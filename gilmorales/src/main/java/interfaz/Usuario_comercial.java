package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarioComercialPrincipal;

//
//import basededatos.iUsuario_comercial;

public class Usuario_comercial extends VistaUsuarioComercialPrincipal {
//	private ImageIcon _fotoComercial;
//	private Label _nombreUsuarioL;
//	private Label _nombreEmpresaL;
//	private button _editarPerfilB;
//	private button _eliminarPublicacionesB;
//	private int _numeroMeGustas;
//	private Label _meGustasL;
//	private TextArea _descripcionTA;
//	private Label _tituloVideosL;
//	public iUsuario_comercial _iUsuario_comercial;
	public Eliminar_publicaciones__Comercial_ _eliminar_publicaciones__Comercial_;
	public Editar_perfil__Comercial_ _editar_perfil__Comercial_;
	public Cabecera_Usuario_Comercial _cabecera_Usuario_Comercial = new Cabecera_Usuario_Comercial();
	public Lista_publicaciones__Comercial_ _lista_publicaciones__Comercial_ = new Lista_publicaciones__Comercial_();
	
	
	
	

	public Usuario_comercial(String imagen, String usuario, String nombreEmpresa, String des, String mg) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Cabecera_Usuario_Comercial();
		this.Lista_publicaciones__Comercial_();
		this.getVaadinAvatar().setImage(imagen);
		this.getNombreDeEmpresa().setText(nombreEmpresa);
		this.getNombreDeUsuario().setText(usuario);
		this.getDescripcion().setText(des);
		this.getNumeroL().setText(mg);
	}
	
	public void Eliminar_publicaciones__Comercial_() {
		
	}

	public void Editar_perfil__Comercial_() {
		
	}

	public void Cabecera_Usuario_Comercial() {
		this.getCabecera().add(_cabecera_Usuario_Comercial);
		this._cabecera_Usuario_Comercial.getInicio().setVisible(false);
	}

	public void Lista_publicaciones__Comercial_() {
		this.getListaVideos().as(VerticalLayout.class).add(_lista_publicaciones__Comercial_);
	}
}