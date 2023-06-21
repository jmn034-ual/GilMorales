package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesUsuarioNoRegistrado;

public class Lista_Publicaciones__Usuario_no_registrado_ extends VistaListaPublicacionesUsuarioNoRegistrado{
	public Usuario_No_Registrado unr;
	public Vector<Lista_Publicaciones__Usuario_no_registrado__item> _item = new Vector<Lista_Publicaciones__Usuario_no_registrado__item>();
	
	public Lista_Publicaciones__Usuario_no_registrado_(){
		
	}
	
	public Lista_Publicaciones__Usuario_no_registrado_(Usuario_No_Registrado unr){
		this.unr = unr;
		Lista_Publicaciones__Usuario_no_registrado__item item1 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
				"icons/icon.png", "videos/tiktok1.mp4", unr);
		Lista_Publicaciones__Usuario_no_registrado__item item2 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario2", "Nijar", "Una publicacion de prueba",
				"icons/luffy.jpg", "videos/tiktok1.mp4", unr);
		anadirPublicacion(item1);
		anadirPublicacion(item2);
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
