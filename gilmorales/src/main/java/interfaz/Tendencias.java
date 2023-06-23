package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaTendencias;

public class Tendencias extends VistaListaTendencias{
	public Ver_tendencias _ver_tendencias;
	public Vector<Tendencias_item> _item = new Vector<Tendencias_item>();
	
	public void addTendencia(Tendencias_item ti) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(ti);
	}
}