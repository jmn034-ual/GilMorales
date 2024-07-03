package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;


public class Ver_perfil_publico extends Ver_Perfil__2 {
	public Publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacciones_gustadas_Otro_usuario _ver_publicacciones_gustadas__Otro_usuario_;
	UsuarioRegistrado userAver;
	iUsuario_Registrado bd = new BDPrincipal();
	Object interfazAux;

	public Ver_perfil_publico(UsuarioRegistrado userAver, Object interfaz, Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		if(userAver != null) {
		this.userAver = bd.cargarUsuarioRegistrado(userAver.getID());
		this.interfazAux = interfaz;
		if(cabecera_TOP._cabecera_Usuario_Registrado != null) {
			user = bd.cargarUsuarioRegistrado(cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz.ur.getID());
			asignarInterfaz(interfazAux);
			motrarDatosUserRegistrado();
			if(this.userAver.getID() == user.getID()) {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(new Ver_perfil_propio(cabecera_top));
			}else if(this.userAver.getPrivacidad() == 1) {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(new Ver_perfil_privado(this.userAver, cabecera_TOP));
			}
			Seguir();
		}else {
			asignarInterfaz(interfazAux);
			motrarDatosUserNoRegistrado();
			if(this.userAver.getPrivacidad() == 1) {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(new Ver_perfil_privado(this.userAver, cabecera_TOP));
			}
		}
		NumeroSeguidores();
		NumeroSeguidos();
		NumeroMeGusta();
		this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
		this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());
		this.getFotoPerfil1().setImage(this.userAver.getFoto());
		this.getLabelDescripcion().setText(this.userAver.getDescripcion());
		publicaciones_usuario_publico();
		Ver_publicacciones_gustadas__Otro_usuario_();
		Denunciar_usuario(this);
		}
		
	}

	private void motrarDatosUserNoRegistrado() {
		this.getBotonSeguir().setVisible(false);
		this.getVerSeguidores().setEnabled(false);
		this.getVerSiguiendos().setEnabled(false);
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
		this.getBotonBloquear().setVisible(false);
		if (user.seguir.contains(userAver)) {
			this.getBotonSeguir().setText("Dejar de Seguir");
		} 
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(user.getID(), this.userAver.getID());
			user = this.bd.cargarUsuarioRegistrado(user.getID());
			if(this.getBotonSeguir().getText().equals("Dejar de Seguir"))
				this.getBotonSeguir().setText("Seguir");
			else
				this.getBotonSeguir().setText("Dejar de Seguir");

		});
	}

	public void publicaciones_usuario_publico() {
		this._publicaciones_usuario_publico = new Publicaciones_usuario_publico(this.userAver, this);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_publicaciones_usuario_publico);
		this.getBotonVideos().addClickListener(event -> {
			this.getBotonVideos().addThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getBotonMeGustas().removeThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}

	public void Ver_publicacciones_gustadas__Otro_usuario_() {
		_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas_Otro_usuario(this);
		this.getBotonMeGustas().addClickListener(event -> {
			this.getBotonMeGustas().addThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getBotonVideos().removeThemeVariants(ButtonVariant.LUMO_PRIMARY);

			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicacciones_gustadas__Otro_usuario_);
		});
	}
	
	public void NumeroSeguidores() {
		this.getNumSeguidores().setText(this.userAver.seguidor.size()+"");
	}

	public void NumeroSeguidos() {
		this.getNumSiguiendo().setText(this.userAver.seguir.size()+"");
	}
	
	public void NumeroMeGusta() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.userAver.publica.getCollection());
		int numMeGustas = 0;
		for(Publicacion p : publicaciones) {
			numMeGustas += p.getNumMeGustas();
		}
		this.getNumMeGustas().setText(numMeGustas+"");
	}
}