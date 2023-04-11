package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTopUsuarios;

public class top_usuarios extends VistaTopUsuarios{
	public Cabecera_TOP _cabecera_TOP;
	public Vector<top_usuarios_item> _item = new Vector<top_usuarios_item>();
	
	public void anadirUsuarios(top_usuarios_item tui) {
		this.getLayoutTopUsuarios().as(VerticalLayout.class).add(tui);
	}
}