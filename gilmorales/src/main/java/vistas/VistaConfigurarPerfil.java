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

    @Id("cabecera")
	private HorizontalLayout cabecera;
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
	@Id("radioGroupVisibilidad")
	private RadioButtonGroup<String> radioGroupVisibilidad;
//	@Id("radioBotonPrivada")
//	private RadioButton<String> radioBotonPrivada;
//	@Id("radioBotonPublica")
//	private RadioButton<String> radioBotonPublica;
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

	/**
     * Creates a new VistaConfigurarPerfil.
     */
    public VistaConfigurarPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
