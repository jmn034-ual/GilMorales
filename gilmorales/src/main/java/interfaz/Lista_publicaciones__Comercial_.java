package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesComercial;

public class Lista_publicaciones__Comercial_ extends VistaListaPublicacionesComercial{
	public Usuario_comercial _usuario_comercial;
	public Vector<Lista_publicaciones__Comercial__item> _item = new Vector<Lista_publicaciones__Comercial__item>();
	
public Lista_publicaciones__Comercial__item p = new Lista_publicaciones__Comercial__item("videos/tiktok.mp4");
	
	public Lista_publicaciones__Comercial_() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	public void anadirPublicacion(Lista_publicaciones__Comercial__item publicacion) {
		this.getVaadinHorizontalLayout().add(publicacion);
		_item.add(publicacion);
	}
	
	
}