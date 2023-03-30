package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-lista-top-comentarios-usuario-no-registrado-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-top-comentarios-usuario-no-registrado-item")
@JsModule("./src/vista-lista-top-comentarios-usuario-no-registrado-item.ts")
public class VistaListaTopComentariosUsuarioNoRegistradoItem extends LitTemplate {

    @Id("nombreDeUsuarioB")
	private HorizontalLayout nombreDeUsuarioB;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombreDeUsuarioB1")
	private Button nombreDeUsuarioB1;
	@Id("comentarioL")
	private Label comentarioL;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	@Id("numeroMeGusta")
	private Label numeroMeGusta;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("meGustaL")
	private Label meGustaL;
	@Id("meGustaB")
	private Button meGustaB;
	@Id("borrarComentarioB")
	private Button borrarComentarioB;

	/**
     * Creates a new VistaListaTopComentariosUsuarioNoRegistradoItem.
     */
    public VistaListaTopComentariosUsuarioNoRegistradoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
