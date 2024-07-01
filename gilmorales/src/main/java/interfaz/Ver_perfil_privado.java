package interfaz;

import java.util.ArrayList;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import basededatos.iVer_perfil_privado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_perfil_privado extends Ver_Perfil__2 {

	public iVer_perfil_privado _iVer_perfil_privado;
	UsuarioRegistrado userAver;
	UsuarioRegistrado user;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Ver_perfil_privado(UsuarioRegistrado userAver, Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.userAver = userAver;
    	this.getBotonSeguir().setVisible(false);
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(true);
    	this.getLabelUsuarioPrivado().setVisible(true);
    	if(cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
    		this.getVaadinVerticalLayout3().setVisible(false);
        	this.getBotonPeticionAmistad().setVisible(false);
    	}else if(cabecera_TOP._cabecera_Usuario_Registrado != null)
    		this.getBotonBloquear().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());
    	NumeroSeguidores();
		NumeroSeguidos();
		NumeroMeGusta();
	}
	
	public void Enviar_peticion_amistad() {
		throw new UnsupportedOperationException();
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