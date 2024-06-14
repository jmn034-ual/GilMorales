package interfaz;

import bd_dcl.Comentario;

public class Lista_comentarios_Usuario_registrado_item extends Lista_Comentarios_Vista_Usuario_No_registrado_item {

	//	private button _dar_me_gusta_comentarioB;
//	private button _denunciarB;
	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	public Denunciar_comentario _denunciar_comentario;
	
	public Lista_comentarios_Usuario_registrado_item(Object interfaz, Comentario comentario) {
		super(interfaz, comentario);
		// TODO Auto-generated constructor stub
	}

	public void Dar_me_gusta_comentario() {
		throw new UnsupportedOperationException();
	}

	public void Denunciar_comentario() {
		throw new UnsupportedOperationException();
	}
}