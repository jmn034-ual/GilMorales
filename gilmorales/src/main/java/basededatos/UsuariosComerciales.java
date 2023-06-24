package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import bd_dcl.UsuarioComercial;

public class UsuariosComerciales {
	public BDPrincipal _c_bd_comercial;
	public Vector<UsuarioComercial> _usuarioComercial = new Vector<UsuarioComercial>();

	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto) {
		throw new UnsupportedOperationException();
	}
}