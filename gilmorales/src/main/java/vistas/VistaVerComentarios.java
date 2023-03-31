package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-ver-comentarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-comentarios")
@JsModule("./src/vista-ver-comentarios.ts")
public class VistaVerComentarios extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutInfo")
	private Element layoutInfo;
	@Id("layoutpropietario")
	private HorizontalLayout layoutpropietario;
	@Id("layoutFotoPerfil")
	private Element layoutFotoPerfil;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelGeolocalizacion")
	private Label labelGeolocalizacion;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutEstadisticas")
	private Element layoutEstadisticas;
	@Id("layoutMeGustas")
	private HorizontalLayout layoutMeGustas;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("labelNumMeGustas")
	private Label labelNumMeGustas;
	@Id("layoutNumComentarios")
	private HorizontalLayout layoutNumComentarios;
	@Id("numComentarios")
	private Label numComentarios;
	@Id("labelComentarios")
	private Label labelComentarios;
	@Id("layoutVisualizaciones")
	private HorizontalLayout layoutVisualizaciones;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("labelVisualizaciones")
	private Label labelVisualizaciones;
	@Id("layoutSeguidores")
	private Element layoutSeguidores;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("numSeguidores")
	private Label numSeguidores;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("botonEliminarAdmi")
	private Button botonEliminarAdmi;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("layoutListaComentarios")
	private Element layoutListaComentarios;
	@Id("layoutComentar")
	private HorizontalLayout layoutComentar;
	@Id("textFieldCmentario")
	private TextField textFieldCmentario;
	@Id("botonComentar")
	private Button botonComentar;

	/**
     * Creates a new VistaVerComentarios.
     */
    public VistaVerComentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}
