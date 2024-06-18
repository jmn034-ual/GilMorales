package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import vistas.VistaListaComentariosComercial;

public class Lista_comentarios_Comercial extends VistaListaComentariosComercial{
	public Ver_comentarios_Comercial _ver_comentarios__Comercial_;
	public Vector<Lista_comentarios_Comercial_item> _item = new Vector<Lista_comentarios_Comercial_item>();
	Lista_comentarios_Comercial_item comentario;
	Publicacion publicacion;
	
	public Lista_comentarios_Comercial(Publicacion publicacion, Ver_comentarios_Comercial interfaz) {
		this.getStyle().set("width", "100%");
		this._ver_comentarios__Comercial_ = interfaz;
		this.publicacion = publicacion;
		cargarComentarios();
	}
	
	public void cargarComentarios() {
		List<Comentario> lista = new ArrayList<Comentario>(this.publicacion.tieneComentarios.getCollection());
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(Comentario com : lista) {
				this.comentario = new Lista_comentarios_Comercial_item(com, this);
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.comentario);
				_item.add(this.comentario);
			
		}
	}
	
	
}