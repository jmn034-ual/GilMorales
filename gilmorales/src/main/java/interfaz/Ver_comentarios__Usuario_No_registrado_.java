package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_comentarios__Usuario_No_registrado_ extends Ver_comentarios {
//	private Label _meGustasL;
	public Ver_publicacion__Usuario_No_Registrado_ verPublicacionUNR;
	public Lista_Publicaciones__Usuario_no_registrado__item _publicacionesUNR;
	public Lista_Comentarios__Vista_Usuario_No_registrado_ _lista_Comentarios__Vista_Usuario_No_registrado_ = new Lista_Comentarios__Vista_Usuario_No_registrado_() ;
	
	public Ver_comentarios__Usuario_No_registrado_() {
		
	}

	public Ver_comentarios__Usuario_No_registrado_(Lista_Publicaciones__Usuario_no_registrado__item item) {
		this.getBotonComentar().setVisible(false);
		this.getBotonEliminarAdmi().setVisible(false);
		this.getBotonMeGusta().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getLayoutComentar().setVisible(false);
		this.getBotonNombreUsuario().setText("Funciona");
		_lista_Comentarios__Vista_Usuario_No_registrado_.anadirComentario(new Lista_Comentarios__Vista_Usuario_No_registrado__item());
		
	}
	
	public void Lista_Comentarios__Vista_Usuario_No_registrado_() {
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_Comentarios__Vista_Usuario_No_registrado_);
	}
}