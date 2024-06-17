package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaVerPublicacionAdministrador;

public class Ver_publicacion_Administrador extends VistaVerPublicacionAdministrador{

	public Lista_Publicaciones_Administrador_item _lista_Publicaciones__Administrador_;
	public Lista_publicaciones_usuario_item _lista_publicaciones_usuario;
	public Lista_publicaciones_gustadas_item _lista_publicaciones_gustadas;
	public Ver_comentarios_Administrador _ver_comentarios__Administrador_;
	public Lista_usuarios_registrados_item userRegistradoItem;
	public Lista_Top_Comentarios_Administrador _lista_Top_Comentarios__Administrador_;
	Publicacion publicacion;
	
	public Ver_publicacion_Administrador(Publicacion p, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = p;
		if(interfaz instanceof Lista_Publicaciones_Administrador_item) {
			this._lista_Publicaciones__Administrador_ = (Lista_Publicaciones_Administrador_item) interfaz;
		}else if(interfaz instanceof Lista_publicaciones_usuario_item) {
			this._lista_publicaciones_usuario = (Lista_publicaciones_usuario_item) interfaz;
		}else if(interfaz instanceof Lista_usuarios_registrados_item) {
			this.userRegistradoItem = (Lista_usuarios_registrados_item) interfaz;
		}else {
			this._lista_publicaciones_gustadas = (Lista_publicaciones_gustadas_item) interfaz;
		}
		this.getVideo().add(new Video(this.publicacion.getVideo()));
		Lista_Top_Comentarios__Administrador_();
		NumeroComentarios();
		NumeroMeGustas();
		NumeroVisualizaciones();
		Ver_comentarios__Administrador_();
		VerPerfil();
	}

	public void Ver_comentarios__Administrador_() {
		this.getBotonVerComentario().addClickListener(event->{
			_ver_comentarios__Administrador_ = new Ver_comentarios_Administrador(this.publicacion, this);
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(_ver_comentarios__Administrador_);
		});
	}

	public void Lista_Top_Comentarios__Administrador_() {
			_lista_Top_Comentarios__Administrador_ = new Lista_Top_Comentarios_Administrador(this.publicacion, this);
			this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_Comentarios__Administrador_);	}

	public void VerPerfil() {
		this.getVerPerfil().addClickListener(event ->{
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(this.publicacion.getPerteneceA()));
		});
	}

	public void NumeroMeGustas() {
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
	}

	public void NumeroComentarios() {
		this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
	}

	public void EliminarPublicacion() {
		throw new UnsupportedOperationException();
	}
}