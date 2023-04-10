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

/**
 * A Designer generated component for the vista-usar-otra-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usar-otra-cuenta")
@JsModule("./src/vista-usar-otra-cuenta.ts")
public class VistaUsarOtraCuenta extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("introducirDatosL")
	private H1 introducirDatosL;
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
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("cancelarB")
	private Button cancelarB;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("entrarB")
	private Button entrarB;
	
	

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



	public H1 getIntroducirDatosL() {
		return introducirDatosL;
	}



	public void setIntroducirDatosL(H1 introducirDatosL) {
		this.introducirDatosL = introducirDatosL;
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



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Button getCancelarB() {
		return cancelarB;
	}



	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}



	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}



	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}



	public Button getEntrarB() {
		return entrarB;
	}



	public void setEntrarB(Button entrarB) {
		this.entrarB = entrarB;
	}



	/**
     * Creates a new VistaUsarOtraCuenta.
     */
    public VistaUsarOtraCuenta() {
        // You can initialise any data required for the connected UI components here.
    }

}
