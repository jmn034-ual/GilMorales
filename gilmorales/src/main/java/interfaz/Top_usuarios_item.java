package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuariosItem;

public class Top_usuarios_item extends VistaTopUsuariosItem{
//	private button _verPerfilB;
	public Top_usuarios _top_usuarios;
	public Ver_perfil_publico ver_perfil;
	Usuario_No_Registrado unrInterfaz;
	Usuario_Registrado userInterfaz;
	UsuarioRegistrado usuario;
	
	public Top_usuarios_item(UsuarioRegistrado usuario, Top_usuarios interfaz){
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
		this.usuario = usuario;
		this._top_usuarios = interfaz;

		if(this._top_usuarios._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
			this.unrInterfaz = this._top_usuarios._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
			Ver_perfilUNR();
		}else {
			this.userInterfaz = this._top_usuarios._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz;
			Ver_perfilUR();
		}	
	}
	public void Ver_perfilUR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario, this, this._top_usuarios._cabecera_TOP);
		this.getNombreUsuario().addClickListener(event ->{
			userInterfaz.getCabeceraTop().setVisible(false);
			userInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
			userInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(ver_perfil);
			});
	}
	public void Ver_perfilUNR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario, this, this._top_usuarios._cabecera_TOP);
		this.getNombreUsuario().addClickListener(event ->{
//			unrInterfaz.getLayoutCabeceraTop().setVisible(false);
			unrInterfaz.getVaadinHorizontalLayout().removeAll();
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
}