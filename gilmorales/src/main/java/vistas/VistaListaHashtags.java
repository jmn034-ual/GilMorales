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


	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	/**
     * Creates a new VistaListaHashtags.
     */
    public VistaListaHashtags() {
        // You can initialise any data required for the connected UI components here.
    }

}
