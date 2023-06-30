package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-me-gustas-publicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-me-gustas-publicacion")
@JsModule("./src/vista-lista-me-gustas-publicacion.ts")
public class VistaListaMeGustasPublicacion extends LitTemplate {

    @Id("layoutLista")
	private Element layoutLista;

    
	public Element getLayoutLista() {
		return layoutLista;
	}


	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}


	/**
     * Creates a new VistaListaMeGustasPublicacion.
     */
    public VistaListaMeGustasPublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
