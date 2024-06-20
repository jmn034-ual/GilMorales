package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import interfaz.Publicaciones_propias_item;
import vistas.VistaListaPublicacionesPropias;

public class Lista_Publicaciones_propias extends VistaListaPublicacionesPropias{
	public Ver_publicaciones_propias _ver_publicaciones_propias;
	public Vector<Publicaciones_propias_item> _item = new Vector<Publicaciones_propias_item>();
	UsuarioRegistrado user;
	Publicaciones_propias_item publicacion;
	public Lista_Publicaciones_propias(UsuarioRegistrado ur, Ver_publicaciones_propias interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.user = ur;
		this._ver_publicaciones_propias = interfaz;
		cargarPublicacionesPropias();
	}

	public void cargarPublicacionesPropias() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());

		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		this._item.clear();

		if(publicaciones != null) {
			int tamanio = publicaciones.size();
			for(int i = 0; i < publicaciones.size(); i++) {
				if(tamanio >= 3) {					
					this.getLayoutLista().as(VerticalLayout.class).add(new HorizontalLayout(new Publicaciones_propias_item(publicaciones.get(i), this),
							new Publicaciones_propias_item(publicaciones.get(++i), this), new Publicaciones_propias_item(publicaciones.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Publicaciones_propias_item(publicaciones.get(i), this),
							new Publicaciones_propias_item(publicaciones.get(++i), this));
					horizontal2.getStyle().set("width", "66.66%");

					this.getLayoutLista().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Publicaciones_propias_item(publicaciones.get(i), this));
					horizontal.getStyle().set("width", "33%");
					this.getLayoutLista().as(VerticalLayout.class).add(horizontal);
				}
			}
		}

	}
}