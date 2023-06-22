package interfaz;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import vistas.VistaListaPublicacionesAdministradorItem;

public class Lista_Publicaciones__Administrador__item extends VistaListaPublicacionesAdministradorItem{
//	private button _eliminar_publicacion__Administrador_;
//	private ImageIcon _usuarioIcon;
//	private button _verPerfilB;
//	private Label _geolocalizacionL;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
//	private Video _video;
//	private int _numeroMeGustas;
//	private Label _meGustasL;
//	private int _numeroComentarios;
//	private Label _comentariosL;
//	private button _verComentariosB;
//	private TextArea _descripcionTA;
//	private button _verPublicacionB;

	public Lista_Publicaciones__Administrador_ _lista_Publicaciones__Administrador_;
	public Ver_comentarios__Administrador_ _ver_comentarios__Administrador_ = new Ver_comentarios__Administrador_(this);
	public Ver_publicacion__Administrador_ _ver_publicacion__Administrador_;
	public Administrador admin;
	public Ver_Perfil__2 _ver_perfil = new Ver_Perfil__2();
	
	public Lista_Publicaciones__Administrador__item() {
		
	}
	
	public Lista_Publicaciones__Administrador__item(String usuario, String localizacion, String descripcion, String foto, String video, Administrador admin) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(new Video(video));
		this.getNombre().setText(usuario);
		this.getGeolocalizacion().setText(localizacion);
		this.getDescripcion().setText(descripcion);
		this.getFoto().setImage(foto);
		this.Eliminar_publicacion__Administrador_();
		this.NumeroComentarios();
		this.admin=admin;
		this.Ver_comentarios__Administrador_();
	}

	public void Eliminar_publicacion__Administrador_() {
		this.getEliminarPub().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();});
	}

	public void Ver_comentarios__Administrador_() {
		this.getComentarios().addClickListener(event -> {
			admin.getVaadinHorizontalLayout().removeAll();
			admin.getVaadinHorizontalLayout().add(_ver_comentarios__Administrador_);
		});
	}

	public void Ver_publicacion__Administrador_() {
		throw new UnsupportedOperationException();
	}

	public void NumeroMeGustas() {
		throw new UnsupportedOperationException();
	}

	public void NumeroComentarios() {
		this.getNumC();
	}

	public void VerPerfil() {
		throw new UnsupportedOperationException();
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}