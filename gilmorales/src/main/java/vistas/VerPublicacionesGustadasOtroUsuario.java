package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the ver-publicaciones-gustadas-otro-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("ver-publicaciones-gustadas-otro-usuario")
@JsModule("./src/ver-publicaciones-gustadas-otro-usuario.ts")
public class VerPublicacionesGustadasOtroUsuario extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
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
	@Id("botonVerListaHashtags")
	private Button botonVerListaHashtags;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
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
	@Id("layoutDatosPerfil")
	private HorizontalLayout layoutDatosPerfil;
	@Id("numSiguiendo")
	private Label numSiguiendo;
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
	@Id("botonMeGustas")
	private Button botonMeGustas;
	@Id("layoutListaPublicacionesGustadas")
	private Element layoutListaPublicacionesGustadas;
	@Id("layoutHorizontalPublicacionesGustadas")
	private HorizontalLayout layoutHorizontalPublicacionesGustadas;

	/**
     * Creates a new VerPublicacionesGustadasOtroUsuario.
     */
    public VerPublicacionesGustadasOtroUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
