package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenuncias;

public class Ver_denuncias extends VistaVerDenuncias {
	private Label _tituloL;
	private Label _filtrarL;
	public Gestionar_denuncias _gestionar_denuncias;
	public Lista_denuncias _lista_denuncias;
	
	public Ver_denuncias(Lista_denuncias lista) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLayoutListaDenuncias().as(VerticalLayout.class).add(lista);
	}

	public void Lista_denuncias() {
		throw new UnsupportedOperationException();
	}
}