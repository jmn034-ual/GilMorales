package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
	public Lista_Publicaciones_propias(UsuarioRegistrado ur) {
		this.user = ur;
		cargarPublicacionesPropias();
	}

	public void cargarPublicacionesPropias() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());

		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		this._item.clear();

		for(Publicacion p : publicaciones) {
			this.publicacion = new Publicaciones_propias_item(p);
			this.getLayoutLista().as(VerticalLayout.class).add(this.publicacion);
			this._item.add(publicacion);
		}

	}
}