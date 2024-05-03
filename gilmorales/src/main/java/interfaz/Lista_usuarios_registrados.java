package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaUsuariosRegistrados;

public class Lista_usuarios_registrados extends VistaListaUsuariosRegistrados {
	// private ComboBox _ordenarCB;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	public Vector<Lista_usuarios_registrados_item> _item = new Vector<Lista_usuarios_registrados_item>();
	iAdministrador bd = new BDPrincipal();
	Lista_usuarios_registrados_item usuario;
//	Administrador adminInterfaz;
//	Usuario_No_Registrado unr;
//	Usuario_Registrado ur;

	public Lista_usuarios_registrados(Ver_lista_usuarios_registrados interfaz) {
		this._ver_lista_usuarios_registrados = interfaz;
		cargarListaUsuariosAdministrador();
	}

//	public Lista_usuarios_registrados(Usuario_Registrado ur) {
//		this.ur = ur;
//		cargarListaUsuariosAdministrador();
//	}
//
//	public Lista_usuarios_registrados(Administrador adminInterfaz) {
//		this.adminInterfaz = adminInterfaz;
//		cargarListaUsuariosAdministrador();
//	}

//	public void cargarListaUsuarios() {
//		List<UsuarioRegistrado> lista = bd.cargarListaUsuariosRegistrados();
//
//		this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).removeAll();
//		_item.clear();
//		if (lista != null) {
//			for (UsuarioRegistrado user : lista) {
//				this.usuario = new Lista_usuarios_registrados_item(user);
//				this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).add(this.usuario);
//				_item.add(this.usuario);
//
//			}
//		}
//
//	}

	public void cargarListaUsuariosAdministrador() {
		List<UsuarioRegistrado> lista = bd.cargarListaUsuariosRegistrados();

		this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).removeAll();
		_item.clear();
		int tamanio = lista.size();
		for (int i = 0; i < lista.size(); i++) {
			if (tamanio >= 3) {
				this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class)
						.add(new HorizontalLayout(new Lista_usuarios_registrados_item(lista.get(i), this),
								new Lista_usuarios_registrados_item(lista.get(++i), this),
								new Lista_usuarios_registrados_item(lista.get(i += 1), this)));
				tamanio -= 3;
			} else if (tamanio == 2) {
				HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_usuarios_registrados_item(lista.get(i), this),
						new Lista_usuarios_registrados_item(lista.get(++i), this));
				horizontal2.getStyle().set("width", "66.66%");
				this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class)
						.add(horizontal2);
			} else {
				HorizontalLayout horizontal1 = new HorizontalLayout(new Lista_usuarios_registrados_item(lista.get(i), this));
				horizontal1.getStyle().set("width", "33%");

				this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class)
						.add(horizontal1);
			}
		}

	}

	public void Ordenar() {

	}
}