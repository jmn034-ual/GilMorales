package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;

public class Lista_comentarios_Usuario_registrado extends Lista_Comentarios_Vista_Usuario_No_registrado {
	// private button _comentarB;
	public Ver_comentarios_Usuario_Registrado _ver_comentarios__Usuario_Registrado_;
	public Vector<Lista_comentarios_Usuario_registrado_item> _item = new Vector<Lista_comentarios_Usuario_registrado_item>();
	iUsuario_Registrado bd = new BDPrincipal();
	Lista_comentarios_Usuario_registrado_item comentario;
	
	public Lista_comentarios_Usuario_registrado(Publicacion publicacion, Ver_comentarios_Usuario_Registrado interfaz) {
		this._ver_comentarios__Usuario_Registrado_ = interfaz;
		this.publicacion = publicacion;
		cargarComentarioUsuarioRegistrado();
	}

	public void cargarComentarioUsuarioRegistrado() {
		List<Comentario> lista = new ArrayList<Comentario>(this.publicacion.tieneComentarios.getCollection());

		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (Comentario com : lista) {
			this.comentario = new Lista_comentarios_Usuario_registrado_item(this, com);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.comentario);
			_item.add(this.comentario);

		}
	}

}