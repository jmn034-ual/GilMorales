package interfaz;

import bd_dcl.UsuarioRegistrado;

public class Me_gustas_item extends Nuevos_seguidores_item {


	public Me_gustas _me_gustas;
	
	public Me_gustas_item(UsuarioRegistrado usuario, UsuarioRegistrado usuarioDaMeGusta, Me_gustas interfaz) {
		super(usuario, usuarioDaMeGusta);
		this._me_gustas = interfaz;
	}

	public Me_gustas_item() {
		super();
	}
}