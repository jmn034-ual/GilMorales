package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_publico extends Notificaciones {
	public Ver_notificaciones_usuario_publico _ver_notificaciones_usuario_publico;
	public Vector<Notificaciones_usuario_publico_item> _item = new Vector<Notificaciones_usuario_publico_item>();
	public Notificaciones_usuario_publico_item notificaciones;
	
	public Notificaciones_usuario_publico(UsuarioRegistrado ur, Ver_notificaciones_usuario_publico interfaz) {
		this._ver_notificaciones_usuario_publico = interfaz;
		this.notificaciones = new Notificaciones_usuario_publico_item(ur, this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(notificaciones);
	}
	
}