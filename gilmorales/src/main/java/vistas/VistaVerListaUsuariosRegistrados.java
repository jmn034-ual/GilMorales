package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-ver-lista-usuarios-registrados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-lista-usuarios-registrados")
@JsModule("./src/vista-ver-lista-usuarios-registrados.ts")
public class VistaVerListaUsuariosRegistrados extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("titulo")
	private H1 titulo;
	@Id("layoutBotonOrdenar")
	private HorizontalLayout layoutBotonOrdenar;
	@Id("botonOrdenar")
	private Select botonOrdenar;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("vaadinItem1")
	private Element vaadinItem1;
	@Id("vaadinItem")
	private Element vaadinItem;
	@Id("layoutHorizontalLista")
	private HorizontalLayout layoutHorizontalLista;
	@Id("layoutVerticalLista")
	private Element layoutVerticalLista;

	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}


	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}


	public H1 getTitulo() {
		return titulo;
	}


	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}


	public HorizontalLayout getLayoutBotonOrdenar() {
		return layoutBotonOrdenar;
	}


	public void setLayoutBotonOrdenar(HorizontalLayout layoutBotonOrdenar) {
		this.layoutBotonOrdenar = layoutBotonOrdenar;
	}


	public Select getBotonOrdenar() {
		return botonOrdenar;
	}


	public void setBotonOrdenar(Select botonOrdenar) {
		this.botonOrdenar = botonOrdenar;
	}


	public Element getVaadinListBox() {
		return vaadinListBox;
	}


	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}


	public Element getVaadinItem1() {
		return vaadinItem1;
	}


	public void setVaadinItem1(Element vaadinItem1) {
		this.vaadinItem1 = vaadinItem1;
	}


	public Element getVaadinItem() {
		return vaadinItem;
	}


	public void setVaadinItem(Element vaadinItem) {
		this.vaadinItem = vaadinItem;
	}


	public HorizontalLayout getLayoutHorizontalLista() {
		return layoutHorizontalLista;
	}


	public void setLayoutHorizontalLista(HorizontalLayout layoutHorizontalLista) {
		this.layoutHorizontalLista = layoutHorizontalLista;
	}


	public Element getLayoutVerticalLista() {
		return layoutVerticalLista;
	}


	public void setLayoutVerticalLista(Element layoutVerticalLista) {
		this.layoutVerticalLista = layoutVerticalLista;
	}


	/**
     * Creates a new VistaVerListaUsuariosRegistrados.
     */
    public VistaVerListaUsuariosRegistrados() {
        // You can initialise any data required for the connected UI components here.
    }

}
