package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Nuevos_seguidores extends Notificaciones_comun {
	public Notificaciones_usuario_publico_item _notificaciones_usuario_publico;
	public Vector<Nuevos_seguidores_item> _itemNuevosSeguidores = new Vector<Nuevos_seguidores_item>();
	public Vector<Nuevos_seguidores_item> _itemMenciones = new Vector<Nuevos_seguidores_item>();
	public VerticalLayout seguidores = new VerticalLayout();
	public VerticalLayout menciones = new VerticalLayout();
	Nuevos_seguidores_item nuevoItem ;
	public H3 tituloMenciones = new H3("Menciones: ");
	
	public Nuevos_seguidores(UsuarioRegistrado ur) {
		super(ur);
	}
	
	public Nuevos_seguidores(UsuarioRegistrado ur, Notificaciones_usuario_publico_item interfaz) {
		super(ur);
		this._notificaciones_usuario_publico = interfaz;
		cargarNotificaciones();
		this.getTituloNotificacion().setText("Nuevos seguidores:");
	}
	public void addNuevoSeguidor(Notificacion nuevoSeguidor) {
		this.seguidores.add(informacion(nuevoSeguidor));
		this._itemNuevosSeguidores.add(nuevoItem);
	}
	private Nuevos_seguidores_item informacion(Notificacion notificacionNuevoSeguidor) {
		UsuarioRegistrado usuarioNotifica = bd.cargarUsuarioRegistrado(notificacionNuevoSeguidor.getIDUsuarioNotifica());
		nuevoItem = new Nuevos_seguidores_item(this.user, usuarioNotifica, this);
		if(usuarioNotifica.getPrivacidad() != 1) {
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonSeguir().setVisible(true);
			nuevoItem.getBotonEnviarSolicitud().setVisible(false);
		}else if(usuarioNotifica.getPrivacidad() == 1){
			nuevoItem.getBotonSeguir().setVisible(false);
			nuevoItem.getPrivado().setVisible(false);
			nuevoItem.getBotonEnviarSolicitud().setVisible(true);
		}
		return nuevoItem;
	}

	public void addNuevaMencion(Notificacion mencion) {
		this.menciones.add(informacion(mencion));
		this._itemMenciones.add(nuevoItem);
	}
	
	public void cargarNotificaciones() {
		this.notificaciones = new ArrayList<Notificacion>(this.user.recibe.getCollection());

		if (notificaciones.isEmpty()) {
			System.out.println("No tiene notificaciones de nuevos seguidores");
		} else {
			

			this.seguidores.removeAll();
			this.menciones.removeAll();
			this._itemNuevosSeguidores.clear();
			this._itemMenciones.clear();

			/* Cargamos las listas de notificaciones */
			for (Notificacion n : this.notificaciones) {
				if(n.getTipoNotificacion() != 0 && n.getTipoNotificacion() != 3) continue;
				else if(n.getTipoNotificacion() == 0) {
					addNuevoSeguidor(n);
				}else {
					addNuevaMencion(n);
				}
			}
			this.getListaNotificaciones().as(VerticalLayout.class).add(this.seguidores);
			VerticalLayout aux = new VerticalLayout(tituloMenciones, this.menciones);
			aux.setPadding(false);
			aux.setMargin(false);
			this.getVaadinHorizontalLayout().add(aux);
		}
	}

}