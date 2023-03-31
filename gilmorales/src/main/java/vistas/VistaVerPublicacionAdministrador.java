package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-publicacion-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicacion-administrador")
@JsModule("./src/vista-ver-publicacion-administrador.ts")
public class VistaVerPublicacionAdministrador extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("layoutUsuario")
	private HorizontalLayout layoutUsuario;
	@Id("avatar")
	private Avatar avatar;
	@Id("layoutVerPerfil")
	private Element layoutVerPerfil;
	@Id("verPerfil")
	private Button verPerfil;
	@Id("geolocalizacion")
	private Label geolocalizacion;
	@Id("botonDenunciar")
	private Element botonDenunciar;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("eliminarPublicacion")
	private Button eliminarPublicacion;
	@Id("layoutLabels")
	private HorizontalLayout layoutLabels;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;

	/**
     * Creates a new VistaVerPublicacionAdministrador.
     */
    public VistaVerPublicacionAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
