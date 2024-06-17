package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaVerListaUsuariosRegistrados;

public class Ver_lista_usuarios_registrados extends VistaVerListaUsuariosRegistrados{
	public Cabecera_TOP _cabecera_TOP;
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	
	public Ver_lista_usuarios_registrados(Cabecera_TOP interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._cabecera_TOP = interfaz;
		lista_usuarios_registrados();
	}
	
	public void lista_usuarios_registrados() {
		_lista_usuarios_registrados = new Lista_usuarios_registrados(this);
		this.getLayoutVerticalLista().as(VerticalLayout.class).add(_lista_usuarios_registrados);
	}
}