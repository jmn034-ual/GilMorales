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
	public Ver_perfil_Administrador verPerfilAdmin;
	public Usuario_No_Registrado userNoRegistrado;
	public Usuario_Registrado userRegistrado;
	public Administrador admin;
	Publicacion publicacion;
	
	public Publicaciones_hashtag_item(Publicacion p, Publicaciones_hashtag interfaz) {
		this._publicaciones_hashtag = interfaz;
		this.publicacion = p;
		Video video = new Video(this.publicacion.getVideo());
//		video.getStyle().set("width", "70%");
//		video.getStyle().set("height", "70%");
		if(this.publicacion.getPerteneceA() != null) {
			this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
			this.getVaadinAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		}else {
			this.getBotonNombreUsuario().setText(this.publicacion.getEsPublicada().getNombreUsuarioComercial());
			this.getVaadinAvatar().setImage(this.publicacion.getEsPublicada().getFoto());
		}
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getImagenPublicacion().as(VerticalLayout.class).add(video);

		if(this._publicaciones_hashtag._ver_hashtag._top_hashtags != null) {
			if(this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado != null)
				this.userNoRegistrado =  this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			if(this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_Registrado != null)
				this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._top_hashtags._top_hashtags._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}else if(this._publicaciones_hashtag._ver_hashtag._resultado_hashtags != null) {
			if( this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_No_Registrado != null) {
				this.userNoRegistrado =  this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_No_Registrado.unr;
			}else if( this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_Registrado != null) {
				this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz;
			}else {
				this.admin = this._publicaciones_hashtag._ver_hashtag._resultado_hashtags._resultado_hashtags._realizar_busqueda._cabecera_Administrador._administrador;
			}
		}else if(this._publicaciones_hashtag._ver_hashtag._tendencias != null){
			Tendencias_item tendencias = this._publicaciones_hashtag._ver_hashtag._tendencias;
			if(tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado != null)
				this.userNoRegistrado = tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado.unr;
			if(tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_Registrado != null)
				this.userRegistrado =  tendencias._tendencias._ver_tendencias.cabecera_top._cabecera_Usuario_Registrado.urInterfaz;
			else if(tendencias._tendencias._ver_tendencias.cabecera_top.cabeceraAdmin != null)
				this.admin = tendencias._tendencias._ver_tendencias.cabecera_top.cabeceraAdmin._administrador;
		}
		else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags != null){
			if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP != null) {
				Cabecera_TOP cabeceraTop = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP;
				if(cabeceraTop._cabecera_Usuario_No_Registrado != null)
					this.userNoRegistrado = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			}else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias != null)
				if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado != null)
					this.userNoRegistrado = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias.cabecera_top._cabecera_Usuario_No_Registrado.unr;
			if(userNoRegistrado == null){
				if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP != null)
					if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP._cabecera_Usuario_Registrado != null)
						this.userRegistrado =  this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
					else
						this.admin = this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._cabecera_TOP.cabeceraAdmin._administrador;
				else if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias != null)
					if(this._publicaciones_hashtag._ver_hashtag._lista_Hashtags._lista_Hashtags._ver_lista_Hashtag._ver_tendencias.cabecera_top._cabecera_Usuario_Registrado != null)
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
			} else if(this.userRegistrado != null){
//				if (this.userRegistrado.ur.equals(this.publicacion.getPerteneceA())) {
//					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
//							.add(new Ver_publicacion_propia(publicacion, this.userRegistrado));
//				} else {
					_ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.userRegistrado.ur, this);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(_ver_publicacion_ajena);
//				}
			}else {
				this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
				.add(new Ver_publicacion_Administrador(publicacion, this));
			}
		});
	}

	public void Ver_perfil() {
		if(this.publicacion.getPerteneceA() != null) {
//			this.getBotonNombreUsuario().setEnabled(false);
		this.getBotonNombreUsuario().addClickListener(event -> {
			this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if (this.publicacion.getPerteneceA() != null && this.publicacion.getPerteneceA().getPrivacidad() != 0) {
				if (this.userNoRegistrado != null) {
					perfilPrivado = new Ver_perfil_privado(this.publicacion.getPerteneceA(),
							this.userNoRegistrado.cabeceraUNR._cabecera_TOP);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(perfilPrivado);
				} else if (this.userRegistrado != null) {
					perfilPrivado = new Ver_perfil_privado(this.publicacion.getPerteneceA(),
							this.userRegistrado._cabecera_Usuario_Registrado._cabecera_TOP);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(perfilPrivado);
				} else {
					verPerfilAdmin = new Ver_perfil_Administrador(this.admin._cabecera_Administrador.cabeceraTOP, this.publicacion.getPerteneceA());
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(verPerfilAdmin);
				}
			} else if (this.publicacion.getPerteneceA() != null) {
				if (this.userNoRegistrado != null) {
					perfilPublico = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this,
							this.userNoRegistrado.cabeceraUNR._cabecera_TOP);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(perfilPublico);
				} else if (this.userRegistrado != null) {
					perfilPublico = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this,
							this.userRegistrado._cabecera_Usuario_Registrado._cabecera_TOP);
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(perfilPublico);
				} else {
					verPerfilAdmin = new Ver_perfil_Administrador(this.admin._cabecera_Administrador.cabeceraTOP, this.publicacion.getPerteneceA());
					this._publicaciones_hashtag._ver_hashtag.getVaadinVerticalLayout().as(VerticalLayout.class)
							.add(verPerfilAdmin);
				}
			}
		});}
	}
}