package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP = new Cabecera_TOP();

	public Cabecera_Usuario_No_Registrado() {
		this.getStyle().set("width","100%");
		this.getStyle().set("height","100%");
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "80px");
		customIcon.getStyle().set("heigth", "80px");
		this.getLogoWeb().setIcon(customIcon);
		Registrarse();
		Cabecera_TOP();
		Volver_Inicio();
		Realizar_busqueda();
	}

	public void Realizar_busqueda() {
		_realizar_busqueda = new Realizar_busqueda();
		this.getBotonBuscar().addClickListener(event ->{
			this._realizar_busqueda.setVisible(true);
			this._cabecera_TOP.setVisible(false);
			this.getVaadinVerticalLayout().setVisible(true);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._realizar_busqueda);
		});
	}

	public void Cabecera_TOP() {
		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
    	this.getCabeceraNR().as(VerticalLayout.class).add(_cabecera_TOP);
	}

	public void Volver_Inicio() {
		this.getInicio().addClickListener(event -> {
			_realizar_busqueda = new Realizar_busqueda();
			this._cabecera_TOP.getCabeceraTop().setVisible(true);
			this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			Cabecera_TOP();
		});
	}

	public void Registrarse() {
	this.getBotonRegistrarse().addClickListener(event -> {
		this.getCabeceraNR().as(VerticalLayout.class).removeAll();
//		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
		this.getCabeceraNR().as(VerticalLayout.class).add(new Registrar());
	});
	}
}