package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerSeguidos;

public class Ver_seguidos extends VistaVerSeguidos{
	private Label _tituloL;
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_de_segidos _lista_de_segidos = new Lista_de_segidos();
	
	public Ver_seguidos() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		Lista_de_segidos();
		BotonSalir();
	}
	public void Lista_de_segidos() {
		this.getLayoutListaSeguidos().as(VerticalLayout.class).add(_lista_de_segidos);
	}
	public void BotonSalir() {
		this.getBotonSalir().addClickListener(event->{
			this.setVisible(false);
		});
	}
}