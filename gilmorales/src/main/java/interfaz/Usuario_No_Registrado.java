package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import ch.qos.logback.classic.pattern.RelativeTimeConverter;
//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
	//	private button _iniciarSesionB;
	//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	Cabecera_TOP top = new Cabecera_TOP();
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado= new Lista_Publicaciones__Usuario_no_registrado_();
	public Cabecera_Usuario_No_Registrado cabeceraUNR = new Cabecera_Usuario_No_Registrado();

	public Usuario_No_Registrado() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Publicaciones__Usuario_no_registrado_();
		this.Cabecera_Usuario_No_Registrado();	
		top.getLayoutListaResultadoBusqueda().setVisible(false);
		this.getLayoutCabeceraTop().as(VerticalLayout.class).add(top);
	}

	public void Publicaciones__Usuario_no_registrado_() {
		publicacionesNoRegistrado.getStyle().set("width", "100%");
		publicacionesNoRegistrado.getStyle().set("height", "100%");
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {
		cabeceraUNR.getStyle().set("width", "100%");
		cabeceraUNR.getStyle().set("height", "100%");
		this.getLayoutCabecera().add(cabeceraUNR);
	}


	public void Iniciar_Sesion() {
		throw new UnsupportedOperationException();
	}
}