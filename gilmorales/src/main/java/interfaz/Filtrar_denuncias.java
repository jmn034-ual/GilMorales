package interfaz;

import java.util.List;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import bd_dcl.Denuncia;
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
				cargarDenuncias();
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
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._ver_denuncias_finalizadas);
	}
	
	public void cargarDenuncias() {
		BDPrincipal bdAdmin = new BDPrincipal();

		List<Denuncia> denuncias = bdAdmin.cargarDenuncias("todas");
	
		this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_lista_denuncias._item.clear();
		
		int tamanio = denuncias.size();

		for(int i = 0; i < denuncias.size(); i++) {
			if(tamanio >= 3) {					
				this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this, this._lista_denuncias),
						new Lista_denuncias_item(denuncias.get(++i), this, this._lista_denuncias), new Lista_denuncias_item(denuncias.get(i+=1), this, this._lista_denuncias)));
				tamanio -= 3;
			}else if(tamanio == 2){
				HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this, this._lista_denuncias),
						new Lista_denuncias_item(denuncias.get(++i), this, this._lista_denuncias));
				horizontal2.getStyle().set("width", "66.66%");

				this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
			}else {
				HorizontalLayout horizontal = new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this, this._lista_denuncias));
				horizontal.getStyle().set("width", "33%");
				this._lista_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
			}
		}

	}
}