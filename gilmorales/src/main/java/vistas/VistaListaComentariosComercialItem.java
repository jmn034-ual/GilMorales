package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-lista-comentarios-comercial-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-comentarios-comercial-item")
@JsModule("./src/vista-lista-comentarios-comercial-item.ts")
public class VistaListaComentariosComercialItem extends LitTemplate {

    @Id("nombreDeUsuarioB")
	private HorizontalLayout nombreDeUsuarioB;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("avatar")
	private Avatar avatar;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombreDeUsuarioB1")
	private Button nombreDeUsuarioB1;
	@Id("comentarioL")
	private Label comentarioL;

	/**
     * Creates a new VistaListaComentariosComercialItem.
     */
    public VistaListaComentariosComercialItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
