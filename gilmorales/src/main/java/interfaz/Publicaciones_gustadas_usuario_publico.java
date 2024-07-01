package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaPublicacionesGustadasUsuarioPublico;

public class Publicaciones_gustadas_usuario_publico extends VistaPublicacionesGustadasUsuarioPublico{
	public Ver_publicacciones_gustadas_Otro_usuario _ver_publicacciones_gustadas__Otro_usuario_;
	public Vector<Publicaciones_gustadas_usuario_publico_item> _item = new Vector<Publicaciones_gustadas_usuario_publico_item>();
	UsuarioRegistrado user;

	
	public Publicaciones_gustadas_usuario_publico(Ver_publicacciones_gustadas_Otro_usuario interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._ver_publicacciones_gustadas__Otro_usuario_ = interfaz;
		this.user = this._ver_publicacciones_gustadas__Otro_usuario_._ver_perfil_publico.userAver;
		cargarPublicacionesGustadasUsuario();
	}
	
	public void cargarPublicacionesGustadasUsuario() {
		List<Publicacion> lista = new ArrayList<Publicacion>(this.user.daMeGustaPublicacion.getCollection());
		
		if(lista != null) {
			int tamanio = lista.size();
			for(int i = 0; i < lista.size(); i++) {
				if(tamanio >= 3) {					
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new HorizontalLayout(new Publicaciones_gustadas_usuario_publico_item(lista.get(i), this),
							new Publicaciones_gustadas_usuario_publico_item(lista.get(++i), this), new Publicaciones_gustadas_usuario_publico_item(lista.get(i+=1), this)));
					tamanio -= 3;
				}else if(tamanio == 2){
					HorizontalLayout horizontal2 = new HorizontalLayout(new Publicaciones_gustadas_usuario_publico_item(lista.get(i), this),
							new Publicaciones_gustadas_usuario_publico_item(lista.get(++i), this));
					horizontal2.getStyle().set("width", "66.66%");

					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal2);
				}else {
					HorizontalLayout horizontal = new HorizontalLayout(new Publicaciones_gustadas_usuario_publico_item(lista.get(i), this));
					horizontal.getStyle().set("width", "33%");
					this.getVaadinVerticalLayout().as(VerticalLayout.class).add(horizontal);
				}
			}
		}
		
	}
}