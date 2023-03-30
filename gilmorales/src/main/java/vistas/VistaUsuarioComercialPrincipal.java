package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-usuario-comercial-principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-comercial-principal")
@JsModule("./src/vista-usuario-comercial-principal.ts")
public class VistaUsuarioComercialPrincipal extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoDePerfil")
	private Image fotoDePerfil;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("nombreDeUsuario")
	private H2 nombreDeUsuario;
	@Id("nombreDeEmpresa")
	private H3 nombreDeEmpresa;
	@Id("editarPerffilB")
	private Button editarPerffilB;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("eliminarPublicacion")
	private Button eliminarPublicacion;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("numeroL")
	private Label numeroL;
	@Id("meGustasL")
	private Label meGustasL;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("descripcion")
	private Label descripcion;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("h2")
	private H2 h2;
	@Id("listaVideos")
	private Element listaVideos;

	/**
     * Creates a new VistaUsuarioComercialPrincipal.
     */
    public VistaUsuarioComercialPrincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}
