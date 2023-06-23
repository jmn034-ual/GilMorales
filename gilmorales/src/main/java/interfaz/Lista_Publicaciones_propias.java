package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Publicaciones_propias_item;
import vistas.VistaListaPublicacionesPropias;

public class Lista_Publicaciones_propias extends VistaListaPublicacionesPropias{
	public Ver_publicaciones_propias _ver_publicaciones_propias;
	public Vector<Publicaciones_propias_item> _item = new Vector<Publicaciones_propias_item>();
	
	public void addPublicacionPropia(Publicaciones_propias_item ppi) {
		this.getLayoutLista().as(VerticalLayout.class).add(ppi);
	}
}