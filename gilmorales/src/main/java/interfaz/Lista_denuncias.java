package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Denuncia;
import vistas.VistaListasDenunciasAdministrador;

public class Lista_denuncias extends VistaListasDenunciasAdministrador {
	private ComboBox _filtrarCB;
	public Ver_denuncias _ver_denuncias;
	public Vector<Lista_denuncias_item> _item = new Vector<Lista_denuncias_item>();
	public Filtrar_denuncias _filtrar_denuncias;
	Lista_denuncias_item denuncia;
	BDPrincipal admin = new BDPrincipal();
	public Lista_denuncias() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void Filtrar() {
		
	}
	
	public void cargarDenuncias() {
		List<Denuncia> denuncias = null;
		try {
			denuncias = new ArrayList<Denuncia>(admin.denuncias.cargarDenuncias());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for (Denuncia d : denuncias) {
			denuncia = new Lista_denuncias_item(d);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(denuncia);
			_item.add(denuncia);
		}

	}
}