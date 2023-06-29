package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Nuevos_seguidores extends Notificaciones_comun {
	public Notificaciones_usuario_publico_item _notificaciones_usuario_publico;
	public Vector<Nuevos_seguidores_item> _item = new Vector<Nuevos_seguidores_item>();
	UsuarioRegistrado ur;
	iUsuario_Registrado bd = new BDPrincipal();

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
		UsuarioRegistrado usuarioNotifica = bd.cargarUsuarioRegistrado(notificacionNuevoSeguidor.getIDUsuarioNotifica());
		nuevoItem = new Nuevos_seguidores_item(this.ur, usuarioNotifica);
		if(!ur.seguir.contains(usuarioNotifica) && usuarioNotifica.getPrivacidad() != 1) {
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonSeguir().setVisible(true);
			nuevoItem.getBotonDejarDeSeguir().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		}else if(!ur.seguir.contains(usuarioNotifica) && usuarioNotifica.getPrivacidad() == 1){
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonDejarDeSeguir().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(true);
		}else if(ur.seguir.contains(usuarioNotifica) && usuarioNotifica.getPrivacidad() == 1) {
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
		return nuevoItem;
	}

	public void addNuevaMencion(Notificacion mencion) {
		this.getNuevosSeguidores().as(VerticalLayout.class).add(informacion(mencion));
	}
}