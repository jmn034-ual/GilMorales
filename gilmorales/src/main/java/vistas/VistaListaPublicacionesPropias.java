package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-publicaciones-propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-propias")
@JsModule("./src/vista-lista-publicaciones-propias.ts")
public class VistaListaPublicacionesPropias extends LitTemplate {

    @Id("layoutLista")
	private Element layoutLista;

	/**
     * Creates a new VistaListaPublicacionesPropias.
     */
    public VistaListaPublicacionesPropias() {
        // You can initialise any data required for the connected UI components here.
    }

}
