package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioAdministradorDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;
import interfaz.Administrador;

public class UsuariosAdministradores {
	public BDPrincipal _c_bd_administrador;
	public Vector<UsuarioAdministrador> _usuarioAdministrador = new Vector<UsuarioAdministrador>();

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado) throws PersistentException {
		UsuarioAdministrador admin = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			admin = UsuarioAdministradorDAO.loadUsuarioAdministradorByORMID(aCodigoEmpleado);			
		}catch(Exception e){
			t.rollback();
		}
		return admin;
	}

	public UsuarioAdministrador addFoto(String aFoto, int aCodigoEmpleado) throws PersistentException {
		UsuarioAdministrador admin = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			admin = UsuarioAdministradorDAO.loadUsuarioAdministradorByORMID(aCodigoEmpleado);
			admin.setFoto(aFoto);
			UsuarioAdministradorDAO.save(admin);
		}catch(Exception e){
			t.rollback();
		}
		return admin;
	}
}