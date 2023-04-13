package interfaz;

import com.vaadin.flow.component.button.Button;import com.vaadin.flow.component.charts.model.VerticalAlign;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTopHashtagsItem;

public class top_hashtags_item extends VistaTopHashtagsItem{
	private Button _verHashtagB;
	public top_hashtags _top_hashtags;
	public Ver_hashtag _ver_hashtag;

	public top_hashtags_item(String nombreHashtag) {
		this.getHashtagItem().setText(nombreHashtag);
	}
	public void Ver_hashtag() {
		throw new UnsupportedOperationException();
	}
}