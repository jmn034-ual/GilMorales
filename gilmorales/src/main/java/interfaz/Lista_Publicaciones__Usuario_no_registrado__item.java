package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Imagen;
import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesUsuarioNoRegistrado;
import vistas.VistaListaPublicacionesUsuarioNoRegistradoItem;

public class Lista_Publicaciones__Usuario_no_registrado__item extends VistaListaPublicacionesUsuarioNoRegistradoItem{
	
	private int numeroMeGustas = Integer.parseInt(this.getLabelNumMeGustas().getText());
	private int bMeGustaPulsado = 0;
	public Lista_Publicaciones__Usuario_no_registrado_ _publicaciones__Usuario_no_registrado_;
	public Ver_perfil_publico ver_perfil;
	public Ver_publicacion__Usuario_No_Registrado_ verPublicacionUNR;
	public Ver_comentarios__Usuario_No_registrado_ verComentariosUNR;
	public Usuario_No_Registrado unr;
	private Publicacion publicacion;

	public Lista_Publicaciones__Usuario_no_registrado__item(Publicacion publicacion, Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.unr = unr;
		this.publicacion = publicacion;
		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getVaadinAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getLabelGeolocalizacion().setText("Almeria");
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(this.publicacion.getVideo()));
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getLayoutComentar().setVisible(false);
		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();
		Ver_perfil();
	}
	
	public Lista_Publicaciones__Usuario_no_registrado__item(String usuario, String localizacion, String descripcion, String foto, String video, Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getVaadinAvatar().setImage(foto);
		this.getBotonNombreUsuario().setText(usuario);
		this.getLabelGeolocalizacion().setText(localizacion);
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(video));
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(descripcion);
		this.getLabelNumMeGustas().setText(""+numeroMeGustas);
		this.getLayoutComentar().setVisible(false);
		this.unr = unr;
		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();
		Ver_perfil();
	}

	public void Ver_perfil() {
//		this.ver_perfil = new Ver_perfil_publico(publicacion.getPerteneceA());
		this.ver_perfil = new Ver_perfil_publico();
		this.getBotonNombreUsuario().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		verComentariosUNR = new Ver_comentarios__Usuario_No_registrado_(this);
		this.getBotonVerComentarios().addClickListener(event -> {
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
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