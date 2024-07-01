package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesGustadasItem;

public class Publicaciones_gustadas_item extends VistaPublicacionesGustadasItem{

	public Publicaciones_gustadas _publicaciones_gustadas;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	Publicacion publicacion;
	BDPrincipal bd = new BDPrincipal();
	
	public Publicaciones_gustadas_item(Publicacion publicacion, Publicaciones_gustadas interfaz) {
		this._publicaciones_gustadas = interfaz;
		this.publicacion = this.bd.cargarPublicacion(publicacion.getIdPublicacion());
		Video video = new Video(this.publicacion.getVideo());
		this.getVideo().as(VerticalLayout.class).add(video);
		NumeroVisualizaciones();
		Ver_publicacion_ajena();
	}

	public void Ver_publicacion_ajena() {
		UsuarioRegistrado user = this._publicaciones_gustadas._ver_publicaciones_gustadas__Usuario_registrado_._ver_perfil_propio.user;
		this.getVideo().as(VerticalLayout.class).addClickListener(event ->{
			this._ver_publicacion_ajena = new Ver_publicacion_ajena(this.publicacion, user, this);
			this._publicaciones_gustadas._ver_publicaciones_gustadas__Usuario_registrado_._ver_perfil_propio.getVaadinHorizontalLayout().removeAll();
			this._publicaciones_gustadas._ver_publicaciones_gustadas__Usuario_registrado_._ver_perfil_propio.getVaadinHorizontalLayout().add(_ver_publicacion_ajena);

		});
	}

	public void NumeroVisualizaciones() {
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones() + " Visualizaciones");
	}
}