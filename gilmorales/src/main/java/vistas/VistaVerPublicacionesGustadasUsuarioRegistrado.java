package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-publicaciones-gustadas-usuario-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicaciones-gustadas-usuario-registrado")
@JsModule("./src/vista-ver-publicaciones-gustadas-usuario-registrado.ts")
public class VistaVerPublicacionesGustadasUsuarioRegistrado extends LitTemplate {

    

	@Id("layoutPublicacionesGustadas")
	private Element layoutPublicacionesGustadas;
	

	public Element getLayoutPublicacionesGustadas() {
		return layoutPublicacionesGustadas;
	}


	public void setLayoutPublicacionesGustadas(Element layoutPublicacionesGustadas) {
		this.layoutPublicacionesGustadas = layoutPublicacionesGustadas;
	}


	/**
     * Creates a new VistaVerPublicacionesGustadasUsuarioRegistrado.
     */
    public VistaVerPublicacionesGustadasUsuarioRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
