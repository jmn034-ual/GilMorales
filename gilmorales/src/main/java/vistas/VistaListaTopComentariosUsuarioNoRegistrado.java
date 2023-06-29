package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-lista-top-comentarios-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-top-comentarios-usuario-no-registrado")
@JsModule("./src/vista-lista-top-comentarios-usuario-no-registrado.ts")
public class VistaListaTopComentariosUsuarioNoRegistrado extends LitTemplate {

    @Id("listaTopComentarios")
	private Element listaTopComentarios;

    public Element getListaTopComentarios() {
		return listaTopComentarios;
	}

	public void setListaTopComentarios(Element listaTopComentarios) {
		this.listaTopComentarios = listaTopComentarios;
	}
	
	/**
     * Creates a new VistaListaTopComentariosUsuarioNoRegistrado.
     */
    public VistaListaTopComentariosUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

	

}
