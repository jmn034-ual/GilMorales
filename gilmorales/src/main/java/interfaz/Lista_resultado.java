package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;

import vistas.VistaListaResultado;

public class Lista_resultado extends VistaListaResultado{
	private Label _filtrarL;
	private ComboBox _filtrarCB;
	private Label _usuariosL;
	private Label _hashtagsL;
	public Realizar_busqueda _realizar_busqueda;
	public Vector<Lista_resultado_item> _item = new Vector<Lista_resultado_item>();
	public Filtrar_resultado _filtrar_resultado;

	public void Filtrar_resultado() {
		throw new UnsupportedOperationException();
	}
}