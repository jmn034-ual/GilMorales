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
	Publicacion publicacion;
	
	public Publicaciones_hashtag_item(Publicacion p) {
		this.publicacion = p;
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "70%");
		video.getStyle().set("height", "70%");
		this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getImagenPublicacion().as(VerticalLayout.class).add(video);
		Ver_publicacion_ajena();
	}

	public void Ver_publicacion_ajena() {
		this.getImagenPublicacion().as(VerticalLayout.class).addClickListener(event -> {
			Notification.show("Has hecho click");
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
				this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(perfilPublico);
			}
		});
	}
}