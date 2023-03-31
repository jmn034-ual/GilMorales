package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-notificaciones-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-comun")
@JsModule("./src/vista-notificaciones-comun.ts")
public class VistaNotificacionesComun extends LitTemplate {

    @Id("botonNombreUsuario")
	private Element botonNombreUsuario;
	@Id("tituloNotificacion")
	private H3 tituloNotificacion;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaNotificacionesComun.
     */
    public VistaNotificacionesComun() {
        // You can initialise any data required for the connected UI components here.
    }

}
