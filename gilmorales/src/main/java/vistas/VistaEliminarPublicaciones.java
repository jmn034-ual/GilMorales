package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-eliminar-publicaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-eliminar-publicaciones")
@JsModule("./src/vista-eliminar-publicaciones.ts")
public class VistaEliminarPublicaciones extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("titulo")
	private H1 titulo;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("checkboxSelecionarTodas")
	private Checkbox checkboxSelecionarTodas;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonEliminar")
	private Button botonEliminar;
	@Id("labelSelecionar")
	private Label labelSelecionar;

	/**
     * Creates a new VistaEliminarPublicaciones.
     */
    public VistaEliminarPublicaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
