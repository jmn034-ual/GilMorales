package interfaz;

import TikTok.Video;
import vistas.VistaListaPublicacionesComercialItem;

public class Lista_publicaciones__Comercial__item extends VistaListaPublicacionesComercialItem {
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private Video _video;
//	private button _verPublicacionB;
	public Lista_publicaciones__Comercial_ _lista_publicaciones__Comercial_;
	public Ver_publicacion_propia__Comercial_ _ver_publicacion_propia__Comercial_;

	
	public Lista_publicaciones__Comercial__item() {
		this.getStyle().set("width", "50%");
		this.getStyle().set("height", "50%");
	}
	
	public Lista_publicaciones__Comercial__item(String video) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLayoutVideo().add(new Video(video));
	}
	
	
	public void Ver_publicacion_propia__Comercial_() {
		
	}

	public void NumeroVisualizaciones() {
		
	}
}