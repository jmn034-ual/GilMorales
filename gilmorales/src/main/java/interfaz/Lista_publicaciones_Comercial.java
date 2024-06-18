package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
		
		if(publicaciones != null) {
			int tamanio = publicaciones.size();
			for(int i = 0; i < publicaciones.size(); i++) {
				if(tamanio >= 3) {					
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_publicaciones_Comercial_item(publicaciones.get(i), this),
							new Lista_publicaciones_Comercial_item(publicaciones.get(++i), this), new Lista_publicaciones_Comercial_item(publicaciones.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_publicaciones_Comercial_item(publicaciones.get(i), this),
							new Lista_publicaciones_Comercial_item(publicaciones.get(i++), this));
					horizontal2.getStyle().set("width", "66.66%");
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Lista_publicaciones_Comercial_item(publicaciones.get(i), this));
					horizontal.getStyle().set("width", "33%");
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
		
	}
	
	
}