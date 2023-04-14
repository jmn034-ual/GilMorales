package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListasDenunciasAdministrador;

public class Lista_denuncias extends VistaListasDenunciasAdministrador {
	private ComboBox _filtrarCB;
	public Ver_denuncias _ver_denuncias;
	public Vector<Lista_denuncias_item> _item = new Vector<Lista_denuncias_item>();
	public Filtrar_denuncias _filtrar_denuncias;

	public Lista_denuncias() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void Filtrar() {
		
	}
	
	public void anadirDenuncia(Lista_denuncias_item denuncia) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(denuncia);;
		_item.add(denuncia);
	}
}