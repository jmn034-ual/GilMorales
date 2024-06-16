package interfaz;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Me_gustas extends Nuevos_seguidores {

	public Notificaciones_item _notificaciones;
	public Vector<Me_gustas_item> _item = new Vector<Me_gustas_item>();

	public Me_gustas() {
		this.getTituloNotificacion().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
	}

	public Me_gustas(UsuarioRegistrado ur) {
		super(ur);
		this.getTituloNotificacion().setVisible(false);
	}

	public void addNuevoMeGusta(Notificacion nuevoMeGusta) {
		Me_gustas_item nuevoItem = informacion(nuevoMeGusta);
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}

	private Me_gustas_item informacion(Notificacion notificacionNuevoMeGusta) {
		Me_gustas_item nuevoItem = null;

		UsuarioRegistrado seguidor = bd.cargarUsuarioRegistrado(notificacionNuevoMeGusta.getIDUsuarioNotifica());
		nuevoItem = new Me_gustas_item(ur, seguidor);
		this.getFotoPerfil().setImage(seguidor.getFoto());
		this.getVaadinButton().setText(seguidor.getNombreUsuario());
		if (!ur.seguir.contains(seguidor) && seguidor.getPrivacidad() != 1) {
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonSeguir().setVisible(true);
			nuevoItem.getBotonDejarDeSeguir().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		} else if (!ur.seguir.contains(seguidor) && seguidor.getPrivacidad() == 1) {
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonDejarDeSeguir().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(true);
		} else if (ur.seguir.contains(seguidor) && seguidor.getPrivacidad() == 1) {
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonDejarDeSeguir().setVisible(true);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		} else {
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonDejarDeSeguir().setVisible(true);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		}

		return nuevoItem;
	}
}