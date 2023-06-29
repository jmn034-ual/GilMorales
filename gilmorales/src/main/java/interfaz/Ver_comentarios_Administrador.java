package interfaz;

import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import vistas.VistaVerComentarios;

public class Ver_comentarios_Administrador extends VistaVerComentarios{
//	private button _eliminarPublicacionB;
	public Lista_Publicaciones_Administrador_item _lista_Publicaciones__Administrador_;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	public Lista_comentarios_Administrador _lista_comentarios__Administrador_;
	
	Lista_comentarios_Administrador_item listaComentarios;
	public Ver_perfil_Administrador ver_perfil = new Ver_perfil_Administrador();
	Publicacion publi;
	
	public Ver_comentarios_Administrador(Publicacion publicacion) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.publi = publicacion;
		this.getBotonComentar().setVisible(false);
		this.getBotonEliminarAdmi().setVisible(true);
		this.getBotonMeGusta().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getLayoutComentar().setVisible(false);
		this.getFotoPerfil().setImage("icons/luffy.jpg");
		
		Lista_comentarios__Administrador_();
	} 

	public void Lista_comentarios__Administrador_() {
		_lista_comentarios__Administrador_ = new Lista_comentarios_Administrador(this.publi);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Administrador_);
	}

	public void EliminarPublicacio() {
		throw new UnsupportedOperationException();
	}
}