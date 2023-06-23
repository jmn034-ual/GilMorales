package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerListaHashtags;

public class Ver_lista_Hashtag extends VistaVerListaHashtags{
	private Label _tituloL;
	public Ver_tendencias _ver_tendencias;
	public Cabecera_TOP _cabecera_TOP;
	public Lista_Hashtags _lista_Hashtags = new Lista_Hashtags();
	
	Lista_Hashtags_item  h1 = new Lista_Hashtags_item("Vaadin");
	Lista_Hashtags_item  h2 = new Lista_Hashtags_item("MDS2");
	
	public Ver_lista_Hashtag() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		_lista_Hashtags.anadirHashag(h1);
		_lista_Hashtags.anadirHashag(h2);
		Lista_Hashtags();
	}

	public void Lista_Hashtags() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_lista_Hashtags);;
	}
}