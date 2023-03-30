package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-lista-publicaciones-propias-eliminar-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-propias-eliminar-item")
@JsModule("./src/vista-lista-publicaciones-propias-eliminar-item.ts")
public class VistaListaPublicacionesPropiasEliminarItem extends LitTemplate {

    @Id("layoutItem")
	private Element layoutItem;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("checkboxEliminar")
	private Checkbox checkboxEliminar;

	/**
     * Creates a new VistaListaPublicacionesPropiasEliminarItem.
     */
    public VistaListaPublicacionesPropiasEliminarItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
