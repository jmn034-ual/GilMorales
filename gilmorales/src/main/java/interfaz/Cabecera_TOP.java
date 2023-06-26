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
	public Ver_lista_Hashtag _ver_lista_Hashtag = new Ver_lista_Hashtag();
	public top_hashtags _top_hashtags = new top_hashtags();
	public top_usuarios _top_usuarios = new top_usuarios();
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados();

	top_usuarios_item tui = new top_usuarios_item("Usuario1");
	
	public Cabecera_TOP() {
		this.getLayoutListaResultadoBusqueda().setVisible(false);
		Ver_lista_Hashtag();
		Ver_lista_usuarios_registrados();
		top_hashtags();
		_top_usuarios.anadirUsuarios(tui);
		top_usuarios();
	}

	public void Ver_lista_Hashtag() {
		this.getBotonVerListaHashtag().addClickListener(event -> {
			this.getLayoutListaResultadoBusqueda().setVisible(false);
			this.getCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(true);
			this.getLayoutAyuda().setVisible(true);
			this._ver_lista_usuarios_registrados.setVisible(false);
			this.getLayoutAyuda().as(VerticalLayout.class).add(_ver_lista_Hashtag);
			});
	}

	public void top_hashtags() {
		this.getListaTopHashtag().as(VerticalLayout.class).add(_top_hashtags);
	}

	public void top_usuarios() {
		this.getListaUsuarios().as(VerticalLayout.class).add(_top_usuarios);
	}

	public void Ver_lista_usuarios_registrados() {
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			this.getLayoutListaResultadoBusqueda().setVisible(false);
			this.getCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(true);
			this.getLayoutAyuda().setVisible(true);
			this.getLayoutAyuda().as(VerticalLayout.class).add(_ver_lista_usuarios_registrados);

			});
	}
}