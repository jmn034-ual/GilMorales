package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-top-hashtags-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-top-hashtags-item")
@JsModule("./src/vista-top-hashtags-item.ts")
public class VistaTopHashtagsItem extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("hashtagItem")
	private Button hashtagItem;

	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Button getHashtagItem() {
		return hashtagItem;
	}


	public void setHashtagItem(Button hashtagItem) {
		this.hashtagItem = hashtagItem;
	}


	/**
     * Creates a new VistaTopHashtagsItem.
     */
    public VistaTopHashtagsItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
