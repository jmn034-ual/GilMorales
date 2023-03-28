package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-tendencias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-tendencias")
@JsModule("./src/vista-ver-tendencias.ts")
public class VistaVerTendencias extends LitTemplate {

    @Id("titulo")
	private H1 titulo;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutItem")
	private Element layoutItem;
	@Id("botonVerListaHashtags")
	private Button botonVerListaHashtags;

	/**
     * Creates a new VistaVerTendencias.
     */
    public VistaVerTendencias() {
        // You can initialise any data required for the connected UI components here.
    }

}
