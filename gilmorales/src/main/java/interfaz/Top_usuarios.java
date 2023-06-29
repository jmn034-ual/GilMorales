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
	iUsuario_Registrado bd;
	Top_usuarios_item tui;
	
	public Top_usuarios() {
		bd = new BDPrincipal();
		cargarUsuariosTOP();
	}
	
	public void cargarUsuariosTOP() {
		List<UsuarioRegistrado> top = bd.cargarListaUsuariosTOP();
		this.getLayoutTopUsuarios().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for (UsuarioRegistrado u : top) {
			tui = new Top_usuarios_item(u);
			this.getLayoutTopUsuarios().as(VerticalLayout.class).add(tui);
			_item.add(tui);
		}
		if(top.isEmpty()) {
			System.out.println("Esta vacio.");
		}
	}
}