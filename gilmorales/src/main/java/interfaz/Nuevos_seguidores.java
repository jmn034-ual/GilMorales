package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Nuevos_seguidores extends Notificaciones__comun {
	public Notificaciones_usuario_publico_item _notificaciones_usuario_publico;
	public Vector<Nuevos_seguidores_item> _item = new Vector<Nuevos_seguidores_item>();
	UsuarioRegistrado ur;
	
	public Nuevos_seguidores() {
		this.getTituloNotificacion().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
		Nuevos_seguidores_item nuevoItem = new Nuevos_seguidores_item();
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}
	
	public Nuevos_seguidores(UsuarioRegistrado ur) {
		this.getTituloNotificacion().setVisible(false);
		this.ur = ur;
	}
	public void addNuevoSeguidor(Notificacion nuevoSeguidor) {
		this.getNuevosSeguidores().as(VerticalLayout.class).add(informacion(nuevoSeguidor));
	}
	private Nuevos_seguidores_item informacion(Notificacion notificacionNuevoSeguidor) {
		Nuevos_seguidores_item nuevoItem = null;
		try {
			UsuarioRegistrado nuevoSeguidor = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(notificacionNuevoSeguidor.getEnviadaA().getORMID());
			nuevoItem = new Nuevos_seguidores_item(nuevoSeguidor);
			if(!ur.seguir.contains(nuevoSeguidor) && nuevoSeguidor.getPrivacidad() != 1) {
				nuevoItem.getPrivado().setVisible(false);
				nuevoItem.getBotonSeguir().setVisible(true);
				nuevoItem.getBotonDejarDeSeguir().setVisible(false);
				nuevoItem.getBotonEnviarSolicitud().setVisible(false);
			}else if(!ur.seguir.contains(nuevoSeguidor) && nuevoSeguidor.getPrivacidad() == 1){
				nuevoItem.getBotonSeguir().setVisible(false);
				nuevoItem.getPrivado().setVisible(false);
				nuevoItem.getBotonDejarDeSeguir().setVisible(false);
				nuevoItem.getBotonEnviarSolicitud().setVisible(true);
			}else if(ur.seguir.contains(nuevoSeguidor) && nuevoSeguidor.getPrivacidad() == 1) {
				nuevoItem.getBotonSeguir().setVisible(false);
				nuevoItem.getPrivado().setVisible(false);
				nuevoItem.getBotonDejarDeSeguir().setVisible(true);
				nuevoItem.getBotonEnviarSolicitud().setVisible(false);			
			}else {
				nuevoItem.getBotonSeguir().setVisible(false);
				nuevoItem.getPrivado().setVisible(false);
				nuevoItem.getBotonDejarDeSeguir().setVisible(true);
				nuevoItem.getBotonEnviarSolicitud().setVisible(false);	
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nuevoItem;
	}
	
	public void addNuevaMencion(Notificacion mencion) {
		this.getNuevosSeguidores().as(VerticalLayout.class).add(informacion(mencion));
	}
}