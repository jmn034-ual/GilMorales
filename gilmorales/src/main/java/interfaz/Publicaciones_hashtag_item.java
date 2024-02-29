package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtagItem;

public class Publicaciones_hashtag_item extends VistaPublicacionesHashtagItem{

	public Publicaciones_hashtag _publicaciones_hashtag;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Ver_Perfil__2 _ver_perfil;
	Publicacion publicacion;
	
	public Publicaciones_hashtag_item(Publicacion p) {
		this.publicacion = p;
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "50%");
		video.getStyle().set("height", "50%");
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
		throw new UnsupportedOperationException();
	}
}