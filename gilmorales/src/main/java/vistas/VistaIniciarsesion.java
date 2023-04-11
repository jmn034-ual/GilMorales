package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-iniciarsesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./src/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {



	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("iniciarSesionL")
	private H1 iniciarSesionL;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("usuarioTF")
	private TextField usuarioTF;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("recuperarContrasenaB")
	private Button recuperarContrasenaB;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("iniciarSesionB")
	private Button iniciarSesionB;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("googleB")
	private Button googleB;
	@Id("facebookB")
	private Button facebookB;
	@Id("twitterB")
	private Button twitterB;
	@Id("instagramB")
	private Button instagramB;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("noCuentraL")
	private Label noCuentraL;
	@Id("registrarB")
	private Button registrarB;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("contrasenaTF")
	private PasswordField contrasenaTF;

	/**
     * Creates a new VistaIniciarsesion.
     */
    public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }
    
    

}
