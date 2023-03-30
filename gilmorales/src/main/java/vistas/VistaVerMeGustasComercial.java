package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;

/**
 * A Designer generated component for the vista-ver-me-gustas-comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-me-gustas-comercial")
@JsModule("./src/vista-ver-me-gustas-comercial.ts")
public class VistaVerMeGustasComercial extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("meGustasL")
	private H1 meGustasL;

	/**
     * Creates a new VistaVerMeGustasComercial.
     */
    public VistaVerMeGustasComercial() {
        // You can initialise any data required for the connected UI components here.
    }

}
