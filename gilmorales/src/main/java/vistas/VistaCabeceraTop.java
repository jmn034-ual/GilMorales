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

/**
 * A Designer generated component for the vista-cabecera-top template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-top")
@JsModule("./src/vista-cabecera-top.ts")
public class VistaCabeceraTop extends LitTemplate {

    @Id("botonVerListaHashtag")
	private Button botonVerListaHashtag;
	@Id("listaTopHashtag")
	private Element listaTopHashtag;
	@Id("tituloHashtag")
	private H3 tituloHashtag;
	@Id("botonVerListaUsuarios")
	private Button botonVerListaUsuarios;
	@Id("listaUsuarios")
	private Element listaUsuarios;
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("cabeceraTop")
	private Element cabeceraTop;
	@Id("layoutPublicaciones")
	private Element layoutPublicaciones;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("layoutRealizarBusqueda")
	private Element layoutRealizarBusqueda;

	/**
     * Creates a new VistaCabeceraTop.
     */
    public VistaCabeceraTop() {
        // You can initialise any data required for the connected UI components here.
    }

}
