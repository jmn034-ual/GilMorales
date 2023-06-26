package basededatos;

import basededatos.BDPrincipal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

	public void eliminarSeleccion(List aListaSeleccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPublicacion(int aIDPublicacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion p = PublicacionDAO.loadPublicacionByORMID(aIDPublicacion);
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

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarPublicacionesUsuarios() {
		throw new UnsupportedOperationException();
	}
}