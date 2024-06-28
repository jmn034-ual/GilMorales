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

	public Publicacion cargarPublicacion(int idPublicacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion publicacion = null;
		try {
			publicacion = PublicacionDAO.getPublicacionByORMID(idPublicacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return publicacion;
	}

	public void eliminarSeleccion(List<Publicacion> aListaSeleccion) throws PersistentException {
		for (Publicacion publicacion : aListaSeleccion) {
			eliminarPublicacion(publicacion.getIdPublicacion());
		}
	}

	public List<Publicacion> cargarPublicacionesComerciales() throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		List<Publicacion> publicaciones = null;
		try {
			String condition = "UsuarioComercialID IS NOT NULL";
			publicaciones = PublicacionDAO.queryPublicacion(condition, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return publicaciones;
	}

	public void eliminarPublicacion(int aIDPublicacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion p = PublicacionDAO.loadPublicacionByORMID(aIDPublicacion);
			Pattern mencion = Pattern.compile("@(\\w+)");
			Matcher m = mencion.matcher(p.getDescripcion());
			while (m.find()) {
				if (p.getPerteneceA() != null) {
					List<UsuarioRegistrado> lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
					for (UsuarioRegistrado ur : lista) {
						if (ur.getNombreUsuario().equals(m.group(1))) {
							List<Notificacion> listaNotificaciones = new ArrayList<Notificacion>(
									ur.recibe.getCollection());
							for (Notificacion n : listaNotificaciones) {
								if (n.getIDUsuarioNotifica() == p.getPerteneceA().getID()) {
									NotificacionDAO.deleteAndDissociate(n);
								}
							}
						}
					}
				}
			}
			List<Comentario> comentarios = new ArrayList<Comentario>(p.tieneComentarios.getCollection());
			for (Comentario comentario : comentarios) {
				ComentarioDAO.deleteAndDissociate(comentario);
			}
			PublicacionDAO.deleteAndDissociate(p);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public Publicacion addPublicacion(String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID)
			throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion p = null;

		try {
			p = PublicacionDAO.createPublicacion();
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuarioID);
			if (usuario != null) {
				p.setNombreUsuarioComercial(null);
				p.setNombreUsuario(usuario.getNombreUsuario());
				p.setEsPublicada(null);
				p.setPerteneceA(usuario);
			} else {
				UsuarioComercial uc = UsuarioComercialDAO.loadUsuarioComercialByORMID(aUsuarioID);
				p.setNombreUsuarioComercial(uc.getNombreUsuarioComercial());
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

	public Publicacion addPublicacionComercial(String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID)
			throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion p = null;

		try {
			p = PublicacionDAO.createPublicacion();
			UsuarioComercial uc = UsuarioComercialDAO.loadUsuarioComercialByORMID(aUsuarioID);
			if (uc != null) {
				p.setNombreUsuarioComercial(uc.getNombreUsuarioComercial());
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

	public Publicacion meGustaPublicacion(int aIdPublicacion, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion p = null;
		try {
			p = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			Notificacion notificacion = NotificacionDAO.createNotificacion();

			if (!p.gustaA.contains(usuario)) {
				p.gustaA.add(usuario);
				p.setNumMeGustas(p.gustaA.size());
				usuario.daMeGustaPublicacion.add(p);
				if (p.getPerteneceA() != null) {
					notificacion.setTipoNotificacion(1);
					notificacion.setEnviadaA(p.getPerteneceA());
					notificacion.setIDUsuarioNotifica(usuario.getID());
					NotificacionDAO.save(notificacion);
				}
			} else {
				p.gustaA.remove(usuario);
				usuario.daMeGustaPublicacion.remove(p);
				p.setNumMeGustas(p.gustaA.size());
				NotificacionDAO.deleteAndDissociate(notificacion);
			}
			PublicacionDAO.save(p);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return p;
	}

	public List cargarPublicacionesUsuarios() throws PersistentException {
		List<Publicacion> publicaciones = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			publicaciones = PublicacionDAO.queryPublicacion(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return publicaciones;
	}

	public void crearMencion(Object p) {
		Publicacion publicacion = null;
		Comentario comentario = null;
		UsuarioRegistrado user = null;
		Pattern mencion = Pattern.compile("@(\\w+)");
		Matcher m = null;
		if(p instanceof Publicacion) {
			publicacion = (Publicacion) p;
			if(publicacion.getPerteneceA() != null)
				user = publicacion.getPerteneceA();
			m = mencion.matcher(publicacion.getDescripcion());
		}else {
			comentario = (Comentario) p;
			user = comentario.getEsComentadoPor();
			m = mencion.matcher(comentario.getComentario());
		}
		
		try {
			while (m.find()) {
				String condition = "nombreUsuario = '" + m.group(1) + "'";
				List<UsuarioRegistrado> lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(condition, null);
				for (UsuarioRegistrado ur : lista) {
					if (ur.getNombreUsuario().equals(m.group(1)) && !ur.getNombreUsuario().equals(user.getNombreUsuario())) {
						Notificacion notificacion = NotificacionDAO.createNotificacion();
						notificacion.setTipoNotificacion(3);
						notificacion.setEnviadaA(ur);
						notificacion.setIDUsuarioNotifica(user.getID());
						NotificacionDAO.save(notificacion);
						break;
					}
				}
			}
			GilMoralesPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void crearHashtag(Publicacion p) {
	    Pattern hashtagPattern = Pattern.compile("#(\\w+)");
	    Matcher matcher = hashtagPattern.matcher(p.getDescripcion());

	    try {
	        while (matcher.find()) {
	            String nombreHashtag = matcher.group(1);
	            String condition = "nombreHashtag = '" + nombreHashtag + "'";
	            List<Hashtag> listaHashtag = HashtagDAO.queryHashtag(condition, null);

	            if (listaHashtag.isEmpty()) {
	                // Crear un nuevo hashtag si no existe
	                Hashtag nuevoHashtag = HashtagDAO.createHashtag();
	                nuevoHashtag.setNombreHashtag(nombreHashtag);
	                nuevoHashtag.aparece.add(p);
	                HashtagDAO.save(nuevoHashtag);
	            } else {
	                // Añadir la publicación al hashtag existente
	                Hashtag hashtagExistente = listaHashtag.get(0);
	                hashtagExistente.aparece.add(p);
	                HashtagDAO.save(hashtagExistente);
	            }
	        }
	        GilMoralesPersistentManager.instance().disposePersistentManager();
	    } catch (PersistentException e) {
	        e.printStackTrace();
	    }
	}

	public List<Publicacion> cargarAllPublicaciones() throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		List<Publicacion> publicaciones = null;
		try {
	        publicaciones = PublicacionDAO.queryPublicacion(null, "numMeGustas DESC");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return publicaciones;		
	}

}