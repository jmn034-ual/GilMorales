package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesComercialItem;

public class Lista_publicaciones_Comercial_item extends VistaListaPublicacionesComercialItem {

	public Lista_publicaciones_Comercial _lista_publicaciones__Comercial_;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();
	
	public Lista_publicaciones_Comercial_item(Publicacion p, Lista_publicaciones_Comercial interfaz) {
		this._lista_publicaciones__Comercial_ = interfaz;
		this.publicacion = this.bd.cargarPublicacion(p.getIdPublicacion());
		Video video = new Video(this.publicacion.getVideo());
		this.getLayaoutVideo().as(VerticalLayout.class).add(video);
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
		Ver_publicacion_propia__Comercial_();
		NumeroVisualizaciones();
	}
	
	
	public void Ver_publicacion_propia__Comercial_() {
		this._ver_publicacion_propia__Comercial_ = new Ver_publicacion_propia_Comercial(this.publicacion, this);
		this.getLayoutItem().as(VerticalLayout.class).addClickListener(event ->{
			this._lista_publicaciones__Comercial_._usuario_comercial.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			this._lista_publicaciones__Comercial_._usuario_comercial.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_publicacion_propia__Comercial_);

		});
		
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
	}
}