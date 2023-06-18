package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Publicacion;
import vistas.VistaPublicacionesPropiasItem;

public class Publicaciones_propias_item extends VistaPublicacionesPropiasItem{
	private int _numeroVisualizaciones;
	private Label _visualizacionesL;
	private Div _video;
	private Button _verPubliacionB;
	public Lista_Publicaciones_propias _publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	
	public Publicaciones_propias_item(Publicacion p) {
		p.getVideo().getStyle().set("width", "60%");
		p.getVideo().getStyle().set("height", "60%");
		p.getVideo().getElement().setProperty("controls", false);
		p.getVideo().getElement().setProperty("autoplay", false); 
		p.getVideo().getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(p.getVideo());
		this.getNumVisualizaciones().setText(""+p.getNumVisualizaciones());
	}

	
	public void Ver_publicacion_propia() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}