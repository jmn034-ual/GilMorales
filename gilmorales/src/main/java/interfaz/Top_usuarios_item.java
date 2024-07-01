package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuariosItem;

public class Top_usuarios_item extends VistaTopUsuariosItem{
//	private button _verPerfilB;
	public Top_usuarios _top_usuarios;
	public Ver_perfil_publico ver_perfil;
	public Ver_perfil_Administrador verPerfilAdmin;
	Usuario_No_Registrado unrInterfaz;
	Usuario_Registrado userInterfaz;
	UsuarioRegistrado usuario;
	Administrador admin;
	
	public Top_usuarios_item(UsuarioRegistrado usuario, Top_usuarios interfaz){
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
		this._top_usuarios = interfaz;
		this.usuario = usuario;
		if(this._top_usuarios._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
			this.unrInterfaz = this._top_usuarios._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
		}else if(this._top_usuarios._cabecera_TOP._cabecera_Usuario_Registrado != null){
			this.userInterfaz = this._top_usuarios._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
		}else {
			this.admin = this._top_usuarios._cabecera_TOP.cabeceraAdmin._administrador;
		}
		Ver_perfil();
	}
	public void Ver_perfil() {
		if(this.unrInterfaz != null) {
			this.ver_perfil = new Ver_perfil_publico(this.usuario, this, this._top_usuarios._cabecera_TOP);
		}else if(this.userInterfaz != null){
			this.ver_perfil = new Ver_perfil_publico(this.usuario, this, this._top_usuarios._cabecera_TOP);
		}else {
			this.verPerfilAdmin = new Ver_perfil_Administrador( this._top_usuarios._cabecera_TOP, this.usuario);
		}
		this.getNombreUsuario().addClickListener(event ->{
			if(this.unrInterfaz != null) {
				unrInterfaz.getVaadinHorizontalLayout().removeAll();
				unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			}else if(this.userInterfaz != null){
				this.userInterfaz.getVaadinHorizontalLayout().removeAll();
				this.userInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			}else {
				this.admin.getVaadinHorizontalLayout().removeAll();
				this.admin.getVaadinHorizontalLayout().add(verPerfilAdmin);
			}
			});
	}

}