package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerComentarios;

public class Ver_comentarios__Administrador_ extends VistaVerComentarios{
//	private button _eliminarPublicacionB;
	public Lista_Publicaciones__Administrador__item _lista_Publicaciones__Administrador_;
	public Ver_publicacion__Administrador_ _ver_publicacion__Administrador_;
	public Lista_comentarios__Administrador_ _lista_comentarios__Administrador_ = new Lista_comentarios__Administrador_();
	
	Lista_comentarios__Administrador__item comentario = new Lista_comentarios__Administrador__item();
	
	public Ver_comentarios__Administrador_(Lista_Publicaciones__Administrador__item item) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getBotonComentar().setVisible(true);
		this.getBotonEliminarAdmi().setVisible(true);
		this.getBotonMeGusta().setVisible(true);
		this.getBotonSeguir().setVisible(true);
		this.getLayoutComentar().setVisible(true);
		_lista_comentarios__Administrador_.anadirComentario(comentario);
		Lista_comentarios__Administrador_();
	} 

	public void Lista_comentarios__Administrador_() {
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Administrador_);
	}

	public void EliminarPublicacio() {
		throw new UnsupportedOperationException();
	}
}