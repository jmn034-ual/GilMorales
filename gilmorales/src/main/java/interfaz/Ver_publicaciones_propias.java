package interfaz;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;
import vistas.VistaVerPublicacionesPropias;

public class Ver_publicaciones_propias extends VistaVerPublicacionesPropias{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_Publicaciones_propias _publicaciones_propias = new Lista_Publicaciones_propias();
	private UsuarioRegistrado ur;
	private ArrayList<Publicacion> publicaciones = null;
	Publicaciones_propias_item p;
	public Ver_publicaciones_propias(UsuarioRegistrado ur) {
		this.ur = ur;
		try {
			this.publicaciones = new ArrayList<Publicacion>(UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(ur.getID()).publica.getCollection());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Publicaciones_propias();
	}

	public void Publicaciones_propias() {
		for(int i = 0; i < publicaciones.size(); i++) {
			Publicaciones_propias_item p = new Publicaciones_propias_item((Publicacion) publicaciones.get(i));
			_publicaciones_propias.addPublicacionPropia(p);
		}
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_propias);
	}
}