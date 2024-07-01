package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaMeGustasPublicacion;

public class Lista_usuarios  extends VistaListaMeGustasPublicacion{
	public Ver_me_gustas_publicacion_Comercial _ver_me_gustas_publicacion__Comercial_;
	public Vector<Lista_usuarios_item> _item = new Vector<Lista_usuarios_item>();
	Publicacion p;
	Lista_usuarios_item meGusta;
	
	public Lista_usuarios(Publicacion p, Ver_me_gustas_publicacion_Comercial interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_me_gustas_publicacion__Comercial_ = interfaz;
		this.p = p;
		cargarMeGustas();
	}
	

	public void cargarMeGustas() {
		List<UsuarioRegistrado> meGustas = new ArrayList<UsuarioRegistrado>(this.p.gustaA.getCollection());
		
		this.getLayoutLista().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for(UsuarioRegistrado u : meGustas) {
			this.meGusta = new Lista_usuarios_item(u, this);
			this.getLayoutLista().as(VerticalLayout.class).add(this.meGusta);
			_item.add(meGusta);
			
		}
	}
}