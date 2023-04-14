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
	private int bMeGustaPulsado = 0;
	//	private String megusta;
	//	private button _verComentariosB;
	//	private int _numeroComentarios;
	//	private Label _labelComentarios;
	//	private TextArea _descripcion;
	//	private button _verPublicacionB;
	public Lista_Publicaciones__Usuario_no_registrado_ _publicaciones__Usuario_no_registrado_;
	public Ver_Perfil__2 _ver_perfil;
	public Ver_publicacion__Usuario_No_Registrado_ verPublicacionUNR;
	public Ver_comentarios__Usuario_No_registrado_ verComentariosUNR = new Ver_comentarios__Usuario_No_registrado_(this);


	public Lista_Publicaciones__Usuario_no_registrado__item() {

	}

	public Lista_Publicaciones__Usuario_no_registrado__item(String usuario, String localizacion, String descripcion, String foto, String video) {

		this.getLayoutBotonesUsuarioR().setVisible(false);
		this.getVaadinAvatar().setImage(foto);
		this.getBotonNombreUsuario().setText(usuario);
		this.getLabelGeolocalizacion().setText(localizacion);
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(video));
		this.getVaadinButton().setVisible(false);
		this.getLabelDescripcion().setText(descripcion);
		this.getLabelNumMeGustas().setText(""+numeroMeGustas);
		this.getLayoutComentar().setVisible(false);

		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();


	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Ver_publicacion__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_comentarios__Usuario_No_registrado_() {
		this.getBotonVerComentarios().addClickListener(event -> {
			this.getLayoutPublicacion().removeAll();
			this.getLayoutPublicacion().add(verComentariosUNR);
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