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
	
	

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public H1 getLabelRecuperarContrasena() {
		return labelRecuperarContrasena;
	}



	public void setLabelRecuperarContrasena(H1 labelRecuperarContrasena) {
		this.labelRecuperarContrasena = labelRecuperarContrasena;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public TextField getCorreoRecuperacionTF() {
		return correoRecuperacionTF;
	}



	public void setCorreoRecuperacionTF(TextField correoRecuperacionTF) {
		this.correoRecuperacionTF = correoRecuperacionTF;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public TextField getCodigoTF() {
		return codigoTF;
	}



	public void setCodigoTF(TextField codigoTF) {
		this.codigoTF = codigoTF;
	}



	public Button getEnviarCodigoB() {
		return enviarCodigoB;
	}



	public void setEnviarCodigoB(Button enviarCodigoB) {
		this.enviarCodigoB = enviarCodigoB;
	}



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public PasswordField getContrasenaTF() {
		return contrasenaTF;
	}



	public void setContrasenaTF(PasswordField contrasenaTF) {
		this.contrasenaTF = contrasenaTF;
	}



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Button getEnviarB() {
		return enviarB;
	}



	public void setEnviarB(Button enviarB) {
		this.enviarB = enviarB;
	}



	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}



	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}



	public Label getCrarCuentaL() {
		return crarCuentaL;
	}



	public void setCrarCuentaL(Label crarCuentaL) {
		this.crarCuentaL = crarCuentaL;
	}



	public Button getRegistrarseB() {
		return registrarseB;
	}



	public void setRegistrarseB(Button registrarseB) {
		this.registrarseB = registrarseB;
	}



	/**
     * Creates a new VistaRecuperarpassword.
     */
    public VistaRecuperarpassword() {
        // You can initialise any data required for the connected UI components here.
    }

}
