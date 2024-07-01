package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenunciasFiltradas;

public class Ver_denuncias_aplicadas extends VistaVerDenunciasFiltradas{
	public Filtrar_denuncias _filtrar_denuncias;
	public Lista_denuncias_aplicadas _lista_denuncias_aplicadas;

	public Ver_denuncias_aplicadas(Filtrar_denuncias filtrar_denuncias) {
		this._filtrar_denuncias = filtrar_denuncias;
		Lista_denuncias_aplicadas();
		
	}

	public void Lista_denuncias_aplicadas() {
	this._lista_denuncias_aplicadas = new Lista_denuncias_aplicadas(this);	
	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._lista_denuncias_aplicadas);
	}
}