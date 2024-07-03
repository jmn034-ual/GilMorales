package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import vistas.VistaVerMeGustasPublicacion;

public class Ver_me_gustas_publicacion extends VistaVerMeGustasPublicacion{
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Lista_publicaciones_Usuario_Registrado_item listaItem;
	public Ver_comentarios_Usuario_Registrado verComentarios;
	public Lista_Me_Gustas_Publicacion _lista_Me_Gustas_Publicacion;
	Publicacion p;
	public Ver_me_gustas_publicacion(Publicacion publicacion, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.p = publicacion;
		if(interfaz instanceof Ver_publicacion_propia)
			this._ver_publicacion_propia = (Ver_publicacion_propia) interfaz;
		else if(interfaz instanceof Lista_publicaciones_Usuario_Registrado_item)
			this.listaItem = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
		else if(interfaz instanceof Ver_comentarios_Usuario_Registrado)
			this.verComentarios = (Ver_comentarios_Usuario_Registrado) interfaz;
		Lista_Me_Gustas_Publicacion();
	}


	public void Lista_Me_Gustas_Publicacion() {
		_lista_Me_Gustas_Publicacion = new Lista_Me_Gustas_Publicacion(this.p, this);
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_Me_Gustas_Publicacion);
	}
}