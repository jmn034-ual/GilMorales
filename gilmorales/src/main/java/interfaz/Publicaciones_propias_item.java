package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesPropiasItem;

public class Publicaciones_propias_item extends VistaPublicacionesPropiasItem{

	public Lista_Publicaciones_propias _publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	Publicacion publicacion;
	Usuario_Registrado userInterfaz;
	
	public Publicaciones_propias_item(Publicacion publicacion, Lista_Publicaciones_propias interfaz) {
		this.publicacion = publicacion;
		Video video = new Video(publicacion.getVideo());
		this._publicaciones_propias = interfaz;
		this.userInterfaz = this._publicaciones_propias._ver_publicaciones_propias._ver_perfil_propio.cabecera_top._cabecera_Usuario_Registrado.urInterfaz;
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		NumeroVisualizaciones();
		Ver_publicacion_propia();
	}

	
	public void Ver_publicacion_propia() {
		this._ver_publicacion_propia = new Ver_publicacion_propia(this.publicacion, this.userInterfaz);
		this.getLayoutItem().as(VerticalLayout.class).addClickListener(event ->{
			this.userInterfaz.getVaadinHorizontalLayout().removeAll();
			this.userInterfaz.getVaadinHorizontalLayout().add(this._ver_publicacion_propia);
		});
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + " Visualizaciones");
	}
}