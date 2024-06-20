package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_comentarios_Usuario_Registrado extends Ver_comentarios {
	
	public Ver_publicacion_propia verPropia;
	public Ver_publicacion_ajena verAjena;
	public Lista_publicaciones_Usuario_Registrado_item publicacionItem;
	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	UsuarioRegistrado user;
	
	public Ver_comentarios_Usuario_Registrado(Publicacion publicacion, Object interfaz, UsuarioRegistrado user) {
		super(publicacion);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.user = user;
		if(interfaz instanceof Lista_publicaciones_Usuario_Registrado_item) {			
			this.publicacionItem = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
		}else if(interfaz instanceof Ver_publicacion_propia){
			this.verPropia = (Ver_publicacion_propia) interfaz;
		}else {
			this.verAjena = (Ver_publicacion_ajena) interfaz;
		}
		if(this.publicacion.getPerteneceA() != this.user) {
			this.getBotonEliminarAdmi().setVisible(false);
			this.getBotonSeguir().setVisible(true);

		}
		Lista_comentarios__Usuario_registrado_();
		Comentar();
		Dar_me_gusta_publicacion();
		Seguir();
		Ver_perfil(this);
	}

	public void Lista_comentarios__Usuario_registrado_() {
		_lista_comentarios__Usuario_registrado_ = new Lista_comentarios_Usuario_registrado(this.publicacion, this);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Usuario_registrado_);
	}

	public void Dar_me_gusta_publicacion() {
		this.getBotonMeGusta().addClickListener(event -> {
			this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		});	
	}

	public void Seguir() {
		if(this.user.seguir.contains(this.publicacion.getPerteneceA()))
			this.getBotonSeguir().setText("Dejar de Seguir");
		else
			this.getBotonSeguir().setText("Seguir");

		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.user.getID(), this.publicacion.getPerteneceA().getID());
		});
	}
	
	public void Comentar() {
		this.getBotonComentar().addClickListener(event -> {
			this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(),
					this.getTextFieldCmentario().getValue());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
			this.getLayoutListaComentarios().as(VerticalLayout.class).removeAll();
			Lista_comentarios__Usuario_registrado_();
			this.getTextFieldCmentario().setValue("");
		});
	}
}