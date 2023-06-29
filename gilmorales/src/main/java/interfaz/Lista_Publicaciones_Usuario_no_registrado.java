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
	private iUsuario_No_Registrado bd = new BDPrincipal();

	public Lista_Publicaciones_Usuario_no_registrado(){
	}
	public Lista_Publicaciones_Usuario_no_registrado(Usuario_No_Registrado unr){
		this.unr = unr;
		cargarPublicacionesUNR();
	}

	public void cargarPublicacionesUNR() {
		List<UsuarioRegistrado> lista = bd.cargarUsuariosUNR();

		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		for( UsuarioRegistrado u : lista) {
			if(u.getPrivacidad() == 1){
				continue;
			}else {
				List<Publicacion> publicaciones = new ArrayList<Publicacion>(u.publica.getCollection());
				for(Publicacion pub : publicaciones) {
					this.publicacion = new Lista_Publicaciones_Usuario_no_registrado_item(pub, unr);	
					this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
					_item.add(this.publicacion);
				}		
			}
			
		}
	}
}
