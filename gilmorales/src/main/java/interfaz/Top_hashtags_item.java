package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.VerticalAlign;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Hashtag;
import bd_dcl.UsuarioRegistrado;
import oshi.util.UserGroupInfo;
import vistas.VistaTopHashtagsItem;

public class Top_hashtags_item extends VistaTopHashtagsItem{
	public Top_hashtags _top_hashtags;
	public Ver_hashtag _ver_hashtag;
	Hashtag hashtag;
	Usuario_Registrado userInterfaz;
	Usuario_No_Registrado unrInterfaz;

	public Top_hashtags_item(Hashtag hashtag, Top_hashtags interfaz) {
		this.hashtag = hashtag;
		this._top_hashtags = interfaz;
		this.getHashtagItem().setText(hashtag.getNombreHashtag());
		Ver_hashtag();	
	}
	
	public void Ver_hashtag() {
		if(this._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {		
			this.unrInterfaz = this._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			this._ver_hashtag = new Ver_hashtag(hashtag, this);
		}else {
			this.userInterfaz = this._top_hashtags._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
			this._ver_hashtag = new Ver_hashtag(hashtag, this);
		}
		
		this.getHashtagItem().addClickListener(event -> {
			if(this._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {		
				unrInterfaz.getVaadinHorizontalLayout().removeAll();
				unrInterfaz.getVaadinHorizontalLayout().add(_ver_hashtag);
			}else {
				userInterfaz.getVaadinHorizontalLayout().removeAll();
				userInterfaz.getVaadinHorizontalLayout().add(_ver_hashtag);
			}

		});
	}
	

}