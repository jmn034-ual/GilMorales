package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerTendencias;

public class Ver_tendencias extends VistaVerTendencias{

	public Ver_lista_Hashtag _ver_lista_Hashtag = new Ver_lista_Hashtag();
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
		_tendencias.addTendencia(ti6);
		_tendencias.addTendencia(ti7);
		_tendencias.addTendencia(ti8);
		_tendencias.addTendencia(ti9);
		_tendencias.addTendencia(ti10);
		this.getFotoPerfil1().setSizeFull();
		this.getFotoPerfil1().setImage("icons/luffy.jpg");
		Tendencias();
//		Ver_lista_Hashtag();
	}

	public void Ver_lista_Hashtag() {
//		this.getBotonVerListaHashtags().addClickListener(event ->{
//			this._ver_lista_Hashtag.setVisible(true);
//		});
	}

	public void Tendencias() {
		this.getLayoutHashtags().as(VerticalLayout.class).add(_tendencias);
	}
}