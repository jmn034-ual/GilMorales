package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import vistas.VistaListaComentariosUsuarioNoRegistrado;

public class Lista_comentarios_Administrador extends VistaListaComentariosUsuarioNoRegistrado{
	public Ver_comentarios_Administrador _ver_comentarios__Administrador_;
	public Vector<Lista_comentarios_Administrador_item> _item = new Vector<Lista_comentarios_Administrador_item>();
	iAdministrador bd = new BDPrincipal();
	Publicacion publicacion;
	Lista_comentarios_Administrador_item comentario ;
	
	public Lista_comentarios_Administrador(Publicacion publicacion, Ver_comentarios_Administrador interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100");
		this.publicacion = publicacion;
		this._ver_comentarios__Administrador_ = interfaz;
		cargarComentarios();
	}
	
	public void cargarComentarios() {
		List<Comentario> comentarios = new ArrayList<Comentario>(this.publicacion.tieneComentarios.getCollection());
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (Comentario c : comentarios) {
			comentario = new Lista_comentarios_Administrador_item(c, this);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(comentario);
			_item.add(comentario);
		}

	}
	
	
	
}