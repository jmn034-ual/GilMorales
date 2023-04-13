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
	public Cabecera_TOP top = new Cabecera_TOP();
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado;
	public Cabecera_Usuario_No_Registrado cabeceraUNR = new Cabecera_Usuario_No_Registrado();
	public Element cabeceraTop = top.getCabeceraTop();
	Lista_Publicaciones__Usuario_no_registrado__item item1 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
			"icons/icon.png", "videos/tiktok1.mp4");
	Lista_Publicaciones__Usuario_no_registrado__item item2 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
			"icons/luffy.jpg", "videos/tiktok1.mp4");
	Lista_Publicaciones__Usuario_no_registrado_ lp = new Lista_Publicaciones__Usuario_no_registrado_();
	

	public Usuario_No_Registrado() {
		lp.anadirPublicacion(item1);
		lp.anadirPublicacion(item2);
		Ver_comentarios__Usuario_No_registrado_ verComNR = new Ver_comentarios__Usuario_No_registrado_(item1);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(lp);
		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.Cabecera_Usuario_No_Registrado();	
		top.getLayoutListaResultadoBusqueda().setVisible(false);
		this.getLayoutCabeceraTop().as(VerticalLayout.class).add(top);
		this.cabeceraUNR.getVaadinButton().addClickListener(event-> {this.getVaadinVerticalLayout().removeAllChildren(); 
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Iniciar_Sesion__4());});
		this.cabeceraUNR.getBotonRegistrarse().addClickListener(event-> {this.getVaadinVerticalLayout().removeAllChildren(); 
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Registrar());});
		item1.getBotonVerComentarios().addClickListener(event-> {this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(verComNR);
		});

	}

//	public void Publicaciones__Usuario_no_registrado_() {
//		publicacionesNoRegistrado.getStyle().set("width", "100%");
//		publicacionesNoRegistrado.getStyle().set("height", "100%");
//		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
//	}

	public void Cabecera_Usuario_No_Registrado() {

		this.getLayoutCabecera().add(cabeceraUNR);
	}


	public void Iniciar_Sesion() {
		
	}
}