package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;

import vistas.VistaListasDenunciasAdministrador;

public class Lista_denuncias extends VistaListasDenunciasAdministrador {
	private ComboBox _filtrarCB;
	public Ver_denuncias _ver_denuncias;
	public Vector<Lista_denuncias_item> _item = new Vector<Lista_denuncias_item>();
	public Filtrar_denuncias _filtrar_denuncias;

	public void Filtrar() {
		throw new UnsupportedOperationException();
	}
}