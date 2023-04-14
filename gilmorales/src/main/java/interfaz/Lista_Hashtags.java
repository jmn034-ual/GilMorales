package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaHashtags;

public class Lista_Hashtags extends VistaListaHashtags{
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Vector<Lista_Hashtags_item> _item = new Vector<Lista_Hashtags_item>();
		
	public void anadirHashag(Lista_Hashtags_item thi) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(thi);
	}
}