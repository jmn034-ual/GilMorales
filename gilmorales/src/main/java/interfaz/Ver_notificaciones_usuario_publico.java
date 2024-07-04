package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.iVer_notificaciones_usuario_publico;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones_usuario_publico extends Ver_notificaciones{

	public Notificaciones_usuario_publico _notificaciones_usuario_publico;

	public Ver_notificaciones_usuario_publico(Cabecera_Usuario_Registrado cabecera, UsuarioRegistrado user) {
		super(cabecera, user);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	Notificaciones_usuario_publico();
	}
	public void Notificaciones_usuario_publico() {
    	_notificaciones_usuario_publico = new Notificaciones_usuario_publico(this.user, this);
    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._notificaciones_usuario_publico);
	}
}