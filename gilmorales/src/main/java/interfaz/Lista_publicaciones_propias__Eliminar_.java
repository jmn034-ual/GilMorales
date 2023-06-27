package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaPublicacionesPropiasEliminar;

public class Lista_publicaciones_propias__Eliminar_ extends VistaListaPublicacionesPropiasEliminar{
	private ComboBox _seleccionar_todasCB;
	private Button _eliminar_seleccion;
	public Eliminar_publicaciones _eliminar_publicaciones;
	public Vector<Lista_publicaciones_propias__Eliminar__item> _item = new Vector<Lista_publicaciones_propias__Eliminar__item>();
		
	public void addPublicacion(Lista_publicaciones_propias__Eliminar__item publi) {
		this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).add(publi);
		_item.add(publi);
	}

	public void Seleccionar_todas() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_seleccion() {
		throw new UnsupportedOperationException();
	}
}