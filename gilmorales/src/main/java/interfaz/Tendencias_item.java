package interfaz;

import bd_dcl.Hashtag;
import vistas.VistaListaTendenciasItem;

public class Tendencias_item extends VistaListaTendenciasItem{
//	private button _nombreHashtagB;
	public Tendencias _tendencias;
	public Ver_hashtag _ver_hashtag;
	Hashtag hashtag ;

	public Tendencias_item(Hashtag h, Tendencias interfaz) {
		this.hashtag = h;
		this._tendencias =  interfaz;
		this.getHashtag().setText(h.getNombreHashtag());
		Ver_hashtag();
	}
	public void Ver_hashtag() {
		this._ver_hashtag = new Ver_hashtag(hashtag, this);
		this.getHashtag().addClickListener(event -> {
			this._tendencias._ver_tendencias.getVaadinHorizontalLayout().removeAll();
			this._tendencias._ver_tendencias.getVaadinHorizontalLayout().add(_ver_hashtag);
		});
		
		
	}
}