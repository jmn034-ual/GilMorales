package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerPublicacionesGustadasUsuarioRegistrado;

public class Ver_publicaciones_gustadas__Usuario_registrado_ extends VistaVerPublicacionesGustadasUsuarioRegistrado{
	public Ver_perfil_propio _ver_perfil_propio;
	public Publicaciones_gustadas _publicaciones_gustadas = new Publicaciones_gustadas();

	public void Publicaciones_gustadas() {
		this.getLayoutPublicacionesGustadas().as(VerticalLayout.class).add(_publicaciones_gustadas);
	}
}