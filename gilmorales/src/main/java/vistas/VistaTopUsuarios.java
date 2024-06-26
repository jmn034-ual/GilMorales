package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-top-usuarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-top-usuarios")
@JsModule("./src/vista-top-usuarios.ts")
public class VistaTopUsuarios extends LitTemplate {

    @Id("layoutTopUsuarios")
	private Element layoutTopUsuarios;

    
	public Element getLayoutTopUsuarios() {
		return layoutTopUsuarios;
	}


	public void setLayoutTopUsuarios(Element layoutTopUsuarios) {
		this.layoutTopUsuarios = layoutTopUsuarios;
	}


	/**
     * Creates a new VistaTopUsuarios.
     */
    public VistaTopUsuarios() {
        // You can initialise any data required for the connected UI components here.
    }

}
