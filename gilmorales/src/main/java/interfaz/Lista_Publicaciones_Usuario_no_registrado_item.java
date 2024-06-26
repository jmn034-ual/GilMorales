package interfaz;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
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
	
	public Lista_Publicaciones_Usuario_no_registrado_item() {
		// TODO Auto-generated constructor stub
	}
	
	public Lista_Publicaciones_Usuario_no_registrado_item(Publicacion publicacion, Lista_Publicaciones_Usuario_no_registrado interfaz) {
		this._publicaciones__Usuario_no_registrado_  = interfaz;
		this.publicacion = publicacion;
		Icon icono = new Icon(VaadinIcon.HEART);
		icono.setSize("30px");
		this.getVaadinButton().setIcon(icono);
		this.getVaadinButton().getStyle().set("color", "black");
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
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "100%");
		video.getStyle().set("height", "100%");
        video.getStyle().set("border-radius", "8px");
		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getLabelGeolocalizacion().setText(publicacion.getLocalizacion());
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getVaadinButton().setEnabled(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLayoutComentar().setVisible(false);
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
		NumeroComentarios();
		NumeroMeGustas();
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
		this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this, this._publicaciones__Usuario_no_registrado_.unr.cabeceraUNR._cabecera_TOP);
		this.getBotonNombreUsuario().addClickListener(event ->{
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().removeAll();
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		this.verPublicacionUNR = new Ver_publicacion_Usuario_No_Registrado(this.publicacion, this);
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().removeAll();
			_publicaciones__Usuario_no_registrado_.unr.getVaadinHorizontalLayout().add(verPublicacionUNR);
			});
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		verComentariosUNR = new Ver_comentarios_Usuario_No_registrado(this.publicacion, this);
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