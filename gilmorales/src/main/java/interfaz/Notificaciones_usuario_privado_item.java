package interfaz;

import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_privado_item extends Notificaciones_item {

	public Notificaciones_usuario_privado _notificaciones_usuario_privado;
	public Nuevos_seguidores_usuario_privado _nuevos_seguidores_usuario_privado;
	
	public Notificaciones_usuario_privado_item(UsuarioRegistrado user) {
		super(user);
		// TODO Auto-generated constructor stub
	}


	public void Nuevos_seguidores_usuario_privado() {
		throw new UnsupportedOperationException();
	}
}