package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesUsuarioNoRegistradoItem;
import vistas.VistaListaUsuariosItem;
import vistas.VistaPublicacionesGustadasItem;
import vistas.VistaPublicacionesUsuarioPublicoItem;

public class Lista_publicaciones_usuario_item extends VistaPublicacionesUsuarioPublicoItem{

	public Lista_publicaciones_usuario _lista_publicaciones_usuario;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	Publicacion publicacion;
	
	public Lista_publicaciones_usuario_item(Publicacion p, Lista_publicaciones_usuario interfaz) {
		this.publicacion = p;
		this._lista_publicaciones_usuario = interfaz;
		Video video = new Video(publicacion.getVideo());
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getNumVisualizaciones().setText(""+publicacion.getNumVisualizaciones());
		Ver_publicacion__Administrador();
	}

	public void Ver_publicacion__Administrador() {
		this._ver_publicacion__Administrador_ = new Ver_publicacion_Administrador(publicacion, this);
		this.getLayoutPublicacion().as(VerticalLayout.class).addClickListener(event -> {
			this._lista_publicaciones_usuario._ver_perfil__Administrador_.getVaadinHorizontalLayout().removeAll();
			this._lista_publicaciones_usuario._ver_perfil__Administrador_.getVaadinHorizontalLayout().add(_ver_publicacion__Administrador_);
		});
		
	}
}