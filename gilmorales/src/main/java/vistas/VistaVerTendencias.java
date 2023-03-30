package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-tendencias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-tendencias")
@JsModule("./src/vista-ver-tendencias.ts")
public class VistaVerTendencias extends LitTemplate {

    @Id("titulo")
	private H1 titulo;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("layoutItem")
	private Element layoutItem;
	@Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutTendencias")
	private Element layoutTendencias;
	@Id("tituloTendencias")
	private H4 tituloTendencias;
	@Id("layoutHashtags")
	private Element layoutHashtags;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("botonVerListaHashtags")
	private Button botonVerListaHashtags;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Element fotoPerfil;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("nombreUsuario")
	private H3 nombreUsuario;
	@Id("nombreYapellidos")
	private H4 nombreYapellidos;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("botonDenunciar")
	private Button botonDenunciar;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("numSiguiendo")
	private Label numSiguiendo;
	@Id("layoutDatosPerfil")
	private HorizontalLayout layoutDatosPerfil;
	@Id("labelSiguiendo")
	private Label labelSiguiendo;
	@Id("numSeguidores")
	private Label numSeguidores;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("layoutDescripcion")
	private HorizontalLayout layoutDescripcion;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutBonoes")
	private HorizontalLayout layoutBonoes;
	@Id("botonVideos")
	private Button botonVideos;
	@Id("botonMeGustas")
	private Button botonMeGustas;
	@Id("layoutListaPublicaciones")
	private Element layoutListaPublicaciones;
	@Id("layoutHorizontalPublicaciones")
	private HorizontalLayout layoutHorizontalPublicaciones;
	@Id("botonModificarPerfil")
	private Button botonModificarPerfil;
	@Id("botonEliminarPublicacion")
	private Button botonEliminarPublicacion;
	@Id("labelUsuarioPrivado")
	private Label labelUsuarioPrivado;
	@Id("botonPeticionAmistad")
	private Button botonPeticionAmistad;
	@Id("botonEditarPerfil")
	private Button botonEditarPerfil;
	/**
     * Creates a new VistaVerTendencias.
     */
    public VistaVerTendencias() {
        // You can initialise any data required for the connected UI components here.
    }

}
