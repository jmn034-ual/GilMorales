package interfaz;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import vistas.VistaListaPublicacionesAdministradorItem;

public class Lista_Publicaciones_Administrador_item extends VistaListaPublicacionesAdministradorItem{
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

	public Lista_Publicaciones_Administrador _lista_Publicaciones__Administrador_;
	public Ver_comentarios_Administrador _ver_comentarios__Administrador_ ;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	public UsuarioAdministrador admin;
	public Administrador adminInterfaz;
	public Ver_Perfil__2 _ver_perfil = new Ver_Perfil__2();
	public Ver_perfil_Administrador _ver_perfil_administrador_= new Ver_perfil_Administrador();
	Publicacion publicacion;
	
	public Lista_Publicaciones_Administrador_item() {
		
	}
	
	public Lista_Publicaciones_Administrador_item(Publicacion p, UsuarioAdministrador admin, Administrador adminInterfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(new Video(p.getVideo()));
		this.getNombre().setText(p.getPerteneceA().getNombreUsuario());
		this.getGeolocalizacion().setText(p.getLocalizacion());
		this.getDescripcion().setText(p.getDescripcion());
		this.getFoto().setImage(p.getPerteneceA().getFoto());
		this.Eliminar_publicacion__Administrador_();
		this.NumeroComentarios();
		this.admin=admin;
		this.publicacion = p;
		this.Ver_comentarios__Administrador_();
		this.VerPerfil();
	}

	public void Eliminar_publicacion__Administrador_() {
		this.getEliminarPub().addClickListener(event->{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll()
			;});
	}

	public void Ver_comentarios__Administrador_() {
		_ver_comentarios__Administrador_ = new Ver_comentarios_Administrador(publicacion);
		this.getComentarios().addClickListener(event -> {
			this.adminInterfaz.getVaadinHorizontalLayout().removeAll();
			this.adminInterfaz.getVaadinHorizontalLayout().add(_ver_comentarios__Administrador_);
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
		this.getNombre().addClickListener(event->{
			this.adminInterfaz.getVaadinHorizontalLayout().removeAll();
			this.adminInterfaz.getVaadinHorizontalLayout().add(_ver_perfil_administrador_);
		});
	}

	public void NumeroVisualizaciones() {
		throw new UnsupportedOperationException();
	}
}