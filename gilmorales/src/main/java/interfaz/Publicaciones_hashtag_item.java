package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtagItem;

public class Publicaciones_hashtag_item extends VistaPublicacionesHashtagItem {

	public Publicaciones_hashtag _publicaciones_hashtag;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Ver_perfil_publico perfilPublico;
	public Ver_perfil_privado perfilPrivado;
	public Usuario_No_Registrado userNoRegistrado;
	public Usuario_Registrado userRegistrado;
	Publicacion publicacion;
	
	public Tendencias_item tendencias;

	public Publicaciones_hashtag_item(Publicacion p, Publicaciones_hashtag interfaz) {
		this._publicaciones_hashtag = interfaz;
		this.publicacion = p;
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "70%");
		video.getStyle().set("height", "70%");
		this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getImagenPublicacion().as(VerticalLayout.class).add(video);
		
		if(this._publicaciones_hashtag._ver_hashtag._top_hashtags != null) {
			if(this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado != null)
				this.userNoRegistrado =  this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			if(userNoRegistrado == null)
				this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}else if(this._publicaciones_hashtag._ver_hashtag._resultado_hashtags != null) {
			this.userNoRegistrado =  this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_No_Registrado.unr;
			if(userNoRegistrado == null)
				this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz;
		}else if(this._publicaciones_hashtag._ver_hashtag._tendencias != null){
			this.tendencias = this._publicaciones_hashtag._ver_hashtag._tendencias;
			this.userNoRegistrado = this.tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado.unr;
//			this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_Registrado.urInterfaz;
		}
		else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags != null){
			if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP != null)
				this.userNoRegistrado = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias != null)
				this.userNoRegistrado = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado.unr;
			if(userNoRegistrado == null){
				if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP != null)
					this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
				else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias != null)
					this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias.cabecera_top._cabecera_Usuario_Registrado.urInterfaz;
			}
		}
		
		Ver_publicacion_ajena();
		Ver_perfil();
	}

	public void Ver_publicacion_ajena() {
		this.getImagenPublicacion().as(VerticalLayout.class).addClickListener(event -> {
			this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if (this.userNoRegistrado != null) {
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
						.add(new Ver_publicacion_Usuario_No_Registrado(publicacion, this));
			} else {
				if (this.userRegistrado.ur.equals(this.publicacion.getPerteneceA())) {
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(new Ver_publicacion_propia(publicacion, this.userRegistrado));
				} else {
					_ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.userRegistrado);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(_ver_publicacion_ajena);
				}
			}
		});
	}

	public void Ver_perfil() {
		this.getBotonNombreUsuario().addClickListener(event -> {
			this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if (this.publicacion.getPerteneceA() != null && this.publicacion.getPerteneceA().getPrivacidad() != 0) {
				if(this.userNoRegistrado != null)
					perfilPrivado = new Ver_perfil_privado(this.publicacion.getPerteneceA(), this.userNoRegistrado.cabeceraUNR._cabecera_TOP);
				else
					perfilPrivado = new Ver_perfil_privado(this.publicacion.getPerteneceA(), this.userRegistrado._cabecera_Usuario_Registrado._cabecera_TOP);
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).add(perfilPrivado);
			} else if (this.publicacion.getPerteneceA() != null) {
				if(this.userNoRegistrado != null)
					perfilPublico = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this, this.userNoRegistrado.cabeceraUNR._cabecera_TOP);
				else
					perfilPublico = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this, this.userRegistrado._cabecera_Usuario_Registrado._cabecera_TOP);				
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).add(perfilPublico);
			}
		});
	}
}