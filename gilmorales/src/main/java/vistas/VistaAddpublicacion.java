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
 * A Designer generated component for the vista-addpublicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-addpublicacion")
@JsModule("./src/vista-addpublicacion.ts")
public class VistaAddpublicacion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutSubirVideo")
	private Element layoutSubirVideo;
	@Id("layoutTitulo")
	private Element layoutTitulo;
	@Id("titulo")
	private H2 titulo;
	@Id("label")
	private Label label;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("botonSubir")
	private Button botonSubir;
	@Id("layoutDatosPublicacion")
	private Element layoutDatosPublicacion;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("labelLocalizacion")
	private Label labelLocalizacion;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("textFielLocalizacion")
	private TextField textFielLocalizacion;
	@Id("botonAniadir")
	private Button botonAniadir;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("textAreaDescripcion")
	private TextArea textAreaDescripcion;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("botonDescartar")
	private Button botonDescartar;
	@Id("botonPublicar")
	private Button botonPublicar;

	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public HorizontalLayout getCabecera() {
		return cabecera;
	}


	public void setCabecera(HorizontalLayout cabecera) {
		this.cabecera = cabecera;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getLayoutSubirVideo() {
		return layoutSubirVideo;
	}


	public void setLayoutSubirVideo(Element layoutSubirVideo) {
		this.layoutSubirVideo = layoutSubirVideo;
	}


	public Element getLayoutTitulo() {
		return layoutTitulo;
	}


	public void setLayoutTitulo(Element layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}


	public H2 getTitulo() {
		return titulo;
	}


	public void setTitulo(H2 titulo) {
		this.titulo = titulo;
	}


	public Label getLabel() {
		return label;
	}


	public void setLabel(Label label) {
		this.label = label;
	}


	public Element getLayoutVideo() {
		return layoutVideo;
	}


	public void setLayoutVideo(Element layoutVideo) {
		this.layoutVideo = layoutVideo;
	}


	public Button getBotonSubir() {
		return botonSubir;
	}


	public void setBotonSubir(Button botonSubir) {
		this.botonSubir = botonSubir;
	}


	public Element getLayoutDatosPublicacion() {
		return layoutDatosPublicacion;
	}


	public void setLayoutDatosPublicacion(Element layoutDatosPublicacion) {
		this.layoutDatosPublicacion = layoutDatosPublicacion;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public Label getLabelLocalizacion() {
		return labelLocalizacion;
	}


	public void setLabelLocalizacion(Label labelLocalizacion) {
		this.labelLocalizacion = labelLocalizacion;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public TextField getTextFielLocalizacion() {
		return textFielLocalizacion;
	}


	public void setTextFielLocalizacion(TextField textFielLocalizacion) {
		this.textFielLocalizacion = textFielLocalizacion;
	}


	public Button getBotonAniadir() {
		return botonAniadir;
	}


	public void setBotonAniadir(Button botonAniadir) {
		this.botonAniadir = botonAniadir;
	}


	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}


	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}


	public Label getLabelDescripcion() {
		return labelDescripcion;
	}


	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}


	public TextArea getTextAreaDescripcion() {
		return textAreaDescripcion;
	}


	public void setTextAreaDescripcion(TextArea textAreaDescripcion) {
		this.textAreaDescripcion = textAreaDescripcion;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public Button getBotonDescartar() {
		return botonDescartar;
	}


	public void setBotonDescartar(Button botonDescartar) {
		this.botonDescartar = botonDescartar;
	}


	public Button getBotonPublicar() {
		return botonPublicar;
	}


	public void setBotonPublicar(Button botonPublicar) {
		this.botonPublicar = botonPublicar;
	}


	/**
     * Creates a new VistaAddpublicacion.
     */
    public VistaAddpublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
