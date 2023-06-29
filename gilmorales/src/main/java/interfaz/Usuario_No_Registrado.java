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

import basededatos.BDPrincipal;
import ch.qos.logback.classic.pattern.RelativeTimeConverter;
//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
	//	private button _iniciarSesionB;
	//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Lista_Publicaciones_Usuario_no_registrado publicacionesNoRegistrado;
	public Cabecera_Usuario_No_Registrado cabeceraUNR;
	Login inicioSesion;
	private BDPrincipal bd;

	public Usuario_No_Registrado(BDPrincipal bd) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.bd = bd;
		Lista_Publicaciones__Usuario_no_registrado_();
//		Iniciar_Sesion();
		Cabecera_Usuario_No_Registrado();	
	}

	public void Lista_Publicaciones__Usuario_no_registrado_() {
		this.publicacionesNoRegistrado = new Lista_Publicaciones_Usuario_no_registrado(this);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {
		cabeceraUNR = new Cabecera_Usuario_No_Registrado(this);
		this.getLayoutCabecera().add(cabeceraUNR);
	}

	public void Iniciar_Sesion() {
		inicioSesion = new Login(bd);
		this.cabeceraUNR.getVaadinButton().addClickListener(event-> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll(); 
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(inicioSesion);
		});
	}
}