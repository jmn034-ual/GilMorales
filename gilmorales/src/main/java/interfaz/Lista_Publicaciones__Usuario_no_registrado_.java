package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesUsuarioNoRegistrado;

public class Lista_Publicaciones__Usuario_no_registrado_ extends VistaListaPublicacionesUsuarioNoRegistrado{
	public Usuario_No_Registrado _usuario_No_Registrado;
	public Vector<Lista_Publicaciones__Usuario_no_registrado__item> _item = new Vector<Lista_Publicaciones__Usuario_no_registrado__item>();
	Lista_Publicaciones__Usuario_no_registrado__item aux = new Lista_Publicaciones__Usuario_no_registrado__item();
	
	public Lista_Publicaciones__Usuario_no_registrado_() {
		
	}
	public void anadirPublicacion(Lista_Publicaciones__Usuario_no_registrado__item publicacion) {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(publicacion);
		_item.add(publicacion);
	}
	
	public Lista_Publicaciones__Usuario_no_registrado__item getPublicacion(Lista_Publicaciones__Usuario_no_registrado__item publicacion) {
		if(_item.contains(publicacion))return publicacion;
		return null;
	}	
}
