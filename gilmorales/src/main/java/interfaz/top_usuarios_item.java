package interfaz;

import vistas.VistaTopUsuariosItem;

public class top_usuarios_item extends VistaTopUsuariosItem{
//	private button _verPerfilB;
	public top_usuarios _top_usuarios;
	public Ver_Perfil__2 _ver_perfil;

	public top_usuarios_item(String nombreUsuario) {
		this.getNombreUsuario().setText(nombreUsuario);
	}
	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}