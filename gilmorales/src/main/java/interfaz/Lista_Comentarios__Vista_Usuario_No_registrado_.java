package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaComentariosUsuarioNoRegistrado;

public class Lista_Comentarios__Vista_Usuario_No_registrado_ extends VistaListaComentariosUsuarioNoRegistrado{
	public Ver_comentarios__Usuario_No_registrado_ _ver_comentarios__Usuario_No_registrado_;
	public Vector<Lista_Comentarios__Vista_Usuario_No_registrado__item> _item = new Vector<Lista_Comentarios__Vista_Usuario_No_registrado__item>();
	
	public Lista_Comentarios__Vista_Usuario_No_registrado_() {
	
	}
	public void anadirComentario(Lista_Comentarios__Vista_Usuario_No_registrado__item comentario) {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(comentario);
		_item.add(comentario);
	}
}