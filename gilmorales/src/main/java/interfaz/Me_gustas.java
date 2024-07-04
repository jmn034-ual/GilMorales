package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Me_gustas extends Nuevos_seguidores {

	public Notificaciones_item _notificaciones;
	public Vector<Me_gustas_item> _itemMeGustas = new Vector<Me_gustas_item>();

	public Me_gustas(UsuarioRegistrado ur, Notificaciones_item interfaz) {
		super(ur);
		this._notificaciones = interfaz;
		this.getTituloNotificacion().setText("Me Gustas:");
		cargarNotificacionesMeGustas();
	}

	public void addNuevoMeGusta(Notificacion nuevoMeGusta) {
		Me_gustas_item nuevoItem = informacion(nuevoMeGusta);
		if (nuevoItem != null) {
			this.getListaNotificaciones().as(VerticalLayout.class).add(nuevoItem);
			this._itemMeGustas.add(nuevoItem);
		}
	}

	private Me_gustas_item informacion(Notificacion notificacionNuevoMeGusta) {
		Me_gustas_item nuevoItem = null;

		UsuarioRegistrado seguidor = bd.cargarUsuarioRegistrado(notificacionNuevoMeGusta.getIDUsuarioNotifica());
		nuevoItem = new Me_gustas_item( notificacionNuevoMeGusta, this.user, seguidor, this);
		if (seguidor.getPrivacidad() != 1) {
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonSeguir().setVisible(true);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		} else if (seguidor.getPrivacidad() == 1) {
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(true);
		}

		return nuevoItem;
	}

	public void cargarNotificacionesMeGustas() {
		this.notificaciones = new ArrayList<Notificacion>(this.user.recibe.getCollection());

		if (notificaciones.isEmpty()) {
			System.out.println("No tiene notificaciones de Me Gustas");
		} else {

			this.getListaNotificaciones().as(VerticalLayout.class).removeAll();
			this._itemMeGustas.clear();

			/* Cargamos las listas de notificaciones */
			for (Notificacion n : this.notificaciones) {
				if (n.getTipoNotificacion() != 1)
					continue;
				addNuevoMeGusta(n);
			}
			if (this._itemMeGustas.isEmpty()) {
				Label label = new Label("No tienes notificaciones de me gustas");
				this.getListaNotificaciones().as(VerticalLayout.class).add(label);
			}
		}
	}

}