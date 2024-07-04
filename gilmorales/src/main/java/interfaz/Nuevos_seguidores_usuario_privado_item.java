package interfaz;

import org.orm.PersistentException;

import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;
import bd_dcl.UsuarioRegistrado;
import interfaz.Nuevos_seguidores_usuario_privado;

public class Nuevos_seguidores_usuario_privado_item extends Nuevos_seguidores_item {

	public Nuevos_seguidores_usuario_privado _nuevos_seguidores_usuario_privado;
	
	public Nuevos_seguidores_usuario_privado_item(Notificacion notificacionNuevoSeguidor, UsuarioRegistrado usuario, UsuarioRegistrado nuevoSeguidor, Nuevos_seguidores_usuario_privado interfaz) {
		super(notificacionNuevoSeguidor, usuario, nuevoSeguidor);
		this._nuevos_seguidores_usuario_privado = interfaz;
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
		
		 Aceptar_solicitud();
		 CancelarSolicitud();
		 Ver_perfil(this);
	}

	public void Aceptar_solicitud() {
		this.getBotonAceptar().addClickListener(event ->{
			this.bd.seguirUsuario(this.nuevoSeguidor.getID(), this.usuario.getID());
			this.nuevoSeguidor = this.bd.cargarUsuarioRegistrado(this.nuevoSeguidor.getID());
			this.usuario = this.bd.cargarUsuarioRegistrado(this.usuario.getID());
			this.getBotonCancelar().click();
		});
	}

	public void CancelarSolicitud() {
		this.getBotonCancelar().addClickListener(event->{
			this._nuevos_seguidores_usuario_privado.seguidores.remove(this);
			this._nuevos_seguidores_usuario_privado._itemNuevosSeguidores.remove(this);
			this.bd.eliminarNotificacion(this.notificacionNuevoSeguidor.getIdNotificacion());
		});
	}
}