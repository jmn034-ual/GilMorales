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
 * A Designer generated component for the vista-cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera")
@JsModule("./src/vista-cabecera.ts")
public class VistaCabecera extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("logoWeb")
	private Button logoWeb;
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
	@Id("botonNotificaciones")
	private Button botonNotificaciones;
	@Id("botonAniadir")
	private Button botonAniadir;
	@Id("botonPerfil")
	private Button botonPerfil;
	@Id("botonCerrarSesion")
	private Button botonCerrarSesion;
	@Id("iconoWeb")
	private Element iconoWeb;
	@Id("gestionarDenunciasB")
	private Button gestionarDenunciasB;
	@Id("cerrarSesionB")
	private Button cerrarSesionB;

	/**
     * Creates a new VistaCabecera.
     */
    public VistaCabecera() {
        // You can initialise any data required for the connected UI components here.
    }

}
