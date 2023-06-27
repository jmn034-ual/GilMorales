package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesPropiasItem;

public class Publicaciones_propias_item extends VistaPublicacionesPropiasItem{
	private int _numeroVisualizaciones;
	private Label _visualizacionesL;
	private Div _video;
	private Button _verPubliacionB;
	public Lista_Publicaciones_propias _publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	
	public Publicaciones_propias_item(Publicacion publicacion) {
		Video video = new Video(publicacion.getVideo());
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getNumVisualizaciones().setText(""+publicacion.getNumVisualizaciones());
	}

	
	public void Ver_publicacion_propia() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}