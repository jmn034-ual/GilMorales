package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Imagen;
import TikTok.Video;
import vistas.VistaListaPublicacionesUsuarioNoRegistrado;
import vistas.VistaListaPublicacionesUsuarioNoRegistradoItem;

public class Lista_Publicaciones__Usuario_no_registrado__item extends VistaListaPublicacionesUsuarioNoRegistradoItem{
//	private ImageIcon _iconoUsuario;
//	private button _verPerfilB;
//	private Label _labelGeolocalizacion;
//	private Video _video;
//	private int _numeroVisualizaciones;
//	private Label _labelVisualizaciones;
	private int numeroMeGustas = Integer.parseInt(this.getLabelNumMeGustas().getText());
//	private String megusta;
//	private button _verComentariosB;
//	private int _numeroComentarios;
//	private Label _labelComentarios;
//	private TextArea _descripcion;
//	private button _verPublicacionB;
	public Lista_Publicaciones__Usuario_no_registrado_ _publicaciones__Usuario_no_registrado_;
	public Ver_Perfil__2 _ver_perfil;
	public Ver_publicacion__Usuario_No_Registrado_ verPublicacionUNR;
	public Ver_comentarios__Usuario_No_registrado_ verComentariosUNR;
	
	public Lista_Publicaciones__Usuario_no_registrado__item(String usuario, String localizacion, String descripcion, String foto, String video) {
		this.getVaadinAvatar().setImage(foto);
//		this.getFotoPerfil().as(VerticalLayout.class).add(new Image(foto, null));
		this.getBotonNombreUsuario().setText(usuario);
		this.getLabelGeolocalizacion().setText(localizacion);
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(video));
		this.getBotonSeguir().setVisible(false);
		this.getBotonDenunciar().setVisible(false);
	//	this.getLabelNumComentarios().add("0");
		this.getBotonVerComentarios().addClickListener(event->{Ver_comentarios__Usuario_No_registrado_();});
	//	this.getLabelMeGustas().add(megusta);
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(descripcion);
		this.getLabelNumMeGustas().setText(""+numeroMeGustas);
		this.getTextFieldComentario().setVisible(false);
		this.getBotonComentar().setVisible(false);
		
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_comentarios__Usuario_No_registrado_() {
		throw new UnsupportedOperationException();
	}

	public void NumeroMeGustas() {
		throw new UnsupportedOperationException();
	}

	public void NumeroComentarios() {
		throw new UnsupportedOperationException();
	}
}