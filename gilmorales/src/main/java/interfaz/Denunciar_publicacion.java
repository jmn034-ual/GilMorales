package interfaz;

import com.vaadin.flow.component.notification.Notification;

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
		if (interfaz instanceof Ver_publicacion_ajena) {
			this._ver_publicacion_ajena = (Ver_publicacion_ajena) interfaz;
			this.user = this._ver_publicacion_ajena.user;
		} else {
			this._lista_publicaciones__Usuario_Registrado_ = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
			this.user = this._lista_publicaciones__Usuario_Registrado_.user;
		}
		Enviar();
	}

	public void Enviar() {
		this.getBotonEnviar().addClickListener(event -> {
			String explicacion = this.getTextAreaMotivoDenuncia().getValue();
			String motivo = this.getTextFieldNombreusuario().getValue();
			if (motivo.isBlank() || explicacion.isBlank()) {
				Notification.show("Rellene los campos de su denuncia");
			} else {
				this.bd.denunciarPublicacion(this.publiacion.getIdPublicacion(), motivo, explicacion,
						this.user.getID());
				if(this._ver_publicacion_ajena != null)
					this._ver_publicacion_ajena.dialog.close();
				else
					this._lista_publicaciones__Usuario_Registrado_.dialog.close();
			}
		});
	}
}