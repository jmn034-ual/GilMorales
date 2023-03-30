package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-lista-publicaciones-comercial-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-comercial-item")
@JsModule("./src/vista-lista-publicaciones-comercial-item.ts")
public class VistaListaPublicacionesComercialItem extends LitTemplate {

    @Id("layoutVideo")
	private HorizontalLayout layoutVideo;
	@Id("div")
	private Div div;
	@Id("a")
	private Element a;

	/**
     * Creates a new VistaListaPublicacionesComercialItem.
     */
    public VistaListaPublicacionesComercialItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
