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
 * A Designer generated component for the vista-cabecera-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera")
@JsModule("./src/vista-cabecera.ts")
public class VistaCabecera extends LitTemplate {

   
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
	@Id("botonNotificaciones")
	private Button botonNotificaciones;
	@Id("botonPerfil")
	private Button botonPerfil;
	@Id("botonCerrarSesion")
	private Button botonCerrarSesion;
	@Id("botonAniadir")
	private Button botonAniadir;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;


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


	public Button getBotonNotificaciones() {
		return botonNotificaciones;
	}


	public void setBotonNotificaciones(Button botonNotificaciones) {
		this.botonNotificaciones = botonNotificaciones;
	}


	public Button getBotonPerfil() {
		return botonPerfil;
	}


	public void setBotonPerfil(Button botonPerfil) {
		this.botonPerfil = botonPerfil;
	}


	public Button getBotonCerrarSesion() {
		return botonCerrarSesion;
	}


	public void setBotonCerrarSesion(Button botonCerrarSesion) {
		this.botonCerrarSesion = botonCerrarSesion;
	}


	public Button getBotonAniadir() {
		return botonAniadir;
	}


	public void setBotonAniadir(Button botonAniadir) {
		this.botonAniadir = botonAniadir;
	}


	/**
     * Creates a new VistaCabeceraAdministrador.
     */
    public VistaCabecera() {
        // You can initialise any data required for the connected UI components here.
    }

}
