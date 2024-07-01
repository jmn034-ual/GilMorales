package interfaz;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaMeGustasPublicacionItem;

public class Lista_usuarios_item extends VistaListaMeGustasPublicacionItem {

	public Lista_usuarios _lista_usuarios;
	UsuarioRegistrado user;

	public Lista_usuarios_item(UsuarioRegistrado user, Lista_usuarios interfaz) {
		this.getStyle().set("width", "100%");
		this.user = user;
		this._lista_usuarios = interfaz;
		this.getBotonNombreUsuario().setText(user.getNombreUsuario());
		this.getBotonSeguir().setVisible(false);
		this.getVaadinAvatar().setImage(user.getFoto());
	}
}