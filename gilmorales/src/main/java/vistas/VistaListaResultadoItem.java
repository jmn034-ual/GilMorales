package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista-resultado-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-resultado-item")
@JsModule("./src/vista-lista-resultado-item.ts")
public class VistaListaResultadoItem extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutFotoPerfil")
	private Element layoutFotoPerfil;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("layoutFotoHashtag")
	private Element layoutFotoHashtag;
	@Id("botonHashtag")
	private Button botonHashtag;

	/**
     * Creates a new VistaListaResultadoItem.
     */
    public VistaListaResultadoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
