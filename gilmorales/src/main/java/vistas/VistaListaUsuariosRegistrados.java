package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-usuarios-registrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-usuarios-registrados")
@JsModule("./src/vista-lista-usuarios-registrados.ts")
public class VistaListaUsuariosRegistrados extends LitTemplate {

    @Id("layoutListaUsuariosRegistrados")
	private Element layoutListaUsuariosRegistrados;

	/**
     * Creates a new VistaListaUsuariosRegistrados.
     */
    public VistaListaUsuariosRegistrados() {
        // You can initialise any data required for the connected UI components here.
    }

}
