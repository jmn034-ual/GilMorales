package interfaz;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;

public class Lista_publicaciones__Usuario_Registrado_ extends Lista_Publicaciones__Usuario_no_registrado_ {
//	public Usuario_Registrado _usuario_Registrado;
	public Vector<Lista_publicaciones__Usuario_Registrado__item> _item = new Vector<Lista_publicaciones__Usuario_Registrado__item>();
	Lista_publicaciones__Usuario_Registrado__item publicacion;
	private iUsuario_Registrado	bd = new BDPrincipal();
	Usuario_Registrado urInterfaz;
	UsuarioRegistrado ur;
	
	public Lista_publicaciones__Usuario_Registrado_(Usuario_Registrado urInterfaz, UsuarioRegistrado ur) {
		this.urInterfaz = urInterfaz;
		this.ur = ur;
		cargarPublicacionesUR();
	}

	public void cargarPublicacionesUR() {
		this.getLayoutPublicacionesUNR().as(VerticalLayout.class).removeAll();
		_item.clear();
		List<Publicacion> publicaciones;
		try {
			publicaciones = PublicacionDAO.queryPublicacion(null, null);
			for(Publicacion pub : publicaciones) {
//				if(pub.getPerteneceA() != null && pub.getEsPublicada() == null && this.ur.ur.seguir.getCollection().contains(pub.getPerteneceA())) {
				if(this.ur.seguir.getCollection().contains(pub.getPerteneceA())) {

					this.publicacion = new Lista_publicaciones__Usuario_Registrado__item(pub, this.urInterfaz);	
				}else if(pub.getEsPublicada() != null){
					this.publicacion = new Lista_publicaciones__Usuario_Registrado__item(pub, this.urInterfaz);	
				}
				if(this.publicacion != null) {
					this.getLayoutPublicacionesUNR().as(VerticalLayout.class).add(this.publicacion);
					_item.add(this.publicacion);
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}