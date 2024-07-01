package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerPublicacionesGustadasOtroUsuario;

public class Ver_publicaciones_gustadas  extends VistaVerPublicacionesGustadasOtroUsuario{
	public Ver_perfil_Administrador _ver_perfil__Administrador_;
	public Lista_publicaciones_gustadas _lista_publicaciones_gustadas;
	
	public Ver_publicaciones_gustadas(Ver_perfil_Administrador interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this._ver_perfil__Administrador_ = interfaz;
		Lista_publicaciones_gustadas();
	}

	public void Lista_publicaciones_gustadas() {
		_lista_publicaciones_gustadas = new Lista_publicaciones_gustadas(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_lista_publicaciones_gustadas);
	}
}