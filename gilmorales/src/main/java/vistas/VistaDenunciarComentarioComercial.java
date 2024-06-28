package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-denunciar-comentario-comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-denunciar-comentario-comercial")
@JsModule("./src/vista-denunciar-comentario-comercial.ts")
public class VistaDenunciarComentarioComercial extends LitTemplate {

	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("denunciarL")
	private H1 denunciarL;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("h4")
	private H4 h4;
	@Id("motivoTA")
	private TextArea motivoTA;
	@Id("vaadinHorizontalLayout7")
	private HorizontalLayout vaadinHorizontalLayout7;
	@Id("cancelarB")
	private Button cancelarB;
	@Id("EnviarB")
	private Button enviarB;
	@Id("h41")
	private H4 h41;	
	

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



	public H1 getDenunciarL() {
		return denunciarL;
	}



	public void setDenunciarL(H1 denunciarL) {
		this.denunciarL = denunciarL;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public H4 getH4() {
		return h4;
	}



	public void setH4(H4 h4) {
		this.h4 = h4;
	}



	public TextArea getMotivoTA() {
		return motivoTA;
	}



	public void setMotivoTA(TextArea motivoTA) {
		this.motivoTA = motivoTA;
	}



	public HorizontalLayout getVaadinHorizontalLayout7() {
		return vaadinHorizontalLayout7;
	}



	public void setVaadinHorizontalLayout7(HorizontalLayout vaadinHorizontalLayout7) {
		this.vaadinHorizontalLayout7 = vaadinHorizontalLayout7;
	}



	public Button getCancelarB() {
		return cancelarB;
	}



	public void setCancelarB(Button cancelarB) {
		this.cancelarB = cancelarB;
	}



	public Button getEnviarB() {
		return enviarB;
	}



	public void setEnviarB(Button enviarB) {
		this.enviarB = enviarB;
	}


	public H4 getH41() {
		return h41;
	}



	public void setH41(H4 h41) {
		this.h41 = h41;
	}



	/**
     * Creates a new VistaDenunciarComentarioComercial.
     */
    public VistaDenunciarComentarioComercial() {
        // You can initialise any data required for the connected UI components here.
    }

}
