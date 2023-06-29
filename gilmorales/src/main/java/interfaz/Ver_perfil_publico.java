package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;

//import basededatos.iVer_perfil_publico;

public class Ver_perfil_publico extends Ver_Perfil__2 {
//	private button _seguir;
//	public iVer_perfil_publico _iVer_perfil_ublico;
	public Publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacciones_gustadas_Otro_usuario _ver_publicacciones_gustadas__Otro_usuario_;
	UsuarioRegistrado userAver;
	UsuarioRegistrado user;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_perfil_publico(UsuarioRegistrado userAver) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.userAver = userAver;
    	this.getBotonSeguir().setVisible(false);
    	this.getVerSeguidores().setVisible(false);
    	this.getVerSiguiendos().setVisible(false);
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this.user.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.user.getNombre() + " " + this.user.getApellidos());
    	_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas_Otro_usuario();
    	publicaciones_usuario_publico();
	}
	
	public Ver_perfil_publico(UsuarioRegistrado userAver, UsuarioRegistrado user) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.userAver = userAver;
    	this.user = user;
    	this.getVerSeguidores().setVisible(false);
    	this.getVerSiguiendos().setVisible(false);
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this.user.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.user.getNombre() + " " + this.user.getApellidos());
    	_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas_Otro_usuario();
    	publicaciones_usuario_publico();
    	if(this.user.seguir.contains(userAver)) {
    		this.getBotonSeguir().setText("Dejar de Seguir");
    	}else {
    		this.getBotonSeguir().setText("Seguir");
    	}
    	Seguir();

	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event ->{
	    	if(this.user.seguir.contains(userAver)) {
				this.bd.seguirUsuario(this.user.getID(), this.userAver.getID());
	    		this.getBotonSeguir().setText("Dejar de Seguir");
	    	}else{
	    		this.bd.dejarSeguirUsuario(this.user.getID(), this.userAver.getID());
	    		this.getBotonSeguir().setText("Seguir");
	    	}
		});
	}

	public void publicaciones_usuario_publico() {
		this._publicaciones_usuario_publico = new Publicaciones_usuario_publico(this.user);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_publicaciones_usuario_publico);
		this.getBotonVideos().addClickListener(event ->{
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}

	public void Ver_publicacciones_gustadas__Otro_usuario_() {
		this.getBotonMeGustas().addClickListener(event ->{
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicacciones_gustadas__Otro_usuario_);
		});
	}
}