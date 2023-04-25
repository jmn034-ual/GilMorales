package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaUsuariosRegistrados;

public class lista_usuarios_registrados extends VistaListaUsuariosRegistrados{
//	private ComboBox _ordenarCB;
	public Ver_lista_usuarios_registrados _ver_lista_usuarios_registrados;
	public Vector<lista_usuarios_registrados_item> _item = new Vector<lista_usuarios_registrados_item>();

	public void anadirUsuario(lista_usuarios_registrados_item uri) {
		this.getLayoutListaUsuariosRegistrados().as(VerticalLayout.class).add(uri);
	}
	public void Ordenar() {
		throw new UnsupportedOperationException();
	}
}