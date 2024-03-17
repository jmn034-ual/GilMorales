package interfaz;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerComentarios;

public class Ver_comentarios extends VistaVerComentarios{

	public Ver_perfil_publico ver_perfil;
	UsuarioRegistrado user;
	Publicacion publicacion;
	
	public Ver_comentarios(Publicacion publicacion,Object userInterfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.publicacion = publicacion;
		this.getFotoPerfil().setSizeFull();
		NumeroMeGustas();
		NumeroComentarios();
		NumeroVisualizaciones();
		NumeroSeguidores();
	}

	public void Ver_perfil() {
	}

	public void NumeroMeGustas() {
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
	}

	public void NumeroComentarios() {
		this.getNumComentarios().setText(this.publicacion.getNumComentarios() + "");
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + "");
	}

	public void NumeroSeguidores() {
		if(this.publicacion.getPerteneceA() != null) {			
			this.getNumSeguidores().setText(this.publicacion.getPerteneceA().seguidor.size() + "");
		}else {
			this.getNumSeguidores().setVisible(false);
		}
	}
}