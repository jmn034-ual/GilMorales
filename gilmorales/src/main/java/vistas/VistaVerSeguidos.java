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
 * A Designer generated component for the vista-ver-seguidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-seguidos")
@JsModule("./src/vista-ver-seguidos.ts")
public class VistaVerSeguidos extends LitTemplate {

    @Id("layoutListaSeguidos")
	private Element layoutListaSeguidos;
	@Id("titulo")
	private H2 titulo;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("botonSalir")
	private Button botonSalir;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
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

	public Element getLayoutListaSeguidos() {
		return layoutListaSeguidos;
	}

	public void setLayoutListaSeguidos(Element layoutListaSeguidos) {
		this.layoutListaSeguidos = layoutListaSeguidos;
	}

	public H2 getTitulo() {
		return titulo;
	}

	public void setTitulo(H2 titulo) {
		this.titulo = titulo;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(Button botonSalir) {
		this.botonSalir = botonSalir;
	}

	public HorizontalLayout getLayoutTitulo() {
		return layoutTitulo;
	}

	public void setLayoutTitulo(HorizontalLayout layoutTitulo) {
		this.layoutTitulo = layoutTitulo;
	}

	public HorizontalLayout getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(HorizontalLayout labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	/**
     * Creates a new VistaVerSeguidos.
     */
    public VistaVerSeguidos() {
        // You can initialise any data required for the connected UI components here.
    }

}
