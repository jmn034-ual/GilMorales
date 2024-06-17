package interfaz;

import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaDenunciarUsuario;

public class Denunciar_comentario extends VistaDenunciarUsuario{

	public Lista_comentarios_Usuario_registrado_item _lista_comentarios__Usuario_registrado_;
	public Lista_comentarios_Comercial_item _lista_comentarios__Comercial_;
	BDPrincipal bd = new BDPrincipal();
	Comentario comentario;
	UsuarioRegistrado user;

	
	public Denunciar_comentario(Comentario comentario, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.comentario = comentario;
		if(interfaz instanceof Lista_comentarios_Usuario_registrado_item) {
			this._lista_comentarios__Usuario_registrado_ = (Lista_comentarios_Usuario_registrado_item) interfaz;
			this.user = this._lista_comentarios__Usuario_registrado_.comentario.getEsComentadoPor();
		}else {
			this._lista_comentarios__Comercial_ = (Lista_comentarios_Comercial_item) interfaz;
			this.user = this._lista_comentarios__Comercial_.comentario.getEsComentadoPor();
		}
		Cancelar();
		Enviar();
	}

	public void Elegir_motivo_denuncia() {
		throw new UnsupportedOperationException();
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event -> {
			
		});
	}

	public void Enviar() {
		this.getBotonEnviar().addClickListener(event -> {
			String explicacion = this.getTextAreaMotivoDenuncia().getValue();
			String motivo = this.getTextFieldNombreusuario().getValue();
			this.bd.denunciarComentario(this.comentario.getIdComentario(), motivo, explicacion, this.user.getID());
		});
	}
}