package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesUsuarioPublico;

public class publicaciones_usuario_publico extends VistaPublicacionesUsuarioPublico{
	public Ver_perfil_publico _ver_perfil_publico;
	public Vector<publicaciones_usuario_publico_item> _item = new Vector<publicaciones_usuario_publico_item>();
	publicaciones_usuario_publico_item publicacion;
	UsuarioRegistrado user;
	
	public publicaciones_usuario_publico(UsuarioRegistrado user) {
		this.user = user;
		cargarPublicacionesUsuario();
	}
	
	public void cargarPublicacionesUsuario() {
		List<Publicacion> lista = new ArrayList<Publicacion>(this.user.publica.getCollection());
		
		for(Publicacion p : lista) {
			this.publicacion = new publicaciones_usuario_publico_item(p);
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.publicacion);
			_item.add(this.publicacion);
		}
	}
}