package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaPublicacionesUsuarioNoRegistrado;

public class Lista_Publicaciones__Usuario_no_registrado_ extends VistaListaPublicacionesUsuarioNoRegistrado{
	public Usuario_No_Registrado unr;
	public Vector<Lista_Publicaciones__Usuario_no_registrado__item> _item = new Vector<Lista_Publicaciones__Usuario_no_registrado__item>();
	private Lista_Publicaciones__Usuario_no_registrado__item publicacion;
	private iUsuario_No_Registrado bd = new BDPrincipal();
	
	public Lista_Publicaciones__Usuario_no_registrado_(){
	}
	public Lista_Publicaciones__Usuario_no_registrado_(Usuario_No_Registrado unr){
		this.unr = unr;
		cargarPublicacionesUNR();
	}
	
	public void cargarPublicacionesUNR() {
//		List<UsuarioRegistrado> lista = bd.cargarUsuariosUNR();
		
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();

//		for(UsuarioRegistrado user : lista) {
//			List<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
//			for(Publicacion pub : publicaciones) {
//				this.publicacion = new Lista_Publicaciones__Usuario_no_registrado__item(pub, unr);
//				this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
//				_item.add(this.publicacion);
//			}
//		}
		List<Publicacion> publicaciones;
		try {
			publicaciones = PublicacionDAO.queryPublicacion(null, null);
			for(Publicacion pub : publicaciones) {
//				if(pub.getPerteneceA() != null && pub.getEsPublicada() == null) {
					this.publicacion = new Lista_Publicaciones__Usuario_no_registrado__item(pub, unr);	
//				}else {
//					this.publicacion = new Lista_Publicaciones__Usuario_no_registrado__item(pub, unr);	
//				}
				this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
				_item.add(this.publicacion);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
