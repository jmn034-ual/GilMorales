package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-top-hashtags template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-top-hashtags")
@JsModule("./src/vista-top-hashtags.ts")
public class VistaTopHashtags extends LitTemplate {

    @Id("layoutListaTopHashtag")
	private Element layoutListaTopHashtag;

	/**
     * Creates a new VistaTopHashtags.
     */
    public VistaTopHashtags() {
        // You can initialise any data required for the connected UI components here.
    }

}
