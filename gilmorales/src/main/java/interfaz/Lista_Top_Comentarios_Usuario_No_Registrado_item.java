package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaTopComentariosUsuarioNoRegistradoItem;

public class Lista_Top_Comentarios_Usuario_No_Registrado_item extends VistaListaTopComentariosUsuarioNoRegistradoItem {
	private Image _usuarioIcono;
	private Button _verPerfilB;
	private Label _comentarioL;
	public Lista_Top_Comentarios_Usuario_No_Registrado _lista_Top_Comentarios__Usuario_No_Registrado_;
	public Ver_Perfil__2 _ver_perfil;
	Comentario comentario;
	
	public Lista_Top_Comentarios_Usuario_No_Registrado_item(Comentario comentario) {
		this.comentario = comentario;
		datosComentario();
	}
	
	public Lista_Top_Comentarios_Usuario_No_Registrado_item(Comentario comentario, Lista_Top_Comentarios_Usuario_No_Registrado interfaz) {
		this.comentario = comentario;
		this._lista_Top_Comentarios__Usuario_No_Registrado_ = interfaz;
		datosComentario();
	}
	
	public void datosComentario() {
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreDeUsuarioB().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getMeGustaL().setVisible(false);
		this.getBorrarComentarioB().setVisible(false);
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}