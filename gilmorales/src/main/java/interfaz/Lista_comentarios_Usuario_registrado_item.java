package interfaz;

import bd_dcl.Comentario;

public class Lista_comentarios_Usuario_registrado_item extends Lista_Comentarios_Vista_Usuario_No_registrado_item {

	//	private button _dar_me_gusta_comentarioB;
//	private button _denunciarB;
	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	public Denunciar_comentario _denunciar_comentario;
	
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
		this.Ver_perfil(this);
	}

	public void Dar_me_gusta_comentario() {
		throw new UnsupportedOperationException();
	}

	public void Denunciar_comentario() {
		throw new UnsupportedOperationException();
	}
}