package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista-comentarios-usuario-no-registrado-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-comentarios-usuario-no-registrado-item")
@JsModule("./src/vista-lista-comentarios-usuario-no-registrado-item.ts")
public class VistaListaComentariosUsuarioNoRegistradoItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	@Id("nombreUsuario")
	private H3 nombreUsuario;
	@Id("comentarioL")
	private Label comentarioL;
	@Id("numeroMeGusta")
	private Label numeroMeGusta;
	@Id("meGustaL")
	private Label meGustaL;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("meGustaB")
	private Button meGustaB;
	@Id("denunciarB")
	private Button denunciarB;
	@Id("borrarComentarioB")
	private Button borrarComentarioB;
	@Id("nombreDeUsuarioB")
	private Button nombreDeUsuarioB;
	/**
     * Creates a new VistaListaComentariosUsuarioNoRegistradoItem.
     */
    public VistaListaComentariosUsuarioNoRegistradoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
