package interfaz;

import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_privado_item extends Notificaciones_item {

	public Nuevos_seguidores_usuario_privado _nuevos_seguidores_usuario_privado;
	
	public Notificaciones_usuario_privado_item(UsuarioRegistrado user, Notificaciones_usuario_privado interfaz) {
		super(user, interfaz);
		Nuevos_seguidores_usuario_privado();
	}


	public void Nuevos_seguidores_usuario_privado() {
		this._nuevos_seguidores_usuario_privado = new Nuevos_seguidores_usuario_privado(user, this);
		this.getVaadinHorizontalLayout().add(this._nuevos_seguidores_usuario_privado);
	}
}