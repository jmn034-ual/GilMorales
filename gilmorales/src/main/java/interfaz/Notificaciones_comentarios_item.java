package interfaz;


import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaNotificacionesComentariosItem;

public class Notificaciones_comentarios_item extends VistaNotificacionesComentariosItem{

	public Notificaciones_comentarios _notificaciones_comentarios;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado daMeGusta;
	UsuarioRegistrado recibe;
	Comentario comentario;
	
	public Notificaciones_comentarios_item() {
		this.getLabelComentario().setText("No tienes notificaciones");
		this.getBotonMeGusta().setVisible(false);
	}
	
	
	public Notificaciones_comentarios_item(UsuarioRegistrado daMeGusta, UsuarioRegistrado recibe, Comentario c , Notificaciones_comentarios interfaz) {
		this.daMeGusta = daMeGusta;
		this.recibe = recibe;
		this.comentario = c;
		this._notificaciones_comentarios = interfaz;
		this.getVaadinAvatar().setImage(this.recibe.getFoto());
		this.getNombreUser().setText(this.recibe.getNombreUsuario());
		this.getLabelComentario().setText(this.comentario.getComentario());
		System.out.println("Aparece en la publicacion: " + this.comentario.getComentadoEn());
		
	}

	public void Dar_me_gusta_comentario() {
		this.getBotonMeGusta().addClickListener(event -> {
		 	this.comentario = this.bd.meGustaComentario(daMeGusta.getID(), recibe.getID());
		});
	}
}