package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaVerListaUsuariosRegistrados;

public class Ver_lista_usuarios_registrados extends VistaVerListaUsuariosRegistrados{
//	private Label _tituloL;
	public Cabecera_TOP _cabecera_TOP;
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	Administrador adminInterfaz;
	Usuario_No_Registrado unr;
	Usuario_Registrado ur;
	
	public Ver_lista_usuarios_registrados() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		_lista_usuarios_registrados = new Lista_usuarios_registrados();
		lista_usuarios_registrados();
		Select<String> select = new Select<>();
        select.setLabel("Ordenar por:");
        select.setItems("Me Gustas", "Seguidores",
                "None");
        select.setValue("None");

		this.getLayoutBotonOrdenar().add(select);
	}
	
	public Ver_lista_usuarios_registrados(Usuario_Registrado ur) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.ur = ur;
		_lista_usuarios_registrados = new Lista_usuarios_registrados(this.ur);
		lista_usuarios_registrados();
	}
	public Ver_lista_usuarios_registrados(Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.unr = unr;
		_lista_usuarios_registrados = new Lista_usuarios_registrados(this.unr);
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