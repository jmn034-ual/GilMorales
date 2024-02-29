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
	Usuario_No_Registrado unrInterfaz;
	Usuario_Registrado userInterfaz;
	Hashtag hashtag;

	public Top_hashtags_item(Hashtag hashtag, Object user) {
		this.hashtag = hashtag;
		if(user instanceof Usuario_No_Registrado) {
			this.unrInterfaz = (Usuario_No_Registrado) user;
			Ver_hashtagUNR();
		}else {
			this.userInterfaz = (Usuario_Registrado) user;
			Ver_hashtagUR();
		}	
		this.getHashtagItem().setText(hashtag.getNombreHashtag());
	}
	
	public void Ver_hashtagUR() {
		this._ver_hashtag = new Ver_hashtag(hashtag);
		this.getHashtagItem().addClickListener(event -> {
			userInterfaz.getListaPublicaciones().setVisible(false);
			userInterfaz.getCabeceraTop().setVisible(false);
			userInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(false);
//			userInterfaz.getVaadinHorizontalLayout().remove(userInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			userInterfaz.getVaadinHorizontalLayout().add(_ver_hashtag);
		});
	}
	
	public void Ver_hashtagUNR() {
		this._ver_hashtag = new Ver_hashtag(hashtag);
		this.getHashtagItem().addClickListener(event -> {
			unrInterfaz.getLayoutListaPublicaciones().setVisible(false);
			unrInterfaz.getLayoutCabeceraTop().setVisible(false);
			unrInterfaz.cabeceraUNR._cabecera_TOP.setVisible(false);
//			unrInterfaz.getVaadinHorizontalLayout().remove(unrInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			unrInterfaz.getVaadinHorizontalLayout().add(_ver_hashtag);
		});
	}
}