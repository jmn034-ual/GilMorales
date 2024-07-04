package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificaciones;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones extends VistaVerNotificaciones{
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public UsuarioRegistrado user;
	public iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_notificaciones(Cabecera_Usuario_Registrado interfaz, UsuarioRegistrado user) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._cabecera_Usuario_Registrado = interfaz;
    	this.user = this.bd.cargarUsuarioRegistrado(user.getID());
//    	if(interfaz.urInterfaz.ur.getPrivacidad() == 0) {
//    		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_notificaciones_usuario_publico(interfaz.urInterfaz.ur, this));
//    	}else {
//    		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_notificaciones_usuario_privado(interfaz.urInterfaz.ur));
//    	}
	}
}