package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Publicacion;
import vistas.VistaVerPublicacionesPropias;

public class Ver_publicaciones_propias extends VistaVerPublicacionesPropias{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_Publicaciones_propias _publicaciones_propias = new Lista_Publicaciones_propias();
	
	Publicacion p = new Publicacion("Joaquin", "Esta es mi publicacion", "fecha");
	Publicaciones_propias_item ppi = new Publicaciones_propias_item(p);
	
	public Ver_publicaciones_propias() {
		_publicaciones_propias.addPublicacionPropia(ppi);
		Publicaciones_propias();
	}

	public void Publicaciones_propias() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_propias);
	}
}