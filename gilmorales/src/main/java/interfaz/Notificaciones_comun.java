package interfaz;

import java.util.List;

import com.vaadin.flow.component.notification.Notification;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaNotificacionesComun;
import basededatos.BDPrincipal;

public class Notificaciones_comun extends VistaNotificacionesComun{
//	private button _verPerfilB;
	public Ver_Perfil__2 _ver_perfil;
	UsuarioRegistrado user;
	BDPrincipal bd = new BDPrincipal();
	public List<Notificacion> notificaciones;

	public Notificaciones_comun(UsuarioRegistrado user) {
		this.user = this.bd.cargarUsuarioRegistrado(user.getID());
	}

	public void Ver_perfil() {
//		this.getVaadinButton().addClickListener(event -> Notification.show("VAmos bien"));
	}
}