package interfaz;

import java.util.Vector;

import bd_dcl.UsuarioRegistrado;
import interfaz.Notificaciones_usuario_privado_item;

public class Nuevos_seguidores_usuario_privado extends Nuevos_seguidores {

	public Notificaciones_usuario_privado_item _notificaciones_usuario_privado;
	public Vector<Nuevos_seguidores_usuario_privado_item> _item = new Vector<Nuevos_seguidores_usuario_privado_item>();
	
	public Nuevos_seguidores_usuario_privado(UsuarioRegistrado ur, Notificaciones_usuario_privado_item interfaz) {
		super(ur);
		this._notificaciones_usuario_privado = interfaz;
		cargarNotificaciones();
		this.getTituloNotificacion().setText("Nuevos seguidores:");
	}
}