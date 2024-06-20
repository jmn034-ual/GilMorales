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
	
	public Top_usuarios(Cabecera_TOP interfaz) {
		this._cabecera_TOP = (Cabecera_TOP) interfaz;			
		cargarUsuariosTOP();
	}

	
	public void cargarUsuariosTOP() {
		List<UsuarioRegistrado> top = bd.cargarListaUsuariosTOP();
		this.getLayoutTopUsuarios().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for (UsuarioRegistrado u : top) {
			if(this._cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
				tui = new Top_usuarios_item(u, this);
			}else {
				UsuarioRegistrado ur = bd.cargarUsuarioRegistrado(u.getID());
				tui = new Top_usuarios_item(ur, this);
			}
			this.getLayoutTopUsuarios().as(VerticalLayout.class).add(tui);
			_item.add(tui);
		}
	}
}