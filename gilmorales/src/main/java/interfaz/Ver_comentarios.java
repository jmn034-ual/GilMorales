package interfaz;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerComentarios;

public class Ver_comentarios extends VistaVerComentarios {

	public Ver_perfil_publico ver_perfil;
	public Ver_perfil_Administrador verPerfilAdmin;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();

	public Ver_comentarios(Publicacion publicacion) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = publicacion;
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		if (this.publicacion.getPerteneceA() != null) {
			this.getBotonNombreUsuario().setText(this.publicacion.getPerteneceA().getNombreUsuario());
			this.getFotoPerfil().setImage(this.publicacion.getPerteneceA().getFoto());
		} else {
			this.getBotonNombreUsuario().setText(this.publicacion.getEsPublicada().getNombreUsuarioComercial());
			this.getFotoPerfil().setImage(this.publicacion.getEsPublicada().getFoto());
		}
		NumeroMeGustas();
		NumeroComentarios();
		NumeroVisualizaciones();
		NumeroSeguidores();
	}

	public void Ver_perfil(Object interfaz) {
		Cabecera_TOP cabeceraTopAux = null;
		if (interfaz instanceof Ver_comentarios_Usuario_Registrado) {
			Ver_comentarios_Usuario_Registrado auxUR = (Ver_comentarios_Usuario_Registrado) interfaz;
			if (auxUR.verPublicacion != null) {
				cabeceraTopAux = auxUR.verPublicacion.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP;
			} else {
				cabeceraTopAux = auxUR.publicacionItem._lista_publicaciones__Usuario_Registrado_.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP;
			}
			this.ver_perfil = new Ver_perfil_publico(auxUR.publicacion.getPerteneceA(), interfaz, cabeceraTopAux);
		} else if (interfaz instanceof Ver_comentarios_Administrador) {
			Ver_comentarios_Administrador auxAdmin = (Ver_comentarios_Administrador) interfaz;
			if(auxAdmin._lista_Publicaciones__Administrador_ != null) {
				cabeceraTopAux = auxAdmin._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._cabecera_Administrador.cabeceraTOP;
			}else {
				cabeceraTopAux = auxAdmin._ver_publicacion__Administrador_._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._cabecera_Administrador.cabeceraTOP;
			}
			this.verPerfilAdmin = new Ver_perfil_Administrador(cabeceraTopAux, auxAdmin.publicacion.getPerteneceA());
		} else {
			Ver_comentarios_Usuario_No_registrado auxUNR = (Ver_comentarios_Usuario_No_registrado) interfaz;
			this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this,
					auxUNR.unrInterfaz.cabeceraUNR._cabecera_TOP);
		}

		this.getBotonNombreUsuario().addClickListener(event -> {
			if (this.ver_perfil != null) {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(ver_perfil);
			} else if (this.verPerfilAdmin != null) {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(verPerfilAdmin);
			} else {
				this.getVaadinHorizontalLayout().removeAll();
				this.getVaadinHorizontalLayout().add(ver_perfil);
			}
		});
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
		if (this.publicacion.getPerteneceA() != null) {
			this.getNumSeguidores().setText(this.publicacion.getPerteneceA().seguidor.size() + "");
		} else {
			this.getNumSeguidores().setVisible(false);
		}
	}
}