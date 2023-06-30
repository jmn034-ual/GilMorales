package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-ver-me-gustas-publicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-me-gustas-publicacion")
@JsModule("./src/vista-ver-me-gustas-publicacion.ts")
public class VistaVerMeGustasPublicacion extends LitTemplate {

    @Id("layoutMeGustas")
	private Element layoutMeGustas;
	@Id("titulo")
	private H2 titulo;
	@Id("layoutLista")
	private Element layoutLista;
	@Id("botonCerrar")
	private Button botonCerrar;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	
	

	
	public Button getBotonCerrar() {
		return botonCerrar;
	}


	public void setBotonCerrar(Button botonCerrar) {
		this.botonCerrar = botonCerrar;
	}


	public Element getIronIcon() {
		return ironIcon;
	}


	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
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


	public Element getLayoutMeGustas() {
		return layoutMeGustas;
	}


	public void setLayoutMeGustas(Element layoutMeGustas) {
		this.layoutMeGustas = layoutMeGustas;
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
     * Creates a new VistaVerMeGustasPublicacion.
     */
    public VistaVerMeGustasPublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
