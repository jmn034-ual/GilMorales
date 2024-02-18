package interfaz;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

public class Resultado_usuarios_item extends Lista_resultado_item {
public Resultado_usuarios_item(Object o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
	//	private button _verPerfilB;
//	private ImageIcon _usuarioIcono;
	public Resultado_usuarios _resultado_usuarios;
	public Ver_Perfil__2 _ver_perfil;
	
//	public Resultado_usuarios_item(UsuarioRegistrado user) {
//		this.getBotonNombreUsuario().setText(user.getNombreUsuario());
//		this.getLayoutFotoPerfil().as(VerticalLayout.class).add(new Avatar(user.getNombreUsuario(), user.getFoto()));
//	}
}