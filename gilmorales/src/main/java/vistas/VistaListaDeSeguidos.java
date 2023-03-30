package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-de-seguidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-de-seguidos")
@JsModule("./src/vista-lista-de-seguidos.ts")
public class VistaListaDeSeguidos extends LitTemplate {

    @Id("layoutSeguidos")
	private Element layoutSeguidos;

	/**
     * Creates a new VistaListaDeSeguidos.
     */
    public VistaListaDeSeguidos() {
        // You can initialise any data required for the connected UI components here.
    }

}
