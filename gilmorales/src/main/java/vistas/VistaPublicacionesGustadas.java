package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-publicaciones-gustadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-gustadas")
@JsModule("./src/vista-publicaciones-gustadas.ts")
public class VistaPublicacionesGustadas extends LitTemplate {

    @Id("layoutListaVertical")
	private Element layoutListaVertical;

	public Element getLayoutListaVertical() {
		return layoutListaVertical;
	}


	public void setLayoutListaVertical(Element layoutListaVertical) {
		this.layoutListaVertical = layoutListaVertical;
	}




	/**
     * Creates a new VistaPublicacionesGustadas.
     */
    public VistaPublicacionesGustadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
