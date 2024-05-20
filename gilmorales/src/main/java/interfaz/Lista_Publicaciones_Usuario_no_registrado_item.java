package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesUsuarioNoRegistradoItem;

public class Lista_Publicaciones_Usuario_no_registrado_item extends VistaListaPublicacionesUsuarioNoRegistradoItem{
	
	private int numeroMeGustas;
	private int bMeGustaPulsado = 0;
	public Lista_Publicaciones_Usuario_no_registrado _publicaciones__Usuario_no_registrado_;
	public Ver_perfil_publico ver_perfil;
	public Ver_publicacion_Usuario_No_Registrado verPublicacionUNR;
	public Ver_comentarios_Usuario_No_registrado verComentariosUNR;
	public Publicacion publicacion;
	
	public Lista_Publicaciones_Usuario_no_registrado_item(Publicacion publicacion, Lista_Publicaciones_Usuario_no_registrado interfaz) {
		this._publicaciones__Usuario_no_registrado_  = interfaz;
		this.publicacion = publicacion;
		NumeroComentarios();
		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();
		mostrarDatosUsuario();
		mostrarDatosPublicacion();
		if(this.publicacion.getPerteneceA() != null) {
			Ver_perfil();	
		}else {
			this.getBotonNombreUsuario().setEnabled(false);
		}
		Ver_publicacion__Usuario_No_Registrado_();
	}
	public void mostrarDatosPublicacion() {
		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getLabelGeolocalizacion().setText(publicacion.getLocalizacion());
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(this.publicacion.getVideo()));
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLayoutComentar().setVisible(false);

	}
	public void mostrarDatosUsuario() {
		if(this.publicacion.getPerteneceA() != null) {
			this.getVaadinAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
			this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		}else{
			this.getVaadinAvatar().setImage(this.publicacion.getEsPublicada().getFoto());
			this.getBotonNombreUsuario().setText(this.publicacion.getEsPublicada().getNombreUsuarioComercial());
		}
	}
	
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this);
		this.getBotonNombreUsuario().addClickListener(event ->{
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().removeAll();
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		this.verPublicacionUNR = new Ver_publicacion_Usuario_No_Registrado(publicacion, _publicaciones__Usuario_no_registrado_.unr);
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().removeAll();
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().add(verPublicacionUNR);
			});
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		verComentariosUNR = new Ver_comentarios_Usuario_No_registrado(this.publicacion, _publicaciones__Usuario_no_registrado_.unr);
		this.getBotonVerComentarios().addClickListener(event -> {
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().removeAll();
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().add(verComentariosUNR);
		});
	}

	public void NumeroMeGustas() {
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
	}

	public void NumeroComentarios() {
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
	}
}