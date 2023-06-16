package interfaz;

import com.sun.jna.platform.unix.X11.Visual;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;

import vistas.VistaVerHashtag;

public class Ver_hashtag extends VistaVerHashtag{
//	private IronIcon _iconoHashtag;
//	private Label _nombreHashtagL;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
	public top_hashtags_item _top_hashtags;
	public Resultado_hashtags_item _resultado_hashtags;
	public Tendencias_item _tendencias;
	public Lista_Hashtags_item _lista_Hashtags;
	public Lista_resultado_item _lista_resultado;
	public Publicaciones_hashtag _publicaciones_hashtag;

	
	public Ver_hashtag() {
		this.getStyle().set("width","100%");
		this.getStyle().set("height", "100%");
		Publicaciones_hashtag();
		Visualizaciones();
	}
	
	public void Publicaciones_hashtag() {
		
	}

	public void Visualizaciones() {
		
	}
}