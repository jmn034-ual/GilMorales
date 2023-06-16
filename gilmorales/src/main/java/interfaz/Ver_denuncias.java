package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenuncias;

public class Ver_denuncias extends VistaVerDenuncias {
	private Label _tituloL;
	private Label _filtrarL;
	public Gestionar_denuncias _gestionar_denuncias;
	public Cabecera_Administrador cabecera = new Cabecera_Administrador();
	public Lista_denuncias _lista_denuncias = new Lista_denuncias();
	

	Lista_denuncias_item item1= new Lista_denuncias_item("Cr", "Cristian", "no aplicada", "ninguno", "icons/icon.png");
	
	public Ver_denuncias() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		_lista_denuncias.anadirDenuncia(item1);
		this.getLayoutCabecera().add(cabecera);
		Lista_denuncias();
		
	}

	public void Lista_denuncias() {
		this.getLayoutListaDenuncias().as(VerticalLayout.class).add(_lista_denuncias);
	}
}