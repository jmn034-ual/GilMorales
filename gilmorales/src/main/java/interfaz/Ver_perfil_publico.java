package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;


public class Ver_perfil_publico extends Ver_Perfil__2 {
	public Publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacciones_gustadas_Otro_usuario _ver_publicacciones_gustadas__Otro_usuario_;
	UsuarioRegistrado userAver;
	iUsuario_Registrado bd = new BDPrincipal();

	public Ver_perfil_publico(UsuarioRegistrado userAver, Object interfaz, Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.userAver = userAver;
		if(cabecera_TOP._cabecera_Usuario_Registrado != null) {
			user = bd.cargarUsuarioRegistrado(cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz.ur.getID());
			asignarInterfaz(interfaz);
			motrarDatosUserRegistrado();
		}else {
			asignarInterfaz(interfaz);
			motrarDatosUserNoRegistrado();
		}
		
		this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
		this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());
		this.getFotoPerfil1().setImage(this.userAver.getFoto());
		publicaciones_usuario_publico();
		Ver_publicacciones_gustadas__Otro_usuario_();
	}

	private void motrarDatosUserNoRegistrado() {
		this.getBotonSeguir().setVisible(false);
		this.getVerSeguidores().setVisible(false);
		this.getVerSiguiendos().setVisible(false);
		this.getBotonEditarPerfil().setVisible(false);
		this.getBotonEliminarPublicacion().setVisible(false);
		this.getBotonModificarPerfil().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(false);
		this.getLabelUsuarioPrivado().setVisible(false);
		this.getListaMeGustas().setVisible(true);
		this.getBotonBloquear().setVisible(false);
		this.getBotonDenunciar().setVisible(false);
	}

	private void motrarDatosUserRegistrado() {
		this.getBotonSeguir().setVisible(true);
		this.getVerSeguidores().setVisible(true);
		this.getVerSiguiendos().setVisible(true);
		this.getBotonEditarPerfil().setVisible(false);
		this.getBotonEliminarPublicacion().setVisible(false);
		this.getBotonModificarPerfil().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(false);
		this.getLabelUsuarioPrivado().setVisible(false);
		this.getListaMeGustas().setVisible(true);
		if (user.seguir.contains(userAver)) {
			this.getBotonSeguir().setText("Dejar de Seguir");
		} else {
			this.getBotonSeguir().setText("Seguir");
		}
		Seguir();

	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			if (user.seguir.contains(userAver)) {
				this.bd.seguirUsuario(user.getID(), this.userAver.getID());
				this.getBotonSeguir().setText("Dejar de Seguir");
			} else {
				this.bd.dejarSeguirUsuario(user.getID(), this.userAver.getID());
				this.getBotonSeguir().setText("Seguir");
			}
		});
	}

	public void publicaciones_usuario_publico() {
		this._publicaciones_usuario_publico = new Publicaciones_usuario_publico(this.userAver);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_publicaciones_usuario_publico);
		this.getBotonVideos().addClickListener(event -> {
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}

	public void Ver_publicacciones_gustadas__Otro_usuario_() {
		_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas_Otro_usuario();
		this.getBotonMeGustas().addClickListener(event -> {
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicacciones_gustadas__Otro_usuario_);
		});
	}
}