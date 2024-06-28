package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import net.bytebuddy.asm.Advice.This;

public class Lista_comentarios_Usuario_registrado_item extends Lista_Comentarios_Vista_Usuario_No_registrado_item {

	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	public Denunciar_comentario _denunciar_comentario;
	BDPrincipal bd = new BDPrincipal();
	UsuarioRegistrado user;
	Publicacion publiacion;
	Dialog dialog;
	boolean gusta = false;
	Icon icono = null;
	
	public Lista_comentarios_Usuario_registrado_item(Lista_comentarios_Usuario_registrado interfaz, Comentario comentario) {
		this.getStyle().set("width", "100%");
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreUsuario().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getMeGustaB().setEnabled(true);
		this.getDenunciarB().setVisible(true);
		this.getBorrarComentarioB().setVisible(false);
		this._lista_comentarios__Usuario_registrado_ = interfaz;
		this.comentario = comentario;
		this.user = this.bd.cargarUsuarioRegistrado(this._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.user.getID());
		this.Ver_perfil(this);
		Dar_me_gusta_comentario();
		Denunciar_comentario();
	}

	public void Dar_me_gusta_comentario() {
		gusta = this.comentario.gustaA.contains(this.user);
		if(gusta) {
			this.getMeGustaB().setIcon(new Icon(VaadinIcon.HEART));
		}else
			this.getMeGustaB().setIcon(new Icon(VaadinIcon.HEART_O));

		this.getNumeroMeGusta().setText(this.comentario.getNumeroMeGustas()+"");
		if(this.comentario.getEsComentadoPor().getID() != this.user.getID()) {
		this.getMeGustaB().addClickListener(event -> {
			gusta = !(gusta);
			this.comentario = this.bd.meGustaComentario(this.comentario.getIdComentario(), this.user.getID());
			this.getNumeroMeGusta().setText(this.comentario.getNumeroMeGustas()+"");
			this.publiacion = this.bd.cargarPublicacion(this._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.publicacion.getIdPublicacion());
			this.user = this.bd.cargarUsuarioRegistrado(this._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.user.getID());
			if(gusta)
				this.getMeGustaB().setIcon(new Icon(VaadinIcon.HEART));
			else
				this.getMeGustaB().setIcon(new Icon(VaadinIcon.HEART_O));
			});
		}
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