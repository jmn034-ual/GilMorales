package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-notificaciones-comentarios-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-comentarios-item")
@JsModule("./src/vista-notificaciones-comentarios-item.ts")
public class VistaNotificacionesComentariosItem extends LitTemplate {


	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("labelComentario")
	private Label labelComentario;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("nombreUser")
	private Button nombreUser;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}


	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}

	public Button getNombreUser() {
		return nombreUser;
	}


	public void setNombreUser(Button nombreUser) {
		this.nombreUser = nombreUser;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Label getLabelComentario() {
		return labelComentario;
	}


	public void setLabelComentario(Label labelComentario) {
		this.labelComentario = labelComentario;
	}


	public Button getBotonMeGusta() {
		return botonMeGusta;
	}


	public void setBotonMeGusta(Button botonMeGusta) {
		this.botonMeGusta = botonMeGusta;
	}


	/**
     * Creates a new VistaNotificacionesComentariosItem.
     */
    public VistaNotificacionesComentariosItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
