package interfaz;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import vistas.VistaListaPublicacionesAdministradorItem;

public class Lista_Publicaciones_Administrador_item extends VistaListaPublicacionesAdministradorItem{

	public Lista_Publicaciones_Administrador _lista_Publicaciones__Administrador_;
	public Ver_comentarios_Administrador _ver_comentarios__Administrador_ ;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	public Ver_perfil_Administrador _ver_perfil_administrador_;
	Publicacion publicacion;
	
	public Lista_Publicaciones_Administrador_item(Publicacion p, Lista_Publicaciones_Administrador adminInterfaz) {
		this.publicacion = p;
		this._lista_Publicaciones__Administrador_ = adminInterfaz;
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(p.getVideo()));
		if(this.publicacion.getPerteneceA() != null) {			
			this.getBotonNombreUsuario().setText(p.getPerteneceA().getNombreUsuario());
		}else {
			this.getBotonNombreUsuario().setText(p.getEsPublicada().getNombreUsuarioComercial());
		}
		this.getLabelGeolocalizacion().setText(p.getLocalizacion());
		this.getVaadinAvatar().setImage(p.getPerteneceA().getFoto());
		Eliminar_publicacion__Administrador_();
		NumeroComentarios();
		Ver_comentarios__Administrador_();
		Ver_publicacion__Administrador_();
		NumeroMeGustas();
		VerPerfil();
		NumeroVisualizaciones();
	}

	public void Eliminar_publicacion__Administrador_() {
		this.getBotonEliminar().addClickListener(event->{
			this._lista_Publicaciones__Administrador_.getVaadinVerticalLayout().as(VerticalLayout.class).remove(this);
			this._lista_Publicaciones__Administrador_._administrador._iAdministrador.eliminarPublicacion(this.publicacion.getIdPublicacion());
		});
	}

	public void Ver_comentarios__Administrador_() {
		_ver_comentarios__Administrador_ = new Ver_comentarios_Administrador(publicacion, this);
		this.getBotonVerComentarios().addClickListener(event -> {
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().removeAll();
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().add(_ver_comentarios__Administrador_);
		});
	}

	public void Ver_publicacion__Administrador_() {
		_ver_publicacion__Administrador_ = new Ver_publicacion_Administrador(this.publicacion, this);
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().removeAll();
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().add(_ver_publicacion__Administrador_);
		});
	}

	public void NumeroMeGustas() {
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
	}

	public void NumeroComentarios() {
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios() +"");
	}

	public void VerPerfil() {
		_ver_perfil_administrador_ = new Ver_perfil_Administrador(this.publicacion.getPerteneceA());
		this.getBotonNombreUsuario().addClickListener(event->{
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().removeAll();
			this._lista_Publicaciones__Administrador_._administrador.getVaadinHorizontalLayout().add(_ver_perfil_administrador_);
		});
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
	}
}