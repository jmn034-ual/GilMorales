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
//	public Usuario_Registrado _usuario_Registrado;
	public Vector<Lista_publicaciones_Usuario_Registrado_item> _item = new Vector<Lista_publicaciones_Usuario_Registrado_item>();
	Lista_publicaciones_Usuario_Registrado_item publicacion;
	private iUsuario_Registrado	bd = new BDPrincipal();
	Usuario_Registrado urInterfaz;
	UsuarioRegistrado ur;
	
	public Lista_publicaciones_Usuario_Registrado(Usuario_Registrado urInterfaz, UsuarioRegistrado ur) {
		this.urInterfaz = urInterfaz;
		this.ur = ur;
		cargarPublicacionesUR();
	}

	public void cargarPublicacionesUR() {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		List<UsuarioRegistrado> usuarios = new ArrayList<UsuarioRegistrado>(this.ur.seguir.getCollection());
		for(UsuarioRegistrado u : usuarios) {
		List<Publicacion> publicaciones = new ArrayList<Publicacion>(u.publica.getCollection());
		for(Publicacion pub : publicaciones) {
//				if(pub.getPerteneceA() != null && pub.getEsPublicada() == null && this.ur.ur.seguir.getCollection().contains(pub.getPerteneceA())) {
				if(this.ur.seguir.getCollection().contains(pub.getPerteneceA())) {

					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this.urInterfaz, this.ur);	
				}else if(pub.getEsPublicada() != null){
					this.publicacion = new Lista_publicaciones_Usuario_Registrado_item(pub, this.urInterfaz, this.ur);	
				}
				if(this.publicacion != null) {
					this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
					_item.add(this.publicacion);
				}
			}
		}
	}
}