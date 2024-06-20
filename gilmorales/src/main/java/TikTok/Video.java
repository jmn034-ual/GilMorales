package TikTok;


import com.vaadin.flow.component.*;

@Tag("video")
public class Video extends HtmlContainer implements ClickNotifier<com.vaadin.flow.component.html.Image> {

    private static final PropertyDescriptor<String, String> srcDescriptor = PropertyDescriptors
            .attributeWithDefault("src", "");

    public Video() {
        super();
        getElement().setProperty("controls", true);
        getElement().setProperty("autoplay", true);
        getElement().getStyle().set("border-radius", "8px");
    }

    public Video(String src) {
        setSrc(src);
        getElement().setProperty("controls", true);
        getElement().setProperty("autoplay", true);
        getElement().setProperty("muted", true);
        this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
//		this.getStyle().set("object-fit", "cover");
        getElement().setProperty("overflow", "hidden");
        getElement().getStyle().set("border-radius", "8px");
    }

    public String getSrc() {
        return get(srcDescriptor);
    }

    public void setSrc(String src) {
        set(srcDescriptor, src);
    }
}