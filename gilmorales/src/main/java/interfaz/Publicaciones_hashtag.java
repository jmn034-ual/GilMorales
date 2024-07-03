package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtag;

public class Publicaciones_hashtag extends VistaPublicacionesHashtag{
	public Ver_hashtag _ver_hashtag;
	public Vector<Publicaciones_hashtag_item> _item = new Vector<Publicaciones_hashtag_item>();
	Hashtag hashtag;
	Publicaciones_hashtag_item publicacion;
	
	public Publicaciones_hashtag(Hashtag hashtag, Ver_hashtag interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.hashtag = hashtag;
		this._ver_hashtag = interfaz;
		cargarPubliacaciones();
	}
	
	public void cargarPubliacaciones() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this.hashtag.aparece.getCollection());

		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		this._item.clear();

		if(publicaciones != null) {
			int tamanio = publicaciones.size();
			for(int i = 0; i < publicaciones.size(); i++) {
				if(tamanio >= 3) {					
					this.getLayoutLista().as(VerticalLayout.class).add(new HorizontalLayout(new Publicaciones_hashtag_item(publicaciones.get(i), this),
							new Publicaciones_hashtag_item(publicaciones.get(++i), this), new Publicaciones_hashtag_item(publicaciones.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Publicaciones_hashtag_item(publicaciones.get(i), this),
							new Publicaciones_hashtag_item(publicaciones.get(++i), this));
					horizontal2.getStyle().set("width", "66.66%");

					this.getLayoutLista().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Publicaciones_hashtag_item(publicaciones.get(i), this));
					horizontal.getStyle().set("width", "33%");
					this.getLayoutLista().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
	}
}