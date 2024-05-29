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
	
	public Lista_comentarios_Administrador_item(Comentario comentario) {
		this.comentario = comentario;
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
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
//			admin.borrarComentario(comentario.getIdComentario(), comentario.getComentadoEn().getIdPublicacion(), comentario.getEsComentadoPor().getID());
			admin.borrarComentario(comentario.getIdComentario());
		});
	}
}