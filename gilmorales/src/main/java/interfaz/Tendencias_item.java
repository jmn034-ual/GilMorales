package interfaz;

import vistas.VistaListaTendenciasItem;

public class Tendencias_item extends VistaListaTendenciasItem{
//	private button _nombreHashtagB;
	public Tendencias _tendencias;
	public Ver_hashtag _ver_hashtag;

	public Tendencias_item(Lista_Hashtags_item lhi) {
		this.getHashtag().setText(lhi.getNombreHashtags().getText());
	}
	public void Ver_hashtag() {
		throw new UnsupportedOperationException();
	}
}