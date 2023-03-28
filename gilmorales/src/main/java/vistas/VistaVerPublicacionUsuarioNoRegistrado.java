package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-publicacion-usuario-no-registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicacion-usuario-no-registrado")
@JsModule("./src/vista-ver-publicacion-usuario-no-registrado.ts")
public class VistaVerPublicacionUsuarioNoRegistrado extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("video")
	private HorizontalLayout video;
	@Id("layoutNumVisualizaciones")
	private HorizontalLayout layoutNumVisualizaciones;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("label")
	private Label label;
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
	@Id("layoutLabels")
	private HorizontalLayout layoutLabels;
	@Id("descripcion")
	private Label descripcion;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("labelNumMeGustas")
	private Label labelNumMeGustas;
	@Id("numComentarios")
	private Label numComentarios;
	@Id("botonVerComentario")
	private Button botonVerComentario;
	@Id("ironIcon2")
	private Element ironIcon2;
	@Id("fechaSubida")
	private Label fechaSubida;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;

	/**
     * Creates a new VistaVerPublicacionUsuarioNoRegistrado.
     */
    public VistaVerPublicacionUsuarioNoRegistrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
