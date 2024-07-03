package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaPublicacionesPropiasEliminar;

public class Lista_publicaciones_propias_Eliminar extends VistaListaPublicacionesPropiasEliminar {
	private ComboBox _seleccionar_todasCB;
	private Button _eliminar_seleccion;
	public Eliminar_publicaciones _eliminar_publicaciones;
	public Vector<Lista_publicaciones_propias_Eliminar_item> _item = new Vector<Lista_publicaciones_propias_Eliminar_item>();
	Lista_publicaciones_propias_Eliminar_item publicacion;
	UsuarioRegistrado user;
	UsuarioComercial comercial;
	iUsuario_Registrado bd = new BDPrincipal();

	public Lista_publicaciones_propias_Eliminar(Object ur, Eliminar_publicaciones interfaz) {
		this.getStyle().set("width", "80%");

		this._eliminar_publicaciones = interfaz;
		if (ur instanceof UsuarioRegistrado) {
			this.user = (UsuarioRegistrado) ur;
			cargarPublicacionesPropias();
		} else {
			this.comercial = (UsuarioComercial) ur;
			cargarPublicacionesPropias();
		}
	}

	public void cargarPublicacionesPropias() {
		List<Publicacion> publicaciones = null;
		if (this.comercial != null) {
			publicaciones = new ArrayList<Publicacion>(this.comercial.publica.getCollection());
		} else {
			publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());
		}
		this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).removeAll();
		this._item.clear();		
		if(publicaciones != null) {
			Lista_publicaciones_propias_Eliminar_item item1;
			Lista_publicaciones_propias_Eliminar_item item2;
			Lista_publicaciones_propias_Eliminar_item item3;
			int tamanio = publicaciones.size();
			for(int i = 0; i < publicaciones.size(); i++) {
				if(tamanio >= 3) {			
					item1 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(i), this);
					item2 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(++i), this);
					item3 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(i+=1), this);
					this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).add(new HorizontalLayout(item1, item2,item3));
					this._item.add(item1);
					this._item.add(item2);
					this._item.add(item3);

					tamanio -= 3;
				}else if(tamanio == 2){
					item1 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(i), this);
					item2 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(++i), this);
					HorizontalLayout horizontal2 = new HorizontalLayout(item1, item2);
					this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).add(horizontal2);
					this._item.add(item1);
					this._item.add(item2);
				}else {
					item1 = new Lista_publicaciones_propias_Eliminar_item(publicaciones.get(i), this);
					HorizontalLayout horizontal = new HorizontalLayout(item1);
					this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).add(horizontal);
					this._item.add(item1);
				}
			}
		}
	}

	public void Seleccionar_todas(boolean seleccionar) {
		if (seleccionar) {
			for (Lista_publicaciones_propias_Eliminar_item pub : this._item) {
				pub.getCheckboxEliminar().setValue(true);
			}
		} else {
			for (Lista_publicaciones_propias_Eliminar_item pub : this._item) {
				pub.getCheckboxEliminar().setValue(false);
			}
		}
	}

	public void Eliminar_seleccion() {
		List<Publicacion> publicacionesSeleccionadas = new ArrayList<Publicacion>();
		for (Lista_publicaciones_propias_Eliminar_item pub : this._item) {
			if (pub.getCheckboxEliminar().getValue()) {
				publicacionesSeleccionadas.add(pub.Seleccionar_publicacion());
				this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).remove(pub);
			}
		}
		this.bd.eliminarSeleccion(publicacionesSeleccionadas);
	}
}