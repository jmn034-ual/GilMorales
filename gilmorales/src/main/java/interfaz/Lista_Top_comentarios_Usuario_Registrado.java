package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Lista_Top_comentarios_Usuario_Registrado extends Lista_Top_Comentarios_Usuario_No_Registrado {

	public Ver_publicacion_usuario_Registrado _ver_publicacion__usuario_Registrado_;
	public Vector<Lista_Top_comentarios_Usuario_Registrado_item> _item = new Vector<Lista_Top_comentarios_Usuario_Registrado_item>();
	Lista_Top_comentarios_Usuario_Registrado_item comentario;
	UsuarioRegistrado user;
	UsuarioComercial uc;

	public Lista_Top_comentarios_Usuario_Registrado(Publicacion p, UsuarioRegistrado user, Ver_publicacion_usuario_Registrado interfaz) {
		super(p);
		this.user = user;
		this._ver_publicacion__usuario_Registrado_ = interfaz;
		this.cargarComentariosTOP();
	}
	public Lista_Top_comentarios_Usuario_Registrado(Publicacion p, UsuarioComercial uc) {
		super(p);
		this.uc = uc;
		this.cargarComentariosTOP();
	}

	@Override
	public void cargarComentariosTOP() {
		List<Comentario> comentarios = this.bd.cargarComentariosTOP(this.p.getIdPublicacion());
		if(_item != null) {
			this.getListaTopComentarios().as(VerticalLayout.class).removeAll();
			this._item.clear();	


			for(Comentario c : comentarios) {
				this.comentario = new Lista_Top_comentarios_Usuario_Registrado_item(c, this.user, this);
				this.getListaTopComentarios().as(VerticalLayout.class).add(comentario);
				_item.add(comentario);
				if(_item.size() == 5) break;
			}
		}
	}


}