package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import vistas.VistaListaHashtags;

public class Lista_Hashtags extends VistaListaHashtags{
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Vector<Lista_Hashtags_item> _item = new Vector<Lista_Hashtags_item>();
	iUsuario_Registrado bd = new BDPrincipal();

	public Lista_Hashtags(Ver_lista_Hashtag interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("padding", "0px");

		this._ver_lista_Hashtag = interfaz;
		cargarHashtags();
	}
	
	public void cargarHashtags() {
		List<Hashtag> hashtags = this.bd.cargarListaHashtags();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		if(hashtags != null) {
			int tamanio = hashtags.size();
			for(int i = 0; i < hashtags.size(); i++) {
				if(tamanio >= 3) {					
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_Hashtags_item(hashtags.get(i), this),
							new Lista_Hashtags_item(hashtags.get(++i), this), new Lista_Hashtags_item(hashtags.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_Hashtags_item(hashtags.get(i), this),
							new Lista_Hashtags_item(hashtags.get(++i), this));
					horizontal2.getStyle().set("width", "66.66%");

					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Lista_Hashtags_item(hashtags.get(i), this));
					horizontal.getStyle().set("width", "33%");
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
	}
}