package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-administrador-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador-principal")
@JsModule("./src/vista-administrador-principal.ts")
public class VistaAdministradorPrincipal extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabeceraAdmin")
	private HorizontalLayout layoutCabeceraAdmin;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("topUsuariosL")
	private H2 topUsuariosL;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("topHashtagL")
	private H2 topHashtagL;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("layoutPublicaciones")
	private Element layoutPublicaciones;

	/**
     * Creates a new VistaAdministradorPrincipal.
     */
    public VistaAdministradorPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}
