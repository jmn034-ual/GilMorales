package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPublicacionesGustadas;

public class Publicaciones_gustadas extends VistaPublicacionesGustadas{
	public Ver_publicaciones_gustadas_Usuario_registrado _ver_publicaciones_gustadas__Usuario_registrado_;
	public Vector<Publicaciones_gustadas_item> _item = new Vector<Publicaciones_gustadas_item>();
	
	public void addPublicacion(Publicaciones_gustadas_item publicacion) {
		this.getLayoutListaVertical().as(VerticalLayout.class).add(publicacion);
		_item.add(publicacion);
	}
}