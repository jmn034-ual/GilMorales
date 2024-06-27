package interfaz;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Comentario;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Lista_Top_comentarios_Usuario_Registrado_item extends Lista_Top_Comentarios_Usuario_No_Registrado_item {

	//	private button _dar_me_gusta_comentarioB;
	public Lista_Top_comentarios_Usuario_Registrado _lista_Top_comentarios__Usuario_Registrado_;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado user;
	UsuarioComercial uc;

	public Lista_Top_comentarios_Usuario_Registrado_item(Comentario comentario, UsuarioRegistrado usuario, Lista_Top_comentarios_Usuario_Registrado interfaz) {
		super(comentario);
		this.getStyle().set("width", "100%");
		this.user = usuario;
		this._lista_Top_comentarios__Usuario_Registrado_ = interfaz;
		datosComentario();
		Dar_me_gusta_comentario();
		Ver_perfil(this);
	}

	public void Dar_me_gusta_comentario() {
		this.getMeGustaB().addClickListener(event ->{
			if(this.user != null) {
			this.comentario = bd.meGustaComentario(this.comentario.getIdComentario(), this.user.getID());
				this.getNumeroMeGusta().setText(this.comentario.getNumeroMeGustas() +"");
			}
		});
	}
}