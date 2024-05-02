package interfaz;


import com.vaadin.flow.component.html.Image;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import vistas.VistaVerHashtag;

public class Ver_hashtag extends VistaVerHashtag{

	public Top_hashtags_item _top_hashtags;
	public Resultado_hashtags_item _resultado_hashtags;
	public Tendencias_item _tendencias;
	public Lista_Hashtags_item _lista_Hashtags;
	public Lista_resultado_item _lista_resultado;
	public Publicaciones_hashtag _publicaciones_hashtag;
	iUsuario_Registrado bd = new BDPrincipal();	
	Hashtag hashtag;
	
	public Ver_hashtag(Hashtag hashtag, Object interfaz) {
		
		if(interfaz instanceof Lista_Hashtags_item) {
			this._lista_Hashtags = (Lista_Hashtags_item) interfaz;
			System.out.println(_lista_Hashtags != null);
		}else if(interfaz instanceof Top_hashtags_item) {
			this._top_hashtags = (Top_hashtags_item) interfaz;
		}
//		}else if(interfaz instanceof Resultado_hashtags_item) {
//			this._resultado_hashtags = (Resultado_hashtags_item) interfaz;
//		}else if(interfaz instanceof Tendencias_item) {
//			this._tendencias = (Tendencias_item) interfaz;
//		}else if(interfaz instanceof Lista_resultado_item) {
//			this._lista_resultado = (Lista_resultado_item) interfaz;
//		}else if(interfaz instanceof Publicaciones_hashtag) {
//			this._publicaciones_hashtag = (Publicaciones_hashtag) interfaz;
//		}
		
		this.getStyle().set("width","100%");
		this.getStyle().set("height", "100%");
		this.hashtag = hashtag;
		this.getH2().setText(this.hashtag.getNombreHashtag());
		this.getImagenHashtag().as(VerticalLayout.class).add(new Image("icons/luffy.jpg", this.hashtag.getNombreHashtag()));
		Publicaciones_hashtag();
		Visualizaciones();
	}
	
	public void Publicaciones_hashtag() {
		this._publicaciones_hashtag = new Publicaciones_hashtag(this.hashtag, this);
		this.getLayoutLista().as(VerticalLayout.class).add(this._publicaciones_hashtag);
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.hashtag.getNumVisualizaciones()+"");
	}
}