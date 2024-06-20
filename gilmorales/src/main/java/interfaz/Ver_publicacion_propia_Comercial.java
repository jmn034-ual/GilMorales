package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Ver_publicacion_propia_Comercial extends Ver_publicacion_propia{


	public Lista_publicaciones_Comercial_item _lista_publicaciones__Comercial_;
	public Ver_me_gustas_publicacion_Comercial _ver_me_gustas_publicacion__Comercial_;
	public Ver_comentarios_Comercial _ver_comentarios__Comercial_;
	public Lista_Top_comentarios_Publicacion_comercial _lista_Top_comentarios__Publicacion_comercial_;
	Publicacion publicacion; Usuario_comercial ucInterfaz; 
	Usuario_comercial uc;
	
	
	public Ver_publicacion_propia_Comercial(Publicacion publicacion, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");

		this.publicacion = publicacion;
		if(interfaz instanceof Lista_publicaciones_Comercial_item) {
			this._lista_publicaciones__Comercial_ = (Lista_publicaciones_Comercial_item) interfaz;
			this.uc = this._lista_publicaciones__Comercial_._lista_publicaciones__Comercial_._usuario_comercial;
		}else {
			this._add_publiacacion = (Add_publicacion) interfaz;
			this.uc = this._add_publiacacion.ucInterfaz;
		}
		this.getAvatar().setImage(this.publicacion.getEsPublicada().getFoto());
		this.getVerPerfil().setText(this.publicacion.getEsPublicada().getNombreUsuarioComercial());
		this.getBotonDenunciar().setVisible(false);
		this.getVaadinHorizontalLayout2().setVisible(false);
		this.getGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getFechaSubida().setText(this.publicacion.getFechaPublicacion());
		this.getVideo().add(new Video(this.publicacion.getVideo()));
		this.getBotonSeguir().setVisible(false);
		Ver_comentarios__Comercial_();
		Eliminar();
		Ver_perfil_comcercial();
		
	}
	
	public void Ver_perfil_comcercial() {
		this.getVerPerfil().addClickListener(event ->{
			this.uc._cabecera_Usuario_Comercial.getBotonPerfil().click();
		});	
	}
	

	public void Ver_me_gustas_publicacion__Comercial_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_comentarios__Comercial_() {
		this._ver_comentarios__Comercial_ = new Ver_comentarios_Comercial(this.publicacion, this);
		this.getBotonVerComentario().addClickListener(event ->{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._ver_comentarios__Comercial_);
		});
	}

	public void lista_Top_comentarios__Publicacion_comercial_() {
		this._lista_Top_comentarios__Publicacion_comercial_ = new Lista_Top_comentarios_Publicacion_comercial(this.publicacion, this);
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_comentarios__Publicacion_comercial_);
	}

	public void Eliminar() {
		this.getVaadinButton1().addClickListener(event -> {
			this.bd.eliminarPublicacion(this.publicacion.getIdPublicacion());
			this.uc._cabecera_Usuario_Comercial.getBotonPerfil().click();
		});
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
	}
}