package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_comentarios__Usuario_No_registrado_ extends Ver_comentarios {
//	private Label _meGustasL;
	public Ver_publicacion__Usuario_No_Registrado_ verPublicacionUNR;
	public Lista_Publicaciones__Usuario_no_registrado__item _publicacionesUNR;
	public Lista_Comentarios__Vista_Usuario_No_registrado_ _lista_Comentarios__Vista_Usuario_No_registrado_;
//	Lista_Comentarios__Vista_Usuario_No_registrado__item comentario = new Lista_Comentarios__Vista_Usuario_No_registrado__item();
	private Usuario_No_Registrado unr;
	public Ver_comentarios__Usuario_No_registrado_() {
		
	}

	public Ver_comentarios__Usuario_No_registrado_(Lista_Publicaciones__Usuario_no_registrado__item item, Usuario_No_Registrado unr) {
		this.getFotoPerfil().setImage("icons/luffy.jpg");
		this.getBotonComentar().setVisible(false);
		this.getBotonEliminarAdmi().setVisible(false);
		this.getBotonMeGusta().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getLayoutComentar().setVisible(false);
		this.unr = unr;
		_lista_Comentarios__Vista_Usuario_No_registrado_ = new Lista_Comentarios__Vista_Usuario_No_registrado_(unr); 
		Lista_Comentarios__Vista_Usuario_No_registrado_();
		Ver_perfil();
	}
	
	public void Lista_Comentarios__Vista_Usuario_No_registrado_() {
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_Comentarios__Vista_Usuario_No_registrado_);
	}
	@Override
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(unr);
		this.getBotonNombreUsuario().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			unr.getVaadinHorizontalLayout().remove(unr.getVaadinHorizontalLayout().getComponentAt(0));
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
}