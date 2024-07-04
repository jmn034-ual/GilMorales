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
	Usuario_Registrado userInterfaz;
	
	public Notificaciones_comentarios_item(UsuarioRegistrado daMeGusta, UsuarioRegistrado recibe, Comentario c , Notificaciones_comentarios interfaz) {
		this.daMeGusta = daMeGusta;
		this.recibe = recibe;
		this.comentario = c;
		this._notificaciones_comentarios = interfaz;
		this.getVaadinAvatar().setImage(this.recibe.getFoto());
		this.getNombreUser().setText(this.recibe.getNombreUsuario());
		this.getLabelComentario().setText(this.comentario.getComentario());
		System.out.println("Aparece en la publicacion: " + this.comentario.getComentadoEn());
		Ver_perfil();
	}

	public void Dar_me_gusta_comentario() {
		this.getBotonMeGusta().addClickListener(event -> {
		 	this.comentario = this.bd.meGustaComentario(daMeGusta.getID(), recibe.getID());
		});
	}
	
	public void Ver_perfil() {
		this.getNombreUser().addClickListener(event ->{
			if(this._notificaciones_comentarios._notificaciones._notificacionesPublico != null)
				this.userInterfaz = this._notificaciones_comentarios._notificaciones._notificacionesPublico._ver_notificaciones_usuario_publico._cabecera_Usuario_Registrado.urInterfaz;
			else
				this.userInterfaz = this._notificaciones_comentarios._notificaciones._notificacionesPrivado._ver_notificaciones_usuario_privado._cabecera_Usuario_Registrado.urInterfaz;

			this.userInterfaz.getVaadinHorizontalLayout().removeAll();
			this.userInterfaz.getVaadinHorizontalLayout().add(new Ver_perfil_publico(this.recibe, this, this.userInterfaz._cabecera_Usuario_Registrado._cabecera_TOP));
		});
	}
}