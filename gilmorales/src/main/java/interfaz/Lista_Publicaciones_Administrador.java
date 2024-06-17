package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import vistas.VistaListaPublicacionesAdministrador;

public class Lista_Publicaciones_Administrador extends VistaListaPublicacionesAdministrador{
	public Administrador _administrador;
	public Vector<Lista_Publicaciones_Administrador_item> _item = new Vector<Lista_Publicaciones_Administrador_item>();
	iAdministrador bd = new BDPrincipal();
	Lista_Publicaciones_Administrador_item publicacion;
	
	public Lista_Publicaciones_Administrador(Administrador adminInterfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._administrador = adminInterfaz;
		cargarPublicaciones();
	};
	
	public void cargarPublicaciones() {
		List<Publicacion> lista = new ArrayList<Publicacion>(bd.cargarPublicacionesUsuarios());
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(Publicacion p : lista) {
				this.publicacion = new Lista_Publicaciones_Administrador_item(p, this);
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.publicacion);
				_item.add(this.publicacion);
			
		}
	}
}