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
 * A Designer generated component for the vista-lista-hashtags-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-hashtags-item")
@JsModule("./src/vista-lista-hashtags-item.ts")
public class VistaListaHashtagsItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("video")
	private Element video;
	@Id("datosHashtags")
	private Element datosHashtags;
	@Id("nombreHashtags")
	private Button nombreHashtags;
	@Id("layoutVisualizaciones")
	private HorizontalLayout layoutVisualizaciones;
	@Id("lableVisualizaciones")
	private Label lableVisualizaciones;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	
	

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Element getVideo() {
		return video;
	}



	public void setVideo(Element video) {
		this.video = video;
	}



	public Element getDatosHashtags() {
		return datosHashtags;
	}



	public void setDatosHashtags(Element datosHashtags) {
		this.datosHashtags = datosHashtags;
	}



	public Button getNombreHashtags() {
		return nombreHashtags;
	}



	public void setNombreHashtags(Button nombreHashtags) {
		this.nombreHashtags = nombreHashtags;
	}



	public HorizontalLayout getLayoutVisualizaciones() {
		return layoutVisualizaciones;
	}



	public void setLayoutVisualizaciones(HorizontalLayout layoutVisualizaciones) {
		this.layoutVisualizaciones = layoutVisualizaciones;
	}



	public Label getLableVisualizaciones() {
		return lableVisualizaciones;
	}



	public void setLableVisualizaciones(Label lableVisualizaciones) {
		this.lableVisualizaciones = lableVisualizaciones;
	}



	public Label getNumVisualizaciones() {
		return numVisualizaciones;
	}



	public void setNumVisualizaciones(Label numVisualizaciones) {
		this.numVisualizaciones = numVisualizaciones;
	}



	/**
     * Creates a new VistaListaHashtagsItem.
     */
    public VistaListaHashtagsItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
