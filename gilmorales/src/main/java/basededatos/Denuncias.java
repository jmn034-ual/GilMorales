package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Comentario;
import bd_dcl.ComentarioDAO;
import bd_dcl.Denuncia;
import bd_dcl.DenunciaDAO;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Denuncias {
	public BDPrincipal _c_bd_denuncia;
	public Vector<Denuncia> _denuncia = new Vector<Denuncia>();

	public List cargarDenuncias() throws PersistentException {
		List<Denuncia> denuncias = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			denuncias = DenunciaDAO.queryDenuncia(null, null);
		}catch(Exception e){
			t.rollback();
		}
		return denuncias;	
	}

	public void denunciarPublicacion(int aIdPublicacion, String aMotivo, String aExplicacion, int aUsuarioID)throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Publicacion p = PublicacionDAO.loadPublicacionByORMID(aIdPublicacion);
			UsuarioRegistrado usuarioDenunciante = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(2);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denuciaPublicacion.add(p);
			p.publicacionDenunciadaPor.add(usuarioDenunciante);
			PublicacionDAO.save(p);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public void denunciarUsuario(int aUsuarioDenunciadoID, String aExplicacion, String aMotivo, int aUsuarioDenuncianteID)throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuarioDenunciado = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioDenunciadoID);
			UsuarioRegistrado usuarioDenunciante = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioDenuncianteID);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(0);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denucia.add(usuarioDenunciado);
			usuarioDenunciado.esDenunciado.add(usuarioDenunciante);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
			UsuarioRegistradoDAO.save(usuarioDenunciado);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	
	}

	public void denunciarComentario(int aIdComentario, String aMotivo, String aExplicacion, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			UsuarioRegistrado usuarioDenunciante = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(1);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denunciaComentarioUR.add(comentario);
			comentario.denunciadoPor.add(usuarioDenunciante);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
			ComentarioDAO.save(comentario);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	
	}

	public List filtrarDenuncias(String aFiltro) throws PersistentException {
		List<Denuncia> denuncias = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			denuncias = DenunciaDAO.queryDenuncia(null, aFiltro);
		}catch(Exception e){
			t.rollback();
		}
		return denuncias;
	}
}