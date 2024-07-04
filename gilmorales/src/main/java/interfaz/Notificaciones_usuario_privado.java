package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_privado extends Notificaciones {
	public Ver_notificaciones_usuario_privado _ver_notificaciones_usuario_privado;
	public Vector<Notificaciones_usuario_privado_item> _item = new Vector<Notificaciones_usuario_privado_item>();
	public Notificaciones_usuario_privado_item notificaciones;
	
	public Notificaciones_usuario_privado(UsuarioRegistrado ur, Ver_notificaciones_usuario_privado interfaz) {
		this._ver_notificaciones_usuario_privado = interfaz;
		this.notificaciones = new Notificaciones_usuario_privado_item(ur, this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(notificaciones);
	}
}