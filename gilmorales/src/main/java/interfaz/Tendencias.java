package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Comentario;
import bd_dcl.Hashtag;
import vistas.VistaListaTendencias;

public class Tendencias extends VistaListaTendencias{
	public Ver_tendencias _ver_tendencias;
	public Vector<Tendencias_item> _item = new Vector<Tendencias_item>();
	iUsuario_Registrado bd = new BDPrincipal();
	Tendencias_item tendencia;

	public Tendencias(Ver_tendencias interfaz) {
		this._ver_tendencias = interfaz;
		cargarTendencias();
	}

	public void cargarTendencias() {
		List<Hashtag> tendencias = bd.cargarTendencias();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (Hashtag h : tendencias) {
			tendencia = new Tendencias_item(h, this);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(tendencia);
			_item.add(tendencia);
		}	
	}
}