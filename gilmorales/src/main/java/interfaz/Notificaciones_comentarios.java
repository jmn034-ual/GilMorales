package interfaz;

import java.util.ArrayList;
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
	public Vector<Notificaciones_comentarios_item> _item = new Vector<Notificaciones_comentarios_item>();
	UsuarioRegistrado ur;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Notificaciones_comentarios() {
		this.getTituloNotificacion().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
		Notificaciones_comentarios_item nuevoItem = new Notificaciones_comentarios_item();
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}
	
	public Notificaciones_comentarios(UsuarioRegistrado ur, Notificaciones_item interfaz) {
		this.getTituloNotificacion().setVisible(false);
		this.ur = ur;
		this._notificaciones = interfaz;
	}
	public void addNuevoComentario(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = informacion(nuevoComentario);
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}
	
	private Notificaciones_comentarios_item informacion(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = null;
			UsuarioRegistrado usuarioComenta = this.bd.cargarUsuarioRegistrado(nuevoComentario.getIDUsuarioNotifica());
			this.getFotoPerfil().setImage(usuarioComenta.getFoto());
			this.getVaadinButton().setText(usuarioComenta.getNombreUsuario());
			ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.ur.publica.getCollection());
			for(Publicacion p : publicaciones) {
				ArrayList<Comentario> comentarios = new ArrayList<Comentario>(p.tieneComentarios.getCollection());
				for(Comentario c : comentarios) {
					if(c.getEsComentadoPor().equals(usuarioComenta)) {
						nuevoItem = new Notificaciones_comentarios_item(nuevoComentario.getEnviadaA(), usuarioComenta, c, this);
						break;
					}
				}
			}
		return nuevoItem;
	}
}