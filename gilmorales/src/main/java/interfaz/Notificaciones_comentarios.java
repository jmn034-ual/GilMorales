package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Comentario;
import bd_dcl.Notificacion;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Notificaciones_comentarios extends Notificaciones_comun {
	public Notificaciones_item _notificaciones;
	public Vector<Notificaciones_comentarios_item> _itemComentarios = new Vector<Notificaciones_comentarios_item>();

	// Convertir el notificaciones en notificacioens usuario publico
	public Notificaciones_comentarios(UsuarioRegistrado ur, Notificaciones_item interfaz) {
		super(ur);
		this.user = ur;
		this._notificaciones = interfaz;
		this.getTituloNotificacion().setText("Comentarios:");
		cargarNotificacionesComentarios();
	}

	public void addNuevoComentario(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = informacion(nuevoComentario);
		this.getListaNotificaciones().as(VerticalLayout.class).add(nuevoItem);
	}

	private Notificaciones_comentarios_item informacion(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = null;
		UsuarioRegistrado usuarioComenta = this.bd.cargarUsuarioRegistrado(nuevoComentario.getIDUsuarioNotifica());
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());
		for (Publicacion p : publicaciones) {
			ArrayList<Comentario> comentarios = new ArrayList<Comentario>(p.tieneComentarios.getCollection());
			for (Comentario c : comentarios) {
				if (c.getEsComentadoPor().equals(usuarioComenta)) {
					nuevoItem = new Notificaciones_comentarios_item(nuevoComentario.getEnviadaA(), usuarioComenta, c,
							this);
					break;
				}
			}
		}
		return nuevoItem;
	}

	public void cargarNotificacionesComentarios() {
		this.notificaciones = new ArrayList<Notificacion>(this.user.recibe.getCollection());

		if (notificaciones.isEmpty()) {
			System.out.println("No tiene notificaciones de comentarios");
		} else {
			

			this.getListaNotificaciones().as(VerticalLayout.class).removeAll();
			this._itemComentarios.clear();

			/* Cargamos las listas de notificaciones */
			for (Notificacion n : this.notificaciones) {
				if(n.getTipoNotificacion() != 2) continue;
				addNuevoComentario(n);
			}
		}
	}
}