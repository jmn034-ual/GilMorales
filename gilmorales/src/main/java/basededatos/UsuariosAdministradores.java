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

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado, String aNombreAdmin) throws PersistentException {
		UsuarioAdministrador admin = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<UsuarioAdministrador> lista = UsuarioAdministradorDAO.queryUsuarioAdministrador(null, null);
			for(UsuarioAdministrador administrador : lista) {
				if((administrador.getCodigoEmpleado() == aCodigoEmpleado) && (administrador.getNombreAdmin().equals(aNombreAdmin))){
					admin = administrador;
					break;
				}
			}
		}catch(Exception e){
			t.rollback();
		}
		return admin;
	}


	public void addFoto(String aFoto) {
		throw new UnsupportedOperationException();
	}
}