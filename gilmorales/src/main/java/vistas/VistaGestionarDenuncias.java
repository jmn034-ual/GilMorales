package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-gestionar-denuncias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionar-denuncias")
@JsModule("./src/vista-gestionar-denuncias.ts")
public class VistaGestionarDenuncias extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("datos")
	private H1 datos;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("fototPerfil")
	private Div fototPerfil;
	@Id("addFoto")
	private Button addFoto;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("nombre")
	private Label nombre;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("fecha")
	private Label fecha;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("código")
	private Label código;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("verDenuncias")
	private Button verDenuncias;

	/**
     * Creates a new VistaGestionarDenuncias.
     */
    public VistaGestionarDenuncias() {
        // You can initialise any data required for the connected UI components here.
    }

}
