package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista-tendencias-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-tendencias-item")
@JsModule("./src/vista-lista-tendencias-item.ts")
public class VistaListaTendenciasItem extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("hashtag")
	private Button hashtag;
	

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Button getHashtag() {
		return hashtag;
	}


	public void setHashtag(Button hashtag) {
		this.hashtag = hashtag;
	}


	/**
     * Creates a new VistaListaTendenciasItem.
     */
    public VistaListaTendenciasItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
