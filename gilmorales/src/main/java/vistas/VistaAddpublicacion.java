package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * A Designer generated component for the vista-addpublicacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-addpublicacion")
@JsModule("./src/vista-addpublicacion.ts")
public class VistaAddpublicacion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera")
	private HorizontalLayout cabecera;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutSubirVideo")
	private Element layoutSubirVideo;
	@Id("layoutTitulo")
	private Element layoutTitulo;
	@Id("titulo")
	private H2 titulo;
	@Id("label")
	private Label label;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("botonSubir")
	private Button botonSubir;
	@Id("layoutDatosPublicacion")
	private Element layoutDatosPublicacion;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("labelLocalizacion")
	private Label labelLocalizacion;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("textFielLocalizacion")
	private TextField textFielLocalizacion;
	@Id("botonAniadir")
	private Button botonAniadir;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("textAreaDescripcion")
	private TextArea textAreaDescripcion;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("botonDescartar")
	private Button botonDescartar;
	@Id("botonPublicar")
	private Button botonPublicar;

	/**
     * Creates a new VistaAddpublicacion.
     */
    public VistaAddpublicacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
