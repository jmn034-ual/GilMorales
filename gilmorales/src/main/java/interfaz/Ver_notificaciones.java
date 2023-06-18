package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerNotificaciones;

public class Ver_notificaciones extends VistaVerNotificaciones{
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	
	public Ver_notificaciones() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_notificaciones_usuario_publico());
	}
}