package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerPublicacionUsuarioRegistrado;

public class Ver_publicacion_usuario_Registrado extends VistaVerPublicacionUsuarioRegistrado{
//	private Video _video;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private ImageIcon _usuarioIcono;
//	private button _verPerfilB;
//	private Label _geolocalizacionL;
//	private TextArea _descripcioTA;
//	private Label _fechaL;
//	private int _numeroMeGustas;
//	private Label _meGustasL;
//	private int _numeroComentarios;
//	private Label _comentariosL;
//	private button _verComentariosB;
	public Ver_comentarios_Usuario_Registrado _ver_comentarios__Usuario_Registrado_;
	public Lista_Top_comentarios_Usuario_Registrado _lista_Top_comentarios__Usuario_Registrado_;
	Publicacion publicacion;
	UsuarioRegistrado user;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_publicacion_usuario_Registrado(Publicacion p, UsuarioRegistrado user) {
		this.publicacion = p;
		this.user = user;
		Lista_Top_comentarios__Usuario_Registrado_();
	}
	
	public void comentar() {
		this.getBotonComentar().addClickListener(event -> {
			 this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(), this.getTextComentario().getValue());
		});
	}
	
	public void Ver_comentarios__Usuario_Registrado_() {
		throw new UnsupportedOperationException();
	}

	public void Lista_Top_comentarios__Usuario_Registrado_() {
		_lista_Top_comentarios__Usuario_Registrado_ = new Lista_Top_comentarios_Usuario_Registrado(this.publicacion, this.user);
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_comentarios__Usuario_Registrado_);
	}

	public void NumeroMeGustas() {
		throw new UnsupportedOperationException();
	}

	public void NumeroComentarios() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}