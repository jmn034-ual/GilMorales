package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaComentariosUsuarioNoRegistrado;

public class Lista_Comentarios_Vista_Usuario_No_registrado extends VistaListaComentariosUsuarioNoRegistrado{
	public Ver_comentarios_Usuario_No_registrado _ver_comentarios__Usuario_No_registrado_;
	public Vector<Lista_Comentarios_Vista_Usuario_No_registrado_item> _item = new Vector<Lista_Comentarios_Vista_Usuario_No_registrado_item>();
	private Usuario_No_Registrado unr;
	Lista_Comentarios_Vista_Usuario_No_registrado_item comentario;
	Publicacion publicacion;
	

	public Lista_Comentarios_Vista_Usuario_No_registrado() {}
	
	public Lista_Comentarios_Vista_Usuario_No_registrado(Usuario_No_Registrado unr, Publicacion publicacion) {
		this.unr = unr;
		this.publicacion = publicacion;
		cargarComentarios();
	}
	
	public void cargarComentarios() {
		List<Comentario> lista = new ArrayList<Comentario>(this.publicacion.tieneComentarios.getCollection());
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		_item.clear();

		for(Comentario com : lista) {
				this.comentario = new Lista_Comentarios_Vista_Usuario_No_registrado_item(this.unr, com);
				this.getVaadinVerticalLayout().as(VerticalLayout.class).add(this.comentario);
				_item.add(this.comentario);
			
		}
	}
}