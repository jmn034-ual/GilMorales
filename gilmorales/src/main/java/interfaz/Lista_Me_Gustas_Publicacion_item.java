package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaMeGustasPublicacionItem;

public class Lista_Me_Gustas_Publicacion_item extends VistaListaMeGustasPublicacionItem{
	private Button _dejar_de_seguirB;
	private Button _seguirB;
	private Button _verPerfilB;
	private IronIcon _usuarioIcono;
	public Lista_Me_Gustas_Publicacion _lista_Me_Gustas_Publicacion;
	public Ver_Perfil__2 _ver_perfil;
	UsuarioRegistrado user;
	public Lista_Me_Gustas_Publicacion_item(UsuarioRegistrado user) {
		this.user = user;
	}

	public void Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}

	public void Seguir() {
		throw new UnsupportedOperationException();
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}