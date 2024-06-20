package interfaz;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;

public class Resultado_usuarios_item extends Lista_resultado_item {


	public Resultado_usuarios _resultado_usuarios;
	public Ver_Perfil__2 _ver_perfil;
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Resultado_usuarios_item(Object o, Lista_resultado resultado) {
		super(o, resultado);
		
		Seguir();
	}
	
	public void Seguir() {
		if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado != null) {
			if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.seguir.contains(this.user))
				this.getBotonSeguir().setText("Dejar de Seguir");
//			else
//				this.getBotonSeguir().setText("Seguir");
			int userSeguidor = this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.getID();
			this.getBotonSeguir().addClickListener(event -> {
				if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.seguir.contains(this.user))
					this.getBotonSeguir().setText("Dejar de Seguir");
				else
					this.getBotonSeguir().setText("Seguir");
			this.bd.seguirUsuario(userSeguidor, this.user.getID());
//			this.user = this.bd.cargarUsuarioRegistrado(user.getID());
			});
		}else {
			this.getBotonSeguir().setVisible(false);
		}
		
	}
	
}