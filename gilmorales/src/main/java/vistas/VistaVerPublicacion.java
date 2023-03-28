package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-publicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-publicacion")
@JsModule("./src/vista-ver-publicacion.ts")
public class VistaVerPublicacion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
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
	@Id("botonVerPerfil")
	private Button botonVerPerfil;
	@Id("geolocalizacion")
	private Label geolocalizacion;
	@Id("descripcion")
	private Label descripcion;
	@Id("fechaSubida")
	private Label fechaSubida;
	@Id("layoutLabels")
	private HorizontalLayout layoutLabels;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("labelMeGusta")
	private Label labelMeGusta;
	@Id("numComentarios")
	private Label numComentarios;
	@Id("vaadinVerticalLayout5")
	private Element vaadinVerticalLayout5;
	@Id("verComentariosBoton")
	private Button verComentariosBoton;
	@Id("verPerfil")
	private Button verPerfil;
	@Id("botonVerComentario")
	private Button botonVerComentario;

	/**
     * Creates a new VistaVerPublicacion.
     */
    public VistaVerPublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
