package TikTok;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.ImageIcon;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Image;

@Tag("imagen")
public class Imagen extends HtmlContainer{
	private static final PropertyDescriptor<String, String> srcDescriptor = PropertyDescriptors
            .attributeWithDefault("src", "");

    public Imagen() {
        super();
        getElement().setProperty("controls", true);
        getElement().setProperty("autoplay", true);
    }

    public Imagen(String src) {
        setSrc(src);
        getElement().setProperty("controls", true);
        getElement().setProperty("autoplay", true);
    }

    public String getSrc() {
        return get(srcDescriptor);
    }

    public void setSrc(String src) {
        set(srcDescriptor, src);
    }
	
}
