package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-comentarios-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-comentarios-usuario-no-registrado")
@JsModule("./src/vista-lista-comentarios-usuario-no-registrado.ts")
public class VistaListaComentariosUsuarioNoRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
    

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	/**
     * Creates a new VistaListaComentariosUsuarioNoRegistrado.
     */
    public VistaListaComentariosUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
