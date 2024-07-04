package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-notificaciones-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-comun")
@JsModule("./src/vista-notificaciones-comun.ts")
public class VistaNotificacionesComun extends LitTemplate {



	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("tituloNotificacion")
	private H3 tituloNotificacion;
	@Id("listaNotificaciones")
	private Element listaNotificaciones;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public H3 getTituloNotificacion() {
		return tituloNotificacion;
	}


	public void setTituloNotificacion(H3 tituloNotificacion) {
		this.tituloNotificacion = tituloNotificacion;
	}


	public Element getListaNotificaciones() {
		return listaNotificaciones;
	}


	public void setListaNotificaciones(Element listaNotificaciones) {
		this.listaNotificaciones = listaNotificaciones;
	}


	/**
     * Creates a new VistaNotificacionesComun.
     */
    public VistaNotificacionesComun() {
        // You can initialise any data required for the connected UI components here.
    }

}
