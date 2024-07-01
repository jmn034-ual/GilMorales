package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenunciasFiltradas;

public class Ver_denuncias_pendientes extends VistaVerDenunciasFiltradas {
	public Filtrar_denuncias _filtrar_denuncias;
	public Lista_denuncias_pendientes _lista_denuncias_pendientes;
	
	public Ver_denuncias_pendientes(Filtrar_denuncias filtrar_denuncias) {
		this._filtrar_denuncias = filtrar_denuncias;
		Lista_denuncias_pendientes();
		
	}

	public void Lista_denuncias_pendientes() {
		this._lista_denuncias_pendientes = new Lista_denuncias_pendientes(this);	
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._lista_denuncias_pendientes);
	}
}