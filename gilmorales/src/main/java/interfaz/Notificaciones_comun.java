package interfaz;

import com.vaadin.flow.component.notification.Notification;

import vistas.VistaNotificacionesComun;

public class Notificaciones_comun extends VistaNotificacionesComun{
//	private button _verPerfilB;
	public Ver_Perfil__2 _ver_perfil;
	
	public Notificaciones_comun() {
		this.getTituloNotificacion().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
	}

//	public void Ver_perfil() {
//		this.getVaadinButton().addClickListener(event -> Notification.show("VAmos bien"));
//	}
}