package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-lista-publicaciones-usuario-no-registrado-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-usuario-no-registrado-item")
@JsModule("./src/vista-lista-publicaciones-usuario-no-registrado-item.ts")
public class VistaListaPublicacionesUsuarioNoRegistradoItem extends LitTemplate {

    @Id("layoutPublicacion")
	private HorizontalLayout layoutPublicacion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutFotoPerfil")
	private HorizontalLayout layoutFotoPerfil;
	@Id("layoutVideoPublicacion")
	private Element layoutVideoPublicacion;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelGeolocalizacion")
	private Label labelGeolocalizacion;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("layoutDatos")
	private Element layoutDatos;
	@Id("layoutBotonesUsuarioR")
	private HorizontalLayout layoutBotonesUsuarioR;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("botonDenunciar")
	private Button botonDenunciar;
	@Id("layoutBotonesPublicacion")
	private HorizontalLayout layoutBotonesPublicacion;
	@Id("layoutMeGustas")
	private Element layoutMeGustas;
	@Id("labelNumMeGustas")
	private Label labelNumMeGustas;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("layoutComentarios")
	private Element layoutComentarios;
	@Id("labelNumComentarios")
	private Label labelNumComentarios;
	@Id("botonVerComentarios")
	private Button botonVerComentarios;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutComentar")
	private HorizontalLayout layoutComentar;
	@Id("textFieldComentario")
	private TextField textFieldComentario;
	@Id("botonComentar")
	private Button botonComentar;

	/**
     * Creates a new VistaListaPublicacionesUsuarioNoRegistradoItem.
     */
    public VistaListaPublicacionesUsuarioNoRegistradoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
