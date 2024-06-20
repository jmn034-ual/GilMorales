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
	@Id("contrasenaTF")
	private PasswordField contrasenaTF;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("recuperarContrasenaB")
	private Button recuperarContrasenaB;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("iniciarSesionB")
	private Button iniciarSesionB;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("noCuentraL")
	private Label noCuentraL;
	@Id("registrarB")
	private Button registrarB;
	
	

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



	public H1 getIniciarSesionL() {
		return iniciarSesionL;
	}



	public void setIniciarSesionL(H1 iniciarSesionL) {
		this.iniciarSesionL = iniciarSesionL;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public TextField getUsuarioTF() {
		return usuarioTF;
	}



	public void setUsuarioTF(TextField usuarioTF) {
		this.usuarioTF = usuarioTF;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public PasswordField getContrasenaTF() {
		return contrasenaTF;
	}



	public void setContrasenaTF(PasswordField contrasenaTF) {
		this.contrasenaTF = contrasenaTF;
	}



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public Button getRecuperarContrasenaB() {
		return recuperarContrasenaB;
	}



	public void setRecuperarContrasenaB(Button recuperarContrasenaB) {
		this.recuperarContrasenaB = recuperarContrasenaB;
	}



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Button getIniciarSesionB() {
		return iniciarSesionB;
	}



	public void setIniciarSesionB(Button iniciarSesionB) {
		this.iniciarSesionB = iniciarSesionB;
	}



	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}



	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}



	public Label getNoCuentraL() {
		return noCuentraL;
	}



	public void setNoCuentraL(Label noCuentraL) {
		this.noCuentraL = noCuentraL;
	}



	public Button getRegistrarB() {
		return registrarB;
	}



	public void setRegistrarB(Button registrarB) {
		this.registrarB = registrarB;
	}



	/**
     * Creates a new VistaIniciarsesion.
     */
    public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }
    
    

}
