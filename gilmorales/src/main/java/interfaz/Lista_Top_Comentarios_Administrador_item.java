package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;

public class Lista_Top_Comentarios_Administrador_item extends Lista_Top_Comentarios_Usuario_No_Registrado_item {

	public Lista_Top_Comentarios_Administrador _lista_Top_Comentarios__Administrador_;
	iAdministrador bd = new BDPrincipal();

	public Lista_Top_Comentarios_Administrador_item(Comentario comentario, Lista_Top_Comentarios_Administrador interfaz) {
		super(comentario);	
		this.getStyle().set("width", "100%");
		this._lista_Top_Comentarios__Administrador_ = interfaz;
		this.getBorrarComentarioB().setVisible(true);
		this.getMeGustaB().setEnabled(false);
		Borrar_comentario();
	}

	public void Borrar_comentario() {
		this.getBorrarComentarioB().addClickListener(event -> { 
			this._lista_Top_Comentarios__Administrador_.getListaTopComentarios().as(VerticalLayout.class).remove(this);
			this._lista_Top_Comentarios__Administrador_.itemAdmin.remove(this);
			bd.borrarComentario(comentario.getIdComentario());
		});
	}
}