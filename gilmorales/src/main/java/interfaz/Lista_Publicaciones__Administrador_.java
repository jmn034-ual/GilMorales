package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesAdministrador;

public class Lista_Publicaciones__Administrador_ extends VistaListaPublicacionesAdministrador{
	public Administrador _administrador;
	public Vector<Lista_Publicaciones__Administrador__item> _item = new Vector<Lista_Publicaciones__Administrador__item>();
	public Lista_Publicaciones__Administrador__item p = new Lista_Publicaciones__Administrador__item();
	
	public Lista_Publicaciones__Administrador_() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	};
	
	public void anadirPublicacion(Lista_Publicaciones__Administrador__item pub) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(pub);;
		_item.add(pub);
	}
}