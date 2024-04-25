package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Hashtag;
import vistas.VistaListaHashtagsItem;

public class Lista_Hashtags_item extends VistaListaHashtagsItem{

	public Lista_Hashtags _lista_Hashtags;
	public Ver_hashtag _ver_hashtag;
	Hashtag hashtag;
	
	public Lista_Hashtags_item(Hashtag hashtag, Lista_Hashtags interfaz) {
		this._lista_Hashtags = interfaz;
		this.hashtag = hashtag;
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
        video.getElement().getStyle().set("border-radius", "8px");
		this.getNombreHashtags().setText(hashtag.getNombreHashtag());
		this.getVideo().as(VerticalLayout.class).add(video);
		Visualizaciones();
		Ver_hashtag();
	}

	public void Ver_hashtag() {
		this._ver_hashtag = new Ver_hashtag(hashtag);
		this.getNombreHashtags().addClickListener(event ->{
			this._lista_Hashtags._ver_lista_Hashtag.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			this._lista_Hashtags._ver_lista_Hashtag.getVaadinVerticalLayout1().as(VerticalLayout.class).add(_ver_hashtag);
		});
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.hashtag.getNumVisualizaciones()+"");
	}
}