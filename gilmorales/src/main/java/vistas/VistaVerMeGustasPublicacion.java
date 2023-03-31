package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;

/**
 * A Designer generated component for the vista-ver-me-gustas-publicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-me-gustas-publicacion")
@JsModule("./src/vista-ver-me-gustas-publicacion.ts")
public class VistaVerMeGustasPublicacion extends LitTemplate {

    @Id("layoutMeGustas")
	private Element layoutMeGustas;
	@Id("titulo")
	private H2 titulo;
	@Id("layoutLista")
	private Element layoutLista;

	/**
     * Creates a new VistaVerMeGustasPublicacion.
     */
    public VistaVerMeGustasPublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
