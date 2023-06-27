package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.iVer_notificaciones_usuario_publico;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerNotificacionesUsuarioPublico;

public class Ver_notificaciones_usuario_publico extends VistaVerNotificacionesUsuarioPublico{
	public iVer_notificaciones_usuario_publico _iVer_notificaciones_usuario_publico;
	public Notificaciones_usuario_publico _notificaciones_usuario_publico;
	UsuarioRegistrado ur;

	public Ver_notificaciones_usuario_publico(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.ur = ur;
    	Notificaciones_usuario_publico();
	}
	public void Notificaciones_usuario_publico() {
    	_notificaciones_usuario_publico = new Notificaciones_usuario_publico(ur);
    	this.getLayoutListaNuevosSeguidores().as(VerticalLayout.class).add(this._notificaciones_usuario_publico.notificaciones._nuevos_seguidores);
    	this.getLayoutListaComentarios().as(VerticalLayout.class).add(this._notificaciones_usuario_publico.notificaciones._notificaciones_comentarios);
    	this.getLayoutListaMeGustas().as(VerticalLayout.class).add(this._notificaciones_usuario_publico.notificaciones._me_gustas);
    	this.getLayoutListaMenciones().as(VerticalLayout.class).add(this._notificaciones_usuario_publico.notificaciones.nuevasMenciones);
	}
}