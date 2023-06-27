package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Comentario;
import bd_dcl.ComentarioDAO;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Comentarios {
	public BDPrincipal _c_bd_comentarios;
	public Vector<Comentario> _comentario = new Vector<Comentario>();

	public List cargarComentariosTOP(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion publicacion = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			Comentario comentario = ComentarioDAO.createComentario();
			comentario.setComentadoEn(publicacion);
			comentario.setComentario(aComentario);
			comentario.setEsComentadoPor(usuario);
			comentario.setNumeroMeGustas(0);
			ComentarioDAO.save(comentario);
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}


	public void borrarComentario(int aIdComentario, int aIdPublicacion, String aNombreUsuarioPropietario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void meGustaComentario(int aIdComentario, String aNombreUsuario, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Comentario c = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			if(!c.gustaA.contains(usuario)) {
				c.gustaA.add(usuario);
			}else {
				c.setNumeroMeGustas(c.getNumeroMeGustas()-1);
				c.gustaA.remove(usuario);
			}
			ComentarioDAO.save(c);
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}
}