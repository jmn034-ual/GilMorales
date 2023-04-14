package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-listas-denuncias-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas-denuncias-administrador")
@JsModule("./src/vista-listas-denuncias-administrador.ts")
public class VistaListasDenunciasAdministrador extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	
	


	

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}






	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}






	/**
     * Creates a new VistaListasDenunciasAdministrador.
     */
    public VistaListasDenunciasAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
