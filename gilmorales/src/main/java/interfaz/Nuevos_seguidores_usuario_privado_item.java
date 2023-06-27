package interfaz;

import bd_dcl.UsuarioRegistrado;
import interfaz.Nuevos_seguidores_usuario_privado;

public class Nuevos_seguidores_usuario_privado_item extends Nuevos_seguidores_item {

	public Nuevos_seguidores_usuario_privado _nuevos_seguidores_usuario_privado;
	
	public Nuevos_seguidores_usuario_privado_item(UsuarioRegistrado usuario, UsuarioRegistrado nuevoSeguidor) {
		super(usuario, nuevoSeguidor);
		// TODO Auto-generated constructor stub
	}

	public void Aceptar_solicitud() {
		throw new UnsupportedOperationException();
	}

	public void CancelarSolicitud() {
		throw new UnsupportedOperationException();
	}
}