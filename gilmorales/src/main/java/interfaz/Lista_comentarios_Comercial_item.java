package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosComercialItem;

public class Lista_comentarios_Comercial_item extends VistaListaComentariosComercialItem {

	public Lista_comentarios_Comercial _lista_comentarios__Comercial_;
	public Denunciar_comentario _denunciar_comentario;
	Comentario comentario;
	Dialog dialog;

	
	public Lista_comentarios_Comercial_item(Comentario c, Lista_comentarios_Comercial interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.comentario = c;
		this._lista_comentarios__Comercial_ = interfaz;
		this.getAvatar().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreDeUsuarioB1().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getLabel().setText(comentario.getNumeroMeGustas()+"");
		this.getDenunciarB().setVisible(true);
		_lista_comentarios__Comercial_ = interfaz;
		 Denunciar_comentario();
	}
	

	public void Denunciar_comentario() {
		this.getDenunciarB().addClickListener(event -> {
			dialog = new Dialog();
			this._denunciar_comentario = new Denunciar_comentario(this.comentario, this);
			dialog.add(_denunciar_comentario);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			dialog.open();
		});
	}
}