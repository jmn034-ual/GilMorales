package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_comentarios__Administrador__item extends VistaListaComentariosUsuarioNoRegistradoItem{
//	private button _borrar_comentarioB;
	public Lista_comentarios__Administrador_ _lista_comentarios__Administrador_ = new Lista_comentarios__Administrador_();
	
	public Lista_comentarios__Administrador__item() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage("icons/icon.png");
		this.getNombreUsuario().setText("NombreUsuario");
		this.getComentarioL().setText("Este es un comentaio de prueba...");
		this.getNumeroMeGusta().setText("0");
		this.getMeGustaL().setText("Me Gustas");
		this.getDenunciarB().setVisible(false);
		this.getMeGustaB().setVisible(false);
	}

	public void Borrar_comentario() {
		throw new UnsupportedOperationException();
	}
}