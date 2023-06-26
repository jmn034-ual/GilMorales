package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaTopUsuarios;

public class top_usuarios extends VistaTopUsuarios{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<top_usuarios_item> _item = new Vector<top_usuarios_item>();
	iUsuario_Registrado bd;
	top_usuarios_item tui;
	
	public top_usuarios() {
		bd = new BDPrincipal();
		cargarUsuariosTOP();
	}
	
	public void cargarUsuariosTOP() {
		List<UsuarioRegistrado> top = bd.cargarListaUsuariosTOP();
		this.getLayoutTopUsuarios().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for (int i = 0; i < top.size(); i++) {
			tui = new top_usuarios_item(top.get(i));
			this.getLayoutTopUsuarios().as(VerticalLayout.class).add(tui);
			_item.add(tui);
		}
		if(top.isEmpty()) {
			System.out.println("Esta vacio.");
		}
	}
}