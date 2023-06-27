package basededatos;

import basededatos.BDPrincipal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Comentario;
import bd_dcl.ComentarioDAO;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.HashtagDAO;
import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioComercialDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Publicaciones {
	public BDPrincipal _c_bd_publicacion;
	public Vector<Publicacion> _publiacion = new Vector<Publicacion>();

	public void eliminarSeleccion(List<Publicacion> aListaSeleccion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			for(Publicacion publicacion : aListaSeleccion) {
				PublicacionDAO.deleteAndDissociate(publicacion);
			}
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public void eliminarPublicacion(int aIDPublicacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion p = PublicacionDAO.loadPublicacionByORMID(aIDPublicacion);
			Pattern mencion = Pattern.compile("@(\\w+)");
			Matcher m = mencion.matcher(p.getDescripcion());
			while (m.find()) {
				if(p.getPerteneceA() != null) {
					List<UsuarioRegistrado> lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
					for(UsuarioRegistrado ur : lista) {
						if(ur.getNombreUsuario().equals(m.group(1))) {	
							List<Notificacion> listaNotificaciones = new ArrayList<Notificacion>(ur.recibe.getCollection());
							for(Notificacion n : listaNotificaciones) {
								if(n.getUsuarioRegistradoIDNotifica() == p.getPerteneceA().getID()) {
									NotificacionDAO.deleteAndDissociate(n);
								}
							}
						}
					}
				}
			}
			List<Comentario> comentarios = new ArrayList<Comentario>(p.tieneComentarios.getCollection());
			for(Comentario comentario : comentarios) {
				ComentarioDAO.deleteAndDissociate(comentario);
			}
			PublicacionDAO.deleteAndDissociate(p);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion p = null;

		try {
			p = PublicacionDAO.createPublicacion();
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuarioID);
			if(usuario.getNombreUsuario().equals(aNombreUsuario)) {
				p.setNombreUsuarioComercial(null);
				p.setNombreUsuario(aNombreUsuario);
				p.setEsPublicada(null);
				p.setPerteneceA(usuario);
			}else {
				UsuarioComercial uc = UsuarioComercialDAO.getUsuarioComercialByORMID(aUsuarioID);
				p.setNombreUsuarioComercial(aNombreUsuario);
				p.setNombreUsuario(null);
				p.setPerteneceA(null);
				p.setEsPublicada(uc);
			}
			p.setLocalizacion(aLocalizacion);
			p.setDescripcion(aDescripcion);
			p.setVideo(aVideo);
			p.setFechaPublicacion(aVideo);
			// Obtener la fecha actual
			Date fechaActual = new Date();
			// Formatear la fecha en el formato deseado
			DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
			String fechaFormateada = formatoFecha.format(fechaActual);
			p.setFechaPublicacion(fechaFormateada);
			p.setNumComentarios(0);
			p.setNumMeGustas(0);
			p.setNumVisualizaciones(0);
			PublicacionDAO.save(p);
			t.commit();			
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return p;	
	}

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario, int UsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion p = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(UsuarioID);
			if(!p.gustaA.contains(usuario)) {
				p.gustaA.add(usuario);
			}else {
				p.setNumMeGustas(p.getNumMeGustas()-1);
				p.gustaA.remove(usuario);
			}
			PublicacionDAO.save(p);
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();

	}

	public List cargarPublicacionesUsuarios() throws PersistentException {
		List<Publicacion> publicaciones = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			publicaciones = PublicacionDAO.queryPublicacion(null, null);
		} catch (Exception e) {
			t.rollback();
		}
		return publicaciones;
	}
}