package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

import vistas.VistaPublicacionesPropiasItem;

public class Publicaciones_propias_item extends VistaPublicacionesPropiasItem{
	private int _numeroVisualizaciones;
	private Label _visualizacionesL;
	private Div _video;
	private Button _verPubliacionB;
	public Lista_Publicaciones_propias _publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;

	public void Ver_publicacion_propia() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}