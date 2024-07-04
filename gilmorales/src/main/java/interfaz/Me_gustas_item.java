package interfaz;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Me_gustas_item extends Nuevos_seguidores_item {


	public Me_gustas _me_gustas;
	
	public Me_gustas_item(Notificacion notificacionNuevoSeguidor, UsuarioRegistrado usuario, UsuarioRegistrado usuarioDaMeGusta, Me_gustas interfaz) {
		super(notificacionNuevoSeguidor, usuario, usuarioDaMeGusta);
		this._me_gustas = interfaz;
		if(this.nuevoSeguidor.getPrivacidad() == 0 && this.usuario.getPrivacidad() == 1) {
			this.getPrivado().setVisible(true);
			this.getBotonSeguir().setVisible(true);
			this.getBotonEnviarSolicitud().setVisible(false);
			Seguir();
		}else if(this.nuevoSeguidor.getPrivacidad() == 1 && this.usuario.getPrivacidad() == 1) {
			this.getPrivado().setVisible(true);
			this.getBotonSeguir().setVisible(false);
			this.getBotonEnviarSolicitud().setVisible(true);
			Enviar_peticion_amistad();
		}
		Ver_perfil(this);
	}

}