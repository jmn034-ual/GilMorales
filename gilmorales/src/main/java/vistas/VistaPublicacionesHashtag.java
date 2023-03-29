package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-publicaciones-hashtag template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-hashtag")
@JsModule("./src/vista-publicaciones-hashtag.ts")
public class VistaPublicacionesHashtag extends LitTemplate {

    @Id("layoutLista")
	private Element layoutLista;

	/**
     * Creates a new VistaPublicacionesHashtag.
     */
    public VistaPublicacionesHashtag() {
        // You can initialise any data required for the connected UI components here.
    }

}
