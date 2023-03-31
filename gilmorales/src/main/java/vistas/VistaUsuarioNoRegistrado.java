package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-no-registrado")
@JsModule("./src/vista-usuario-no-registrado.ts")
public class VistaUsuarioNoRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutCabeceraTop")
	private Element layoutCabeceraTop;
	@Id("layoutListaPublicaciones")
	private Element layoutListaPublicaciones;

	/**
     * Creates a new VistaUsuarioNoRegistrado.
     */
    public VistaUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
