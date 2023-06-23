package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-publicaciones-propias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicaciones-propias")
@JsModule("./src/vista-ver-publicaciones-propias.ts")
public class VistaVerPublicacionesPropias extends LitTemplate {



	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	/**
     * Creates a new VistaVerPublicacionesPropias.
     */
    public VistaVerPublicacionesPropias() {
        // You can initialise any data required for the connected UI components here.
    }

}
