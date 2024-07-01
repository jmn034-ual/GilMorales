package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificaciones;

public class Ver_notificaciones extends VistaVerNotificaciones{
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	
	public Ver_notificaciones(Cabecera_Usuario_Registrado interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._cabecera_Usuario_Registrado = interfaz;
    	if(interfaz.urInterfaz.ur.getPrivacidad() == 0) {
    		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_notificaciones_usuario_publico(interfaz.urInterfaz.ur, this));
    	}else {
    		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_notificaciones_usuario_privado(interfaz.urInterfaz.ur));
    	}
	}
}