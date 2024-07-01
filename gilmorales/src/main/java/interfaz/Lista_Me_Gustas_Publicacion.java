package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaMeGustasPublicacion;

public class Lista_Me_Gustas_Publicacion extends VistaListaMeGustasPublicacion{
	public Ver_me_gustas_publicacion _ver_me_gustas_publicacion;
	public Vector<Lista_Me_Gustas_Publicacion_item> _item = new Vector<Lista_Me_Gustas_Publicacion_item>();
	Publicacion p;
	Lista_Me_Gustas_Publicacion_item meGusta;
	public Lista_Me_Gustas_Publicacion(Publicacion p, Ver_me_gustas_publicacion interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_me_gustas_publicacion = interfaz;
		this.p = p;
		cargarMeGustas();
	}
	
	public void cargarMeGustas() {
		List<UsuarioRegistrado> meGustas = new ArrayList<UsuarioRegistrado>(this.p.gustaA.getCollection());
		
		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for(UsuarioRegistrado u : meGustas) {
			this.meGusta = new Lista_Me_Gustas_Publicacion_item(u, this);
			this.getLayoutLista().as(VerticalLayout.class).add(this.meGusta);
			_item.add(meGusta);
			
		}
	}
}