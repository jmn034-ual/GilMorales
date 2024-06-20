package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaPublicacionesUsuarioNoRegistrado;

public class Lista_Publicaciones_Usuario_no_registrado extends VistaListaPublicacionesUsuarioNoRegistrado{
	public Usuario_No_Registrado unr;
	public Vector<Lista_Publicaciones_Usuario_no_registrado_item> _item = new Vector<Lista_Publicaciones_Usuario_no_registrado_item>();
	private Lista_Publicaciones_Usuario_no_registrado_item publicacion;
	private BDPrincipal bd = new BDPrincipal();

	public Lista_Publicaciones_Usuario_no_registrado(){
	}
	public Lista_Publicaciones_Usuario_no_registrado(Usuario_No_Registrado unr){
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.unr = unr;
		cargarPublicacionesUNR();
	}

	public void cargarPublicacionesUNR() {
	    List<UsuarioRegistrado> lista = bd.cargarUsuariosUNR();
	    List<Publicacion> publicacionesComerciales = this.bd.cargarPubliacionesComerciales();

	    this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
	    _item.clear();

	    if (lista != null) {
	        List<Publicacion> publicacionesUsuarios = new ArrayList<>();
	        for (UsuarioRegistrado u : lista) {
	            if (u.getPrivacidad() != 1) {
	                publicacionesUsuarios.addAll(u.publica.getCollection());
	            }
	        }

	        int i = 0, j = 0;
	        while (i < publicacionesUsuarios.size() || j < publicacionesComerciales.size()) {
	            if (i < publicacionesUsuarios.size()) {
	                Publicacion pub = publicacionesUsuarios.get(i++);
	                this.publicacion = new Lista_Publicaciones_Usuario_no_registrado_item(pub, this);  
	                this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
	                _item.add(this.publicacion);
	            }

	            if (j < publicacionesComerciales.size()) {
	                Publicacion pubComercial = publicacionesComerciales.get(j++);
	                this.publicacion = new Lista_Publicaciones_Usuario_no_registrado_item(pubComercial, this);  
	                this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
	                _item.add(this.publicacion);
	            }
	        }
	    }
	}

}
