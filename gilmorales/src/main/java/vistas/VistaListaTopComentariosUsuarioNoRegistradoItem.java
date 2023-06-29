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



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Button getNombreDeUsuarioB1() {
		return nombreDeUsuarioB1;
	}



	public void setNombreDeUsuarioB1(Button nombreDeUsuarioB1) {
		this.nombreDeUsuarioB1 = nombreDeUsuarioB1;
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



	public Avatar getFotoPerfil() {
		return fotoPerfil;
	}



	public void setFotoPerfil(Avatar fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}



	public Label getNumeroMeGusta() {
		return numeroMeGusta;
	}



	public void setNumeroMeGusta(Label numeroMeGusta) {
		this.numeroMeGusta = numeroMeGusta;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public Label getMeGustaL() {
		return meGustaL;
	}



	public void setMeGustaL(Label meGustaL) {
		this.meGustaL = meGustaL;
	}



	public Button getMeGustaB() {
		return meGustaB;
	}



	public void setMeGustaB(Button meGustaB) {
		this.meGustaB = meGustaB;
	}



	public Button getBorrarComentarioB() {
		return borrarComentarioB;
	}



	public void setBorrarComentarioB(Button borrarComentarioB) {
		this.borrarComentarioB = borrarComentarioB;
	}



	/**
     * Creates a new VistaListaTopComentariosUsuarioNoRegistradoItem.
     */
    public VistaListaTopComentariosUsuarioNoRegistradoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
