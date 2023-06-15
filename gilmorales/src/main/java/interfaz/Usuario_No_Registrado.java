package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.dom.Element;

import ch.qos.logback.classic.pattern.RelativeTimeConverter;
//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
	//	private button _iniciarSesionB;
	//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado = new Lista_Publicaciones__Usuario_no_registrado_();
	public Cabecera_Usuario_No_Registrado cabeceraUNR = new Cabecera_Usuario_No_Registrado();
	
	Lista_Publicaciones__Usuario_no_registrado__item item1 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
			"icons/icon.png", "videos/tiktok1.mp4");
	Lista_Publicaciones__Usuario_no_registrado__item item2 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario2", "Nijar", "Una publicacion de prueba",
			"icons/luffy.jpg", "videos/tiktok1.mp4");
	

	public Usuario_No_Registrado() {
		publicacionesNoRegistrado.anadirPublicacion(item1);
		publicacionesNoRegistrado.anadirPublicacion(item2);
		Lista_Publicaciones__Usuario_no_registrado_();
		Iniciar_Sesion();
		this.Cabecera_Usuario_No_Registrado();	
	}

	public void Lista_Publicaciones__Usuario_no_registrado_() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {

		this.getLayoutCabecera().add(cabeceraUNR);
		this.cabeceraUNR.getBotonRegistrarse().addClickListener(event-> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll(); 
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(cabeceraUNR);});
	}


	public void Iniciar_Sesion() {
		this.cabeceraUNR.getVaadinButton().addClickListener(event-> {this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll(); 
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Iniciar_Sesion__4());});
	}
}