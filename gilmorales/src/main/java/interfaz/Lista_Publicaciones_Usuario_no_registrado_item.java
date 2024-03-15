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
	public Usuario_No_Registrado unr;
	public Publicacion publicacion;
	
	public Lista_Publicaciones_Usuario_no_registrado_item() {}

	public Lista_Publicaciones_Usuario_no_registrado_item(Publicacion publicacion, Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.unr = unr;
		this.publicacion = publicacion;
		this.numeroMeGustas = publicacion.getNumMeGustas();
		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getLabelGeolocalizacion().setText(publicacion.getLocalizacion());
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(this.publicacion.getVideo()));
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getLayoutComentar().setVisible(false);
		Ver_comentarios__Usuario_No_registrado_();
		mostrarDatosUsuario();
		if(this.publicacion.getPerteneceA() != null) {
			Ver_perfil();	
		}else {
			this.getBotonNombreUsuario().setDisableOnClick(false);
		}
		Ver_publicacion__Usuario_No_Registrado_();
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
		this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA());
		this.getBotonNombreUsuario().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.getLayoutCabeceraTop().setVisible(false);
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		this.verPublicacionUNR = new Ver_publicacion_Usuario_No_Registrado(publicacion, this.unr);
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.getLayoutCabeceraTop().setVisible(false);
			unr.getVaadinHorizontalLayout().add(verPublicacionUNR);
			});
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		verComentariosUNR = new Ver_comentarios_Usuario_No_registrado(this.publicacion, unr);
		this.getBotonVerComentarios().addClickListener(event -> {
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.getLayoutCabeceraTop().setVisible(false);
			unr.getVaadinHorizontalLayout().add(verComentariosUNR);
		});
	}

	public void NumeroMeGustas() {
		this.getVaadinButton().addClickListener(event ->{
			bMeGustaPulsado = bMeGustaPulsado == 0 ? 1 : 0;
			numeroMeGustas = bMeGustaPulsado == 1 ? ++numeroMeGustas : --numeroMeGustas;
			this.getLabelNumMeGustas().setText(""+numeroMeGustas);			
		});
	}

	public void NumeroComentarios() {
		throw new UnsupportedOperationException();
	}
}