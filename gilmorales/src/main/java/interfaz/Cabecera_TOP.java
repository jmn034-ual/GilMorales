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
	public top_hashtags _top_hashtags = new top_hashtags();
	public top_usuarios _top_usuarios = new top_usuarios();
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	
	public Cabecera_TOP() {
		Ver_lista_Hashtag();
		top_hashtags_item thi = new top_hashtags_item("MDS2");
		_top_hashtags.anadirHashag(thi);
		top_hashtags();
		top_usuarios_item tui = new top_usuarios_item("Usuario1");
		_top_usuarios.anadirUsuarios(tui);
		top_usuarios();
		
	}

	public void Ver_lista_Hashtag() {
		this.getBotonVerListaHashtag().addClickListener(event -> {this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_lista_Hashtag);});
	}

	public void top_hashtags() {
		this.getListaTopHashtag().as(VerticalLayout.class).add(_top_hashtags);
	}

	public void top_usuarios() {
		this.getListaUsuarios().as(VerticalLayout.class).add(_top_usuarios);
	}

	public void Ver_lista_usuarios_registrados() {
		throw new UnsupportedOperationException();
	}
}