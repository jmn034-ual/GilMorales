package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-publicaciones-propias-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-propias-item")
@JsModule("./src/vista-publicaciones-propias-item.ts")
public class VistaPublicacionesPropiasItem extends LitTemplate {

    @Id("layoutFoto")
	private Element layoutFoto;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("layoutItem")
	private Element layoutItem;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;

	/**
     * Creates a new VistaPublicacionesPropiasItem.
     */
    public VistaPublicacionesPropiasItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
