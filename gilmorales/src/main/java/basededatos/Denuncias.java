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
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioAdministradorDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Denuncias {
	public BDPrincipal _c_bd_denuncia;
	public Vector<Denuncia> _denuncia = new Vector<Denuncia>();
	
	public Denuncia actualizarDenuncia(int idDenuncia, int estado) throws PersistentException {
		Denuncia denuncia = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {			
			denuncia = DenunciaDAO.loadDenunciaByORMID(idDenuncia);
			denuncia.setTipoEstado(estado);
			DenunciaDAO.save(denuncia);
			t.commit();
		}catch(Exception e){
			t.rollback();
		}
		return denuncia;
	}

	public List cargarDenuncias(String filtro) throws PersistentException {
		List<Denuncia> denuncias = null;
		String condicion = "";
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			if(filtro == "pendientes")
				condicion = "tipoEstado = '" + 0 + "'"; 
			else if(filtro == "aplicadas")
				condicion = "tipoEstado = '" + 1 + "'"; 
			else if(filtro == "finalizadas")
				condicion = "tipoEstado = '" + 2 + "'"; 
			else 
				condicion = null;
			
			denuncias = DenunciaDAO.queryDenuncia(condicion, null);
			t.commit();
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
			UsuarioAdministrador admin = UsuarioAdministradorDAO.loadUsuarioAdministradorByORMID(999);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(2);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(admin);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denuciaPublicacion.add(p);
			p.publicacionDenunciadaPor.add(usuarioDenunciante);
			PublicacionDAO.save(p);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
			t.commit();
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
			UsuarioAdministrador admin = UsuarioAdministradorDAO.loadUsuarioAdministradorByORMID(999);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(0);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(admin);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denucia.add(usuarioDenunciado);
			usuarioDenunciado.esDenunciado.add(usuarioDenunciante);
			UsuarioRegistradoDAO.save(usuarioDenunciado);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
			t.commit();
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
			UsuarioAdministrador admin = UsuarioAdministradorDAO.loadUsuarioAdministradorByORMID(999);
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setRealizadaPor(usuarioDenunciante);
			denuncia.setTipoDenuncia(1);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(admin);
			DenunciaDAO.save(denuncia);
			usuarioDenunciante.realizaDenuncia.add(denuncia);
			usuarioDenunciante.denunciaComentarioUR.add(comentario);
			comentario.denunciadoPor.add(usuarioDenunciante);
			UsuarioRegistradoDAO.save(usuarioDenunciante);
			ComentarioDAO.save(comentario);
			t.commit();
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	
	}


}