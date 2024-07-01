package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenunciasFiltradas;

public class Ver_denuncias_finalizadas extends VistaVerDenunciasFiltradas {
	public Filtrar_denuncias _filtrar_denuncias;
	public Lista_denuncias_finalizadas _lista_denuncias_finalizadas;
	
	public Ver_denuncias_finalizadas(Filtrar_denuncias filtrar_denuncias) {
		this._filtrar_denuncias = filtrar_denuncias;
		Lista_denuncias_finalizadas();
		
	}

	public void Lista_denuncias_finalizadas() {
		this._lista_denuncias_finalizadas = new Lista_denuncias_finalizadas(this);	
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._lista_denuncias_finalizadas);
	}
}