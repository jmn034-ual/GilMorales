package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerTendencias;

public class Ver_tendencias extends VistaVerTendencias{

	public Ver_lista_Hashtag _ver_lista_Hashtag = new Ver_lista_Hashtag();
	public Tendencias _tendencias;
	
	public Ver_tendencias() {
//		this.getFotoPerfil1().setSizeFull();
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
		 _tendencias = new Tendencias();
		this.getLayoutHashtags().as(VerticalLayout.class).add(_tendencias);
	}
}