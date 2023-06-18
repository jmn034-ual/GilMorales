package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-publicaciones-propias-eliminar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-propias-eliminar")
@JsModule("./src/vista-lista-publicaciones-propias-eliminar.ts")
public class VistaListaPublicacionesPropiasEliminar extends LitTemplate {

    @Id("layoutPublicacionesEliminar")
	private Element layoutPublicacionesEliminar;

    
	public Element getLayoutPublicacionesEliminar() {
		return layoutPublicacionesEliminar;
	}


	public void setLayoutPublicacionesEliminar(Element layoutPublicacionesEliminar) {
		this.layoutPublicacionesEliminar = layoutPublicacionesEliminar;
	}


	/**
     * Creates a new VistaListaPublicacionesPropiasEliminar.
     */
    public VistaListaPublicacionesPropiasEliminar() {
        // You can initialise any data required for the connected UI components here.
    }

}
