package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerTendencias;

public class Ver_tendencias extends VistaVerTendencias{
	private Label _tendenciasL;
	private Button _verListaHashtagB;
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Tendencias _tendencias = new Tendencias();
	
	Tendencias_item ti1 = new Tendencias_item(new Lista_Hashtags_item("Hashtag1"));
	Tendencias_item ti2 = new Tendencias_item(new Lista_Hashtags_item("Hashtag2"));
	Tendencias_item ti3 = new Tendencias_item(new Lista_Hashtags_item("Hashtag3"));
	Tendencias_item ti4 = new Tendencias_item(new Lista_Hashtags_item("Hashtag4"));
	Tendencias_item ti5 = new Tendencias_item(new Lista_Hashtags_item("Hashtag5"));
	Tendencias_item ti6 = new Tendencias_item(new Lista_Hashtags_item("Hashtag6"));
	Tendencias_item ti7 = new Tendencias_item(new Lista_Hashtags_item("Hashtag7"));
	Tendencias_item ti8 = new Tendencias_item(new Lista_Hashtags_item("Hashtag8"));
	Tendencias_item ti9 = new Tendencias_item(new Lista_Hashtags_item("Hashtag9"));
	Tendencias_item ti10 = new Tendencias_item(new Lista_Hashtags_item("Hashtag10"));

	
	public Ver_tendencias() {
		_tendencias.addTendencia(ti1);
		_tendencias.addTendencia(ti2);
		_tendencias.addTendencia(ti3);
		_tendencias.addTendencia(ti4);
		_tendencias.addTendencia(ti5);
		Tendencias();
	}

	public void Ver_lista_Hashtag() {
		
	}

	public void Tendencias() {
		this.getLayoutHashtags().as(VerticalLayout.class).add(_tendencias);
	}
}