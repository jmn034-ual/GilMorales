package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Hashtag;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaResultadoItem;

public class Lista_resultado_item extends VistaListaResultadoItem{
	public Lista_resultado _lista_resultado;
	public Ver_Perfil__2 _ver_perfil;
	public Ver_hashtag _ver_hashtag;
	UsuarioRegistrado user;
	Hashtag hashtag;

	
	public Lista_resultado_item(Object o, Lista_resultado resultado) {
		this._lista_resultado = resultado;
		if(o instanceof UsuarioRegistrado) {
			this.getVaadinHorizontalLayout1().setVisible(false);	
			this.user = (UsuarioRegistrado) o;
			Ver_perfil();
			this.getBotonNombreUsuario().setText(user.getNombre());
		}else {
			this.getVaadinHorizontalLayout().setVisible(false);	
			this.hashtag = (Hashtag) o;
			this.getBotonHashtag().setText(hashtag.getNombreHashtag());
			this._ver_hashtag = new Ver_hashtag(hashtag, this);
			Ver_hashtag();
		}
	}
	
	public void Ver_perfil() {
		if(user.getPrivacidad() == 0) {
			if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_No_Registrado != null)
				this._ver_perfil = new Ver_perfil_publico(user, this, this._lista_resultado._realizar_busqueda._cabecera_Usuario_No_Registrado._cabecera_TOP);
			else if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado != null)
				this._ver_perfil = new Ver_perfil_publico(user, this, this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado._cabecera_TOP);
//			else
//				this._ver_perfil = new Ver_perfil_publico(user, this, this._lista_resultado._realizar_busqueda._cabecera_Administrador.);
		}else {
			if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_No_Registrado != null)
				this._ver_perfil = new Ver_perfil_privado(user, this._lista_resultado._realizar_busqueda._cabecera_Usuario_No_Registrado._cabecera_TOP);
			else if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado != null)
				this._ver_perfil = new Ver_perfil_privado(user, this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado._cabecera_TOP);
		}
		this.getBotonNombreUsuario().addClickListener(event -> {
			this._lista_resultado._realizar_busqueda.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).removeAll();
			this._lista_resultado._realizar_busqueda.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).add(_ver_perfil);
		});
	}

	public void Ver_hashtag() {
		this.getBotonHashtag().addClickListener(event -> {
			this._lista_resultado._realizar_busqueda.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).removeAll();
			this._lista_resultado._realizar_busqueda.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).add(this._ver_hashtag);
		});

	}
}