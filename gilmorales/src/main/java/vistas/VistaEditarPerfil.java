package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-editar-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar-perfil")
@JsModule("./src/vista-editar-perfil.ts")
public class VistaEditarPerfil extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutEditarPerfil")
	private Element layoutEditarPerfil;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("titulo")
	private H2 titulo;
	@Id("layoutFoto")
	private HorizontalLayout layoutFoto;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("labelFoto")
	private Label labelFoto;
	@Id("layoutImagen")
	private Element layoutImagen;
	@Id("botonCambiar")
	private Button botonCambiar;
	@Id("layoutNombreUsuario")
	private HorizontalLayout layoutNombreUsuario;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("labelNombreUsuario")
	private Label labelNombreUsuario;
	@Id("textFieldNombreUsuario")
	private TextField textFieldNombreUsuario;
	@Id("layoutNombre")
	private HorizontalLayout layoutNombre;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("labelNombre")
	private Label labelNombre;
	@Id("textFieldNombre")
	private TextField textFieldNombre;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("labelDecripcion")
	private Label labelDecripcion;
	@Id("textAreaDescripcion")
	private TextArea textAreaDescripcion;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonGuardar")
	private Button botonGuardar;

	/**
     * Creates a new VistaEditarPerfil.
     */
    public VistaEditarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
