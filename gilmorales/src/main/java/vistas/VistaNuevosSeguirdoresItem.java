package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-nuevos-seguirdores-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevos-seguirdores-item")
@JsModule("./src/vista-nuevos-seguirdores-item.ts")
public class VistaNuevosSeguirdoresItem extends LitTemplate {

    @Id("fotoperfil")
	private HorizontalLayout fotoperfil;
	@Id("fotoPerfil")
	private Element fotoPerfil;
	@Id("botonDejarDeSeguir")
	private Button botonDejarDeSeguir;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonAceptar")
	private Button botonAceptar;
	@Id("botonEnviarSolicitud")
	private Button botonEnviarSolicitud;

	/**
     * Creates a new VistaNuevosSeguirdoresItem.
     */
    public VistaNuevosSeguirdoresItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
