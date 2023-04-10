package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraTop;

public class Cabecera_TOP extends VistaCabeceraTop{
	private Button _verListaHashtag;
	private Button _verListaUsuarios;
	private Label _topUsuariosL;
	private Label _topHashtagsL;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public top_hashtags _top_hashtags;
	public top_usuarios _top_usuarios;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	
	public Cabecera_TOP() {
		Ver_lista_Hashtag();
	}

	public void Ver_lista_Hashtag() {
		this.getBotonVerListaHashtag().addClickListener(event -> {this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_lista_Hashtag);});
	}

	public void top_hashtags() {
		throw new UnsupportedOperationException();
	}

	public void top_usuarios() {
		throw new UnsupportedOperationException();
	}

	public void Ver_lista_usuarios_registrados() {
		throw new UnsupportedOperationException();
	}
}