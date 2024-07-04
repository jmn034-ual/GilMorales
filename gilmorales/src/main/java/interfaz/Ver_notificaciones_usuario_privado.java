package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.iVer_notificaciones_usuario_privado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificacionesUsaurioPrivado;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones_usuario_privado  extends Ver_notificaciones{
	public iVer_notificaciones_usuario_privado _iVer_notificaciones_usuario_privado;
	public Notificaciones_usuario_privado _notificaciones_usuario_privado;

	public Ver_notificaciones_usuario_privado(Cabecera_Usuario_Registrado cabecera, UsuarioRegistrado user) {
		super(cabecera, user);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
	}
	public void Notificaciones_usuario_privado() {
		_notificaciones_usuario_privado = new Notificaciones_usuario_privado(this.user, this);
    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._notificaciones_usuario_privado);
    }
}