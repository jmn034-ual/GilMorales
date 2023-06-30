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

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getLayoutDenunciarUsuario() {
		return layoutDenunciarUsuario;
	}

	public void setLayoutDenunciarUsuario(Element layoutDenunciarUsuario) {
		this.layoutDenunciarUsuario = layoutDenunciarUsuario;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public H1 getTitulo() {
		return titulo;
	}

	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public HorizontalLayout getLayoutNombre() {
		return layoutNombre;
	}

	public void setLayoutNombre(HorizontalLayout layoutNombre) {
		this.layoutNombre = layoutNombre;
	}

	public H4 getTituloNombre() {
		return tituloNombre;
	}

	public void setTituloNombre(H4 tituloNombre) {
		this.tituloNombre = tituloNombre;
	}

	public TextField getTextFieldNombreusuario() {
		return textFieldNombreusuario;
	}

	public void setTextFieldNombreusuario(TextField textFieldNombreusuario) {
		this.textFieldNombreusuario = textFieldNombreusuario;
	}

	public HorizontalLayout getLayoutMotivo() {
		return layoutMotivo;
	}

	public void setLayoutMotivo(HorizontalLayout layoutMotivo) {
		this.layoutMotivo = layoutMotivo;
	}

	public H4 getTituloMotivo() {
		return tituloMotivo;
	}

	public void setTituloMotivo(H4 tituloMotivo) {
		this.tituloMotivo = tituloMotivo;
	}

	public TextArea getTextAreaMotivoDenuncia() {
		return textAreaMotivoDenuncia;
	}

	public void setTextAreaMotivoDenuncia(TextArea textAreaMotivoDenuncia) {
		this.textAreaMotivoDenuncia = textAreaMotivoDenuncia;
	}

	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}

	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}

	public Button getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public Button getBotonEnviar() {
		return botonEnviar;
	}

	public void setBotonEnviar(Button botonEnviar) {
		this.botonEnviar = botonEnviar;
	}

	/**
     * Creates a new VistaDenunciarUsuario.
     */
    public VistaDenunciarUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
