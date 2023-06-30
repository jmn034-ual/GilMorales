package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaVerPublicacionUsuarioNoRegistrado;

public class Ver_publicacion_Usuario_No_Registrado extends VistaVerPublicacionUsuarioNoRegistrado{
//	private ImageIcon _usarioIcono;
//	private button _verPerfilB;
//	private Label _geolocalizacionL;
//	private TextArea _descripcionTA;
//	private Label _fechaL;
//	private int _numeroMeGustas;
//	private int _numeroComentarios;
//	private Label _meGustasL;
//	private button _verComentariosB;
//	private int _numeroVisualizaciones;
//	private Video _video;
	public Lista_Publicaciones_Usuario_no_registrado_item _publicaciones__Usuario_no_registrado_;
	public Ver_comentarios_Usuario_No_registrado _ver_comentarios__Usuario_No_registrado_;
	public Lista_Top_Comentarios_Usuario_No_Registrado _lista_Top_Comentarios__Usuario_No_Registrado_;
	Publicacion p;
	Usuario_No_Registrado unr;
	
	public Ver_publicacion_Usuario_No_Registrado(Publicacion p, Usuario_No_Registrado unr) {
		this.p = p;
		this.unr = unr;
		this.getVideo().add(new Video(p.getVideo()));
		Comentarios();
		Lista_Top_Comentarios__Usuario_No_Registrado_();
		NumeroVisualizaciones();
		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();
		
	}

	public void Ver_comentarios__Usuario_No_registrado_() {
		_ver_comentarios__Usuario_No_registrado_ = new Ver_comentarios_Usuario_No_registrado(this.p, unr);
		this.getBotonVerComentario().addClickListener(event -> {
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_comentarios__Usuario_No_registrado_);
		});	}

	public void Lista_Top_Comentarios__Usuario_No_Registrado_() {
		_lista_Top_Comentarios__Usuario_No_Registrado_ = new Lista_Top_Comentarios_Usuario_No_Registrado(p);
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_Comentarios__Usuario_No_Registrado_);
	}

	public void NumeroMeGustas() {
		this.getNumMeGustas().setText(this.p.getNumMeGustas()+"");
	}

	public void Comentarios() {
		this.getNumComentarios().setText(this.p.getNumComentarios()+"");
	}

	public void NumeroVisualizaciones() {
		this.p.setNumVisualizaciones(this.p.getNumVisualizaciones()+1);
		this.getNumVisualizaciones().setText(this.p.getNumVisualizaciones()+"");
	}
}