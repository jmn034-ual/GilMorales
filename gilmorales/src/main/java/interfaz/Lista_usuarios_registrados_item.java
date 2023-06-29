package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaUsuariosItem;

public class Lista_usuarios_registrados_item extends VistaListaUsuariosItem{
//	private ImageIcon _iconoUsuario;
//	private button _verPerfilB;
//	private Label _nombreUsuarioL;
//	private TextArea _descripcionTA;
//	private button _verPublicacionB;
//	private Video _video;
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	public Ver_perfil_publico _ver_perfil;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	UsuarioRegistrado user;
	Administrador adminInterfaz;
	
	public Lista_usuarios_registrados_item(UsuarioRegistrado user) {
		this.user = user;
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getStyle().set("border-radius", "8px");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);
		this.getBotonNombreUsuario().setText(this.user.getNombreUsuario());
		this.getFotoPerfil().setImage(this.user.getFoto());
		this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
	}

	public Lista_usuarios_registrados_item(UsuarioRegistrado user, Administrador adminInterfaz) {
		this.user = user;
		this.adminInterfaz = adminInterfaz;
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getStyle().set("border-radius", "8px");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);
		this.getBotonNombreUsuario().setText(this.user.getNombreUsuario());
		this.getFotoPerfil().setImage(this.user.getFoto());
		this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
	}
	public void Ver_perfil() {
		_ver_perfil = new Ver_perfil_publico(this.user);
		throw new UnsupportedOperationException();
	}

	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}
}