package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import vistas.VistaListaTopComentariosUsuarioNoRegistrado;

public class Lista_Top_Comentarios_Administrador extends Lista_Top_Comentarios_Usuario_No_Registrado {

	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	public Vector<Lista_Top_Comentarios_Administrador_item> itemAdmin = new Vector<Lista_Top_Comentarios_Administrador_item>();
	Lista_Top_Comentarios_Administrador_item comentario;

	public Lista_Top_Comentarios_Administrador(Publicacion p, Ver_publicacion_Administrador interfaz) {
		super(p);
		this._ver_publicacion__Administrador_ = interfaz;
		this.cargarComentariosTOPAdmin();
	}

	public void cargarComentariosTOPAdmin() {
		List<Comentario> comentarios = this.bd.cargarComentariosTOP(this.p.getIdPublicacion());
		
		this.getListaTopComentarios().as(VerticalLayout.class).removeAll();
//		if(this.itemAdmin != null) {
			this.itemAdmin.clear();

		for (Comentario c : comentarios) {
			this.comentario = new Lista_Top_Comentarios_Administrador_item(c, this);
			this.getListaTopComentarios().as(VerticalLayout.class).add(comentario);
			this.itemAdmin.add(comentario);
			if (this.itemAdmin.size() == 5)
				break;
		}
		
	}
}