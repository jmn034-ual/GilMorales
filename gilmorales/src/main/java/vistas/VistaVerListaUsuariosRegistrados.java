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
