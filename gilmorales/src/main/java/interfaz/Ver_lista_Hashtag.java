package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerListaHashtags;

public class Ver_lista_Hashtag extends VistaVerListaHashtags{
	private Label _tituloL;
	public Ver_tendencias _ver_tendencias;
	public Cabecera_TOP _cabecera_TOP;
	public Lista_Hashtags _lista_Hashtags = new Lista_Hashtags();
	
	public Ver_lista_Hashtag() {
		Lista_Hashtags();
	}

	public void Lista_Hashtags() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_lista_Hashtags);;
	}
}