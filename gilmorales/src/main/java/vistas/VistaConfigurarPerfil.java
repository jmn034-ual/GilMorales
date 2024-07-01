package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
//import com.vaadin.flow.component.radiobutton.RadioButton;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-configurar-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configurar-perfil")
@JsModule("./src/vista-configurar-perfil.ts")
public class VistaConfigurarPerfil extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("titulo")
	private H1 titulo;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("layoutPrivacidad")
	private Element layoutPrivacidad;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("tituloPrivacidad")
	private H4 tituloPrivacidad;
	@Id("layoutVisibilidad")
	private HorizontalLayout layoutVisibilidad;
	@Id("labelVisibilidad")
	private Label labelVisibilidad;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("layoutNotificaciones")
	private Element layoutNotificaciones;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("tituloNotificaciones")
	private H4 tituloNotificaciones;
	@Id("layoutPreferencias")
	private HorizontalLayout layoutPreferencias;
	@Id("labelPreferencias")
	private Label labelPreferencias;
	@Id("layoutCheckbox")
	private Element layoutCheckbox;
	@Id("checkboxMeGustas")
	private Checkbox checkboxMeGustas;
	@Id("checkboxComentarios")
	private Checkbox checkboxComentarios;
	@Id("checkboxNuevosSeguidores")
	private Checkbox checkboxNuevosSeguidores;
	@Id("checkboxMenciones")
	private Checkbox checkboxMenciones;
	@Id("layoutBotones")
	private HorizontalLayout layoutBotones;
	@Id("botonRestaurar")
	private Button botonRestaurar;
	@Id("botonGuardar")
	private Button botonGuardar;
	@Id("layoutTitulo")
	private HorizontalLayout layoutTitulo;
	@Id("botonCerrar")
	private Button botonCerrar;
	@Id("layoutCabeceraVentana")
	private HorizontalLayout layoutCabeceraVentana;
	@Id("ironIcon")
	private Element ironIcon;

	
	
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


	public HorizontalLayout getLayoutCabeceraVentana() {
		return layoutCabeceraVentana;
	}


	public void setLayoutCabeceraVentana(HorizontalLayout layoutCabeceraVentana) {
		this.layoutCabeceraVentana = layoutCabeceraVentana;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public H1 getTitulo() {
		return titulo;
	}


	public void setTitulo(H1 titulo) {
		this.titulo = titulo;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public Element getLayoutPrivacidad() {
		return layoutPrivacidad;
	}


	public void setLayoutPrivacidad(Element layoutPrivacidad) {
		this.layoutPrivacidad = layoutPrivacidad;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public H4 getTituloPrivacidad() {
		return tituloPrivacidad;
	}


	public void setTituloPrivacidad(H4 tituloPrivacidad) {
		this.tituloPrivacidad = tituloPrivacidad;
	}


	public HorizontalLayout getLayoutVisibilidad() {
		return layoutVisibilidad;
	}


	public void setLayoutVisibilidad(HorizontalLayout layoutVisibilidad) {
		this.layoutVisibilidad = layoutVisibilidad;
	}


	public Label getLabelVisibilidad() {
		return labelVisibilidad;
	}


	public void setLabelVisibilidad(Label labelVisibilidad) {
		this.labelVisibilidad = labelVisibilidad;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Element getLayoutNotificaciones() {
		return layoutNotificaciones;
	}


	public void setLayoutNotificaciones(Element layoutNotificaciones) {
		this.layoutNotificaciones = layoutNotificaciones;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public H4 getTituloNotificaciones() {
		return tituloNotificaciones;
	}


	public void setTituloNotificaciones(H4 tituloNotificaciones) {
		this.tituloNotificaciones = tituloNotificaciones;
	}


	public HorizontalLayout getLayoutPreferencias() {
		return layoutPreferencias;
	}


	public void setLayoutPreferencias(HorizontalLayout layoutPreferencias) {
		this.layoutPreferencias = layoutPreferencias;
	}


	public Label getLabelPreferencias() {
		return labelPreferencias;
	}


	public void setLabelPreferencias(Label labelPreferencias) {
		this.labelPreferencias = labelPreferencias;
	}


	public Element getLayoutCheckbox() {
		return layoutCheckbox;
	}


	public void setLayoutCheckbox(Element layoutCheckbox) {
		this.layoutCheckbox = layoutCheckbox;
	}


	public Checkbox getCheckboxMeGustas() {
		return checkboxMeGustas;
	}


	public void setCheckboxMeGustas(Checkbox checkboxMeGustas) {
		this.checkboxMeGustas = checkboxMeGustas;
	}


	public Checkbox getCheckboxComentarios() {
		return checkboxComentarios;
	}


	public void setCheckboxComentarios(Checkbox checkboxComentarios) {
		this.checkboxComentarios = checkboxComentarios;
	}


	public Checkbox getCheckboxNuevosSeguidores() {
		return checkboxNuevosSeguidores;
	}


	public void setCheckboxNuevosSeguidores(Checkbox checkboxNuevosSeguidores) {
		this.checkboxNuevosSeguidores = checkboxNuevosSeguidores;
	}


	public Checkbox getCheckboxMenciones() {
		return checkboxMenciones;
	}


	public void setCheckboxMenciones(Checkbox checkboxMenciones) {
		this.checkboxMenciones = checkboxMenciones;
	}


	public HorizontalLayout getLayoutBotones() {
		return layoutBotones;
	}


	public void setLayoutBotones(HorizontalLayout layoutBotones) {
		this.layoutBotones = layoutBotones;
	}


	public Button getBotonRestaurar() {
		return botonRestaurar;
	}


	public void setBotonRestaurar(Button botonRestaurar) {
		this.botonRestaurar = botonRestaurar;
	}


	public Button getBotonGuardar() {
		return botonGuardar;
	}


	public void setBotonGuardar(Button botonGuardar) {
		this.botonGuardar = botonGuardar;
	}


	/**
     * Creates a new VistaConfigurarPerfil.
     */
    public VistaConfigurarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
