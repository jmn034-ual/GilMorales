package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerListaUsuariosRegistrados;

public class Ver_lista_usuarios_registrados extends VistaVerListaUsuariosRegistrados{
//	private Label _tituloL;
	public Cabecera_TOP _cabecera_TOP;
	public lista_usuarios_registrados _lista_usuarios_registrados = new lista_usuarios_registrados();

	public lista_usuarios_registrados_item u1 = new lista_usuarios_registrados_item("Usuario1");
	public lista_usuarios_registrados_item u2 = new lista_usuarios_registrados_item("Usuario2");
	
	public Ver_lista_usuarios_registrados() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		_lista_usuarios_registrados.anadirUsuario(u1);
		_lista_usuarios_registrados.anadirUsuario(u2);
		lista_usuarios_registrados();
	}
	
	public void lista_usuarios_registrados() {
		this.getLayoutVerticalLista().as(VerticalLayout.class).add(_lista_usuarios_registrados);
	}
}