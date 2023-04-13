package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-cabecera-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-usuario-no-registrado")
@JsModule("./src/vista-cabecera-usuario-no-registrado.ts")
public class VistaCabeceraUsuarioNoRegistrado extends LitTemplate {


	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("logoWeb")
	private Button logoWeb;
	@Id("iconoWeb")
	private Element iconoWeb;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("barraBusqueda")
	private HorizontalLayout barraBusqueda;
	@Id("textoBusqueda")
	private TextField textoBusqueda;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("botonBuscar")
	private Button botonBuscar;
	@Id("inicio")
	private Button inicio;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("botonRegistrarse")
	private Button botonRegistrarse;
	

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Button getLogoWeb() {
		return logoWeb;
	}


	public void setLogoWeb(Button logoWeb) {
		this.logoWeb = logoWeb;
	}


	public Element getIconoWeb() {
		return iconoWeb;
	}


	public void setIconoWeb(Element iconoWeb) {
		this.iconoWeb = iconoWeb;
	}


	public HorizontalLayout getCabecera() {
		return cabecera;
	}


	public void setCabecera(HorizontalLayout cabecera) {
		this.cabecera = cabecera;
	}


	public HorizontalLayout getBarraBusqueda() {
		return barraBusqueda;
	}


	public void setBarraBusqueda(HorizontalLayout barraBusqueda) {
		this.barraBusqueda = barraBusqueda;
	}


	public TextField getTextoBusqueda() {
		return textoBusqueda;
	}


	public void setTextoBusqueda(TextField textoBusqueda) {
		this.textoBusqueda = textoBusqueda;
	}


	public Element getIronIcon() {
		return ironIcon;
	}


	public void setIronIcon(Element ironIcon) {
		this.ironIcon = ironIcon;
	}


	public Button getBotonBuscar() {
		return botonBuscar;
	}


	public void setBotonBuscar(Button botonBuscar) {
		this.botonBuscar = botonBuscar;
	}


	public Button getInicio() {
		return inicio;
	}


	public void setInicio(Button inicio) {
		this.inicio = inicio;
	}


	public Button getVaadinButton() {
		return vaadinButton;
	}


	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}


	public Button getBotonRegistrarse() {
		return botonRegistrarse;
	}


	public void setBotonRegistrarse(Button botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
	}


	/**
     * Creates a new VistaCabeceraUsuarioNoRegistrado.
     */
    public VistaCabeceraUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
