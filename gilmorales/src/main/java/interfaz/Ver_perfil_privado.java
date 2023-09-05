package interfaz;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import basededatos.iVer_perfil_privado;
import bd_dcl.UsuarioRegistrado;

public class Ver_perfil_privado extends Ver_Perfil__2 {

	public iVer_perfil_privado _iVer_perfil_privado;
	UsuarioRegistrado userAver;
	UsuarioRegistrado user;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_perfil_privado(UsuarioRegistrado userAver) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.userAver = userAver;
    	this.getBotonSeguir().setVisible(false);
    	this.getVerSeguidores().setVisible(false);
    	this.getVerSiguiendos().setVisible(false);
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(true);
    	this.getLabelUsuarioPrivado().setVisible(true);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());
	}
	
	public Ver_perfil_privado(UsuarioRegistrado userAver, UsuarioRegistrado user) {
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
    	this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());    	
	}

	public void Enviar_peticion_amistad() {
		throw new UnsupportedOperationException();
	}
}