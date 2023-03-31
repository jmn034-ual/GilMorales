package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista-me-gustas-publicacion-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-me-gustas-publicacion-item")
@JsModule("./src/vista-lista-me-gustas-publicacion-item.ts")
public class VistaListaMeGustasPublicacionItem extends LitTemplate {

    @Id("layoutItem")
	private HorizontalLayout layoutItem;
	@Id("layoutFoto")
	private Element layoutFoto;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("botonSeguir")
	private Button botonSeguir;

	/**
     * Creates a new VistaListaMeGustasPublicacionItem.
     */
    public VistaListaMeGustasPublicacionItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
