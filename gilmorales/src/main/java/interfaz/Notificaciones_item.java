package interfaz;

import basededatos.Notificaciones;
import vistas.VistaNotificacionesItem;

public class Notificaciones_item extends VistaNotificacionesItem{
	public Notificaciones _notificaciones;
	public Me_gustas _me_gustas;
	public Notificaciones_comentarios _notificaciones_comentarios;

	public void Me_gustas() {
		_me_gustas = new Me_gustas();
	}

	public void Notificaciones_comentarios() {
		_notificaciones_comentarios = new Notificaciones_comentarios();
	}
}