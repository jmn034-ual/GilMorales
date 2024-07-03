package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaPublicacionesUsuarioNoRegistrado;
import vistas.VistaPublicacionesUsuarioPublico;

public class Lista_publicaciones_usuario extends VistaPublicacionesUsuarioPublico{
	public Ver_perfil_Administrador _ver_perfil__Administrador_;
	public Vector<Lista_publicaciones_usuario_item> _item = new Vector<Lista_publicaciones_usuario_item>();
	UsuarioRegistrado user;
	UsuarioComercial comercial;
	
	public Lista_publicaciones_usuario(Object user, Ver_perfil_Administrador interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this._ver_perfil__Administrador_ = interfaz;
		if(user instanceof UsuarioRegistrado) 
			this.user = (UsuarioRegistrado) user;
		else
			this.comercial = (UsuarioComercial) user;
		cargarPublicacionesUsuario();
	}
	
	public void cargarPublicacionesUsuario() {
		List<Publicacion> lista = null;
		if(this.user != null)
			lista = new ArrayList<Publicacion>(this.user.publica.getCollection());
		else
			lista = new ArrayList<Publicacion>(this.comercial.publica.getCollection());
		
		if(lista != null) {
			int tamanio = lista.size();
			for(int i = 0; i < lista.size(); i++) {
				if(tamanio >= 3) {					
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Lista_publicaciones_usuario_item(lista.get(i), this),
							new Lista_publicaciones_usuario_item(lista.get(++i), this), new Lista_publicaciones_usuario_item(lista.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Lista_publicaciones_usuario_item(lista.get(i), this),
							new Lista_publicaciones_usuario_item(lista.get(++i), this));
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Lista_publicaciones_usuario_item(lista.get(i), this));
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
		
	}
}