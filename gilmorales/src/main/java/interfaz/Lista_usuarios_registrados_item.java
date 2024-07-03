package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaUsuariosItem;

public class Lista_usuarios_registrados_item extends VistaListaUsuariosItem{
	public Lista_usuarios_registrados _lista_usuarios_registrados;
	public Ver_perfil_publico ver_perfil;
	public Ver_perfil_Administrador verPerfilAdmin;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado user;
	UsuarioRegistrado userRegistrado;
	
	public Lista_usuarios_registrados_item(UsuarioRegistrado user, Lista_usuarios_registrados interfaz) {
		this._lista_usuarios_registrados = interfaz;
		this.user = this.bd.cargarUsuarioRegistrado(user.getID());
		if(this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado != null)
			this.userRegistrado = this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz.ur;
		Publicacion p = null;
		Video video = null;
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());
		if(publicaciones != null && publicaciones.size() > 0) {
			p = publicaciones.get(0);
			video = new Video(p.getVideo()); 
			this.getLayoutPublicacion().as(VerticalLayout.class).add(video);
		}else {
			Label label = new Label("Este usuario aún no tiene publicacioenes");
			label.getStyle().set("color", "white");
			this.getLayoutPublicacion().as(VerticalLayout.class).add(label);
		}
		this.getBotonNombreUsuario().setText(this.user.getNombreUsuario());
		this.getLabelNombreCompleto().setText(this.user.getNombre() + " " + this.user.getApellidos());
		this.getLabelDescripcion().setText(this.user.getDescripcion());
		this.getFotoPerfil().setImage(this.user.getFoto());
		Ver_perfil();
		Ver_publicacion_ajena();
	}

	public void Ver_perfil() {
		if(this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP.cabeceraAdmin != null) {
			this.verPerfilAdmin = new Ver_perfil_Administrador(this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP, this.user);
		}else {			
			this.ver_perfil = new Ver_perfil_publico(this.user, this, this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP);
		}
		
		this.getBotonNombreUsuario().addClickListener(event ->{
			this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if(this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP.cabeceraAdmin != null) {
				this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.verPerfilAdmin);
			}else {
				this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.ver_perfil);
			}
			});
		
	}

	public void Ver_publicacion_ajena() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
		if(!publicaciones.isEmpty()) {
		Publicacion publicacion = publicaciones.get(0);
		this.getLayoutPublicacion().as(VerticalLayout.class).addClickListener(event -> {
			this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			if (this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
				this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_publicacion_Usuario_No_Registrado(publicacion, this));
			} else if (this._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado != null) {	
					_ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.userRegistrado,this);
					this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_publicacion_ajena);
			}else {
				this._lista_usuarios_registrados._ver_lista_usuarios_registrados.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Ver_publicacion_Administrador(publicacion, this));
			}
		});
	}
	}
	
	
}