package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_comentarios_Administrador_item extends VistaListaComentariosUsuarioNoRegistradoItem{
//	private button _borrar_comentarioB;
	public Lista_comentarios_Administrador _lista_comentarios__Administrador_ ;
	Comentario comentario;
	iAdministrador admin = new BDPrincipal();
	
	public Lista_comentarios_Administrador_item(Comentario comentario, Lista_comentarios_Administrador interfaz) {
		this.comentario = comentario;
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._lista_comentarios__Administrador_ = interfaz;
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreUsuario().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getDenunciarB().setVisible(false);
		this.getMeGustaB().setVisible(false);
		Borrar_comentario();
	}

	public void Borrar_comentario() {
		this.getBorrarComentarioB().addClickListener(event -> {
			this._lista_comentarios__Administrador_.getVaadinVerticalLayout().as(VerticalLayout.class).remove(this);
			this._lista_comentarios__Administrador_._item.remove(this);
			admin.borrarComentario(comentario.getIdComentario());
			this._lista_comentarios__Administrador_._ver_comentarios__Administrador_.getNumComentarios().setText(this._lista_comentarios__Administrador_._item.size() +"");
		});
	}
}