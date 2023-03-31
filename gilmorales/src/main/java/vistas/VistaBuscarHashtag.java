package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-buscar-hashtag template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar-hashtag")
@JsModule("./src/vista-buscar-hashtag.ts")
public class VistaBuscarHashtag extends LitTemplate {

    @Id("layoutBuscarHashtag")
	private Element layoutBuscarHashtag;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("layoutListaResultadoHashtags1")
	private Element layoutListaResultadoHashtags1;

	/**
     * Creates a new VistaBuscarHashtag.
     */
    public VistaBuscarHashtag() {
        // You can initialise any data required for the connected UI components here.
    }

}
