package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaComentariosUsuarioNoRegistrado;

public class Lista_comentarios__Administrador_ extends VistaListaComentariosUsuarioNoRegistrado{
	public Ver_comentarios__Administrador_ _ver_comentarios__Administrador_;
	public Vector<Lista_comentarios__Administrador__item> _item = new Vector<Lista_comentarios__Administrador__item>();
	
	public Lista_comentarios__Administrador_() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100");
	}
	
	public void anadirComentario(Lista_comentarios__Administrador__item item) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(item);
		_item.add(item);
	}
	
}