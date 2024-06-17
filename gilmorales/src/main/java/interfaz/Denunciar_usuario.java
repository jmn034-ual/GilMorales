package interfaz;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaAddpublicacion;
import vistas.VistaDenunciarUsuario;

public class Denunciar_usuario extends VistaDenunciarUsuario{
	
	public Ver_perfil_publico _ver_perfil;
	BDPrincipal bd = new BDPrincipal();
	
	public Denunciar_usuario(Ver_perfil_publico interfaz) {
		this._ver_perfil = interfaz;
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		Cancelar();
		Enviar();
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event -> {
			Ver_perfil_publico aux = new Ver_perfil_publico(this._ver_perfil.userAver, this._ver_perfil.interfazAux, this._ver_perfil.cabecera_top);
			this._ver_perfil.getVaadinHorizontalLayout().removeAll();
			this._ver_perfil.getVaadinHorizontalLayout().add(aux);
		});
	}

	public void Enviar() {
		this.getBotonEnviar().addClickListener(event -> {
			String explicacion = this.getTextAreaMotivoDenuncia().getValue();
			String motivo = this.getTextFieldNombreusuario().getValue();
			this.bd.denunciarUsuario(explicacion, motivo, this._ver_perfil.user.getID(), this._ver_perfil.userAver.getID());
			Ver_perfil_publico aux = new Ver_perfil_publico(this._ver_perfil.userAver, this._ver_perfil.interfazAux, this._ver_perfil.cabecera_top);
			this._ver_perfil.getVaadinHorizontalLayout().removeAll();
			this._ver_perfil.getVaadinHorizontalLayout().add(aux);
		});
	}
}