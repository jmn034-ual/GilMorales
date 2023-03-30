package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-lista-usuarios-comercial-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-usuarios-comercial-item")
@JsModule("./src/vista-lista-usuarios-comercial-item.ts")
public class VistaListaUsuariosComercialItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Image fotoPerfil;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("nombreUsuarioL")
	private Label nombreUsuarioL;

	/**
     * Creates a new VistaListaUsuariosComercialItem.
     */
    public VistaListaUsuariosComercialItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
