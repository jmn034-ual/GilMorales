package interfaz;

import bd_dcl.UsuarioRegistrado;

public class Me_gustas_item extends Nuevos_seguidores_item {


	public Me_gustas _me_gustas;
	
	public Me_gustas_item(UsuarioRegistrado usuario, UsuarioRegistrado usuarioDaMeGusta) {
		super(usuario, usuarioDaMeGusta);
	}

	public Me_gustas_item() {
		super();
	}
}