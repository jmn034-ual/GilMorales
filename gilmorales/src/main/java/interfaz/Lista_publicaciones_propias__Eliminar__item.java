package interfaz;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Publicacion;
import vistas.VistaListaPublicacionesPropiasEliminarItem;

public class Lista_publicaciones_propias__Eliminar__item extends VistaListaPublicacionesPropiasEliminarItem{
	private ComboBox _seleccionar_publicacion;
	private int _numeroVisualizaciones;
	private Div _video;
	public Lista_publicaciones_propias__Eliminar_ _lista_publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	
	public Lista_publicaciones_propias__Eliminar__item(Publicacion p) {
//		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
		p.getVideo().getStyle().set("width", "50%");
		p.getVideo().getStyle().set("height", "50%");
		p.getVideo().getElement().setProperty("controls", false);
		p.getVideo().getElement().setProperty("autoplay", false); 
		p.getVideo().getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(p.getVideo());
		this.getNumVisualizaciones().setText(""+p.getNumVisualizaciones());
	}

	public void Ver_publicacion_propia() {
		throw new UnsupportedOperationException();
	}

	public void Seleccionar_publicacion() {
		throw new UnsupportedOperationException();
	}
}