package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-publicaciones-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-administrador")
@JsModule("./src/vista-lista-publicaciones-administrador.ts")
public class VistaListaPublicacionesAdministrador extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
    
    

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	/**
     * Creates a new VistaListaPublicacionesAdministrador.
     */
    public VistaListaPublicacionesAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
