package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;

import vistas.VistaListaHashtagsItem;

public class Lista_Hashtags_item extends VistaListaHashtagsItem{
	private Button _verHashtagB;
	private Label _numeroVisualizacionesL;
	private int _numeroVisualizaciones;
	private IronIcon _iconoHashtag;
	public Lista_Hashtags _lista_Hashtags;
	public Ver_hashtag _ver_hashtag;

	public void Ver_hashtag() {
		throw new UnsupportedOperationException();
	}

	public void Visualizaciones() {
		throw new UnsupportedOperationException();
	}
}