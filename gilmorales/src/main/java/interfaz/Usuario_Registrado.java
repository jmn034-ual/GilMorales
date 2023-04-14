package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarioRegistrado;

//import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
//	public iUsuario_Registrado _iUsuario_Registrado;
	public Lista_publicaciones__Usuario_Registrado_ listaPublicaciones = new Lista_publicaciones__Usuario_Registrado_();
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado();
	
	Lista_publicaciones__Usuario_Registrado__item item1 = new Lista_publicaciones__Usuario_Registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
			"icons/icon.png", "videos/tiktok1.mp4");
	Lista_publicaciones__Usuario_Registrado__item item2 = new Lista_publicaciones__Usuario_Registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
			"icons/luffy.jpg", "videos/tiktok1.mp4");
	
	public Usuario_Registrado() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		listaPublicaciones.anadirPublicacion(item1);
		listaPublicaciones.anadirPublicacion(item2);
		
		Cabecera_Usuario_Registrado();
		Lista_publicaciones__Usuario_Registrado_();
		
		
	}
	public void Lista_publicaciones__Usuario_Registrado_() {
		this.getListaPublicaciones().as(VerticalLayout.class).add(listaPublicaciones);
	}

	public void Cabecera_Usuario_Registrado() {
		this.getCabecera().add(_cabecera_Usuario_Registrado);
		this._cabecera_Usuario_Registrado.getBotonAniadir().addClickListener(event ->{
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getCabecera().getStyle().set("width", "100%");
	    	this.getCabecera().getStyle().set("height", "100%");
		});
		this._cabecera_Usuario_Registrado._cabecera_TOP.getBotonVerListaHashtag().addClickListener(event -> {
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getCabecera().getStyle().set("width", "100%");
	    	this.getCabecera().getStyle().set("height", "100%");
	    	});
	}
}