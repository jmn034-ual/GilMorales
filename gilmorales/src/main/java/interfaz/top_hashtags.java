package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import vistas.VistaTopHashtags;

public class top_hashtags extends VistaTopHashtags{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<top_hashtags_item> _item = new Vector<top_hashtags_item>();
	iUsuario_Registrado bd;
	top_hashtags_item thi;
	public top_hashtags() {
		 bd = new BDPrincipal();
		cargarHashtagTOP();
	}
	public void cargarHashtagTOP() {
		List<Hashtag> top = bd.cargarListaHashtagTOP();
		this.getLayoutListaTopHashtag().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (int i = 0; i < top.size(); i++) {
			thi = new top_hashtags_item(top.get(i));
			this.getLayoutListaTopHashtag().as(VerticalLayout.class).add(thi);
			_item.add(thi);
		}

	}
}