package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.sun.jna.platform.unix.X11.Visual;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import vistas.VistaVerHashtag;

public class Ver_hashtag extends VistaVerHashtag{
//	private IronIcon _iconoHashtag;
//	private Label _nombreHashtagL;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
	public Top_hashtags_item _top_hashtags;
	public Resultado_hashtags_item _resultado_hashtags;
	public Tendencias_item _tendencias;
	public Lista_Hashtags_item _lista_Hashtags;
	public Lista_resultado_item _lista_resultado;
	public Publicaciones_hashtag _publicaciones_hashtag;
	iUsuario_Registrado bd = new BDPrincipal();	
	Hashtag hashtag;
	
	public Ver_hashtag(Hashtag hashtag) {
		this.getStyle().set("width","100%");
		this.getStyle().set("height", "100%");
		this.hashtag = hashtag;
		Publicaciones_hashtag();
		Visualizaciones();
	}
	
	public void Publicaciones_hashtag() {
		this._publicaciones_hashtag = new Publicaciones_hashtag(this.hashtag);
		this.getLayoutLista().as(VerticalLayout.class).add(this._publicaciones_hashtag);
	}

	public void Visualizaciones() {
		this.getLabelNumVisualizaciones().setText(this.hashtag.getNumVisualizaciones()+"");
	}
}