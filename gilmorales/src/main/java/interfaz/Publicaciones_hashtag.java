package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtag;

public class Publicaciones_hashtag extends VistaPublicacionesHashtag{
	public Ver_hashtag _ver_hashtag;
	public Vector<Publicaciones_hashtag_item> _item = new Vector<Publicaciones_hashtag_item>();
	Hashtag hashtag;
	Publicaciones_hashtag_item publicacion;
	
	public Publicaciones_hashtag(Hashtag hashtag) {
		this.hashtag = hashtag;
		cargarPubliacaciones();
	}
	
	public void cargarPubliacaciones() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this.hashtag.aparece.getCollection());

		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		this._item.clear();
		
		for(Publicacion p : publicaciones) {
			publicacion = new Publicaciones_hashtag_item(p);
			this.getLayoutLista().as(VerticalLayout.class).add(publicacion);
			this._item.add(publicacion);
		}
	}
}