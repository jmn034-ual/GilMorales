package interfaz;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuariosItem;

public class top_usuarios_item extends VistaTopUsuariosItem{
//	private button _verPerfilB;
	public top_usuarios _top_usuarios;
	public Ver_Perfil__2 _ver_perfil;

	public top_usuarios_item(UsuarioRegistrado usuario) {
		this.getNombreUsuario().setText(usuario.getNombreUsuario());
		this.getFotoPerfil1().setImage(usuario.getFoto());
	}
	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}