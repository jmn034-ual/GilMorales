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
	@Id("nombreDeUsuarioB1")
	private Button nombreDeUsuarioB1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("comentarioL")
	private Label comentarioL;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label")
	private Label label;
	@Id("denunciarB")
	private Button denunciarB;

	public HorizontalLayout getNombreDeUsuarioB() {
		return nombreDeUsuarioB;
	}

	public void setNombreDeUsuarioB(HorizontalLayout nombreDeUsuarioB) {
		this.nombreDeUsuarioB = nombreDeUsuarioB;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public Button getNombreDeUsuarioB1() {
		return nombreDeUsuarioB1;
	}

	public void setNombreDeUsuarioB1(Button nombreDeUsuarioB1) {
		this.nombreDeUsuarioB1 = nombreDeUsuarioB1;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getComentarioL() {
		return comentarioL;
	}

	public void setComentarioL(Label comentarioL) {
		this.comentarioL = comentarioL;
	}

	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}

	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Button getDenunciarB() {
		return denunciarB;
	}

	public void setDenunciarB(Button denunciarB) {
		this.denunciarB = denunciarB;
	}

	/**
     * Creates a new VistaListaComentariosComercialItem.
     */
    public VistaListaComentariosComercialItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
