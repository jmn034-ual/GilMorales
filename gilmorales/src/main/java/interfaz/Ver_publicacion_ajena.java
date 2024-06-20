package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	public Ver_perfil_publico _ver_perfil;
	Usuario_Registrado urInterfaz;
	BDPrincipal bd = new BDPrincipal();

	public Ver_publicacion_ajena(Publicacion p, UsuarioRegistrado user, Object urInterfaz) {
		super(p, user);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");		
		if (urInterfaz instanceof Lista_publicaciones_Usuario_Registrado_item) {
			this._lista_publicaciones__Usuario_Registrado_ = (Lista_publicaciones_Usuario_Registrado_item) urInterfaz;
			this.urInterfaz = this._lista_publicaciones__Usuario_Registrado_._lista_publicaciones__Usuario_Registrado_.urInterfaz;

		} else if (urInterfaz instanceof Publicaciones_gustadas_item) {
			this._publicaciones_gustadas = (Publicaciones_gustadas_item) urInterfaz;
			this.urInterfaz = this._publicaciones_gustadas._publicaciones_gustadas._ver_publicaciones_gustadas__Usuario_registrado_._ver_perfil_propio._cabecera_Usuario_Registrado.urInterfaz;
		} else if (urInterfaz instanceof Publicaciones_usuario_publico_item) {
			this._publicaciones_usuario_publico = (Publicaciones_usuario_publico_item) urInterfaz;
			this.urInterfaz = this._publicaciones_usuario_publico._publicaciones_usuario_publico._ver_perfil_publico._top_usuarios.userInterfaz;
		}else if(urInterfaz instanceof Publicaciones_gustadas_usuario_publico_item) {
			_publicaciones_gustadas_usuario_publico = (Publicaciones_gustadas_usuario_publico_item) urInterfaz;
//			this.urInterfaz = this._publicaciones_gustadas_usuario_publico.;
		}else if(urInterfaz instanceof Publicaciones_hashtag_item) {
			_publicaciones_hashtag = (Publicaciones_hashtag_item) urInterfaz;
//			this.urInterfaz = urInterfaz;
		}else if(urInterfaz instanceof Lista_usuarios_registrados_item) {
			this._lista_usuarios_registrados = (Lista_usuarios_registrados_item) urInterfaz;
			this.urInterfaz = this._lista_usuarios_registrados._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}
		
		if(this.publicacion.getPerteneceA().getID() == (user.getID())) {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_publicacion_propia(this.publicacion, this.urInterfaz));
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
		Comentar();
		Denunciar_publicacion();
		Dar_me_gusta_publicacion();
		this.Ver_comentarios__Usuario_Registrado_(this);
		//Ver_perfil();
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			bd.seguirUsuario(urInterfaz.ur.getID(), this.publicacion.getPerteneceA().getID());
		});
	}

	public void Comentar() {
		this.getBotonComentar().addClickListener(event -> {
			this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(),
					this.getTextComentario().getValue());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());

		});
	}

	public void Denunciar_publicacion() {
		_denunciar_publicacion = new Denunciar_publicacion(this.publicacion, this);
		this.getBotonDenunciar().addClickListener(event -> {
			Dialog dialog = new Dialog(_denunciar_publicacion);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("70%");
			dialog.setWidth("61%");
			this._denunciar_publicacion.getBotonCancelar().addClickListener(event2 -> {
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Dar_me_gusta_publicacion() {
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		this.getBotonMeGusta().addClickListener(event -> {
			this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		});
	}

	public void Ver_perfil() {
		this._ver_perfil = new Ver_perfil_publico(user, this, this.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
	}
}