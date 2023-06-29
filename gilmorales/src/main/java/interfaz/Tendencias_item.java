package interfaz;

import bd_dcl.Hashtag;
import vistas.VistaListaTendenciasItem;

public class Tendencias_item extends VistaListaTendenciasItem{
//	private button _nombreHashtagB;
	public Tendencias _tendencias;
	public Ver_hashtag _ver_hashtag;
	Hashtag hashtag ;

	public Tendencias_item(Hashtag h) {
		this.hashtag = h;
		this.getHashtag().setText(h.getNombreHashtag());
	}
	public void Ver_hashtag() {
		this._ver_hashtag = new Ver_hashtag(hashtag);
		
	}
}