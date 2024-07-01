package interfaz;

import com.vaadin.flow.component.dialog.Dialog;

import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Editar_perfil_Comercial extends Editar_perfil {

	public Usuario_comercial _usuario_comercial;
	UsuarioComercial comercial;
	
	public Editar_perfil_Comercial(UsuarioComercial comercial,	Dialog dialog, Usuario_comercial interfaz) {
		super();
//		this.comercial = this.bd.cargarUsuarioComercial(comercial.getID());
		this._usuario_comercial = interfaz;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.fotoURL = comercial.getFoto();
		this.dialog = dialog;
		this.nombreUsuario = comercial.getNombreUsuarioComercial();
		this.nombre = comercial.getNombreEmpresa();
		this.descripcion = comercial.getDescripcion();
		this.getTextFieldNombreUsuario().setPlaceholder(this.nombreUsuario);
		this.getTextFieldNombre().setPlaceholder(this.nombre);
		this.getFotoPerfil().setImage(comercial.getFoto());
		this.getTextAreaDescripcion().setPlaceholder(this.descripcion);
		Cancelar();
		Guardar(true, this);
	}
}