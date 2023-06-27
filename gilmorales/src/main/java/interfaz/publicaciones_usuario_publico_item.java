package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesUsuarioPublicoItem;

public class publicaciones_usuario_publico_item extends VistaPublicacionesUsuarioPublicoItem{
//	private button _verPublicacionB;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private Video _video;
	public publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacion_ajena _ver_publicacion_ajena;

	public publicaciones_usuario_publico_item(Publicacion publicacion) {
		Video video = new Video(publicacion.getVideo());
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getNumVisualizaciones().setText(""+publicacion.getNumVisualizaciones());
	}
	
	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}

	public void Visualizaciones() {
		throw new UnsupportedOperationException();
	}
}