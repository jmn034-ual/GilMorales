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
 * A Designer generated component for the vista-lista-de-seguidores-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-de-seguidores-item")
@JsModule("./src/vista-lista-de-seguidores-item.ts")
public class VistaListaDeSeguidoresItem extends LitTemplate {

    @Id("layoutItem")
	private HorizontalLayout layoutItem;
	@Id("imagen")
	private Element imagen;
	@Id("nombreUsuario")
	private Button nombreUsuario;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	
	

	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}



	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}



	public HorizontalLayout getLayoutItem() {
		return layoutItem;
	}



	public void setLayoutItem(HorizontalLayout layoutItem) {
		this.layoutItem = layoutItem;
	}



	public Element getImagen() {
		return imagen;
	}



	public void setImagen(Element imagen) {
		this.imagen = imagen;
	}



	public Button getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(Button nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	/**
     * Creates a new VistaListaDeSeguidoresItem.
     */
    public VistaListaDeSeguidoresItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
