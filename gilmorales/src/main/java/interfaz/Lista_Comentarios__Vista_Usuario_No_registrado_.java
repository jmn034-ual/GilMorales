package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaComentariosUsuarioNoRegistrado;

public class Lista_Comentarios__Vista_Usuario_No_registrado_ extends VistaListaComentariosUsuarioNoRegistrado{
	public Ver_comentarios__Usuario_No_registrado_ _ver_comentarios__Usuario_No_registrado_;
	public Vector<Lista_Comentarios__Vista_Usuario_No_registrado__item> _item = new Vector<Lista_Comentarios__Vista_Usuario_No_registrado__item>();
	private Usuario_No_Registrado unr;
	Lista_Comentarios__Vista_Usuario_No_registrado__item comentario;
	Publicacion publicacion;
	

	public Lista_Comentarios__Vista_Usuario_No_registrado_() {}
	
	public Lista_Comentarios__Vista_Usuario_No_registrado_(Usuario_No_Registrado unr, Publicacion publicacion) {
		this.unr = unr;
		this.publicacion = publicacion;
		cargarComentarios();
	}
	
	public void cargarComentarios() {
		List<Comentario> lista = new ArrayList<Comentario>(this.publicacion.tieneComentarios.getCollection());
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(Comentario com : lista) {
				this.comentario = new Lista_Comentarios__Vista_Usuario_No_registrado__item(this.unr, com);
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.comentario);
				_item.add(this.comentario);
			
		}
	}
}