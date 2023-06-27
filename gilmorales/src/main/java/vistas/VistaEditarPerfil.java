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
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-editar-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editar-perfil")
@JsModule("./src/vista-editar-perfil.ts")
public class VistaEditarPerfil extends LitTemplate {

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
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	

	public Avatar getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(Avatar fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public Element getLayoutEditarPerfil() {
		return layoutEditarPerfil;
	}

	public void setLayoutEditarPerfil(Element layoutEditarPerfil) {
		this.layoutEditarPerfil = layoutEditarPerfil;
	}

	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}

	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}

	public H2 getTitulo() {
		return titulo;
	}

	public void setTitulo(H2 titulo) {
		this.titulo = titulo;
	}

	public HorizontalLayout getLayoutFoto() {
		return layoutFoto;
	}

	public void setLayoutFoto(HorizontalLayout layoutFoto) {
		this.layoutFoto = layoutFoto;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getLabelFoto() {
		return labelFoto;
	}

	public void setLabelFoto(Label labelFoto) {
		this.labelFoto = labelFoto;
	}

	public Element getLayoutImagen() {
		return layoutImagen;
	}

	public void setLayoutImagen(Element layoutImagen) {
		this.layoutImagen = layoutImagen;
	}

	public Button getBotonCambiar() {
		return botonCambiar;
	}

	public void setBotonCambiar(Button botonCambiar) {
		this.botonCambiar = botonCambiar;
	}

	public HorizontalLayout getLayoutNombreUsuario() {
		return layoutNombreUsuario;
	}

	public void setLayoutNombreUsuario(HorizontalLayout layoutNombreUsuario) {
		this.layoutNombreUsuario = layoutNombreUsuario;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Label getLabelNombreUsuario() {
		return labelNombreUsuario;
	}

	public void setLabelNombreUsuario(Label labelNombreUsuario) {
		this.labelNombreUsuario = labelNombreUsuario;
	}

	public TextField getTextFieldNombreUsuario() {
		return textFieldNombreUsuario;
	}

	public void setTextFieldNombreUsuario(TextField textFieldNombreUsuario) {
		this.textFieldNombreUsuario = textFieldNombreUsuario;
	}

	public HorizontalLayout getLayoutNombre() {
		return layoutNombre;
	}

	public void setLayoutNombre(HorizontalLayout layoutNombre) {
		this.layoutNombre = layoutNombre;
	}

	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}

	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}

	public Label getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(Label labelNombre) {
		this.labelNombre = labelNombre;
	}

	public TextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(TextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}

	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}

	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}

	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}

	public Label getLabelDecripcion() {
		return labelDecripcion;
	}

	public void setLabelDecripcion(Label labelDecripcion) {
		this.labelDecripcion = labelDecripcion;
	}

	public TextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}

	public void setTextAreaDescripcion(TextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}

	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}

	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}

	public Button getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public Button getBotonGuardar() {
		return botonGuardar;
	}

	public void setBotonGuardar(Button botonGuardar) {
		this.botonGuardar = botonGuardar;
	}

	/**
     * Creates a new VistaEditarPerfil.
     */
    public VistaEditarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
