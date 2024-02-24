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
	public Top_hashtags _top_hashtags;
	public Top_usuarios _top_usuarios;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	Administrador adminInterfaz;
	Usuario_No_Registrado unr;
	Usuario_Registrado ur;

	public Cabecera_TOP() {}

	public Cabecera_TOP(Usuario_No_Registrado unr) {
		this.unr = unr;
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this.unr);
//		this.getLayoutListaResultadoBusqueda().setVisible(false);
		Ver_lista_HashtagUNR();
		Ver_lista_usuarios_registradosUNR();
		top_hashtags();
		top_usuarios();
	}
	public Cabecera_TOP(Usuario_Registrado ur) {
		this.ur = ur;
		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this.ur);
//		this.getLayoutListaResultadoBusqueda().setVisible(false);
		Ver_lista_HashtagUR();
		Ver_lista_usuarios_registradosUR();
		top_hashtags();
		top_usuarios();
	}


	//	public Cabecera_TOP() {
	//		this.getLayoutListaResultadoBusqueda().setVisible(false);
	//		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados();
	//		Ver_lista_Hashtag();
	//		Ver_lista_usuarios_registrados();
	//		top_hashtags();
	//		top_usuarios();
	//	}
	//	public Cabecera_TOP(Administrador adminInterfaz) {
	//		this.adminInterfaz = adminInterfaz;
	//		_ver_lista_usuarios_registrados = new Ver_lista_usuarios_registrados(this.adminInterfaz);
	//		this.getLayoutListaResultadoBusqueda().setVisible(false);
	//		Ver_lista_Hashtag();
	//		Ver_lista_usuarios_registrados();
	//		top_hashtags();
	//		top_usuarios();
	//	}
	public void Ver_lista_HashtagUNR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag();
		this.getBotonVerListaHashtag().addClickListener(event -> {
			unr.getLayoutCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(true);
			this._ver_lista_usuarios_registrados.setVisible(false);
			if(this.unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this.unr.getVaadinHorizontalLayout().remove(this.unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this.unr.getLayoutListaPublicaciones().setVisible(false);
			this.unr.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			});
	}
	public void Ver_lista_HashtagUR() {
		_ver_lista_Hashtag = new Ver_lista_Hashtag();
		this.getBotonVerListaHashtag().addClickListener(event -> {
			this.getCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(true);
			ur.getCabeceraTop().setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(false);
			if(this.ur.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this.ur.getVaadinHorizontalLayout().remove(this.ur.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this.ur.getListaPublicaciones().setVisible(false);
			this.ur.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
		});
	}

	public void top_hashtags() {
		_top_hashtags = new Top_hashtags();
		this.getListaTopHashtag().as(VerticalLayout.class).add(_top_hashtags);
	}

	public void top_usuarios() {
		_top_usuarios = new Top_usuarios(unr);
		this.getListaUsuarios().as(VerticalLayout.class).add(_top_usuarios);
	}

	public void Ver_lista_usuarios_registradosUR() {
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			ur.getCabeceraTop().setVisible(false);
			this._ver_lista_Hashtag.setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(true);
			if(this.ur.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this.ur.getVaadinHorizontalLayout().remove(this.ur.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this.ur.getListaPublicaciones().setVisible(false);
			this.ur.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
		});
	}
	public void Ver_lista_usuarios_registradosUNR() {
		this.getBotonVerListaUsuarios().addClickListener(event -> {
			this._ver_lista_Hashtag.setVisible(false);
			this._ver_lista_usuarios_registrados.setVisible(true);
			unr.getLayoutCabeceraTop().setVisible(false);
			if(this.unr.getVaadinHorizontalLayout().getComponentCount() != 0) {
				this.unr.getVaadinHorizontalLayout().remove(this.unr.getVaadinHorizontalLayout().getComponentAt(0));
			}
			this.unr.getLayoutListaPublicaciones().setVisible(false);
			this.unr.getVaadinHorizontalLayout().add(_ver_lista_usuarios_registrados);
		});
	}
}