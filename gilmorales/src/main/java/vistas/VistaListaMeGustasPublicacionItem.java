package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-lista-me-gustas-publicacion-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-me-gustas-publicacion-item")
@JsModule("./src/vista-lista-me-gustas-publicacion-item.ts")
public class VistaListaMeGustasPublicacionItem extends LitTemplate {

    @Id("layoutItem")
	private HorizontalLayout layoutItem;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	
	

	public HorizontalLayout getLayoutItem() {
		return layoutItem;
	}



	public void setLayoutItem(HorizontalLayout layoutItem) {
		this.layoutItem = layoutItem;
	}






	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}



	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}



	public Button getBotonNombreUsuario() {
		return botonNombreUsuario;
	}



	public void setBotonNombreUsuario(Button botonNombreUsuario) {
		this.botonNombreUsuario = botonNombreUsuario;
	}



	public Button getBotonSeguir() {
		return botonSeguir;
	}



	public void setBotonSeguir(Button botonSeguir) {
		this.botonSeguir = botonSeguir;
	}



	/**
     * Creates a new VistaListaMeGustasPublicacionItem.
     */
    public VistaListaMeGustasPublicacionItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
