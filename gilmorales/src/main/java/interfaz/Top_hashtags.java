package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import vistas.VistaTopHashtags;

public class Top_hashtags extends VistaTopHashtags{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<Top_hashtags_item> _item = new Vector<Top_hashtags_item>();
	iUsuario_Registrado bd;
	Top_hashtags_item thi;
	public Top_hashtags() {
		 bd = new BDPrincipal();
		cargarHashtagTOP();
	}
	public void cargarHashtagTOP() {
		List<Hashtag> top = bd.cargarListaHashtagTOP();
		this.getLayoutListaTopHashtag().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (Hashtag h : top) {
			thi = new Top_hashtags_item(h);
			this.getLayoutListaTopHashtag().as(VerticalLayout.class).add(thi);
			_item.add(thi);
		}

	}
}