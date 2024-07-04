package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerDenuncias;

public class Ver_denuncias extends VistaVerDenuncias {

	public Gestionar_denuncias _gestionar_denuncias;
	public Lista_denuncias _lista_denuncias;
		
	public Ver_denuncias(Gestionar_denuncias interfaz) {
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "100%");
		this._gestionar_denuncias = interfaz;
		Lista_denuncias();
		
	}

	public void Lista_denuncias() {
		this._lista_denuncias = new Lista_denuncias(this);
		this.getLayoutListaDenuncias().as(VerticalLayout.class).add(_lista_denuncias);
		this._lista_denuncias._filtrar_denuncias.select.addValueChangeListener(event ->{
			if(this._lista_denuncias._filtrar_denuncias.select.getValue() == "Todas") {
				this.getVaadinHorizontalLayout4().removeAll();
				this._lista_denuncias = new Lista_denuncias(this);
				this.getLayoutListaDenuncias().as(VerticalLayout.class).removeAll();
				this.getLayoutListaDenuncias().as(VerticalLayout.class).add(_lista_denuncias);
			}
		});
	}
}