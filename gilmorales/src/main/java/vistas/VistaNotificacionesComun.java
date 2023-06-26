package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-notificaciones-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones-comun")
@JsModule("./src/vista-notificaciones-comun.ts")
public class VistaNotificacionesComun extends LitTemplate {

	@Id("nuevosSeguidores")
	private Element nuevosSeguidores;
	@Id("tituloNotificacion")
	private H3 tituloNotificacion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	
	

	public Element getNuevosSeguidores() {
		return nuevosSeguidores;
	}



	public void setNuevosSeguidores(Element nuevosSeguidores) {
		this.nuevosSeguidores = nuevosSeguidores;
	}



	public H3 getTituloNotificacion() {
		return tituloNotificacion;
	}



	public void setTituloNotificacion(H3 tituloNotificacion) {
		this.tituloNotificacion = tituloNotificacion;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Button getVaadinButton() {
		return vaadinButton;
	}



	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}



	public Avatar getFotoPerfil() {
		return fotoPerfil;
	}



	public void setFotoPerfil(Avatar fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}



	/**
     * Creates a new VistaNotificacionesComun.
     */
    public VistaNotificacionesComun() {
        // You can initialise any data required for the connected UI components here.
    }

}
