package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-hashtag template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-hashtag")
@JsModule("./src/vista-ver-hashtag.ts")
public class VistaVerHashtag extends LitTemplate {

    @Id("cabecera")
	private Element cabecera;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutDatosHashtag")
	private HorizontalLayout layoutDatosHashtag;
	@Id("imagenHashtag")
	private Element imagenHashtag;
	@Id("layoutInformacionHashtag")
	private Element layoutInformacionHashtag;
	@Id("h2")
	private H2 h2;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("labelNumVisualizaciones")
	private Label labelNumVisualizaciones;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("layoutHorizontal")
	private HorizontalLayout layoutHorizontal;

	/**
     * Creates a new VistaVerHashtag.
     */
    public VistaVerHashtag() {
        // You can initialise any data required for the connected UI components here.
    }

}
