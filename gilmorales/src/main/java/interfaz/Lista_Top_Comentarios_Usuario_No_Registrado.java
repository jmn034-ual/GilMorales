package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import vistas.VistaListaTopComentariosUsuarioNoRegistrado;

public class Lista_Top_Comentarios_Usuario_No_Registrado extends VistaListaTopComentariosUsuarioNoRegistrado{
	public Ver_publicacion_Usuario_No_Registrado _ver_publicacion__Usuario_No_Registrado_;
	public Vector<Lista_Top_Comentarios_Usuario_No_Registrado_item> _item = new Vector<Lista_Top_Comentarios_Usuario_No_Registrado_item>();
	Publicacion p;
	Lista_Top_Comentarios_Usuario_No_Registrado_item comentario;
	BDPrincipal bd = new BDPrincipal();
	
	public Lista_Top_Comentarios_Usuario_No_Registrado(Publicacion p) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.p = p;
		cargarComentariosTOP();
	}
	
	public Lista_Top_Comentarios_Usuario_No_Registrado(Publicacion p, Ver_publicacion_Usuario_No_Registrado interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._ver_publicacion__Usuario_No_Registrado_ = interfaz;
		this.p = p;
		cargarComentariosTOP();
	}
	
	public void cargarComentariosTOP() {
		List<Comentario> comentarios = this.bd.cargarComentariosTOP(this.p.getIdPublicacion());
		
		this.getListaTopComentarios().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for(Comentario c : comentarios) {
			this.comentario = new Lista_Top_Comentarios_Usuario_No_Registrado_item(c, this);
			this.getListaTopComentarios().as(VerticalLayout.class).add(comentario);
			_item.add(comentario);
			if(_item.size() == 5) break;
		}
	}

}