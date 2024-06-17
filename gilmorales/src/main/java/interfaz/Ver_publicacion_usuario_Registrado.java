package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerPublicacionUsuarioRegistrado;

public class Ver_publicacion_usuario_Registrado extends VistaVerPublicacionUsuarioRegistrado{

	public Ver_comentarios_Usuario_Registrado _ver_comentarios__Usuario_Registrado_;
	public Lista_Top_comentarios_Usuario_Registrado _lista_Top_comentarios__Usuario_Registrado_;
	Publicacion publicacion;
	UsuarioRegistrado user;
	UsuarioComercial uc;
	iUsuario_Registrado bd = new BDPrincipal();
	
	
	public Ver_publicacion_usuario_Registrado(Publicacion p, UsuarioRegistrado user) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = p;
		this.user = user;
		Lista_Top_comentarios__Usuario_Registrado_();
	}
	public Ver_publicacion_usuario_Registrado(Publicacion p, UsuarioComercial uc) {
		this.publicacion = p;
		this.uc = uc;
		Lista_Top_comentarios__Usuario_Registrado_();
	}
	
	public void comentar() {
		this.getBotonComentar().addClickListener(event -> {
			 this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(), this.getTextComentario().getValue());
		});
	}
	
	public void Ver_comentarios__Usuario_Registrado_(Object interfaz) {
		Ver_publicacion_ajena aux = (Ver_publicacion_ajena) interfaz;
		this.getBotonVerComentario().addClickListener(event->{
			_ver_comentarios__Usuario_Registrado_ = new Ver_comentarios_Usuario_Registrado(this.publicacion, aux, this.user);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_comentarios__Usuario_Registrado_);
		});
	}

	public void Lista_Top_comentarios__Usuario_Registrado_() {
		if(this.user != null) {
		_lista_Top_comentarios__Usuario_Registrado_ = new Lista_Top_comentarios_Usuario_Registrado(this.publicacion, this.user);
		}else {
			_lista_Top_comentarios__Usuario_Registrado_ = new Lista_Top_comentarios_Usuario_Registrado(this.publicacion, this.uc);
		}
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_comentarios__Usuario_Registrado_);
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
}