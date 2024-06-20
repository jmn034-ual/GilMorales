package interfaz;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaDenunciarUsuario;

public class Denunciar_publicacion extends VistaDenunciarUsuario {

	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Lista_publicaciones_Usuario_Registrado_item _lista_publicaciones__Usuario_Registrado_;
	Publicacion publiacion;
	UsuarioRegistrado user;
	BDPrincipal bd = new BDPrincipal();

	public Denunciar_publicacion(Publicacion p, Object interfaz) {
		this.publiacion = p;
		if(interfaz instanceof Ver_publicacion_ajena) {
			this._ver_publicacion_ajena = (Ver_publicacion_ajena) interfaz;
			this.user = this._ver_publicacion_ajena.user;
		}else {
			this._lista_publicaciones__Usuario_Registrado_ = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
			this.user = this._lista_publicaciones__Usuario_Registrado_.user;
		}
		Cancelar();
		Enviar();
	}

	public void Elegir_motivo_denuncia() {

	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event -> {

		});
	}

	public void Enviar() {
		this.getBotonEnviar().addClickListener(event -> {
			String explicacion = this.getTextAreaMotivoDenuncia().getValue();
			String motivo = this.getTextFieldNombreusuario().getValue();
			this.bd.denunciarPublicacion(this.publiacion.getIdPublicacion(), motivo, explicacion, this.user.getID());
		});
	}
}