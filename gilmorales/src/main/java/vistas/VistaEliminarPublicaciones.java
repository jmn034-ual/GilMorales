package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-eliminar-publicaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-eliminar-publicaciones")
@JsModule("./src/vista-eliminar-publicaciones.ts")
public class VistaEliminarPublicaciones extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo")
	private H1 titulo;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("checkboxSelecionarTodas")
	private Checkbox checkboxSelecionarTodas;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonEliminar")
	private Button botonEliminar;
	@Id("labelSelecionar")
	private Label labelSelecionar;

	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public H1 getTitulo() {
		return titulo;
	}


	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public Checkbox getCheckboxSelecionarTodas() {
		return checkboxSelecionarTodas;
	}


	public void setCheckboxSelecionarTodas(Checkbox checkboxSelecionarTodas) {
		this.checkboxSelecionarTodas = checkboxSelecionarTodas;
	}


	public Element getLayoutLista() {
		return layoutLista;
	}


	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public Button getBotonCancelar() {
		return botonCancelar;
	}


	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}


	public Button getBotonEliminar() {
		return botonEliminar;
	}


	public void setBotonEliminar(Button botonEliminar) {
		this.botonEliminar = botonEliminar;
	}


	public Label getLabelSelecionar() {
		return labelSelecionar;
	}


	public void setLabelSelecionar(Label labelSelecionar) {
		this.labelSelecionar = labelSelecionar;
	}


	/**
     * Creates a new VistaEliminarPublicaciones.
     */
    public VistaEliminarPublicaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
