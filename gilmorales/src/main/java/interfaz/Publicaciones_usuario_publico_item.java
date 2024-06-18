package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesUsuarioPublicoItem;

public class Publicaciones_usuario_publico_item extends VistaPublicacionesUsuarioPublicoItem{
//	private button _verPublicacionB;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private Video _video;
	public Publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();

	public Publicaciones_usuario_publico_item(Publicacion publicacion, Publicaciones_usuario_publico interfaz) {
		this._publicaciones_usuario_publico = interfaz;
		this.publicacion = this.bd.cargarPublicacion(publicacion.getIdPublicacion());
		Video video = new Video(this.publicacion.getVideo());
		video.getStyle().set("width", "60%");
		video.getStyle().set("height", "60%");
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		Visualizaciones();
	}
	
	public void Ver_publicacion_ajena() {
		UsuarioRegistrado user = this._publicaciones_usuario_publico._ver_perfil_publico.user;
		this._ver_publicacion_ajena = new Ver_publicacion_ajena(this.publicacion, user, this);
	}

	public void Visualizaciones() {
		this.getNumVisualizaciones().setText(""+this.publicacion.getNumVisualizaciones());
	}
}