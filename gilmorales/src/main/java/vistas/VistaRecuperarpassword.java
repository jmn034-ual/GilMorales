package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-recuperarpassword template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperarpassword")
@JsModule("./src/vista-recuperarpassword.ts")
public class VistaRecuperarpassword extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("labelRecuperarContrasena")
	private H1 labelRecuperarContrasena;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("correoRecuperacionTF")
	private TextField correoRecuperacionTF;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("codigoTF")
	private TextField codigoTF;
	@Id("enviarCodigoB")
	private Button enviarCodigoB;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("contrasenaTF")
	private PasswordField contrasenaTF;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("enviarB")
	private Button enviarB;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("crarCuentaL")
	private Label crarCuentaL;
	@Id("registrarseB")
	private Button registrarseB;

	/**
     * Creates a new VistaRecuperarpassword.
     */
    public VistaRecuperarpassword() {
        // You can initialise any data required for the connected UI components here.
    }

}
