package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioComercial;
import vistas.VistaUsuarioComercialPrincipal;
import basededatos.BDPrincipal;
//
import basededatos.iUsuario_comercial;

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
	public iUsuario_comercial _iUsuario_comercial = new BDPrincipal();
	public Eliminar_publicaciones_Comercial _eliminar_publicaciones__Comercial_;
	public Editar_perfil_Comercial _editar_perfil__Comercial_;
	public Cabecera_Usuario_Comercial _cabecera_Usuario_Comercial;
	public Lista_publicaciones_Comercial _lista_publicaciones__Comercial_;
	
	UsuarioComercial comercial;
	
	

	public Usuario_comercial(int UsuarioComercialID) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.comercial = _iUsuario_comercial.cargarUsuarioComercial(UsuarioComercialID);
		this.Cabecera_Usuario_Comercial();
		this.Lista_publicaciones__Comercial_();
		this.getVaadinAvatar().setImage(this.comercial.getFoto());
		this.getNombreDeEmpresa().setText(this.comercial.getNombreEmpresa());
		this.getNombreDeUsuario().setText(this.comercial.getNombreUsuarioComercial());
		this.getDescripcion().setText(this.comercial.getDescripcion());
		this.getNumeroL().setVisible(false);
		
	}
	
	public void Eliminar_publicaciones__Comercial_() {
		
	}

	public void Editar_perfil__Comercial_() {
		_editar_perfil__Comercial_ = new Editar_perfil_Comercial(comercial);
		this.getEditarPerffilB().addClickListener(event ->{
			this._editar_perfil__Comercial_.setVisible(true);
			this._editar_perfil__Comercial_.setVisible(false);
			this._editar_perfil__Comercial_.setVisible(false);
			this._editar_perfil__Comercial_.setVisible(false);
			Dialog dialog = new Dialog(_editar_perfil__Comercial_);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			this._editar_perfil__Comercial_.getBotonCancelar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Cabecera_Usuario_Comercial() {
		_cabecera_Usuario_Comercial = new Cabecera_Usuario_Comercial(this, this.comercial);
		this.getCabecera().add(_cabecera_Usuario_Comercial);
		this._cabecera_Usuario_Comercial.getInicio().setVisible(false);
	}

	public void Lista_publicaciones__Comercial_() {
		_lista_publicaciones__Comercial_ = new Lista_publicaciones_Comercial();;
		this.getListaVideos().as(VerticalLayout.class).add(_lista_publicaciones__Comercial_);
	}
}