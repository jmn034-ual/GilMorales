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
	iUsuario_Registrado bd = new BDPrincipal();
	Top_hashtags_item thi;
	Usuario_Registrado user;
	Usuario_No_Registrado unr;
	
	public Top_hashtags(Object user) {
		if(user instanceof Usuario_No_Registrado) {
			this.unr = (Usuario_No_Registrado) user;
		}else {
			this.user = (Usuario_Registrado) user;
		}	
		cargarHashtagTOP();
	}
	
	public void cargarHashtagTOP() {
		List<Hashtag> top = bd.cargarListaHashtagTOP();
		this.getLayoutListaTopHashtag().as(VerticalLayout.class).removeAll();
		_item.clear();
		for (Hashtag h : top) {
			if(unr != null && h != null) {
				thi = new Top_hashtags_item(h, unr);
			}else {
				thi = new Top_hashtags_item(h, user);
			}
			this.getLayoutListaTopHashtag().as(VerticalLayout.class).add(thi);
			_item.add(thi);
		}

	}
}