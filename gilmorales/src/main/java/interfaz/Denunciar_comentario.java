package interfaz;

import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaDenunciarComentarioComercial;
import vistas.VistaDenunciarUsuario;

public class Denunciar_comentario extends VistaDenunciarComentarioComercial{

	public Lista_comentarios_Usuario_registrado_item _lista_comentarios__Usuario_registrado_;
	public Lista_comentarios_Comercial_item _lista_comentarios__Comercial_;
	BDPrincipal bd = new BDPrincipal();
	Comentario comentario;
	UsuarioRegistrado user;
	UsuarioComercial comercial;
	Select<String> select ;
	String motivo = "";
	
	public Denunciar_comentario(Comentario comentario, Object interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.comentario = comentario;
		if(interfaz instanceof Lista_comentarios_Usuario_registrado_item) {
			this._lista_comentarios__Usuario_registrado_ = (Lista_comentarios_Usuario_registrado_item) interfaz;
			this.user = this._lista_comentarios__Usuario_registrado_.user;
		}else {
			this._lista_comentarios__Comercial_ = (Lista_comentarios_Comercial_item) interfaz;
			this.comercial = this._lista_comentarios__Comercial_._lista_comentarios__Comercial_.publicacion.getEsPublicada();
		}
		select = new Select<>();
        select.setItems("No me gusta", "Spam",
                "Contenido ofensivo", "Contenido sexual");
        select.getStyle().set("align-self", "center");
        this.getVaadinHorizontalLayout1().add(select);
        Elegir_motivo_denuncia();
		Cancelar();
		Enviar();
	}

	public void Elegir_motivo_denuncia() {
		this.select.addValueChangeListener(event ->{
			this.motivo = this.select.getValue();
		});
	}

	public void Cancelar() {
		this.getCancelarB().addClickListener(event -> {
			if(this._lista_comentarios__Usuario_registrado_ != null)
				this._lista_comentarios__Usuario_registrado_.dialog.close();
			else
				this._lista_comentarios__Comercial_.dialog.close();
		});
	}

	public void Enviar() {
		this.getEnviarB().addClickListener(event -> {
			String explicacion = this.getMotivoTA().getValue();
			
			this.bd.denunciarComentario(this.comentario.getIdComentario(), motivo, explicacion, this.user.getID());
			if(this._lista_comentarios__Usuario_registrado_ != null)
				this._lista_comentarios__Usuario_registrado_.dialog.close();
			else
				this._lista_comentarios__Comercial_.dialog.close();
		});
	}
}