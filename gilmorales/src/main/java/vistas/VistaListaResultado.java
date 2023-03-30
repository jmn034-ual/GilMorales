package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-lista-resultado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-resultado")
@JsModule("./src/vista-lista-resultado.ts")
public class VistaListaResultado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("layoutResultadoBusqueda")
	private Element layoutResultadoBusqueda;
	@Id("tituloResultadoBusqueda")
	private H2 tituloResultadoBusqueda;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
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
	@Id("layoutTituloUsuarios")
	private HorizontalLayout layoutTituloUsuarios;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutListaResultadoHashtags")
	private Element layoutListaResultadoHashtags;

	/**
     * Creates a new VistaListaResultado.
     */
    public VistaListaResultado() {
        // You can initialise any data required for the connected UI components here.
    }

}
