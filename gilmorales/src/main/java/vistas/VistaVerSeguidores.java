package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-ver-seguidores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-seguidores")
@JsModule("./src/vista-ver-seguidores.ts")
public class VistaVerSeguidores extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo")
	private H2 titulo;
	@Id("layoutLista")
	private Element layoutLista;

	/**
     * Creates a new VistaVerSeguidores.
     */
    public VistaVerSeguidores() {
        // You can initialise any data required for the connected UI components here.
    }

}
