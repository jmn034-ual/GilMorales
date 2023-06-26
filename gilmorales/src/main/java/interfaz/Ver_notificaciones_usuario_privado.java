package interfaz;

import basededatos.iVer_notificaciones_usuario_privado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificacionesUsaurioPrivado;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones_usuario_privado  extends VistaVerNotificacionesUsaurioPrivado{
	public iVer_notificaciones_usuario_privado _iVer_notificaciones_usuario_privado;
	public Notificaciones_usuario_privado _notificaciones_usuario_privado;

	public Ver_notificaciones_usuario_privado(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
	}
	public void Notificaciones_usuario_privado() {
		throw new UnsupportedOperationException();
	}
}