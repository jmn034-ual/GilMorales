package interfaz;

import basededatos.iVer_notificaciones_usuario_publico;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones_usuario_publico extends VistaVerNotificacionesUsuarioPublico{
	public iVer_notificaciones_usuario_publico _iVer_notificaciones_usuario_publico;
	public Notificaciones_usuario_publico _notificaciones_usuario_publico;

	public Ver_notificaciones_usuario_publico() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
	}
	public void Notificaciones_usuario_publico() {
		throw new UnsupportedOperationException();
	}
}