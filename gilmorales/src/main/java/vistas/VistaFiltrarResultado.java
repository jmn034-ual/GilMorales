package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-filtrar-resultado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-filtrar-resultado")
@JsModule("./src/vista-filtrar-resultado.ts")
public class VistaFiltrarResultado extends LitTemplate {

    @Id("layoutRealizarBusqueda")
	private Element layoutRealizarBusqueda;
	@Id("layoutResultadoBusqueda")
	private Element layoutResultadoBusqueda;
	@Id("layoutListaResultadoBusqueda")
	private Element layoutListaResultadoBusqueda;
	@Id("tituloResultadoBusqueda")
	private H2 tituloResultadoBusqueda;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("layoutTituloUsuarios")
	private HorizontalLayout layoutTituloUsuarios;
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("layoutFiltrar")
	private HorizontalLayout layoutFiltrar;
	@Id("labelFiltrar")
	private Label labelFiltrar;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("filtrarNone")
	private Element filtrarNone;
	@Id("filtrarUsuarios")
	private Element filtrarUsuarios;
	@Id("filtrarHashtag")
	private Element filtrarHashtag;
	@Id("layoutListaResultadoUsuarios")
	private Element layoutListaResultadoUsuarios;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("layoutListaResultadoHashtags")
	private Element layoutListaResultadoHashtags;

	/**
     * Creates a new VistaFiltrarResultado.
     */
    public VistaFiltrarResultado() {
        // You can initialise any data required for the connected UI components here.
    }

}
