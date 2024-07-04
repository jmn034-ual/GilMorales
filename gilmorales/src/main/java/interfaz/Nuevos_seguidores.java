package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
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
	boolean privado;
	Nuevos_seguidores_usuario_privado itemPrivado;
	
	public Nuevos_seguidores(UsuarioRegistrado ur) {
		super(ur);
	}
	
	public Nuevos_seguidores(UsuarioRegistrado ur, Notificaciones_usuario_publico_item interfaz) {
		super(ur);
		this._notificaciones_usuario_publico = interfaz;
		cargarNotificaciones(false, null);
		this.getTituloNotificacion().setText("Nuevos seguidores:");
	}
	public void addNuevoSeguidor(Notificacion nuevoSeguidor) {
		this.nuevoItem = informacion(nuevoSeguidor);
		if(nuevoItem != null) {
			this.seguidores.add(this.nuevoItem);
			this._itemNuevosSeguidores.add(nuevoItem);
		}
	}
	private Nuevos_seguidores_item informacion(Notificacion notificacionNuevoSeguidor) {
		Nuevos_seguidores_item itemAux = null;
		UsuarioRegistrado usuarioNotifica = bd.cargarUsuarioRegistrado(notificacionNuevoSeguidor.getIDUsuarioNotifica());
		if(this.privado) {
			itemAux = new Nuevos_seguidores_usuario_privado_item(notificacionNuevoSeguidor,this.user, usuarioNotifica, this.itemPrivado);
		}else {
			itemAux = new Nuevos_seguidores_item(notificacionNuevoSeguidor, this.user, usuarioNotifica, this);
		}
		return itemAux;
	}

	public void addNuevaMencion(Notificacion mencion) {
		this.nuevoItem = informacion(mencion);
		if(nuevoItem != null) {
			this.menciones.add(this.nuevoItem);
			this._itemMenciones.add(nuevoItem);
		}		
	}
	
	public void cargarNotificaciones(boolean privado, Nuevos_seguidores_usuario_privado itemPrivado) {
		this.notificaciones = new ArrayList<Notificacion>(this.user.recibe.getCollection());
		this.privado = privado;
		this.itemPrivado = itemPrivado;
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
			if(this._itemNuevosSeguidores.isEmpty()) {
				Label label = new Label("No tienes notificaciones de nuevos seguidores");
				this.getListaNotificaciones().as(VerticalLayout.class).add(label);
			}
			VerticalLayout aux = new VerticalLayout(tituloMenciones, this.menciones);
			aux.setPadding(false);
			aux.setMargin(false);
			aux.getStyle().set("width", "100%");
			aux.getStyle().set("height", "100%");
			if(this._itemMenciones.isEmpty()) {
				Label label = new Label("No tienes notificaciones de nuevas menciones");
				aux.add(label);
			}
			this.getVaadinHorizontalLayout().add(aux);

			
		}
	}

}