package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesComercial;

public class Lista_publicaciones_Comercial extends VistaListaPublicacionesComercial{
	public Usuario_comercial _usuario_comercial;
	public Vector<Lista_publicaciones_Comercial_item> _item = new Vector<Lista_publicaciones_Comercial_item>();
	
public Lista_publicaciones_Comercial_item p = new Lista_publicaciones_Comercial_item("videos/tiktok.mp4");
	
	public Lista_publicaciones_Comercial() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	public void anadirPublicacion(Lista_publicaciones_Comercial_item publicacion) {
		this.getVaadinHorizontalLayout().add(publicacion);
		_item.add(publicacion);
	}
	
	
}