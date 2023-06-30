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

	public Lista_Top_comentarios_Usuario_Registrado_item(Comentario comentario, UsuarioRegistrado usuario) {
		super(comentario);
		this.user = usuario;
		// TODO Auto-generated constructor stub
	}

	public Lista_Top_comentarios_Usuario_Registrado_item(Comentario comentario, UsuarioComercial uc) {
		super(comentario);
		this.uc = uc;
		// TODO Auto-generated constructor stub
	}

	public void Dar_me_gusta_comentario() {
		this.getMeGustaB().addClickListener(event ->{
			if(this.user != null) {
				bd.meGustaComentario(this.comentario.getIdComentario(), this.user.getID());
			}
		});
	}
}