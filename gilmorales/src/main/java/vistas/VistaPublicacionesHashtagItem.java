package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-publicaciones-hashtag-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-publicaciones-hashtag-item")
@JsModule("./src/vista-publicaciones-hashtag-item.ts")
public class VistaPublicacionesHashtagItem extends LitTemplate {

    @Id("layoutItem")
	private HorizontalLayout layoutItem;
	@Id("imagenPublicacion")
	private Element imagenPublicacion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("descripcion")
	private Label descripcion;
	
	

	public HorizontalLayout getLayoutItem() {
		return layoutItem;
	}



	public void setLayoutItem(HorizontalLayout layoutItem) {
		this.layoutItem = layoutItem;
	}



	public Element getImagenPublicacion() {
		return imagenPublicacion;
	}



	public void setImagenPublicacion(Element imagenPublicacion) {
		this.imagenPublicacion = imagenPublicacion;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Button getBotonNombreUsuario() {
		return botonNombreUsuario;
	}



	public void setBotonNombreUsuario(Button botonNombreUsuario) {
		this.botonNombreUsuario = botonNombreUsuario;
	}



	public Label getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(Label descripcion) {
		this.descripcion = descripcion;
	}



	/**
     * Creates a new VistaPublicacionesHashtagItem.
     */
    public VistaPublicacionesHashtagItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
