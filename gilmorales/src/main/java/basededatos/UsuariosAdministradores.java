package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import bd_dcl.UsuarioAdministrador;

public class UsuariosAdministradores {
	public BDPrincipal _c_bd_administrador;
	public Vector<UsuarioAdministrador> _usuarioAdministrador = new Vector<UsuarioAdministrador>();

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado, String aNombreAdmin) {
		throw new UnsupportedOperationException();
	}

	public void addFoto(String aFoto) {
		throw new UnsupportedOperationException();
	}
}