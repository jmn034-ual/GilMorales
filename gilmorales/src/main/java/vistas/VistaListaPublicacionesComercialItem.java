package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-lista-publicaciones-comercial-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-comercial-item")
@JsModule("./src/vista-lista-publicaciones-comercial-item.ts")
public class VistaListaPublicacionesComercialItem extends LitTemplate {

	@Id("layoutItem")
	private Element layoutItem;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("layaoutVideo")
	private Element layaoutVideo;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	
	

	public Element getLayoutItem() {
		return layoutItem;
	}



	public void setLayoutItem(Element layoutItem) {
		this.layoutItem = layoutItem;
	}



	public Element getLayoutPublicacion() {
		return layoutPublicacion;
	}



	public void setLayoutPublicacion(Element layoutPublicacion) {
		this.layoutPublicacion = layoutPublicacion;
	}



	public Element getLayaoutVideo() {
		return layaoutVideo;
	}



	public void setLayaoutVideo(Element layaoutVideo) {
		this.layaoutVideo = layaoutVideo;
	}



	public Label getNumVisualizaciones() {
		return numVisualizaciones;
	}



	public void setNumVisualizaciones(Label numVisualizaciones) {
		this.numVisualizaciones = numVisualizaciones;
	}



	/**
     * Creates a new VistaListaPublicacionesComercialItem.
     */
    public VistaListaPublicacionesComercialItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
