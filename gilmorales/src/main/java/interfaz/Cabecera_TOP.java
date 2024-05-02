package interfaz;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraTop;

public class Cabecera_TOP extends VistaCabeceraTop{
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Top_hashtags _top_hashtags;
	public Top_usuarios _top_usuarios;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	Administrador adminInterfaz;

	public Cabecera_TOP(Cabecera_Usuario_Registrado interfazUR) {
		this._cabecera_Usuario_Registrado = interfazUR;
		Ver_lista_HashtagUR();
		Ver_lista_usuarios_registradosUR();
		top_hashtags();
		top_usuarios(_cabecera_Usuario_Registrado.urInterfaz);
	}

	public Cabecera_TOP(Cabecera_Usuario_No_Registrado interfazUNR) {
			this._cabecera_Usuario_No_Registrado = interfazUNR;
			Ver_lista_HashtagUNR();
			Ver_lista_usuarios_registradosUNR();
			top_hashtags();
			top_usuarios(_cabecera_Usuario_No_Registrado.unr);	
	}
	
	public void Ver_lista_HashtagUNR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtag().addClickListener(event -> {
			_cabecera_Usuario_No_Registrado.unr.getLayoutCabeceraTop().setVisible(false);
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().as(VerticalLayout.class).removeAll();
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_lista_Hashtag);
			});
	}
	
	public void Ver_lista_HashtagUR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtag().addClickListener(event -> {
			_cabecera_Usuario_Registrado.urInterfaz.getCabeceraTop().setVisible(false);
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(_ver_lista_Hashtag);
		});
	}

	public void top_hashtags() {
		_top_hashtags = new Top_hashtags(this);
		this.getListaTopHashtag().as(VerticalLayout.class).add(_top_hashtags);
	}

	public void top_usuarios(Object user) {
		_top_usuarios = new Top_usuarios(user);
		this.getListaUsuarios().as(VerticalLayout.class).add(_top_usuarios);
	}

	public void Ver_lista_usuarios_registradosUR() {
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this._cabecera_Usuario_Registrado.urInterfaz);
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			_cabecera_Usuario_Registrado.urInterfaz.getCabeceraTop().setVisible(false);
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(_ver_lista_usuarios_registrados);
		});
	}
	public void Ver_lista_usuarios_registradosUNR() {
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this._cabecera_Usuario_No_Registrado.unr);
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			_cabecera_Usuario_No_Registrado.unr.getLayoutCabeceraTop().setVisible(false);
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().as(VerticalLayout.class).removeAll();
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_lista_usuarios_registrados);
		});
	}
}