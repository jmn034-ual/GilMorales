package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-publicaciones-usuario-publico-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-usuario-publico-item")
@JsModule("./src/vista-publicaciones-usuario-publico-item.ts")
public class VistaPublicacionesUsuarioPublicoItem extends LitTemplate {

    @Id("layoutItem")
	private Element layoutItem;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;

	/**
     * Creates a new VistaPublicacionesUsuarioPublicoItem.
     */
    public VistaPublicacionesUsuarioPublicoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
