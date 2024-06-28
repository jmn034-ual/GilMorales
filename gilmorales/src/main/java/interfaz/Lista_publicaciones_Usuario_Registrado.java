package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Lista_publicaciones_Usuario_Registrado extends Lista_Publicaciones_Usuario_no_registrado {
	public Usuario_Registrado urInterfaz;
	public Vector<Lista_publicaciones_Usuario_Registrado_item> _item = new Vector<Lista_publicaciones_Usuario_Registrado_item>();
	Lista_publicaciones_Usuario_Registrado_item publicacion;
	private BDPrincipal bd = new BDPrincipal();
	Select<String> select;

	public Lista_publicaciones_Usuario_Registrado(Usuario_Registrado urInterfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.urInterfaz = urInterfaz;
		select = new Select<>();
		select.setItems("Todas", "Seguidos");
		select.setValue("Todas");
		this.getSelect().add(select);
		this.select.addValueChangeListener(event -> {
			if (this.select.getValue() == "Todas") {
				cargarTodasLasPublciaciones();
			}else
				cargarPublicacionesUR();
		});
		cargarTodasLasPublciaciones();
		
		

	}

	public void cargarTodasLasPublciaciones() {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		List<Publicacion> publicaciones = this.bd.cargarAllPubliaciones();

		for (Publicacion pub : publicaciones) {
			this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this);
			this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
			_item.add(this.publicacion);
		}
	}

	// A este metodo tengo que darle una vuelta
	public void cargarPublicacionesUR() {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		List<UsuarioRegistrado> usuarios = new ArrayList<UsuarioRegistrado>(this.urInterfaz.ur.seguir.getCollection());

		for (UsuarioRegistrado user : usuarios) {
			List<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
			for (Publicacion pub : publicaciones) {
//				if(pub.getPerteneceA() != null && pub.getEsPublicada() == null && this.ur.ur.seguir.getCollection().contains(pub.getPerteneceA())) {
				if (this.urInterfaz.ur.seguir.getCollection().contains(pub.getPerteneceA())) {

					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this);
				} else if (pub.getEsPublicada() != null) {
					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this);
				}
				if (this.publicacion != null) {
					this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
					_item.add(this.publicacion);
				}
			}
		}
	}
}