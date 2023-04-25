package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import vistas.VistaListaUsuariosItem;

public class lista_usuarios_registrados_item extends VistaListaUsuariosItem{
//	private ImageIcon _iconoUsuario;
//	private button _verPerfilB;
//	private Label _nombreUsuarioL;
//	private TextArea _descripcionTA;
//	private button _verPublicacionB;
//	private Video _video;
	public lista_usuarios_registrados _lista_usuarios_registrados;
	public Ver_Perfil__2 _ver_perfil;
	public Ver_publicacion_ajena _ver_publicacion_ajena;

	public lista_usuarios_registrados_item(String nombreUsuario) {
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getStyle().set("border-radius", "8px");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);
		this.getBotonNombreUsuario().setText(nombreUsuario);
		this.getFotoPerfil().setImage("icons/icon.png");
		this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
	}
	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}
}