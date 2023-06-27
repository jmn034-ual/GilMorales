package interfaz;

import com.vaadin.flow.component.html.Label;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaNotificacionesComentariosItem;

public class Notificaciones_comentarios_item extends VistaNotificacionesComentariosItem{

//	public Notificaciones_comentarios _notificaciones_comentarios;
	
	public Notificaciones_comentarios_item() {
		this.getBotonMeGusta().setVisible(false);
		this.getVaadinVerticalLayout().setVisible(false);
		this.getLabelComentario().setText("No tienes notificaciones");
	}
	
	public Notificaciones_comentarios_item(UsuarioRegistrado usuarioComenta) {
	
	}	

	public void Dar_me_gusta_comentario() {
		throw new UnsupportedOperationException();
	}
}