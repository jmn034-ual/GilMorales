package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-usuarios-comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-usuarios-comercial")
@JsModule("./src/vista-lista-usuarios-comercial.ts")
public class VistaListaUsuariosComercial extends LitTemplate {

    @Id("layoutListaUsuarios")
	private Element layoutListaUsuarios;

	/**
     * Creates a new VistaListaUsuariosComercial.
     */
    public VistaListaUsuariosComercial() {
        // You can initialise any data required for the connected UI components here.
    }

}
