package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	Usuario_No_Registrado unr;

	public Cabecera_Usuario_No_Registrado(Usuario_No_Registrado unr) {
		this.getStyle().set("width","100%");
		this.getStyle().set("height","100%");
		this.unr = unr;
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "80px");
		customIcon.getStyle().set("heigth", "80px");
		this.getLogoWeb().setIcon(customIcon);
		this.getVaadinVerticalLayout().setVisible(false);
//		Registrarse();
		Cabecera_TOP();
		Volver_Inicio();
		Realizar_busqueda();
	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda();
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
		this._cabecera_TOP = new Cabecera_TOP();
		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
    	this.getCabeceraNR().as(VerticalLayout.class).add(_cabecera_TOP);
	}

	public void Volver_Inicio() {
		this.getInicio().addClickListener(event -> {
			_realizar_busqueda = new Realizar_busqueda();
			this._cabecera_TOP.getCabeceraTop().setVisible(true);
			this._cabecera_TOP.getLayoutAyuda().setVisible(false);
	    	this.getCabeceraNR().as(VerticalLayout.class).remove(_cabecera_TOP);
			Cabecera_TOP();
			if(unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				unr.getVaadinHorizontalLayout().remove(unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			unr.getLayoutListaPublicaciones().setVisible(true);
		});
	}

//	public void Registrarse() {
//	this.getBotonRegistrarse().addClickListener(event -> {
//		this.getCabeceraNR().as(VerticalLayout.class).removeAll();
////		this.getStyle().set("width", "100%");
////    	this.getStyle().set("height", "100%");
//		this.getCabeceraNR().as(VerticalLayout.class).add(new Registrar());
//	});
//	}
}