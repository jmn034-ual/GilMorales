package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-notificaciones-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-item")
@JsModule("./src/vista-notificaciones-item.ts")
public class VistaNotificacionesItem extends LitTemplate {


	@Id("notificaciones")
	private Element notificaciones;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;

	
	public Element getNotificaciones() {
		return notificaciones;
	}


	public void setNotificaciones(Element notificaciones) {
		this.notificaciones = notificaciones;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	/**
     * Creates a new VistaNotificacionesItem.
     */
    public VistaNotificacionesItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
