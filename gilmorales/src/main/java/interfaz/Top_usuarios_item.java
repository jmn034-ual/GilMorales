package interfaz;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuariosItem;

public class Top_usuarios_item extends VistaTopUsuariosItem{
//	private button _verPerfilB;
	public Top_usuarios _top_usuarios;
	public Ver_perfil_publico ver_perfil;
	Usuario_No_Registrado unrInterfaz;
	UsuarioRegistrado usuario;
	Usuario_Registrado ur;

	public Top_usuarios_item(UsuarioRegistrado usuario, Usuario_No_Registrado unr) {
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
		this.unrInterfaz = unr;
		this.usuario = usuario;
		Ver_perfilUNR();
	}
	public Top_usuarios_item(UsuarioRegistrado usuario, Usuario_Registrado ur) {
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
		this.ur = ur;
		this.usuario = usuario;
		Ver_perfilUR();
	}
	public void Ver_perfilUR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario);
		this.getNombreUsuario().addClickListener(event ->{
			ur.getListaPublicaciones().setVisible(false);
			ur._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(false);
			ur.getVaadinHorizontalLayout().remove(ur.getVaadinHorizontalLayout().getComponentAt(0));
			ur.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
	public void Ver_perfilUNR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario);
		this.getNombreUsuario().addClickListener(event ->{
			unrInterfaz.getLayoutListaPublicaciones().setVisible(false);
			unrInterfaz.cabeceraUNR._cabecera_TOP.setVisible(false);
//			unrInterfaz.getVaadinHorizontalLayout().remove(unrInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
}