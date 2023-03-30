package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ver-lista-hashtags template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-lista-hashtags")
@JsModule("./src/vista-ver-lista-hashtags.ts")
public class VistaVerListaHashtags extends LitTemplate {

    @Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("h1")
	private H1 h1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;

	/**
     * Creates a new VistaVerListaHashtags.
     */
    public VistaVerListaHashtags() {
        // You can initialise any data required for the connected UI components here.
    }

}
