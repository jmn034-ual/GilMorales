package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesUsuarioPublicoItem;

public class Publicaciones_usuario_publico_item extends VistaPublicacionesUsuarioPublicoItem{

	public Publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Ver_publicacion_Usuario_No_Registrado verPubli;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();

	public Publicaciones_usuario_publico_item(Publicacion publicacion, Publicaciones_usuario_publico interfaz) {
		this._publicaciones_usuario_publico = interfaz;
		this.publicacion = this.bd.cargarPublicacion(publicacion.getIdPublicacion());
		Video video = new Video(this.publicacion.getVideo());
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		Visualizaciones();
		Ver_publicacion_ajena();
	}
	
	public void Ver_publicacion_ajena() {
		UsuarioRegistrado user = this._publicaciones_usuario_publico._ver_perfil_publico.user;
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			this._publicaciones_usuario_publico._ver_perfil_publico.getVaadinHorizontalLayout().removeAll();
			if(this._publicaciones_usuario_publico._ver_perfil_publico.cabecera_top._cabecera_Usuario_Registrado != null) {
				this._ver_publicacion_ajena = new Ver_publicacion_ajena(this.publicacion, user, this);
				this._publicaciones_usuario_publico._ver_perfil_publico.getVaadinHorizontalLayout().add(this._ver_publicacion_ajena);
			}else {
				this.verPubli = new Ver_publicacion_Usuario_No_Registrado(publicacion, this);
				this._publicaciones_usuario_publico._ver_perfil_publico.getVaadinHorizontalLayout().add(this.verPubli);
			}
		});
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + " Visualizaciones");
	}
}