package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Publicacion;
import vistas.VistaEliminarPublicaciones;

public class Eliminar_publicaciones extends VistaEliminarPublicaciones{
	private Label _tituloL;
	private Label _subTituloL;
	private Button _cancelarB;
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_publicaciones_propias__Eliminar_ _lista_publicaciones_propias = new Lista_publicaciones_propias__Eliminar_();
	Publicacion p = new Publicacion("Joaquin", "Esta es mi publicacion", "fecha");
	Publicacion p2 = new Publicacion("Joaquin", "Esta es mi publicacion", "fecha");
	Publicacion p3 = new Publicacion("Joaquin", "Esta es mi publicacion", "fecha");

	Lista_publicaciones_propias__Eliminar__item item = new Lista_publicaciones_propias__Eliminar__item(p);
	Lista_publicaciones_propias__Eliminar__item item2 = new Lista_publicaciones_propias__Eliminar__item(p2);
	Lista_publicaciones_propias__Eliminar__item item3 = new Lista_publicaciones_propias__Eliminar__item(p3);


	public Eliminar_publicaciones() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
//    	_lista_publicaciones_propias.addPublicacion(item);
//    	_lista_publicaciones_propias.addPublicacion(item2);
//    	_lista_publicaciones_propias.addPublicacion(item3);
    	Cancelar();
    	Lista_publicaciones_propias();
	}

	public void Lista_publicaciones_propias() {
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_publicaciones_propias);
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.setVisible(false);
		});
	}
}