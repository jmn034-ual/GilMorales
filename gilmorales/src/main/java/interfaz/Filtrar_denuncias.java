package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaFiltrarDenuncias;

public class Filtrar_denuncias extends VistaFiltrarDenuncias{
	public Lista_denuncias _lista_denuncias;
	public Ver_denuncias_aplicadas _ver_denuncias_aplicadas;
	public Ver_denuncias_pendientes _ver_denuncias_pendientes;
	public Ver_denuncias_finalizadas _ver_denuncias_finalizadas;
	Select<String> select;

	
	public Filtrar_denuncias(Lista_denuncias interfaz) {
		this._lista_denuncias = interfaz;
		select = new Select<>();
		select.setItems("Todas", "Finalizadas", "Pendientes", "Aplicadas");
		select.setValue("Todas");
		this.getVaadinHorizontalLayout().add(select);
		this.select.addValueChangeListener(event -> {
			if(this.select.getValue() == "Todas") {
				this._lista_denuncias.cargarDenuncias();
			}else if(this.select.getValue() == "Finalizadas") {
				Ver_denuncias_finalizadas();
			}else if(this.select.getValue() == "Pendientes") {
				Ver_denuncias_pendientes();
			}else {
				Ver_denuncias_aplicadas();
			}
		});
	}
	
	

	public void Ver_denuncias_aplicadas() {
		this._ver_denuncias_aplicadas = new Ver_denuncias_aplicadas(this);
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._ver_denuncias_aplicadas);
	}

	public void Ver_denuncias_pendientes() {
		this._ver_denuncias_pendientes = new Ver_denuncias_pendientes(this);
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._ver_denuncias_pendientes);
		}

	public void Ver_denuncias_finalizadas() {
		this._ver_denuncias_finalizadas = new Ver_denuncias_finalizadas(this);
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._ver_denuncias_finalizadas);	}
}