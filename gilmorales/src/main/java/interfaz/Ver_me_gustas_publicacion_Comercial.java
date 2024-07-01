package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import vistas.VistaVerMeGustasComercial;
import vistas.VistaVerMeGustasPublicacion;

public class Ver_me_gustas_publicacion_Comercial extends VistaVerMeGustasPublicacion{
//	private Label _tituloL;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;
	public Lista_usuarios _lista_usuarios;
	Publicacion p;

	public Ver_me_gustas_publicacion_Comercial(Publicacion publicacion, Ver_publicacion_propia_Comercial interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.p = publicacion;
		this._ver_publicacion_propia__Comercial_ = interfaz;
		Lista_usuarios();
	}

	public void Lista_usuarios() {
		this._lista_usuarios = new Lista_usuarios(this.p, this);
		this.getLayoutLista().as(VerticalLayout.class).add(this._lista_usuarios);

	}
}