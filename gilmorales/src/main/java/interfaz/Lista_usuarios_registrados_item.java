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
	public Ver_perfil_publico ver_perfil;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	UsuarioRegistrado user;
	Administrador adminInterfaz;
	Usuario_No_Registrado unr;
	Usuario_Registrado ur;
	
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
	public Lista_usuarios_registrados_item(UsuarioRegistrado user, Usuario_No_Registrado unr) {
		this.user = user;
		this.unr = unr;
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getStyle().set("border-radius", "8px");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);
		this.getBotonNombreUsuario().setText(this.user.getNombreUsuario());
		this.getFotoPerfil().setImage(this.user.getFoto());
		this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
		Ver_perfilUNR();
	}
	public Lista_usuarios_registrados_item(UsuarioRegistrado user, Usuario_Registrado ur) {
		this.user = user;
		this.ur = ur;
		Video video = new Video("videos/tiktok1.mp4"); 
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
        video.getStyle().set("border-radius", "8px");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false);
		this.getBotonNombreUsuario().setText(this.user.getNombreUsuario());
		this.getFotoPerfil().setImage(this.user.getFoto());
		this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
		Ver_perfilUR();
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
		Ver_perfilAdmin();
	}
	public void Ver_perfilUR() {
		this.ver_perfil = new Ver_perfil_publico(this.user);
		this.getBotonNombreUsuario().addClickListener(event ->{
			ur.getListaPublicaciones().setVisible(false);
			ur._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(false);
			if(ur.getVaadinHorizontalLayout().getComponentCount() != 0) {
				ur.getVaadinHorizontalLayout().remove(ur.getVaadinHorizontalLayout().getComponentAt(0));
			}
			ur.getVaadinHorizontalLayout().add(ver_perfil);
			
			});
		
	}
	public void Ver_perfilUNR() {
		this.ver_perfil = new Ver_perfil_publico(this.user);
		this.getBotonNombreUsuario().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
		
	}
	public void Ver_perfilAdmin() {
		this.ver_perfil = new Ver_perfil_publico(this.user);
		this.getBotonNombreUsuario().addClickListener(event ->{
			adminInterfaz.getLayoutPublicaciones().setVisible(false);
//			adminInterfaz._cabecera_Administrador._cabecera_TOP.setVisible(false);
			adminInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
		
	}

	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}
}