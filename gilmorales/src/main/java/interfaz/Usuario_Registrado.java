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
			this.getListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Usuario_Registrado.Add_publiacacion());
			this._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(false);
		});
		this._cabecera_Usuario_Registrado._cabecera_TOP.getBotonVerListaHashtag().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Usuario_Registrado._cabecera_TOP);
	    	});
		this._cabecera_Usuario_Registrado._cabecera_TOP.getBotonVerListaUsuarios().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Usuario_Registrado._cabecera_TOP);
	    	});
		this._cabecera_Usuario_Registrado.getInicio().addClickListener(event -> {
			if(!this.getListaPublicaciones().isVisible()) {
				this.getListaPublicaciones().setVisible(true);
				this.getVaadinHorizontalLayout().remove(this.getVaadinHorizontalLayout().getComponentAt(0));
				if(!_cabecera_Usuario_Registrado.getBotonAniadir().isVisible()) this._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
			}
		});
		this._cabecera_Usuario_Registrado.getBotonPerfil().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
		});
	}
}