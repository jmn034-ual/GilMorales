package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import vistas.VistaListaHashtagsItem;

public class Lista_Hashtags_item extends VistaListaHashtagsItem {

	public Lista_Hashtags _lista_Hashtags;
	public Ver_hashtag _ver_hashtag;
	Hashtag hashtag;

	public Lista_Hashtags_item(Hashtag hashtag, Lista_Hashtags interfaz) {
		this._lista_Hashtags = interfaz;
		this.hashtag = hashtag;
		Image foto = new Image("icons/hashtag.jpeg", "Hashtag");
		foto.getStyle().set("width", "60%");
		foto.getStyle().set("height", "60%");
		foto.getElement().getStyle().set("border-radius", "8px");
		this.getVideo().as(VerticalLayout.class).add(foto);

		this.getNombreHashtags().setText(hashtag.getNombreHashtag());
		Visualizaciones();
		Ver_hashtag();
	}

	public void Ver_hashtag() {
		this._ver_hashtag = new Ver_hashtag(hashtag, this);
		this.getNombreHashtags().addClickListener(event -> {
			this._lista_Hashtags._ver_lista_Hashtag.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			this._lista_Hashtags._ver_lista_Hashtag.getVaadinVerticalLayout1().as(VerticalLayout.class)
					.add(_ver_hashtag);
		});
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.hashtag.getNumVisualizaciones() + "");
	}
}