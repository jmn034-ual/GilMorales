package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado {
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	public Usuario_No_Registrado unr;

	public Cabecera_Usuario_No_Registrado(Usuario_No_Registrado unr) {
		this.unr = unr;
		this.getTextoBusqueda().getStyle().set("border-radius", "8px");
		this.getVaadinButton().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
		this.getLogoWeb().setIcon(customIcon);
		this.getVaadinVerticalLayout().setVisible(false);
		Cabecera_TOP();
		Volver_Inicio();
		Realizar_busqueda();
		Registrarse();
	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event -> {
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue(), this);
			unr.getVaadinHorizontalLayout().removeAll();
			unr.getVaadinHorizontalLayout().add(this._realizar_busqueda);
			this.getTextoBusqueda().setValue("");
		});
	}

	public void Cabecera_TOP() {
		this._cabecera_TOP = new Cabecera_TOP(this);
		this.unr.getVaadinHorizontalLayout().add(_cabecera_TOP);
	}

	public void Volver_Inicio() {
		this.getInicio().addClickListener(event -> {
			unr.getVaadinHorizontalLayout().removeAll();
			unr.getVaadinHorizontalLayout().add(new Cabecera_TOP(this),
					new Lista_Publicaciones_Usuario_no_registrado(unr));
		});
	}

	public void Registrarse() {
		this.getBotonRegistrarse().addClickListener(event -> {
			this.unr.inicioSesion.getRegistrarB().click();
		});
	}
}