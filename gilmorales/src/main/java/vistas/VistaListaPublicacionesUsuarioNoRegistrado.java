package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-publicaciones-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-usuario-no-registrado")
@JsModule("./src/vista-lista-publicaciones-usuario-no-registrado.ts")
public class VistaListaPublicacionesUsuarioNoRegistrado extends LitTemplate {

    @Id("layoutPublicaciones")
	private Element layoutPublicaciones;
	@Id("layoutPublicacionesUNR")
	private Element layoutPublicacionesUNR;
	@Id("layoutListaPublicacionesUR")
	private Element layoutListaPublicacionesUR;

	/**
     * Creates a new VistaListaPublicacionesUsuarioNoRegistrado.
     */
    public VistaListaPublicacionesUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
