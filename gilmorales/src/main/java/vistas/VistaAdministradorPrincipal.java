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



	/**
     * Creates a new VistaAdministradorPrincipal.
     */
    public VistaAdministradorPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}
