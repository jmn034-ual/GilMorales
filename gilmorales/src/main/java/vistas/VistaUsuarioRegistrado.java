package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-usuario-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-registrado")
@JsModule("./src/vista-usuario-registrado.ts")
public class VistaUsuarioRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cabeceraTop")
	private Element cabeceraTop;
	@Id("listaPublicaciones")
	private Element listaPublicaciones;

	
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


	public Element getCabeceraTop() {
		return cabeceraTop;
	}


	public void setCabeceraTop(Element cabeceraTop) {
		this.cabeceraTop = cabeceraTop;
	}


	public Element getListaPublicaciones() {
		return listaPublicaciones;
	}


	public void setListaPublicaciones(Element listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}


	/**
     * Creates a new VistaUsuarioRegistrado.
     */
    public VistaUsuarioRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
