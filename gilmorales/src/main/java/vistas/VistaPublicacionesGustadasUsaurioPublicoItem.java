package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-publicaciones-gustadas-usaurio-publico-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-gustadas-usaurio-publico-item")
@JsModule("./src/vista-publicaciones-gustadas-usaurio-publico-item.ts")
public class VistaPublicacionesGustadasUsaurioPublicoItem extends LitTemplate {

    @Id("layoutItem")
	private Element layoutItem;
	@Id("publicacion")
	private Element publicacion;
	@Id("video")
	private Element video;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;

	/**
     * Creates a new VistaPublicacionesGustadasUsaurioPublicoItem.
     */
    public VistaPublicacionesGustadasUsaurioPublicoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
