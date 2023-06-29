package interfaz;

import TikTok.Video;
import vistas.VistaListaPublicacionesComercialItem;

public class Lista_publicaciones_Comercial_item extends VistaListaPublicacionesComercialItem {
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private Video _video;
//	private button _verPublicacionB;
	public Lista_publicaciones_Comercial _lista_publicaciones__Comercial_;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;

	
	public Lista_publicaciones_Comercial_item() {
		this.getStyle().set("width", "50%");
		this.getStyle().set("height", "50%");
	}
	
	public Lista_publicaciones_Comercial_item(String video) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLayoutVideo().add(new Video(video));
	}
	
	
	public void Ver_publicacion_propia__Comercial_() {
		
	}

	public void NumeroVisualizaciones() {
		
	}
}