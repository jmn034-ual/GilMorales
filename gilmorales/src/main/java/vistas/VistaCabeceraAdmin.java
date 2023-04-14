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
 * A Designer generated component for the vista-cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-admin")
@JsModule("./src/vista-cabecera-admin.ts")
public class VistaCabeceraAdmin extends LitTemplate {

   

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("logoWeb")
	private Button logoWeb;
	@Id("iconoWeb")
	private Element iconoWeb;
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
	@Id("gestionarDenunciasB")
	private Button gestionarDenunciasB;
	@Id("cerrarSesionB")
	private Button cerrarSesionB;
	
	

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



	public Button getGestionarDenunciasB() {
		return gestionarDenunciasB;
	}



	public void setGestionarDenunciasB(Button gestionarDenunciasB) {
		this.gestionarDenunciasB = gestionarDenunciasB;
	}



	public Button getCerrarSesionB() {
		return cerrarSesionB;
	}



	public void setCerrarSesionB(Button cerrarSesionB) {
		this.cerrarSesionB = cerrarSesionB;
	}



	/**
     * Creates a new VistaCabecera.
     */
    public VistaCabeceraAdmin() {
        // You can initialise any data required for the connected UI components here.
    }

}
