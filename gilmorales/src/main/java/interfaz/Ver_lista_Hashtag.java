package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerListaHashtags;

public class Ver_lista_Hashtag extends VistaVerListaHashtags{
	public Ver_tendencias _ver_tendencias;
	public Cabecera_TOP _cabecera_TOP;
	public Lista_Hashtags _lista_Hashtags;

	
	public Ver_lista_Hashtag(Object interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	if(interfaz instanceof Cabecera_TOP) {    		
    		this._cabecera_TOP = (Cabecera_TOP) interfaz;
    	}else {
    		this._ver_tendencias = (Ver_tendencias) interfaz;
    	}
		Lista_Hashtags();
	}

	public void Lista_Hashtags() {
		_lista_Hashtags = new Lista_Hashtags(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_lista_Hashtags);;
	}
}