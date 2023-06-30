package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-buscar-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar-usuario")
@JsModule("./src/vista-buscar-usuario.ts")
public class VistaBuscarUsuario extends LitTemplate {

    @Id("layoutRealizarBusqueda")
	private Element layoutRealizarBusqueda;
	@Id("layoutBuscarUsuario")
	private Element layoutBuscarUsuario;
	@Id("layoutTituloUsuarios")
	private HorizontalLayout layoutTituloUsuarios;
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("layoutListaResultadoUsuarios")
	private Element layoutListaResultadoUsuarios;

	
	public Element getLayoutRealizarBusqueda() {
		return layoutRealizarBusqueda;
	}


	public void setLayoutRealizarBusqueda(Element layoutRealizarBusqueda) {
		this.layoutRealizarBusqueda = layoutRealizarBusqueda;
	}


	public Element getLayoutBuscarUsuario() {
		return layoutBuscarUsuario;
	}


	public void setLayoutBuscarUsuario(Element layoutBuscarUsuario) {
		this.layoutBuscarUsuario = layoutBuscarUsuario;
	}


	public HorizontalLayout getLayoutTituloUsuarios() {
		return layoutTituloUsuarios;
	}


	public void setLayoutTituloUsuarios(HorizontalLayout layoutTituloUsuarios) {
		this.layoutTituloUsuarios = layoutTituloUsuarios;
	}


	public H3 getTituloUsuarios() {
		return tituloUsuarios;
	}


	public void setTituloUsuarios(H3 tituloUsuarios) {
		this.tituloUsuarios = tituloUsuarios;
	}


	public Element getLayoutListaResultadoUsuarios() {
		return layoutListaResultadoUsuarios;
	}


	public void setLayoutListaResultadoUsuarios(Element layoutListaResultadoUsuarios) {
		this.layoutListaResultadoUsuarios = layoutListaResultadoUsuarios;
	}


	/**
     * Creates a new VistaBuscarUsuario.
     */
    public VistaBuscarUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
