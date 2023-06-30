package interfaz;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesPropiasEliminarItem;

public class Lista_publicaciones_propias_Eliminar_item extends VistaListaPublicacionesPropiasEliminarItem{
	private ComboBox _seleccionar_publicacion;
	private int _numeroVisualizaciones;
	private Div _video;
	public Lista_publicaciones_propias_Eliminar _lista_publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	Publicacion publicacion;
	
	public Lista_publicaciones_propias_Eliminar_item(Publicacion publicacion) {
		Video video = new Video(publicacion.getVideo());
		video.getStyle().set("width", "50%");
		video.getStyle().set("height", "50%");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.publicacion = publicacion;
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getCheckboxEliminar().setValue(false);
		this.getNumVisualizaciones().setText(""+publicacion.getNumVisualizaciones());
	}

	public void Ver_publicacion_propia() {
		throw new UnsupportedOperationException();
	}

	public Publicacion Seleccionar_publicacion() {
		return publicacion;
	}
}