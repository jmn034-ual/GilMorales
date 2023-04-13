package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-top-usuarios-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-top-usuarios-item")
@JsModule("./src/vista-top-usuarios-item.ts")
public class VistaTopUsuariosItem extends LitTemplate {

    @Id("nombreUsuario")
	private Button nombreUsuario;
	@Id("fotoPerfil")
	private Element fotoPerfil;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	
	
	public Button getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(Button nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public Element getFotoPerfil() {
		return fotoPerfil;
	}


	public void setFotoPerfil(Element fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	/**
     * Creates a new VistaTopUsuariosItem.
     */
    public VistaTopUsuariosItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
