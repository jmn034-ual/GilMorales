package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesComercial;

public class Lista_publicaciones_Comercial extends VistaListaPublicacionesComercial{
	public Usuario_comercial _usuario_comercial;
	public Vector<Lista_publicaciones_Comercial_item> _item = new Vector<Lista_publicaciones_Comercial_item>();
	BDPrincipal bd = new BDPrincipal();
	Lista_publicaciones_Comercial_item publi;
	
	public Lista_publicaciones_Comercial(Usuario_comercial interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._usuario_comercial = interfaz;
		cargarPubliaciones();
	}
	
	public void cargarPubliaciones() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this._usuario_comercial.comercial.publica.getCollection());
		this.getVaadinHorizontalLayout().removeAll();
		_item.clear();
		
		for(Publicacion p : publicaciones) {
			this.publi = new Lista_publicaciones_Comercial_item(p, this);
			this._item.add(this.publi);
		}
	}
	
	
}