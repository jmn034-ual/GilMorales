package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerPublicacionesPropias;

public class Ver_publicaciones_propias extends VistaVerPublicacionesPropias{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_Publicaciones_propias _publicaciones_propias = new Lista_Publicaciones_propias();
		
	public Ver_publicaciones_propias() {
		Publicaciones_propias();
	}

	public void Publicaciones_propias() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_propias);
	}
}