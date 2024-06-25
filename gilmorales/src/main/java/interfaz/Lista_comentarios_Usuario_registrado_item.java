package interfaz;

import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Lista_comentarios_Usuario_registrado_item extends Lista_Comentarios_Vista_Usuario_No_registrado_item {

	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	public Denunciar_comentario _denunciar_comentario;
	BDPrincipal bd = new BDPrincipal();
	UsuarioRegistrado user;
	Publicacion publiacion;
	
	public Lista_comentarios_Usuario_registrado_item(Lista_comentarios_Usuario_registrado interfaz, Comentario comentario) {
		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreUsuario().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getMeGustaB().setEnabled(true);
		this.getDenunciarB().setVisible(true);
		this.getBorrarComentarioB().setVisible(false);
		this._lista_comentarios__Usuario_registrado_ = interfaz;
		this.comentario = comentario;
		this.user = bd.cargarUsuarioRegistrado(this._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.user.getID());
		this.Ver_perfil(this);
		Dar_me_gusta_comentario();
	}

	public void Dar_me_gusta_comentario() {
		this.getNumeroMeGusta().setText(this.comentario.getNumeroMeGustas()+"");
		this.getMeGustaB().addClickListener(event -> {
			this.comentario = this.bd.meGustaComentario(this.comentario.getIdComentario(), this.user.getID());
			this.getNumeroMeGusta().setText(this.comentario.getNumeroMeGustas()+"");
			this.publiacion = bd.cargarPublicacion(this._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.publicacion.getIdPublicacion());

		});
	}
	
	public void Denunciar_comentario() {
		throw new UnsupportedOperationException();
	}
}