package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import vistas.VistaVerMeGustasPublicacion;

public class Ver_me_gustas_publicacion extends VistaVerMeGustasPublicacion{
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Lista_Me_Gustas_Publicacion _lista_Me_Gustas_Publicacion;
	Publicacion p;
	public Ver_me_gustas_publicacion(Publicacion publicacion, Ver_publicacion_propia interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.p = publicacion;
		this._ver_publicacion_propia = interfaz;
		Lista_Me_Gustas_Publicacion();
	}


	public void Lista_Me_Gustas_Publicacion() {
		_lista_Me_Gustas_Publicacion = new Lista_Me_Gustas_Publicacion(this.p, this);
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_Me_Gustas_Publicacion);
	}
}