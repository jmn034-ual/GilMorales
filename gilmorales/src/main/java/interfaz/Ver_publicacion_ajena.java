package interfaz;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_publicacion_ajena extends Ver_publicacion_usuario_Registrado {
	//	private button _seguirB;
//	private button _comentarB;
//	private button _dar_me_gusta_publicaci�nB;
//	private button _denunciarB;
//	private button _verPerfilB;
//	private TextField _comentarTF;
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
	
	public Ver_publicacion_ajena(Publicacion p, UsuarioRegistrado user, Usuario_Registrado urInterfaz) {
//		super(p, user);
		this.publicacion = p;
		this.getVaadinHorizontalLayout2().setVisible(true);
		this.getVerPerfil().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		this.getGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getBotonComentar().setVisible(true);
		if(user.seguir.contains(p.getPerteneceA())) {
			this.getBotonSeguir().setVisible(true);
			this.getBotonSeguir().setText("Dejar de Seguir");
		}else if(!user.seguir.contains(p.getPerteneceA())){
			this.getBotonSeguir().setVisible(true);
			this.getBotonSeguir().setText("Seguir");
		}
		this.getVaadinHorizontalLayout2().setVisible(false);
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getFechaSubida().setText(this.publicacion.getFechaPublicacion());
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
		this.getVideo().add(new Video(publicacion.getVideo()));
		Seguir();
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event ->{
			bd.seguirUsuario(user.getID(), this.publicacion.getPerteneceA().getID());
		});
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void Denunciar_publicacion() {
		this.getBotonDenunciar().addClickListener(event ->{
			
		});
	}

	public void Dar_me_gusta_publicacion() {
		throw new UnsupportedOperationException();
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}