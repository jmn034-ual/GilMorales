package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Comentario;
import bd_dcl.ComentarioDAO;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Comentarios {
	public BDPrincipal _c_bd_comentarios;
	public Vector<Comentario> _comentario = new Vector<Comentario>();

	public List<Comentario> cargarComentariosTOP(int aIdPublicacion) throws PersistentException {
		List<Comentario> top = new ArrayList<Comentario>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion publicacion = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			List<Comentario> ordenada = new ArrayList<Comentario>(publicacion.tieneComentarios.getCollection());
			ordenada.sort(null);
			for (int i = ordenada.size() - 1, j = 0; j < 5; j++) {
				top.add(ordenada.get(i));
			}
		} catch (Exception e) {
			t.rollback();
		}
		return top;
	}

	public Comentario comentarPublicacion(int aIdPublicacion, String aComentario, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Comentario comentario = null;
		try {
			Publicacion publicacion = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			comentario = ComentarioDAO.createComentario();
			Notificacion notificacion = NotificacionDAO.createNotificacion();
			comentario.setComentadoEn(publicacion);
			comentario.setComentario(aComentario);
			comentario.setEsComentadoPor(usuario);
			comentario.setNumeroMeGustas(0);
			ComentarioDAO.save(comentario);
			publicacion.tieneComentarios.add(comentario);
			publicacion.setNumComentarios(publicacion.tieneComentarios.size());
			if (publicacion.getPerteneceA() != null) {
				notificacion.setTipoNotificacion(2);
				notificacion.setEnviadaA(publicacion.getPerteneceA());
				notificacion.setIDUsuarioNotifica(usuario.getID());
				NotificacionDAO.save(notificacion);
			}
			PublicacionDAO.save(publicacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return comentario;
	}

	public void borrarComentario(int aIdComentario) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			Publicacion publicacion = PublicacionDAO
					.loadPublicacionByORMID(comentario.getComentadoEn().getIdPublicacion());
			UsuarioRegistrado user = UsuarioRegistradoDAO
					.loadUsuarioRegistradoByORMID(comentario.getEsComentadoPor().getID());
			// Eliminar la notificacion
			ComentarioDAO.deleteAndDissociate(comentario);
			UsuarioRegistradoDAO.save(user);
			publicacion.setNumComentarios(publicacion.tieneComentarios.size());
			PublicacionDAO.save(publicacion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public Comentario meGustaComentario(int aIdComentario, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Comentario c = null;
		try {
			c = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			if (!c.gustaA.contains(usuario)) {
				usuario.daMeGustaComentario.add(c);
				c.gustaA.add(usuario);
				c.setNumeroMeGustas(c.getNumeroMeGustas() + 1);
			} else {
				usuario.daMeGustaComentario.remove(c);
				c.setNumeroMeGustas(c.getNumeroMeGustas() - 1);
				c.gustaA.remove(usuario);
			}
			ComentarioDAO.save(c);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return c;
	}
}