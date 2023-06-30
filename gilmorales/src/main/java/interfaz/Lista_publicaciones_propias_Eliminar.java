package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaPublicacionesPropiasEliminar;

public class Lista_publicaciones_propias_Eliminar extends VistaListaPublicacionesPropiasEliminar{
	private ComboBox _seleccionar_todasCB;
	private Button _eliminar_seleccion;
	public Eliminar_publicaciones _eliminar_publicaciones;
	public Vector<Lista_publicaciones_propias_Eliminar_item> _item = new Vector<Lista_publicaciones_propias_Eliminar_item>();
	Lista_publicaciones_propias_Eliminar_item publicacion;
	UsuarioRegistrado user;
	iUsuario_Registrado bd = new BDPrincipal();
	public Lista_publicaciones_propias_Eliminar(UsuarioRegistrado ur) {
		this.user = ur;
		cargarPublicacionesPropias();
	}

	public void cargarPublicacionesPropias() {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());

		this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).removeAll();
		this._item.clear();

		for(Publicacion p : publicaciones) {
			this.publicacion = new Lista_publicaciones_propias_Eliminar_item(p);
			this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).add(this.publicacion);
			this._item.add(publicacion);
		}

	}

	public void Seleccionar_todas(boolean seleccionar) {
		if(seleccionar) {
			for(Lista_publicaciones_propias_Eliminar_item pub : this._item) {
				pub.getCheckboxEliminar().setValue(true);
			}
		}else {
			for(Lista_publicaciones_propias_Eliminar_item pub : this._item) {
				pub.getCheckboxEliminar().setValue(false);
			}
		}
	}

	public void Eliminar_seleccion() {
		List<Publicacion> publicacionesSeleccionadas = new ArrayList<Publicacion>();
		for(Lista_publicaciones_propias_Eliminar_item pub : this._item) {
			if(pub.getCheckboxEliminar().getValue()) {
				publicacionesSeleccionadas.add(pub.Seleccionar_publicacion());
				this.getLayoutPublicacionesEliminar().as(VerticalLayout.class).remove(pub);
			}
		}
		this.bd.eliminarSeleccion(publicacionesSeleccionadas);
	}
}