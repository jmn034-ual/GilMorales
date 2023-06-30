package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuarios;

public class Top_usuarios extends VistaTopUsuarios{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<Top_usuarios_item> _item = new Vector<Top_usuarios_item>();
	iUsuario_Registrado bd = new BDPrincipal();
	Top_usuarios_item tui;
	Usuario_Registrado user;
	Usuario_No_Registrado unr;
	public Top_usuarios(Usuario_No_Registrado unr) {
		this.unr = unr;
		cargarUsuariosTOP();
	}
	public Top_usuarios(Usuario_Registrado ur) {
		this.user = ur;
		cargarUsuariosTOP();
	}
	
	public void cargarUsuariosTOP() {
		List<UsuarioRegistrado> top = bd.cargarListaUsuariosTOP();
		this.getLayoutTopUsuarios().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for (UsuarioRegistrado u : top) {
			if(unr != null) {
			tui = new Top_usuarios_item(u, this.unr);
			}else {
				tui = new Top_usuarios_item(u, this.user);
			}
			this.getLayoutTopUsuarios().as(VerticalLayout.class).add(tui);
			_item.add(tui);
		}
		if(top.isEmpty()) {
			System.out.println("Esta vacio.");
		}
	}
}