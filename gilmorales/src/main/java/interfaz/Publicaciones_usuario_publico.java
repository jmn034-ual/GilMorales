package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesUsuarioPublico;

public class Publicaciones_usuario_publico extends VistaPublicacionesUsuarioPublico{
	public Ver_perfil_publico _ver_perfil_publico;
	public Vector<Publicaciones_usuario_publico_item> _item = new Vector<Publicaciones_usuario_publico_item>();
	Publicaciones_usuario_publico_item publicacion;
	UsuarioRegistrado user;
	
	public Publicaciones_usuario_publico(UsuarioRegistrado user) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.user = user;
		cargarPublicacionesUsuario();
	}
	
	public void cargarPublicacionesUsuario() {
		List<Publicacion> lista = new ArrayList<Publicacion>(this.user.publica.getCollection());
		
		if(lista != null) {
			int tamanio = lista.size();
			for(int i = 0; i < lista.size(); i++) {
				if(tamanio >= 3) {					
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Publicaciones_usuario_publico_item(lista.get(i)),
							new Publicaciones_usuario_publico_item(lista.get(++i)), new Publicaciones_usuario_publico_item(lista.get(i+=1))));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Publicaciones_usuario_publico_item(lista.get(i)),
							new Publicaciones_usuario_publico_item(lista.get(++i)));
					horizontal2.getStyle().set("width", "66.66%");

					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Publicaciones_usuario_publico_item(lista.get(i)));
					horizontal.getStyle().set("width", "33%");
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
		
	}
}