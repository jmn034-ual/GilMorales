package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtagItem;

public class Publicaciones_hashtag_item extends VistaPublicacionesHashtagItem{

	public Publicaciones_hashtag _publicaciones_hashtag;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Ver_perfil_publico perfilPublico;
	public Ver_perfil_privado perfilPrivado;
	public Usuario_No_Registrado userNoRegistrado;
	public Usuario_Registrado userRegistrado;
	Publicacion publicacion;
	
	public Publicaciones_hashtag_item(Publicacion p, Publicaciones_hashtag interfaz) {
		this._publicaciones_hashtag = interfaz;
		this.publicacion = p;
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "70%");
		video.getStyle().set("height", "70%");
		this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getImagenPublicacion().as(VerticalLayout.class).add(video);
		Ver_publicacion_ajena();
		Ver_perfil();
		
	}

	public void Ver_publicacion_ajena() {
		_ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.userRegistrado);
		this.getLayoutItem().addClickListener(event -> {
			this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if(this._publicaciones_hashtag._ver_hashtag._top_hashtags.unrInterfaz != null) {
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_publicacion_Usuario_No_Registrado(publicacion, this._publicaciones_hashtag._ver_hashtag._top_hashtags.unrInterfaz ));
			}else {
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_publicacion_ajena);

			}
		});
		
	}

	public void Ver_perfil() {
		this.getBotonNombreUsuario().addClickListener(event ->{
			if(this.publicacion.getPerteneceA()!= null && this.publicacion.getPerteneceA().getPrivacidad() != 0) {
				perfilPrivado = new Ver_perfil_privado(this.publicacion.getPerteneceA());
				this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(perfilPrivado);
			}else if(this.publicacion.getPerteneceA() != null) {
				perfilPublico = new Ver_perfil_publico(this.publicacion.getPerteneceA());
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).add(perfilPublico);
			}
		});
	}
}