package interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;

public class Lista_Top_Comentarios_Administrador_item extends Lista_Top_Comentarios_Usuario_No_Registrado_item {

	public Lista_Top_Comentarios_Administrador _lista_Top_Comentarios__Administrador_;
	iAdministrador bd = new BDPrincipal();

	public Lista_Top_Comentarios_Administrador_item(Comentario comentario) {
		super(comentario);		
		Borrar_comentario();
	}

	public void Borrar_comentario() {
		this.getBorrarComentarioB().addClickListener(event -> { 
//			bd.borrarComentario(comentario.getIdComentario(), comentario.getComentadoEn().getIdPublicacion(), comentario.getComentadoEn().getPerteneceA().getID());
			bd.borrarComentario(comentario.getIdComentario());
		});
	}
}