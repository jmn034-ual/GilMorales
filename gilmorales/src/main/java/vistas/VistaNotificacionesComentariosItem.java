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
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("labelComentario")
	private Label labelComentario;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	

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
