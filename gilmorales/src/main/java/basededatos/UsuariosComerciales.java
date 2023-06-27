package basededatos;

import basededatos.BDPrincipal;

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

	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword) throws PersistentException {
		UsuarioComercial comercial = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<UsuarioComercial> lista = UsuarioComercialDAO.queryUsuarioComercial(null, null);
			for(UsuarioComercial administrador : lista) {
				if((administrador.getNombreUsuarioComercial().equals(aNombreUsuario)) && (administrador.getPassword().equals(aPassword))){
					comercial = administrador;
					break;
				}
			}
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
	
	public void registrarUsuario(String aNombre, String aEmail, String aPassword, String aDescripcion, String aNombreUsuarioEmpresa, String aFechaNacimiento, String aFoto) throws PersistentException {
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
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}
}