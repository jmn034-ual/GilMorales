package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-ver-comentarios-comercial template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-comentarios-comercial")
@JsModule("./src/vista-ver-comentarios-comercial.ts")
public class VistaVerComentariosComercial extends LitTemplate {

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
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("layoutListaComentarios")
	private Element layoutListaComentarios;

	/**
     * Creates a new VistaVerComentariosComercial.
     */
    public VistaVerComentariosComercial() {
        // You can initialise any data required for the connected UI components here.
    }

}
