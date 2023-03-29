package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-de-seguidores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-de-seguidores")
@JsModule("./src/vista-lista-de-seguidores.ts")
public class VistaListaDeSeguidores extends LitTemplate {

    @Id("layoutListaSeguidores")
	private Element layoutListaSeguidores;

	/**
     * Creates a new VistaListaDeSeguidores.
     */
    public VistaListaDeSeguidores() {
        // You can initialise any data required for the connected UI components here.
    }

}
