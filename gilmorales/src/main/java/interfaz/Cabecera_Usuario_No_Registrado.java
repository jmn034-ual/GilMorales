package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
	public Registrar registro = new Registrar();
	public Realizar_busqueda _realizar_busqueda = new Realizar_busqueda();
	public Cabecera_TOP _cabecera_TOP;

	public Cabecera_Usuario_No_Registrado() {
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "100px");
		customIcon.getStyle().set("heigth", "100px");
		this.getLogoWeb().setIcon(customIcon);
//		Registrarse();
	}
	
	public void Realizar_busqueda() {
		throw new UnsupportedOperationException();
	}

	public void Cabecera_TOP() {
		throw new UnsupportedOperationException();
	}

	public void Volver_Inicio() {
		throw new UnsupportedOperationException();
	}

//	public void Registrarse() {
//	this.getBotonRegistrarse().addClickListener(event -> {
//		VerticalLayout registrar = new VerticalLayout();
//		registrar.add(registro);
//		
//	});
//	}
}