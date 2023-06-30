package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;


/**
 * A Designer generated component for the vista-lista-resultado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-resultado")
@JsModule("./src/vista-lista-resultado.ts")
public class VistaListaResultado extends LitTemplate {

   
	@Id("layoutResultadoBusqueda")
	private Element layoutResultadoBusqueda;
	@Id("layoutResultadoUsuario")
	private Element layoutResultadoUsuario;
	@Id("layoutResultadoHashtags")
	private Element layoutResultadoHashtags;
	

	public Element getLayoutResultadoBusqueda() {
		return layoutResultadoBusqueda;
	}


	public void setLayoutResultadoBusqueda(Element layoutResultadoBusqueda) {
		this.layoutResultadoBusqueda = layoutResultadoBusqueda;
	}


	public Element getLayoutResultadoUsuario() {
		return layoutResultadoUsuario;
	}


	public void setLayoutResultadoUsuario(Element layoutResultadoUsuario) {
		this.layoutResultadoUsuario = layoutResultadoUsuario;
	}


	public Element getLayoutResultadoHashtags() {
		return layoutResultadoHashtags;
	}


	public void setLayoutResultadoHashtags(Element layoutResultadoHashtags) {
		this.layoutResultadoHashtags = layoutResultadoHashtags;
	}


	/**
     * Creates a new VistaListaResultado.
     */
    public VistaListaResultado() {
        // You can initialise any data required for the connected UI components here.
    }

}
