package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Denuncia;

public class Lista_denuncias_finalizadas extends Lista_denuncias {
	public Ver_denuncias_finalizadas _ver_denuncias_finalizadas;
	public Vector<Lista_denuncias_finalizadas_item> _item = new Vector<Lista_denuncias_finalizadas_item>();
	String filtro = "finalizadas";

	public Lista_denuncias_finalizadas(Ver_denuncias_finalizadas interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_denuncias_finalizadas = interfaz;
		cargarDenunciasFinalizadas();
	}
	
	public void cargarDenunciasFinalizadas() {
		List<Denuncia> denuncias = this.bdAdmin.cargarDenuncias(filtro);
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		int tamanio = denuncias.size();

		for(int i = 0; i < denuncias.size(); i++) {
			if(tamanio >= 3) {					
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_denuncias_finalizadas_item(denuncias.get(i), this._ver_denuncias_finalizadas._filtrar_denuncias, this),
						new Lista_denuncias_finalizadas_item(denuncias.get(++i), this._ver_denuncias_finalizadas._filtrar_denuncias, this), new Lista_denuncias_finalizadas_item(denuncias.get(i+=1), this._ver_denuncias_finalizadas._filtrar_denuncias, this)));
				tamanio -= 3;
			}else if(tamanio == 2){
				HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_denuncias_finalizadas_item(denuncias.get(i), this._ver_denuncias_finalizadas._filtrar_denuncias, this),
						new Lista_denuncias_finalizadas_item(denuncias.get(++i), this._ver_denuncias_finalizadas._filtrar_denuncias, this));
				horizontal2.getStyle().set("width", "66.66%");

				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
			}else {
				HorizontalLayout horizontal = new HorizontalLayout(new Lista_denuncias_finalizadas_item(denuncias.get(i), this._ver_denuncias_finalizadas._filtrar_denuncias, this));
				horizontal.getStyle().set("width", "33%");
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
			}
		}

	}
}