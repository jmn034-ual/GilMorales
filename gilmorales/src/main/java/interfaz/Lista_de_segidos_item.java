package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaDeSeguidosItem;

public class Lista_de_segidos_item extends VistaListaDeSeguidosItem{
	private Button _dejar_de_seguirB;
	private Button _verPerfilB;
	private IronIcon _usuarioIcono;
	public Lista_de_segidos _lista_de_segidos;
	public Ver_Perfil__2 _ver_perfil;
	UsuarioRegistrado u;

	public Lista_de_segidos_item(UsuarioRegistrado u, Lista_de_segidos lista_de_seguidos) {
		this._lista_de_segidos = lista_de_seguidos;
		this.u = u;
		this.getNombreUsuario().setText(this.u.getNombreUsuario());
		this.getVaadinAvatar().setImage(this.u.getFoto());

	}

	public void Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}