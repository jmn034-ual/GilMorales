package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaDeSeguidoresItem;

public class Lista_de_seguidores_item extends VistaListaDeSeguidoresItem{
	private Button _eliminar_seguidorB;
	private Button _verPerfilB;
	private IronIcon _usuarioIcono;
	public Lista_de_seguidores _lista_de_seguidores;
	public Ver_Perfil__2 _ver_perfil;
	UsuarioRegistrado user;
	
	public Lista_de_seguidores_item(UsuarioRegistrado u, Lista_de_seguidores interfaz) {
		this.user = u;
		this._lista_de_seguidores = interfaz;
		this.getNombreUsuario().setText(this.user.getNombreUsuario());
		this.getVaadinAvatar().setImage(this.user.getFoto());
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_seguidor() {
		throw new UnsupportedOperationException();
	}
}