package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerPublicacionesGustadasUsuarioRegistrado;

public class Ver_publicaciones_gustadas_Usuario_registrado extends VistaVerPublicacionesGustadasUsuarioRegistrado{
	public Ver_perfil_propio _ver_perfil_propio;
	public Publicaciones_gustadas _publicaciones_gustadas ;

	public Ver_publicaciones_gustadas_Usuario_registrado(Ver_perfil_propio interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this._ver_perfil_propio = interfaz;
		Publicaciones_gustadas();
	}

	public void Publicaciones_gustadas() {
		this._publicaciones_gustadas = new Publicaciones_gustadas(this);
		this.getLayoutPublicacionesGustadas().as(VerticalLayout.class).add(_publicaciones_gustadas);
	}
}