package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-administrador-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador-principal")
@JsModule("./src/vista-administrador-principal.ts")
public class VistaAdministradorPrincipal extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabeceraAdmin")
	private HorizontalLayout layoutCabeceraAdmin;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("topUsuariosL")
	private H2 topUsuariosL;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("topHashtagL")
	private H2 topHashtagL;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("layoutPublicaciones")
	private Element layoutPublicaciones;
	
	

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public HorizontalLayout getLayoutCabeceraAdmin() {
		return layoutCabeceraAdmin;
	}



	public void setLayoutCabeceraAdmin(HorizontalLayout layoutCabeceraAdmin) {
		this.layoutCabeceraAdmin = layoutCabeceraAdmin;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public H2 getTopUsuariosL() {
		return topUsuariosL;
	}



	public void setTopUsuariosL(H2 topUsuariosL) {
		this.topUsuariosL = topUsuariosL;
	}



	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}



	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public H2 getTopHashtagL() {
		return topHashtagL;
	}



	public void setTopHashtagL(H2 topHashtagL) {
		this.topHashtagL = topHashtagL;
	}



	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}



	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}



	public Element getLayoutPublicaciones() {
		return layoutPublicaciones;
	}



	public void setLayoutPublicaciones(Element layoutPublicaciones) {
		this.layoutPublicaciones = layoutPublicaciones;
	}



	/**
     * Creates a new VistaAdministradorPrincipal.
     */
    public VistaAdministradorPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}
