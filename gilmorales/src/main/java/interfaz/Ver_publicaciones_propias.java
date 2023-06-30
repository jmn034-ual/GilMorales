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
	public Lista_Publicaciones_propias _publicaciones_propias;
	private UsuarioRegistrado ur;

	public Ver_publicaciones_propias(UsuarioRegistrado ur) {
		this.ur = ur;
		Publicaciones_propias();
	}

	public void Publicaciones_propias() {
		_publicaciones_propias = new Lista_Publicaciones_propias(ur);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_propias);
	}
	
}