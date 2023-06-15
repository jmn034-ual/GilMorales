package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-seguidores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-seguidores")
@JsModule("./src/vista-ver-seguidores.ts")
public class VistaVerSeguidores extends LitTemplate {

    @Id("titulo")
	private H2 titulo;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("botonCerrar")
	private Button botonCerrar;
	@Id("labelTitulo")
	private HorizontalLayout labelTitulo;
	@Id("ironIcon")
	private Element ironIcon;

	
	public Element getIronIcon() {
		return ironIcon;
	}


	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}


	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}


	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}


	public Button getBotonCerrar() {
		return botonCerrar;
	}


	public void setBotonCerrar(Button botonCerrar) {
		this.botonCerrar = botonCerrar;
	}


	public HorizontalLayout getLabelTitulo() {
		return labelTitulo;
	}


	public void setLabelTitulo(HorizontalLayout labelTitulo) {
		this.labelTitulo = labelTitulo;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public H2 getTitulo() {
		return titulo;
	}


	public void setTitulo(H2 titulo) {
		this.titulo = titulo;
	}


	public Element getLayoutLista() {
		return layoutLista;
	}


	public void setLayoutLista(Element layoutLista) {
		this.layoutLista = layoutLista;
	}


	/**
     * Creates a new VistaVerSeguidores.
     */
    public VistaVerSeguidores() {
        // You can initialise any data required for the connected UI components here.
    }

}
