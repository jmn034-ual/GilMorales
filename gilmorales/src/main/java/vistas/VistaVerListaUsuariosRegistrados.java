package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-ver-lista-usuarios-registrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-lista-usuarios-registrados")
@JsModule("./src/vista-ver-lista-usuarios-registrados.ts")
public class VistaVerListaUsuariosRegistrados extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("titulo")
	private H1 titulo;
	@Id("layoutBotonOrdenar")
	private HorizontalLayout layoutBotonOrdenar;
	@Id("botonOrdenar")
	private Select botonOrdenar;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("layoutVerticalLista")
	private Element layoutVerticalLista;
	@Id("layoutHorizontalLista")
	private HorizontalLayout layoutHorizontalLista;

	/**
     * Creates a new VistaVerListaUsuariosRegistrados.
     */
    public VistaVerListaUsuariosRegistrados() {
        // You can initialise any data required for the connected UI components here.
    }

}
