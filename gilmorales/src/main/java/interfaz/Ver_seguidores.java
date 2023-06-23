package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerSeguidores;

public class Ver_seguidores extends VistaVerSeguidores{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_de_seguidores _lista_de_seguidores = new Lista_de_seguidores();
	
	public Ver_seguidores() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		BotonCerrar();
		Lista_de_seguidores();
	}

	public void Lista_de_seguidores() {
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_de_seguidores);
	}
	
	public void BotonCerrar() {
		this.getBotonCerrar().addClickListener(event->{
			this.setVisible(false);
		});
	}
}