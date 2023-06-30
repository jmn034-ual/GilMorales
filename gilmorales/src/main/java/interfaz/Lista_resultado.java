package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaResultado;

public class Lista_resultado extends VistaListaResultado{
	private Label _filtrarL;
	private ComboBox _filtrarCB;
	private Label _usuariosL;
	private Label _hashtagsL;
	public Realizar_busqueda _realizar_busqueda;
	public Vector<Lista_resultado_item> _item = new Vector<Lista_resultado_item>();
	public Filtrar_resultado _filtrar_resultado;
	iUsuario_Registrado bd = new BDPrincipal();
	Lista_resultado_item item;

	public Lista_resultado(String buscar, String filtro) {
		
		cargarBusqueda(buscar, filtro);
	}
	
	public void cargarBusqueda(String buscar, String filtro){
			List resultado = bd.realizarBusqueda(buscar, filtro);
			this.getLayoutResultadoBusqueda().as(VerticalLayout.class).removeAll();
			_item.clear();
			
			for (int i = 0; i < resultado.size(); i++) {
				item = new Lista_resultado_item();
				this.getLayoutResultadoBusqueda().as(VerticalLayout.class).add(item);
				_item.add(item);
			}
	}
	public void Filtrar_resultado() {
		throw new UnsupportedOperationException();
	}
}