package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_comentarios_Usuario_Registrado extends Ver_comentarios {
	
	public Ver_publicacion_usuario_Registrado _ver_publicacion__usuario_Registrado_;
	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	UsuarioRegistrado user;
	
	public Ver_comentarios_Usuario_Registrado(Publicacion publicacion, Usuario_Registrado ur, UsuarioRegistrado user) {
		super(publicacion);
		this.user = user;
		Lista_comentarios__Usuario_registrado_();
	}

	public void Lista_comentarios__Usuario_registrado_() {
		_lista_comentarios__Usuario_registrado_ = new Lista_comentarios_Usuario_registrado(publicacion, this);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Usuario_registrado_);
	}

	public void Dar_me_gusta_publicacion() {
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		this.getBotonMeGusta().addClickListener(event -> {
			this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
		});	
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.user.getID(), this.publicacion.getPerteneceA().getID());
		});
	}
}