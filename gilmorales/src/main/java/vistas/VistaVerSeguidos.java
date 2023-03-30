package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-ver-seguidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-seguidos")
@JsModule("./src/vista-ver-seguidos.ts")
public class VistaVerSeguidos extends LitTemplate {

    @Id("layoutListaSeguidos")
	private Element layoutListaSeguidos;
	@Id("titulo")
	private H2 titulo;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaVerSeguidos.
     */
    public VistaVerSeguidos() {
        // You can initialise any data required for the connected UI components here.
    }

}
