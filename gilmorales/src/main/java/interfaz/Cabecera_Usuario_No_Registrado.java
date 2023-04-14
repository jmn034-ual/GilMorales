package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
	public Realizar_busqueda _realizar_busqueda = new Realizar_busqueda();
	public Cabecera_TOP _cabecera_TOP = new Cabecera_TOP();

	public Cabecera_Usuario_No_Registrado() {
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "100px");
		customIcon.getStyle().set("heigth", "100px");
		this.getLogoWeb().setIcon(customIcon);
		Registrarse();
		Cabecera_TOP();
	}

	public void Realizar_busqueda() {
		throw new UnsupportedOperationException();
	}

	public void Cabecera_TOP() {
		_cabecera_TOP.getStyle().set("width", "100%");
		_cabecera_TOP.getStyle().set("height", "100%");
		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
		this.getCabeceraNR().as(VerticalLayout.class).add(_cabecera_TOP);
	}

	public void Volver_Inicio() {
		
	}

	public void Registrarse() {
	this.getBotonRegistrarse().addClickListener(event -> {
		this.getCabeceraNR().as(VerticalLayout.class).removeAll();
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getCabeceraNR().as(VerticalLayout.class).add(new Registrar());
	});
	}
}