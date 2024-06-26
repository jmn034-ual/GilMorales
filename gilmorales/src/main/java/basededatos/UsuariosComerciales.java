package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioAdministradorDAO;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioComercialDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class UsuariosComerciales {
	public BDPrincipal _c_bd_comercial;
	public Vector<UsuarioComercial> _usuarioComercial = new Vector<UsuarioComercial>();

	public UsuarioComercial cargarUsuarioComercial(int aUsuarioComercialID) throws PersistentException {
		UsuarioComercial comercial = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			comercial = UsuarioComercialDAO.loadUsuarioComercialByORMID(aUsuarioComercialID);
		}catch(Exception e){
			t.rollback();
		}
		return comercial;
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario, int aUsuarioID) throws PersistentException {
		String password = "";
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComercial usuario = UsuarioComercialDAO.loadUsuarioComercialByORMID(aUsuarioID);
			password = usuario.getPassword();
			if(!password.equals(aNuevaPassword)) {
				usuario.setPassword(aNuevaPassword);
				password = aNuevaPassword;
				UsuarioComercialDAO.save(usuario);
			}
		}catch(Exception e){
			t.rollback();
		}
		return password;
	}	

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComercial usuario = UsuarioComercialDAO.loadUsuarioComercialByORMID(aUsuarioID);
			usuario.setNombreEmpresa(aNombreEmpresa);
			usuario.setNombreUsuarioComercial(aNuevoNombreUsuario);
			usuario.setDescripcion(aDescripcion);
			usuario.setFoto(aFoto);
			UsuarioComercialDAO.save(usuario);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public Object registrarUsuario(String aNombre, String aEmail, String aPassword, String aDescripcion, String aNombreUsuarioEmpresa, String aFechaNacimiento, String aFoto) throws PersistentException {
		UsuarioComercial comercial = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
				UsuarioComercial uc = UsuarioComercialDAO.createUsuarioComercial();
				uc.setNombreEmpresa(aNombre);
				uc.setEmail(aEmail);
				uc.setPassword(aPassword);
				uc.setDescripcion(aDescripcion);
				uc.setNombreUsuarioComercial(aNombreUsuarioEmpresa);
				uc.setFechaNacimiento(aFechaNacimiento.toString());
				uc.setEmail(aEmail);
				uc.setFoto(aFoto);
				UsuarioComercialDAO.save(uc);
				comercial = UsuarioComercialDAO.loadUsuarioComercialByORMID(uc.getID());
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return comercial;
	}
	
	public List<UsuarioComercial> buscarUsuario(String aNombreUsuario) throws PersistentException {
		if(aNombreUsuario == "") return null;
		List lista = null;
		List<UsuarioComercial> usuariosCoincidentes = new ArrayList<UsuarioComercial>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			lista = UsuarioComercialDAO.queryUsuarioComercial(null, null);
			for(int i = 0; i < lista.size(); i++) {
				UsuarioComercial usuario = (UsuarioComercial) lista.get(i);
				if(usuario.getNombreUsuarioComercial().equals(aNombreUsuario)) {
						usuariosCoincidentes.add(usuario);
				}else if(aNombreUsuario.length() > 1) {
					if (usuario.getNombreUsuarioComercial().startsWith(aNombreUsuario.substring(0, 1))
							|| usuario.getNombreUsuarioComercial().startsWith(aNombreUsuario.substring(0, 2))) {
						usuariosCoincidentes.add(usuario);
					}
				}
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		return usuariosCoincidentes;
	}
}