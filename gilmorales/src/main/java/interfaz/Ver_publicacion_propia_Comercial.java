package interfaz;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;

public class Ver_publicacion_propia_Comercial extends Ver_publicacion_propia{
public Ver_publicacion_propia_Comercial(Publicacion publicacion, Usuario_Registrado urInterfaz) {
		super(publicacion, urInterfaz);
		// TODO Auto-generated constructor stub
	}

//	private Video _video;
//	private ImageIcon _usuarioIcono;
//	private button _verPerfilB;
//	private button _eliminarB;
//	private Label _geolocalizacionL;
//	private TextArea _descripcionTA;
//	private Label _fechaL;
//	private int _numeroMeGustas;
//	private int _numeroComentarios;
//	private Label _meGustasL;
//	private Label _comentarioL;
//	private button _verMeGustasB;
//	private button _verComentariosB;
//	private int _numeroVisualizaciones;
//	private Label _visualizacionesL;
	public Lista_publicaciones_Comercial_item _lista_publicaciones__Comercial_;
	public Ver_me_gustas_publicacion_Comercial _ver_me_gustas_publicacion__Comercial_;
	public Ver_comentarios_Comercial _ver_comentarios__Comercial_;
	public Lista_Top_comentarios_Publicacion_comercial _lista_Top_comentarios__Publicacion_comercial_;
	Publicacion publicacion; Usuario_comercial ucInterfaz; UsuarioComercial uc;
	
	
//	public Ver_publicacion_propia_Comercial(Publicacion publicacion, Usuario_comercial ucInterfaz, UsuarioComercial uc) {
//		this.publicacion = publicacion;
//		
//	}
//	

	public void Ver_me_gustas_publicacion__Comercial_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_comentarios__Comercial_() {
		throw new UnsupportedOperationException();
	}

	public void lista_Top_comentarios__Publicacion_comercial_() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar() {
		throw new UnsupportedOperationException();
	}

	public void Visualizaciones() {
		throw new UnsupportedOperationException();
	}
}