package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerTendencias;

public class Ver_tendencias extends VistaVerTendencias{

	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Tendencias _tendencias;
	
	public Ver_tendencias() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getFotoPerfil1().setImage("icons/luffy.jpg");
		Tendencias();
		Ver_lista_Hashtag();
	}

	public void Ver_lista_Hashtag() {
		 _ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtags().addClickListener(event ->{
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			});
	}

	public void Tendencias() {
		 _tendencias = new Tendencias(this);
		this.getLayoutHashtags().as(VerticalLayout.class).add(_tendencias);
	}
}