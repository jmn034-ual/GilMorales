package interfaz;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaNotificacionesItem;

public class Notificaciones_item extends VistaNotificacionesItem{
	public Notificaciones_usuario_publico _notificacionesPublico;
	public Notificaciones_usuario_privado _notificacionesPrivado;
	public Me_gustas _me_gustas;
	public Notificaciones_comentarios _notificaciones_comentarios;
	UsuarioRegistrado user;

	public Notificaciones_item(UsuarioRegistrado user, Object interfaz) {
		if(interfaz instanceof Notificaciones_usuario_publico)
			this._notificacionesPublico = (Notificaciones_usuario_publico) interfaz;
		else
			this._notificacionesPrivado = (Notificaciones_usuario_privado) interfaz;	
		this.user = user;
		 Me_gustas();
		 Notificaciones_comentarios();
	}
	
	public Notificaciones_item(UsuarioRegistrado user) {
		 this.user = user;
		 Me_gustas();
		 Notificaciones_comentarios();
	}

	public void Me_gustas() {
		_me_gustas = new Me_gustas(this);
	}

	public void Notificaciones_comentarios() {
		_notificaciones_comentarios = new Notificaciones_comentarios();
	}
}