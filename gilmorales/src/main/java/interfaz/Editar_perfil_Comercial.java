package interfaz;

import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Editar_perfil_Comercial extends Editar_perfil {

	public Usuario_comercial _usuario_comercial;
	UsuarioComercial comercial;
	
	public Editar_perfil_Comercial(UsuarioComercial comercial) {
		super();
		this.comercial = comercial;
	}
}