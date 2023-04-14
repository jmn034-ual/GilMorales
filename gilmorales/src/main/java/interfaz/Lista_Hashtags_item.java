package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import vistas.VistaListaHashtagsItem;

public class Lista_Hashtags_item extends VistaListaHashtagsItem{
	private Button _verHashtagB;
	private Label _numeroVisualizacionesL;
	private int _numeroVisualizaciones;
	private IronIcon _iconoHashtag;
	public Lista_Hashtags _lista_Hashtags;
	public Ver_hashtag _ver_hashtag;
	
	public Lista_Hashtags_item(String nombreHashtag) {
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "80%");
		video.getStyle().set("height", "80%");
        video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);

    	
		this.getNombreHashtags().setText(nombreHashtag);
		this.getVideo().as(VerticalLayout.class).add(video);
		
	}

	public void Ver_hashtag() {
		throw new UnsupportedOperationException();
	}

	public void Visualizaciones() {
		throw new UnsupportedOperationException();
	}
}