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
	BDPrincipal bd = new BDPrincipal();
	Top_hashtags_item thi;
	Usuario_Registrado user;
	Usuario_No_Registrado unr;
	Administrador admin;
	
	public Top_hashtags(Cabecera_TOP interfaz) {
		this._cabecera_TOP = interfaz;
		if(this._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
			this.unr = this._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
		}else if(this._cabecera_TOP._cabecera_Usuario_Registrado != null){
			this.user = this._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}else {
			this.admin = this._cabecera_TOP.cabeceraAdmin._administrador;
		}
		cargarHashtagTOP();
	}
	
	public void cargarHashtagTOP() {
		List<Hashtag> top = bd.cargarListaHashtagTOP();
		this.getLayoutListaTopHashtag().as(VerticalLayout.class).removeAll();
		_item.clear();
		for (Hashtag h : top) {
			if(unr != null && h != null) {
				thi = new Top_hashtags_item(h, this);
			}else {
				thi = new Top_hashtags_item(h, this);
			}
			this.getLayoutListaTopHashtag().as(VerticalLayout.class).add(thi);
			_item.add(thi);
		}

	}
}