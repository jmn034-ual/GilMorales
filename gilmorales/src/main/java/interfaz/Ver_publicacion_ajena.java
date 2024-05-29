package interfaz;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_publicacion_ajena extends Ver_publicacion_usuario_Registrado {
	public Lista_publicaciones_Usuario_Registrado_item _lista_publicaciones__Usuario_Registrado_;
	public Publicaciones_gustadas_item _publicaciones_gustadas;
	public Publicaciones_usuario_publico_item _publicaciones_usuario_publico;
	public Publicaciones_gustadas_usuario_publico_item _publicaciones_gustadas_usuario_publico;
	public Publicaciones_hashtag_item _publicaciones_hashtag;
	public Lista_usuarios_registrados_item _lista_usuarios_registrados;
	public Denunciar_publicacion _denunciar_publicacion;
	public Ver_Perfil__2 _ver_perfil;
	iUsuario_Registrado bd = new BDPrincipal();
	Publicacion publicacion;
	Usuario_Registrado urInterfaz;

	public Ver_publicacion_ajena(Publicacion p, Object urInterfaz) {
		this.publicacion = p;

		if (urInterfaz instanceof Lista_publicaciones_Usuario_Registrado_item) {
			_lista_publicaciones__Usuario_Registrado_ = (Lista_publicaciones_Usuario_Registrado_item) urInterfaz;
			this.urInterfaz = this._lista_publicaciones__Usuario_Registrado_._lista_publicaciones__Usuario_Registrado_.urInterfaz;
		} else if (urInterfaz instanceof Publicaciones_gustadas_item) {
			_publicaciones_gustadas = (Publicaciones_gustadas_item) urInterfaz;
			this.urInterfaz = this._publicaciones_gustadas._publicaciones_gustadas._ver_publicaciones_gustadas__Usuario_registrado_._ver_perfil_propio._cabecera_Usuario_Registrado.urInterfaz;
		} else if (urInterfaz instanceof Publicaciones_usuario_publico_item) {
			_publicaciones_usuario_publico = (Publicaciones_usuario_publico_item) urInterfaz;
			this.urInterfaz = this._publicaciones_usuario_publico._publicaciones_usuario_publico._ver_perfil_publico._top_usuarios.userInterfaz;
//		}else if(urInterfaz instanceof Publicaciones_gustadas_usuario_publico_item) {
//			_publicaciones_gustadas_usuario_publico = (Publicaciones_gustadas_usuario_publico_item) urInterfaz;
//			this.urInterfaz = this._publicaciones_gustadas_usuario_publico.;
//		}else if(urInterfaz instanceof Publicaciones_hashtag_item) {
//			_publicaciones_hashtag = (Publicaciones_hashtag_item) urInterfaz;
//			this.urInterfaz = urInterfaz;
		}else if(urInterfaz instanceof Lista_usuarios_registrados_item) {
			_lista_usuarios_registrados = (Lista_usuarios_registrados_item) urInterfaz;
			this.urInterfaz = this._lista_usuarios_registrados._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}

		this.getVaadinHorizontalLayout2().setVisible(true);
		this.getVerPerfil().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		this.getGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getBotonComentar().setVisible(true);
		if (this.urInterfaz != null) {
			if (this.urInterfaz.ur.seguir.contains(p.getPerteneceA())) {
				this.getBotonSeguir().setVisible(true);
				this.getBotonSeguir().setText("Dejar de Seguir");
			} else if (!this.urInterfaz.ur.seguir.contains(p.getPerteneceA())) {
				this.getBotonSeguir().setVisible(true);
				this.getBotonSeguir().setText("Seguir");
			}
		}
		this.getVaadinHorizontalLayout2().setVisible(true);
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		this.getNumComentarios().setText(this.publicacion.getNumComentarios() + "");
		this.getFechaSubida().setText(this.publicacion.getFechaPublicacion());
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + "");
		this.getVideo().add(new Video(publicacion.getVideo()));
		Seguir();
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			bd.seguirUsuario(urInterfaz.ur.getID(), this.publicacion.getPerteneceA().getID());
		});
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void Denunciar_publicacion() {
		this.getBotonDenunciar().addClickListener(event -> {

		});
	}

	public void Dar_me_gusta_publicacion() {
		throw new UnsupportedOperationException();
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}