package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaVerListaUsuariosRegistrados;

public class Ver_lista_usuarios_registrados extends VistaVerListaUsuariosRegistrados{
	public Cabecera_TOP _cabecera_TOP;
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	Administrador adminInterfaz;
	Usuario_No_Registrado unr;
	Usuario_Registrado ur;
	

	
	public Ver_lista_usuarios_registrados(Cabecera_TOP interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._cabecera_TOP = interfaz;
		lista_usuarios_registrados();
	}
//	public Ver_lista_usuarios_registrados(Usuario_No_Registrado unr) {
//		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
//    	this.unr = unr;
////		_lista_usuarios_registrados = new Lista_usuarios_registrados(this.unr);
//		lista_usuarios_registrados(unr);
//	}

	
//	public Ver_lista_usuarios_registrados(Administrador adminInterfaz) {
//		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
//    	this.adminInterfaz = adminInterfaz;
////		_lista_usuarios_registrados = new Lista_usuarios_registrados(this.adminInterfaz);
//		lista_usuarios_registrados(adminInterfaz);
//	}
	
//	public void lista_usuarios_registrados() {
//		if(interfaz instanceof Usuario_Registrado) {
//			_lista_usuarios_registrados = new Lista_usuarios_registrados(this.ur);
//		}else if(interfaz instanceof Usuario_No_Registrado) {
//			_lista_usuarios_registrados = new Lista_usuarios_registrados(this.unr);
//		}else {
//			_lista_usuarios_registrados = new Lista_usuarios_registrados(this.adminInterfaz);
//		}
//		this.getLayoutVerticalLista().as(VerticalLayout.class).add(_lista_usuarios_registrados);
//	}
	
	public void lista_usuarios_registrados() {
		_lista_usuarios_registrados = new Lista_usuarios_registrados(this);
		this.getLayoutVerticalLista().as(VerticalLayout.class).add(_lista_usuarios_registrados);
	}
}