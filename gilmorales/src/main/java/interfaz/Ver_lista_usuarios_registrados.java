package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerListaUsuariosRegistrados;

public class Ver_lista_usuarios_registrados extends VistaVerListaUsuariosRegistrados{
//	private Label _tituloL;
	public Cabecera_TOP _cabecera_TOP;
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	Administrador adminInterfaz;
	
	public Ver_lista_usuarios_registrados() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		_lista_usuarios_registrados = new Lista_usuarios_registrados();
		lista_usuarios_registrados();
	}

	
	public Ver_lista_usuarios_registrados(Administrador adminInterfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.adminInterfaz = adminInterfaz;
		_lista_usuarios_registrados = new Lista_usuarios_registrados(this.adminInterfaz);
		lista_usuarios_registrados();
	}
	
	public void lista_usuarios_registrados() {
		this.getLayoutVerticalLista().as(VerticalLayout.class).add(_lista_usuarios_registrados);
	}
}