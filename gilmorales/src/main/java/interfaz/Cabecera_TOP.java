package interfaz;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceraTop;

public class Cabecera_TOP extends VistaCabeceraTop{
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Cabecera_Administrador cabeceraAdmin;
	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Top_hashtags _top_hashtags;
	public Top_usuarios _top_usuarios;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;

	public Cabecera_TOP(Object interfaz) {
		if(interfaz instanceof Cabecera_Usuario_Registrado)
			this._cabecera_Usuario_Registrado = (Cabecera_Usuario_Registrado) interfaz;
		else if(interfaz instanceof Cabecera_Usuario_No_Registrado)
			this._cabecera_Usuario_No_Registrado =(Cabecera_Usuario_No_Registrado) interfaz;
		else
			this.cabeceraAdmin = (Cabecera_Administrador) interfaz;
		
		Ver_lista_Hashtag();
		Ver_lista_usuarios_registrados();
		top_hashtags();
		top_usuarios();
	}
	
	public void Ver_lista_Hashtag() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtag().addClickListener(event -> {
			if(this._cabecera_Usuario_No_Registrado != null) {
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().removeAll();
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			}else if(this._cabecera_Usuario_Registrado != null) {
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().removeAll();
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			}else {
				this.cabeceraAdmin._administrador.getVaadinHorizontalLayout().removeAll();
				this.cabeceraAdmin._administrador.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			}
			
			});
	}

	public void top_hashtags() {
		_top_hashtags = new Top_hashtags(this);
		this.getListaTopHashtag().as(VerticalLayout.class).add(_top_hashtags);
	}

	public void top_usuarios() {
		_top_usuarios = new Top_usuarios(this);
		this.getListaUsuarios().as(VerticalLayout.class).add(_top_usuarios);
	}

	public void Ver_lista_usuarios_registrados() {
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this);
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			if(this._cabecera_Usuario_No_Registrado != null) {
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().removeAll();
				this._cabecera_Usuario_No_Registrado.unr.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
			}else if(this._cabecera_Usuario_Registrado != null){
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().removeAll();
				this._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
			}else {
				this.cabeceraAdmin._administrador.getVaadinHorizontalLayout().removeAll();
				this.cabeceraAdmin._administrador.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
			}
		});
	}
}