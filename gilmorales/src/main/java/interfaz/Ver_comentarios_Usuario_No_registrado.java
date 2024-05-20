package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_comentarios_Usuario_No_registrado extends Ver_comentarios {
//	private Label _meGustasL;
	public Ver_publicacion_Usuario_No_Registrado verPublicacionUNR;
	public Lista_Publicaciones_Usuario_no_registrado_item _publicacionesUNR;
	public Lista_Comentarios_Vista_Usuario_No_registrado _lista_Comentarios__Vista_Usuario_No_registrado_;
	private Usuario_No_Registrado unrInterfaz;
	UsuarioRegistrado user;
	Publicacion publicacion;
	
	public Ver_comentarios_Usuario_No_registrado(Publicacion publicacion, Usuario_No_Registrado unr) {
		super(publicacion);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage("icons/luffy.jpg");
		this.getBotonComentar().setVisible(false);
		this.getBotonEliminarAdmi().setVisible(false);
		this.getBotonMeGusta().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getLayoutComentar().setVisible(false);
		this.unrInterfaz = unr;
		this.publicacion = publicacion;
		this.user = publicacion.getPerteneceA();
		Lista_Comentarios__Vista_Usuario_No_registrado_();
		this.Ver_perfil();
	}
	
	public void Lista_Comentarios__Vista_Usuario_No_registrado_() {
		_lista_Comentarios__Vista_Usuario_No_registrado_ = new Lista_Comentarios_Vista_Usuario_No_registrado(unrInterfaz, publicacion); 
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_Comentarios__Vista_Usuario_No_registrado_);
	}
	@Override
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(this.user, this);
		this.getBotonNombreUsuario().addClickListener(event ->{
			unrInterfaz.getVaadinHorizontalLayout().removeAll();
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
}