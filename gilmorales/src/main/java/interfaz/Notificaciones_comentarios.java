package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Notificacion;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Notificaciones_comentarios extends Notificaciones__comun {
	public Notificaciones_item _notificaciones;
	public Vector<Notificaciones_comentarios_item> _item = new Vector<Notificaciones_comentarios_item>();
	UsuarioRegistrado ur;
	
	public Notificaciones_comentarios() {
		this.getTituloNotificacion().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
		Notificaciones_comentarios_item nuevoItem = new Notificaciones_comentarios_item();
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}
	
	public Notificaciones_comentarios(UsuarioRegistrado ur) {
		this.getTituloNotificacion().setVisible(false);
		this.ur = ur;
	}
	public void addNuevoComentario(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = informacion(nuevoComentario);
		this.getNuevosSeguidores().as(VerticalLayout.class).add(nuevoItem);
	}
	
	private Notificaciones_comentarios_item informacion(Notificacion nuevoComentario) {
		Notificaciones_comentarios_item nuevoItem = null;
		try {
			UsuarioRegistrado usuarioComenta = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(nuevoComentario.getEnviadaA().getORMID());
			nuevoItem = new Notificaciones_comentarios_item(usuarioComenta);
			this.getFotoPerfil().setImage(usuarioComenta.getFoto());
			this.getVaadinButton().setText(usuarioComenta.getNombreUsuario());
			nuevoItem.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.getVaadinHorizontalLayout());
			ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.ur.publica.getCollection());
			for(Publicacion p : publicaciones) {
				ArrayList<Comentario> comentarios = new ArrayList<Comentario>(p.tieneComentarios.getCollection());
				for(Comentario c : comentarios) {
					if(c.getEsComentadoPor().equals(usuarioComenta)) {
						nuevoItem.getLabelComentario().setText(c.getComentario());
					}
				}
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nuevoItem;
	}
}