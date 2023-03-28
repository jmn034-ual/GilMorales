package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-lista-hashtags template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-hashtags")
@JsModule("./src/vista-lista-hashtags.ts")
public class VistaListaHashtags extends LitTemplate {

    @Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;

	/**
     * Creates a new VistaListaHashtags.
     */
    public VistaListaHashtags() {
        // You can initialise any data required for the connected UI components here.
    }

}
