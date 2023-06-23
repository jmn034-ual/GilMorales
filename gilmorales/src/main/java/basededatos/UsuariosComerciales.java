package basededatos;

import java.util.Vector;

import bd_dcl.UsuarioComercial;

public class UsuariosComerciales {
	public BDPrincipal _c_bd_comercial;
	public Vector<UsuarioComercial> _usuarioComercial = new Vector<UsuarioComercial>();

	public UsuarioComercial cargarUsuarioComercial() {
		throw new UnsupportedOperationException();
	}

	public void recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto) {
		throw new UnsupportedOperationException();
	}
}