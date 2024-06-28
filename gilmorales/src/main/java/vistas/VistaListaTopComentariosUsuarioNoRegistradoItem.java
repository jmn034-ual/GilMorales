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



	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombreDeUsuarioB")
	private Button nombreDeUsuarioB;
	@Id("comentarioL")
	private Label comentarioL;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("numeroMeGusta")
	private Label numeroMeGusta;
	@Id("meGustaB")
	private Button meGustaB;
	@Id("borrarComentarioB")
	private Button borrarComentarioB;
	@Id("ironIcon1")
	private Element ironIcon1;
	
	

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
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



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Button getNombreDeUsuarioB() {
		return nombreDeUsuarioB;
	}



	public void setNombreDeUsuarioB(Button nombreDeUsuarioB) {
		this.nombreDeUsuarioB = nombreDeUsuarioB;
	}



	public Label getComentarioL() {
		return comentarioL;
	}



	public void setComentarioL(Label comentarioL) {
		this.comentarioL = comentarioL;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public Label getNumeroMeGusta() {
		return numeroMeGusta;
	}



	public void setNumeroMeGusta(Label numeroMeGusta) {
		this.numeroMeGusta = numeroMeGusta;
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



	public Element getIronIcon1() {
		return ironIcon1;
	}



	public void setIronIcon1(Element ironIcon1) {
		this.ironIcon1 = ironIcon1;
	}



	/**
     * Creates a new VistaListaTopComentariosUsuarioNoRegistradoItem.
     */
    public VistaListaTopComentariosUsuarioNoRegistradoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
