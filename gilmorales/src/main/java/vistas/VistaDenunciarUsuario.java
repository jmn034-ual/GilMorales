package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-denunciar-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-denunciar-usuario")
@JsModule("./src/vista-denunciar-usuario.ts")
public class VistaDenunciarUsuario extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("layoutDenunciarUsuario")
	private Element layoutDenunciarUsuario;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("titulo")
	private H1 titulo;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("layoutNombre")
	private HorizontalLayout layoutNombre;
	@Id("tituloNombre")
	private H4 tituloNombre;
	@Id("textFieldNombreusuario")
	private TextField textFieldNombreusuario;
	@Id("layoutMotivo")
	private HorizontalLayout layoutMotivo;
	@Id("tituloMotivo")
	private H4 tituloMotivo;
	@Id("textAreaMotivoDenuncia")
	private TextArea textAreaMotivoDenuncia;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonEnviar")
	private Button botonEnviar;

	/**
     * Creates a new VistaDenunciarUsuario.
     */
    public VistaDenunciarUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
