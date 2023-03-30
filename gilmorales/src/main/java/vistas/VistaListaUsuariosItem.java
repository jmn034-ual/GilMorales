package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-lista-usuarios-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-usuarios-item")
@JsModule("./src/vista-lista-usuarios-item.ts")
public class VistaListaUsuariosItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("labelInformacion")
	private Element labelInformacion;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("layoutFotoperfil")
	private Element layoutFotoperfil;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelNombreCompleto")
	private Label labelNombreCompleto;
	@Id("labelDescripcion")
	private Label labelDescripcion;

	/**
     * Creates a new VistaListaUsuariosItem.
     */
    public VistaListaUsuariosItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
