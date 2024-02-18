package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

public class Resultado_usuarios extends Lista_resultado {
	Resultado_usuarios_item item;
	public Resultado_usuarios(String buscar, String filtro) {
		super(buscar, filtro, _realizar_busqueda);
		cargarUsuariosBusqueda(buscar, filtro);
	}
	public Buscar_Usuario _buscar_Usuario;
	public Vector<Resultado_usuarios_item> _item = new Vector<Resultado_usuarios_item>();
	
	public void cargarUsuariosBusqueda(String buscar, String filtro) {
			List<UsuarioRegistrado> resultado = bd.realizarBusqueda(buscar, filtro);
			this.getLayoutResultadoBusqueda().as(VerticalLayout.class).removeAll();
			_item.clear();
			
			for (int i = 0; i < resultado.size(); i++) {
				item = new Resultado_usuarios_item(resultado.get(i));
				this.getLayoutResultadoBusqueda().as(VerticalLayout.class).add(item);
				_item.add(item);
			}
	
	}
}