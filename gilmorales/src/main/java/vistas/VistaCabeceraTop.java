package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-cabecera-top template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-top")
@JsModule("./src/vista-cabecera-top.ts")
public class VistaCabeceraTop extends LitTemplate {

 

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cabeceraTop")
	private Element cabeceraTop;
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("listaUsuarios")
	private Element listaUsuarios;
	@Id("botonVerListaUsuarios")
	private Button botonVerListaUsuarios;
	@Id("tituloHashtag")
	private H3 tituloHashtag;
	@Id("listaTopHashtag")
	private Element listaTopHashtag;
	@Id("botonVerListaHashtag")
	private Button botonVerListaHashtag;
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
	@Id("layoutListaResultadoUsuarios")
	private Element layoutListaResultadoUsuarios;
	@Id("filtrarHashtag")
	private Element filtrarHashtag;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutListaResultadoHashtags")
	private Element layoutListaResultadoHashtags;

	/**
     * Creates a new VistaCabeceraTop.
     */
    public VistaCabeceraTop() {
        // You can initialise any data required for the connected UI components here.
    }

}
