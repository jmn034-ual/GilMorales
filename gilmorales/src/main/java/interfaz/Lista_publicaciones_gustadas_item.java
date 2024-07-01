package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesGustadasUsaurioPublicoItem;

public class Lista_publicaciones_gustadas_item extends VistaPublicacionesGustadasUsaurioPublicoItem{

	public Lista_publicaciones_gustadas _lista_publicaciones_gustadas;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();

	public Lista_publicaciones_gustadas_item(Publicacion p, Lista_publicaciones_gustadas interfaz) {
		this.publicacion = p;
		this._lista_publicaciones_gustadas = interfaz;
		this.publicacion = this.bd.cargarPublicacion(publicacion.getIdPublicacion());
		Video video = new Video(this.publicacion.getVideo());
		this.getVideo().as(VerticalLayout.class).add(video);
		Ver_publicacion__Administrador();
		Visualizaciones();
	}

	public void Ver_publicacion__Administrador() {
		this._ver_publicacion__Administrador_ = new Ver_publicacion_Administrador(this.publicacion, this);
		this.getVideo().as(VerticalLayout.class).addClickListener(event ->{
			this._lista_publicaciones_gustadas._ver_publicaciones_gustadas._ver_perfil__Administrador_.getVaadinHorizontalLayout().removeAll();
			this._lista_publicaciones_gustadas._ver_publicaciones_gustadas._ver_perfil__Administrador_.getVaadinHorizontalLayout().add(this._ver_publicacion__Administrador_);
		});
	}
	
	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + " Visualizaciones");
	}
}