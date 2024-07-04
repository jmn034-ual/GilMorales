package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Denuncia;
import vistas.VistaListasDenunciasAdministrador;

public class Lista_denuncias extends VistaListasDenunciasAdministrador {
	
	public Ver_denuncias _ver_denuncias;
	public Vector<Lista_denuncias_item> _item = new Vector<Lista_denuncias_item>();
	public Filtrar_denuncias _filtrar_denuncias;
	Lista_denuncias_item denuncia;
	BDPrincipal bdAdmin = new BDPrincipal();
	
	public Lista_denuncias() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	public Lista_denuncias(Ver_denuncias interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_denuncias = interfaz;
		Filtrar();
//		cargarDenuncias();
	}
	
	public void Filtrar() {
		this._filtrar_denuncias = new Filtrar_denuncias(this);
		this._ver_denuncias.getVaadinHorizontalLayout4().add(this._filtrar_denuncias);
		this._filtrar_denuncias.cargarDenuncias();
	}
	
//	public void cargarDenuncias() {
//		List<Denuncia> denuncias = bdAdmin.cargarDenuncias(this._filtrar_denuncias.select.getValue());
//	
//		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
//		_item.clear();
//		
//		int tamanio = denuncias.size();
//
//		for(int i = 0; i < denuncias.size(); i++) {
//			if(tamanio >= 3) {					
//				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this),
//						new Lista_denuncias_item(denuncias.get(++i), this), new Lista_denuncias_item(denuncias.get(i+=1), this)));
//				tamanio -= 3;
//			}else if(tamanio == 2){
//				HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this),
//						new Lista_denuncias_item(denuncias.get(++i), this));
//				horizontal2.getStyle().set("width", "66.66%");
//
//				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
//			}else {
//				HorizontalLayout horizontal = new HorizontalLayout(new Lista_denuncias_item(denuncias.get(i), this));
//				horizontal.getStyle().set("width", "33%");
//				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
//			}
//		}
//
//	}
}