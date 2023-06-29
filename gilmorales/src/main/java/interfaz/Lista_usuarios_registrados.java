package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaUsuariosRegistrados;

public class Lista_usuarios_registrados extends VistaListaUsuariosRegistrados{
//	private ComboBox _ordenarCB;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	public Vector<Lista_usuarios_registrados_item> _item = new Vector<Lista_usuarios_registrados_item>();
	iAdministrador bd = new BDPrincipal();
	Lista_usuarios_registrados_item usuario;
	Administrador adminInterfaz;
	
	public Lista_usuarios_registrados() {
		cargarListaUsuarios();
	}

	public Lista_usuarios_registrados(Administrador adminInterfaz) {
		this.adminInterfaz = adminInterfaz;
		cargarListaUsuariosAdministrador();
	}
	
	public void cargarListaUsuarios() {
		List<UsuarioRegistrado> lista = bd.cargarListaUsuariosRegistrados();

		this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(UsuarioRegistrado user : lista) {
			this.usuario = new Lista_usuarios_registrados_item(user);
			this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).add(this.usuario);
			_item.add(this.usuario);

		}
	}

	public void cargarListaUsuariosAdministrador() {
		List<UsuarioRegistrado> lista = bd.cargarListaUsuariosRegistrados();

		this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(UsuarioRegistrado user : lista) {
			this.usuario = new Lista_usuarios_registrados_item(user, this.adminInterfaz);
			this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).add(this.usuario);
			_item.add(this.usuario);

		}
	}	
	public void Ordenar() {
		
	}
}