package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-notificaciones-comentarios-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-comentarios-item")
@JsModule("./src/vista-notificaciones-comentarios-item.ts")
public class VistaNotificacionesComentariosItem extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("labelComentario")
	private Label labelComentario;

	/**
     * Creates a new VistaNotificacionesComentariosItem.
     */
    public VistaNotificacionesComentariosItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
