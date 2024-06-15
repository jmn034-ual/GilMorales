package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Lista_publicaciones_Usuario_Registrado extends Lista_Publicaciones_Usuario_no_registrado {
	public Usuario_Registrado urInterfaz;
	public Vector<Lista_publicaciones_Usuario_Registrado_item> _item = new Vector<Lista_publicaciones_Usuario_Registrado_item>();
	Lista_publicaciones_Usuario_Registrado_item publicacion;
	private iUsuario_Registrado	bd = new BDPrincipal();
	
	public Lista_publicaciones_Usuario_Registrado(Usuario_Registrado urInterfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.urInterfaz = urInterfaz;
		cargarPublicacionesUR();
	}

	
	//A este metodo tengo que darle una vuelta
	public void cargarPublicacionesUR() {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		List<UsuarioRegistrado> usuarios = new ArrayList<UsuarioRegistrado>(this.urInterfaz.ur.seguir.getCollection());
		for(UsuarioRegistrado user : usuarios) {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
		for(Publicacion pub : publicaciones) {
//				if(pub.getPerteneceA() != null && pub.getEsPublicada() == null && this.ur.ur.seguir.getCollection().contains(pub.getPerteneceA())) {
				if(this.urInterfaz.ur.seguir.getCollection().contains(pub.getPerteneceA())) {

					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this);	
				}else if(pub.getEsPublicada() != null){
					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this);	
				}
				if(this.publicacion != null) {
					this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
					_item.add(this.publicacion);
				}
			}
		}
	}
}