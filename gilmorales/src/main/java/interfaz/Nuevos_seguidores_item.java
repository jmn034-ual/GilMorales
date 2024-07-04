package interfaz;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaNuevosSeguirdoresItem;

public class Nuevos_seguidores_item extends VistaNuevosSeguirdoresItem{

	public Nuevos_seguidores _nuevos_seguidores;
	public Ver_perfil_publico verPerfil;
	UsuarioRegistrado nuevoSeguidor;
	UsuarioRegistrado usuario;
	BDPrincipal bd = new BDPrincipal();
	boolean sigue = false;
	Notificacion notificacionNuevoSeguidor;
	Usuario_Registrado userInterfaz;

	
	public Nuevos_seguidores_item(Notificacion notificacionNuevoSeguidor, UsuarioRegistrado usuario, UsuarioRegistrado nuevoSeguidor) {
		this.getStyle().set("width", "100%");
		this.nuevoSeguidor = nuevoSeguidor;
		this.usuario = usuario;
		this.notificacionNuevoSeguidor = notificacionNuevoSeguidor;
		this.getAvatar().setImage(nuevoSeguidor.getFoto());
		this.getNombreusuario().setText(this.nuevoSeguidor.getNombreUsuario());

	}
		
	public Nuevos_seguidores_item(Notificacion notificacionNuevoSeguidor, UsuarioRegistrado usuario, UsuarioRegistrado nuevoSeguidor, Nuevos_seguidores interfaz) {
		this.getStyle().set("width", "100%");
		this.nuevoSeguidor = nuevoSeguidor;
		this.usuario = usuario;
		this._nuevos_seguidores = interfaz;
		this.notificacionNuevoSeguidor = notificacionNuevoSeguidor;
		this.getAvatar().setImage(nuevoSeguidor.getFoto());
		this.getNombreusuario().setText(this.nuevoSeguidor.getNombreUsuario());
		if(this.nuevoSeguidor.getPrivacidad() == 0 && this.usuario.getPrivacidad() == 0) {
			this.getPrivado().setVisible(false);
			this.getBotonSeguir().setVisible(true);
			this.getBotonEnviarSolicitud().setVisible(false);
			Seguir();
		}else if(this.nuevoSeguidor.getPrivacidad() == 1 && this.usuario.getPrivacidad() == 0) {
			this.getPrivado().setVisible(false);
			this.getBotonSeguir().setVisible(false);
			this.getBotonEnviarSolicitud().setVisible(true);
			Enviar_peticion_amistad();
		}
		Ver_perfil(this);
	}

	public void Seguir() {
		this.sigue = this.usuario.seguir.contains(this.nuevoSeguidor);
		if (this.sigue) {
			this.getBotonSeguir().setText("Dejar de Seguir");
		} 
		this.getBotonSeguir().addClickListener(event ->{
			this.sigue = !this.sigue;
			this.bd.seguirUsuario( this.usuario.getID(), this.nuevoSeguidor.getID());
			this.usuario = this.bd.cargarUsuarioRegistrado(this.usuario.getID());
			if(this.sigue)
				this.getBotonSeguir().setText("Dejar de Seguir");
			else
				this.getBotonSeguir().setText("Seguir");
		});
	}

	public void Enviar_peticion_amistad() {
		this.sigue = this.usuario.seguir.contains(this.nuevoSeguidor);
		if (this.sigue) {
			this.getBotonEnviarSolicitud().setText("Dejar de Seguir");
		} 
		this.getBotonEnviarSolicitud().addClickListener(event ->{
			this.sigue = !this.sigue;
			this.bd.enviarSolicitud( this.usuario.getID(), this.nuevoSeguidor.getID());
			this.usuario = this.bd.cargarUsuarioRegistrado(this.usuario.getID());
			if(this.sigue)
				this.getBotonSeguir().setText("Dejar de Seguir");
			else
				this.getBotonSeguir().setText("Enviar solicitud de amistad");
		});
	}
	
	public void Ver_perfil(Object interfaz) {
		this.getNombreusuario().addClickListener(event ->{
			 if(interfaz instanceof Nuevos_seguidores_usuario_privado_item) {
				Nuevos_seguidores_usuario_privado_item itemPrivadoAux = (Nuevos_seguidores_usuario_privado_item) interfaz;
				this.userInterfaz = itemPrivadoAux._nuevos_seguidores_usuario_privado._notificaciones_usuario_privado._notificacionesPrivado._ver_notificaciones_usuario_privado._cabecera_Usuario_Registrado.urInterfaz;
			}else if( interfaz instanceof Me_gustas_item) {
				Me_gustas_item meGustasAux = (Me_gustas_item) interfaz;
				if(meGustasAux._me_gustas._notificaciones._notificacionesPublico != null)
					this.userInterfaz = meGustasAux._me_gustas._notificaciones._notificacionesPublico._ver_notificaciones_usuario_publico._cabecera_Usuario_Registrado.urInterfaz;
				else
					this.userInterfaz = meGustasAux._me_gustas._notificaciones._notificacionesPrivado._ver_notificaciones_usuario_privado._cabecera_Usuario_Registrado.urInterfaz;
			}else {
				this.userInterfaz = this._nuevos_seguidores._notificaciones_usuario_publico._notificacionesPublico._ver_notificaciones_usuario_publico._cabecera_Usuario_Registrado.urInterfaz;	
			}
			this.userInterfaz.getVaadinHorizontalLayout().removeAll();
			this.userInterfaz.getVaadinHorizontalLayout().add(new Ver_perfil_publico(this.nuevoSeguidor, this, this.userInterfaz._cabecera_Usuario_Registrado._cabecera_TOP));
		
		});
	}

}