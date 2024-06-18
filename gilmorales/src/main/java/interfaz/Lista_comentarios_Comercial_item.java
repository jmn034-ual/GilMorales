package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosComercialItem;

public class Lista_comentarios_Comercial_item extends VistaListaComentariosComercialItem {

	public Lista_comentarios_Comercial _lista_comentarios__Comercial_;
	public Denunciar_comentario _denunciar_comentario;
	Comentario comentario;
	
	public Lista_comentarios_Comercial_item(Comentario c, Lista_comentarios_Comercial interfaz) {
		this.comentario = c;
		this._lista_comentarios__Comercial_ = interfaz;
		this.getAvatar().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreDeUsuarioB1().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getLabel().setText(comentario.getNumeroMeGustas()+"");
		this.getDenunciarB().setVisible(true);
		_lista_comentarios__Comercial_ = interfaz;
		 Denunciar_comentario();
	}
	

	public void Denunciar_comentario() {
		this._denunciar_comentario = new Denunciar_comentario(comentario, this);
	}
}