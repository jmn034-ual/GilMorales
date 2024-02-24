package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import vistas.VistaListaHashtags;

public class Lista_Hashtags extends VistaListaHashtags{
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Vector<Lista_Hashtags_item> _item = new Vector<Lista_Hashtags_item>();
	iUsuario_Registrado bd = new BDPrincipal();
	Lista_Hashtags_item hashtag;

	public Lista_Hashtags() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		cargarHashtags();
	}
	
	public void cargarHashtags() {
		List<Hashtag> hashtags = this.bd.cargarListaHashtags();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		if(hashtags != null) {
		for (Hashtag h : hashtags) {
			this.hashtag = new Lista_Hashtags_item(h);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.hashtag);
			_item.add(hashtag);
		}
		}
	}
}