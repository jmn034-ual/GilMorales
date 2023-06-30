package interfaz;

import com.vaadin.flow.component.html.Label;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaNotificacionesComentariosItem;

public class Notificaciones_comentarios_item extends VistaNotificacionesComentariosItem{

//	public Notificaciones_comentarios _notificaciones_comentarios;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado daMeGusta;
	UsuarioRegistrado recibe;
	
	public Notificaciones_comentarios_item() {
		this.getLabelComentario().setText("No tienes notificaciones");
		this.getBotonMeGusta().setVisible(false);
	}
	
	
	public Notificaciones_comentarios_item(UsuarioRegistrado daMeGusta, UsuarioRegistrado recibe) {
		this.getBotonMeGusta().setVisible(false);
		this.getVaadinVerticalLayout().setVisible(false);
		this.daMeGusta = daMeGusta;
		this.recibe = recibe;
	}

	public void Dar_me_gusta_comentario() {
		this.getBotonMeGusta().addClickListener(event -> {
			this.bd.meGustaComentario(daMeGusta.getID(), recibe.getID());
		});
	}
}