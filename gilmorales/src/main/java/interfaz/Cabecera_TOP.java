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
		top_hashtags(_cabecera_Usuario_Registrado.urInterfaz);
		top_usuarios(_cabecera_Usuario_Registrado.urInterfaz);
	}

	public Cabecera_TOP(Cabecera_Usuario_No_Registrado interfazUNR) {
			this._cabecera_Usuario_No_Registrado = interfazUNR;
			Ver_lista_HashtagUNR();
			Ver_lista_usuarios_registradosUNR();
			top_hashtags(_cabecera_Usuario_No_Registrado.unr);
			top_usuarios(_cabecera_Usuario_No_Registrado.unr);	
	}
	
	public void Ver_lista_HashtagUNR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtag().addClickListener(event -> {
			_cabecera_Usuario_No_Registrado.unr.getLayoutCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(true);
			this._ver_lista_usuarios_registrados.setVisible(false);
			if(this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().remove(this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			});
	}
	public void Ver_lista_HashtagUR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtag().addClickListener(event -> {
			this.getCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(true);
			_cabecera_Usuario_Registrado.urInterfaz.getCabeceraTop().setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(false);
			if(this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().remove(this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
		});
	}

	public void top_hashtags(Object user) {
		_top_hashtags = new Top_hashtags(user);
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
			this._ver_lista_Hashtag.setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(true);
			if(this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().remove(this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this._cabecera_Usuario_Registrado.urInterfaz.getListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
		});
	}
	public void Ver_lista_usuarios_registradosUNR() {
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this._cabecera_Usuario_No_Registrado.unr);
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			this._ver_lista_Hashtag.setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(true);
			_cabecera_Usuario_No_Registrado.unr.getLayoutCabeceraTop().setVisible(false);
			if(this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().remove(this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this._cabecera_Usuario_No_Registrado.unr.getLayoutListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
		});
	}
}