package interfaz;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesComercialItem;

public class Lista_publicaciones_Comercial_item extends VistaListaPublicacionesComercialItem {

	public Lista_publicaciones_Comercial _lista_publicaciones__Comercial_;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;
	Publicacion publicacion;
	
	public Lista_publicaciones_Comercial_item(Publicacion p, Lista_publicaciones_Comercial interfaz) {
		this._lista_publicaciones__Comercial_ = interfaz;
		this.publicacion = p;
		Ver_publicacion_propia__Comercial_();
	}
	
	
	public void Ver_publicacion_propia__Comercial_() {
		this._ver_publicacion_propia__Comercial_ = new Ver_publicacion_propia_Comercial(this.publicacion, this);
		
	}

//	public void NumeroVisualizaciones() {
//	}
}