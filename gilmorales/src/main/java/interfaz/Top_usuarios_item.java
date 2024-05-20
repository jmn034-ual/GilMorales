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
	
	public Top_usuarios_item(UsuarioRegistrado usuario, Object user){
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
		this.usuario = usuario;

		if(user instanceof Usuario_No_Registrado) {
			this.unrInterfaz = (Usuario_No_Registrado) user;
			Ver_perfilUNR();
		}else {
			this.userInterfaz = (Usuario_Registrado) user;
			Ver_perfilUR();
		}	
	}
	public void Ver_perfilUR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario, this);
		this.getNombreUsuario().addClickListener(event ->{
			userInterfaz.getCabeceraTop().setVisible(false);
			userInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
			userInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(ver_perfil);
			});
	}
	public void Ver_perfilUNR() {
		this.ver_perfil = new Ver_perfil_publico(this.usuario, this);
		this.getNombreUsuario().addClickListener(event ->{
//			unrInterfaz.getLayoutCabeceraTop().setVisible(false);
			unrInterfaz.getVaadinHorizontalLayout().removeAll();
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
}