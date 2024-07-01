package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import vistas.VistaVerComentariosComercial;

public class Ver_comentarios_Comercial extends VistaVerComentariosComercial{

	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;
	public Lista_comentarios_Comercial _lista_comentarios__Comercial_;
	Publicacion publicacion;
	
	public Ver_comentarios_Comercial(Publicacion p, Ver_publicacion_propia_Comercial interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = p;
		this._ver_publicacion_propia__Comercial_ = interfaz;
		this.getBotonNombreUsuario().setText(this.publicacion.getEsPublicada().getNombreUsuarioComercial());
		this.getLabelGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		NumMeGustas();
		NumeroComentarios();
		NumVisualizaciones();
		Lista_comentarios__Comercial_();
		this.getBotonNombreUsuario().addClickListener(event ->{
			this._ver_publicacion_propia__Comercial_.uc._cabecera_Usuario_Comercial.getBotonPerfil().click();
		});
	}

	public void Lista_comentarios__Comercial_() {
		this._lista_comentarios__Comercial_ = new Lista_comentarios_Comercial(this.publicacion, this);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(this._lista_comentarios__Comercial_);
	}
	
	public void NumMeGustas() {
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
	}

	public void NumeroComentarios() {
		this.getNumComentarios().setText(this.publicacion.getNumComentarios() + "");
	}

	public void NumVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + "");
	}


}