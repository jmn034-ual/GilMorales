package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Denuncia;

public class Lista_denuncias_aplicadas extends Lista_denuncias {
	
	public Ver_denuncias_aplicadas _ver_denuncias_aplicadas;
	public Vector<Lista_denuncias_aplicadas_item> _item = new Vector<Lista_denuncias_aplicadas_item>();
	String filtro = "aplicadas";
	
	public Lista_denuncias_aplicadas(Ver_denuncias_aplicadas interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_denuncias_aplicadas = interfaz;
		cargarDenunciasAplicadas();
	}
	
	public void cargarDenunciasAplicadas() {
		List<Denuncia> denuncias = bdAdmin.cargarDenuncias(filtro);
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		int tamanio = denuncias.size();

		for(int i = 0; i < denuncias.size(); i++) {
			if(tamanio >= 3) {					
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_denuncias_aplicadas_item(denuncias.get(i), this),
						new Lista_denuncias_aplicadas_item(denuncias.get(++i), this), new Lista_denuncias_aplicadas_item(denuncias.get(i+=1), this)));
				tamanio -= 3;
			}else if(tamanio == 2){
				HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_denuncias_aplicadas_item(denuncias.get(i), this),
						new Lista_denuncias_aplicadas_item(denuncias.get(++i), this));
				horizontal2.getStyle().set("width", "66.66%");

				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
			}else {
				HorizontalLayout horizontal = new HorizontalLayout(new Lista_denuncias_aplicadas_item(denuncias.get(i), this));
				horizontal.getStyle().set("width", "33%");
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
			}
		}

	}
}