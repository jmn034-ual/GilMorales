package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-usuario-no-registrado")
@JsModule("./src/vista-usuario-no-registrado.ts")
public class VistaUsuarioNoRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutCabeceraTop")
	private Element layoutCabeceraTop;
	@Id("layoutListaPublicaciones")
	private Element layoutListaPublicaciones;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getLayoutCabecera() {
		return layoutCabecera;
	}

	public void setLayoutCabecera(HorizontalLayout layoutCabecera) {
		this.layoutCabecera = layoutCabecera;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getLayoutCabeceraTop() {
		return layoutCabeceraTop;
	}

	public void setLayoutCabeceraTop(Element layoutCabeceraTop) {
		this.layoutCabeceraTop = layoutCabeceraTop;
	}

	public Element getLayoutListaPublicaciones() {
		return layoutListaPublicaciones;
	}

	public void setLayoutListaPublicaciones(Element layoutListaPublicaciones) {
		this.layoutListaPublicaciones = layoutListaPublicaciones;
	}

	/**
     * Creates a new VistaUsuarioNoRegistrado.
     */
    public VistaUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
