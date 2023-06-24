package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;

public class Ver_publicacion_propia extends Ver_publicacion__usuario_Registrado_ {
//	private Button _eliminar_publicacion_propiaB;
//	private Button _verPerfilB;
//	private Button _eliminarB;
//	private Button _verMeGustasB;
//	public Lista_publicaciones_propias__Eliminar__item _lista_publicaciones_propias;
	public Publicaciones_propias_item _publicaciones_propias;
	public Add_publicacion _add_publiacacion;
	public Ver_perfil_propio _ver_perfil_propio;
	public Ver_me_gustas_publicacion _ver_me_gustas_publicacion;
	private Publicacion publicacion;
	private Usuario_Registrado urInterfaz;

	
	public Ver_publicacion_propia() {}

	public Ver_publicacion_propia(Publicacion publicacion, Usuario_Registrado urInterfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publicacion = publicacion;
		this.urInterfaz = urInterfaz;
		this.getVerPerfil().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		this.getGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getVaadinButton().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getVaadinHorizontalLayout2().setVisible(false);
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getFechaSubida().setText(this.publicacion.getFechaPublicacion());
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
		this.getVideo().add(new Video(publicacion.getVideo()));
		Eliminar_publicacion_propia();
	}

	public void Eliminar_publicacion_propia() {
		this.getVaadinButton1().addClickListener(event ->{

		});
	}

	public void Ver_perfil_propio() {
		throw new UnsupportedOperationException();
	}

	public void Ver_me_gustas_publicacion() {
		throw new UnsupportedOperationException();
	}
}