package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-cabecera-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-usuario-no-registrado")
@JsModule("./src/vista-cabecera-usuario-no-registrado.ts")
public class VistaCabeceraUsuarioNoRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("logoWeb")
	private Button logoWeb;
	@Id("iconoWeb")
	private Element iconoWeb;
	@Id("barraBusqueda")
	private HorizontalLayout barraBusqueda;
	@Id("textoBusqueda")
	private TextField textoBusqueda;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("botonBuscar")
	private Button botonBuscar;
	@Id("inicio")
	private Button inicio;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("botonCerrarSesion")
	private Button botonCerrarSesion;

	/**
     * Creates a new VistaCabeceraUsuarioNoRegistrado.
     */
    public VistaCabeceraUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
