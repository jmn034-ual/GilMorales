package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTopHashtags;

public class top_hashtags extends VistaTopHashtags{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<top_hashtags_item> _item = new Vector<top_hashtags_item>();
	
	public void anadirHashag(top_hashtags_item thi) {
		this.getLayoutListaTopHashtag().as(VerticalLayout.class).add(thi);
	}
}