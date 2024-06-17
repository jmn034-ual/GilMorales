package interfaz;

import bd_dcl.Comentario;

public class Lista_comentarios_Comercial_item {

	public Lista_comentarios_Comercial _lista_comentarios__Comercial_;
	public Denunciar_comentario _denunciar_comentario;
	Comentario comentario;
	
	public Lista_comentarios_Comercial_item(Comentario c, Lista_comentarios_Comercial interfaz) {
		this.comentario = c;
		this._lista_comentarios__Comercial_ = interfaz;
	}
	

	public void Denunciar_comentario() {
		this._denunciar_comentario = new Denunciar_comentario(comentario, this);
	}
}