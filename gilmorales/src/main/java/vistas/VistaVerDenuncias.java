package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-ver-denuncias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-denuncias")
@JsModule("./src/vista-ver-denuncias.ts")
public class VistaVerDenuncias extends LitTemplate {

    @Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("denunciasL")
	private H1 denunciasL;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("filtrarL")
	private Label filtrarL;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("filtro")
	private Select filtro;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("todas")
	private Element todas;
	@Id("pendientes")
	private Element pendientes;
	@Id("aplicadas")
	private Element aplicadas;
	@Id("finalizadas")
	private Element finalizadas;
	@Id("layoutListaDenuncias")
	private Element layoutListaDenuncias;

	/**
     * Creates a new VistaVerDenuncias.
     */
    public VistaVerDenuncias() {
        // You can initialise any data required for the connected UI components here.
    }

}
