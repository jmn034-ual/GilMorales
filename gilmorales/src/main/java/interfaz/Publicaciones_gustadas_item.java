package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

import vistas.VistaPublicacionesGustadasItem;

public class Publicaciones_gustadas_item extends VistaPublicacionesGustadasItem{
	private int _numeroVisualizaciones;
	private Div _video;
	private Label _visualizacionesL;
	private Button _verPublicacionB;
	public Publicaciones_gustadas _publicaciones_gustadas;
	public Ver_publicacion_ajena _ver_publicacion_ajena;

	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}