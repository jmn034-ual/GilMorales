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
	public Publicaciones_hashtag_item hashtagItem;
	public Lista_Top_Comentarios_Administrador _lista_Top_Comentarios__Administrador_;
	Publicacion publicacion;
	Administrador admin;
	
	public Ver_publicacion_Administrador(Publicacion p, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = p;
		if(interfaz instanceof Lista_Publicaciones_Administrador_item) {
			this._lista_Publicaciones__Administrador_ = (Lista_Publicaciones_Administrador_item) interfaz;
			this.admin = this._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador;
		}else if(interfaz instanceof Lista_publicaciones_usuario_item) {
			this._lista_publicaciones_usuario = (Lista_publicaciones_usuario_item) interfaz;
			this.admin = this._lista_publicaciones_usuario._lista_publicaciones_usuario._ver_perfil__Administrador_.cabecera_top.cabeceraAdmin._administrador;
		}else if(interfaz instanceof Lista_usuarios_registrados_item) {
			this.userRegistradoItem = (Lista_usuarios_registrados_item) interfaz;
			this.admin = this.userRegistradoItem._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP.cabeceraAdmin._administrador;
		}else if(interfaz instanceof Publicaciones_hashtag_item) {
			this.hashtagItem = (Publicaciones_hashtag_item) interfaz;
			this.admin = this.hashtagItem.admin;
		}else {
			this._lista_publicaciones_gustadas = (Lista_publicaciones_gustadas_item) interfaz;
			this.admin = this._lista_publicaciones_gustadas._lista_publicaciones_gustadas._ver_publicaciones_gustadas._ver_perfil__Administrador_.cabecera_top.cabeceraAdmin._administrador;
		}
		this.getVideo().add(new Video(this.publicacion.getVideo()));
		this.getVerPerfil().setText(this.publicacion.getNombreUsuario());
		if(this.publicacion.getPerteneceA() != null)
			this.getAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		else
			this.getAvatar().setImage(this.publicacion.getEsPublicada().getFoto());

		Lista_Top_Comentarios__Administrador_();
		NumeroComentarios();
		NumeroMeGustas();
		NumeroVisualizaciones();
		Ver_comentarios__Administrador_();
		VerPerfil();
		EliminarPublicacion();
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
			if(this.publicacion.getPerteneceA() != null)
				this.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(this.admin._cabecera_Administrador.cabeceraTOP, this.publicacion.getPerteneceA()));
			else
				this.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(this.admin._cabecera_Administrador.cabeceraTOP, this.publicacion.getEsPublicada()));
		});
	}

	public void NumeroMeGustas() {
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
	}

	public void NumeroComentarios() {
		this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+ "");
	}

	public void EliminarPublicacion() {
		this.getEliminarPublicacion().addClickListener(event -> {
			this.admin._iAdministrador.eliminarPublicacion(this.publicacion.getIdPublicacion());
			this.admin._cabecera_Administrador.getInicio().click();
		});
	}
}