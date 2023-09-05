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

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	Usuario_No_Registrado unr;

	public Cabecera_Usuario_No_Registrado(Usuario_No_Registrado unr) {
//		this.getStyle().set("width","100%");
//		this.getStyle().set("height","100%");
		this.unr = unr;
		this.getTextoBusqueda().getStyle().set("background-color", "transparent");
		this.getTextoBusqueda().getStyle().set("border-radius", "8px");
		this.getTextoBusqueda().getStyle().set("color", "#FFFFF");
		this.getVaadinButton().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
//		customIcon.getStyle().set("heigth", "8%");
		this.getLogoWeb().setIcon(customIcon);
		this.getVaadinVerticalLayout().setVisible(false);
//		Registrarse();
		Cabecera_TOP();
		Volver_Inicio();
		Realizar_busqueda();
	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue());
			this._realizar_busqueda.setVisible(true);
			this._cabecera_TOP.setVisible(false);
			if(unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				unr.getVaadinHorizontalLayout().remove(unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.getVaadinHorizontalLayout().add(_realizar_busqueda);
		});
	}

	public void Cabecera_TOP() {
		this._cabecera_TOP = new Cabecera_TOP(this.unr);
//		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
//		this.getCabeceraNR().as(VerticalLayout.class).add(_cabecera_TOP);
	}

	public void Volver_Inicio() {
		this.getInicio().addClickListener(event -> {
			unr.getLayoutCabeceraTop().setVisible(true);
			this._cabecera_TOP.setVisible(true);
			if(unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				unr.getVaadinHorizontalLayout().remove(unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			unr.getLayoutListaPublicaciones().setVisible(true);
		});
	}
//
//	public void Registrarse() {
//		this.getBotonRegistrarse().addClickListener(event -> {
//			this.unr.inicioSesion.Registrar();
//		});
//	}
}