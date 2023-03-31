package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-lista-ddenuncias-administrador-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-ddenuncias-administrador-item")
@JsModule("./src/vista-lista-ddenuncias-administrador-item.ts")
public class VistaListaDdenunciasAdministradorItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("fotoPerfil")
	private Div fotoPerfil;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("nombreUsuario")
	private Button nombreUsuario;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("nombreCompleto")
	private Label nombreCompleto;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("estadoDenuncia")
	private Label estadoDenuncia;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("motivoDenuncia")
	private Label motivoDenuncia;

	/**
     * Creates a new VistaListaDdenunciasAdministradorItem.
     */
    public VistaListaDdenunciasAdministradorItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
