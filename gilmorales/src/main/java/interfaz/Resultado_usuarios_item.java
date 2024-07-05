package interfaz;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;

public class Resultado_usuarios_item extends Lista_resultado_item {


	public Resultado_usuarios _resultado_usuarios;
	public Ver_Perfil__2 _ver_perfil;
	int userSeguidor;
	boolean sigue = false;
	
	public Resultado_usuarios_item(Object o, Lista_resultado resultado) {
		super(o, resultado);
		Seguir();

	}
	
	public void Seguir() {
		if(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado != null) {
			this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur = this.bd.cargarUsuarioRegistrado(this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.getID());
			this.sigue = this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.seguir.contains(this.user);
			if( this.user.getID() == this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.getID()) {
				this.getBotonSeguir().setVisible(false);
			}else if(sigue) {
				this.getBotonSeguir().setText("Dejar de Seguir");
			}else if(!sigue && this.user.getPrivacidad() == 1)
				this.getBotonSeguir().setText("Enviar petición de amistad");
			else
				this.getBotonSeguir().setText("Seguir");
			this.userSeguidor = this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur.getID();
			this.getBotonSeguir().addClickListener(event -> {
				this.sigue = !this.sigue;
				if(sigue) {
					if(this.user.getPrivacidad() == 0) {
						this.bd.seguirUsuario(this.userSeguidor, this.user.getID());
						this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur = this.bd.cargarUsuarioRegistrado(this.userSeguidor);
						this.getBotonSeguir().setText("Dejar de Seguir");
					}else {
						this.getBotonSeguir().setText("Solicitud enviada");
						this.bd.enviarSolicitud(this.userSeguidor, this.user.getID());
						this._lista_resultado._realizar_busqueda._cabecera_Usuario_Registrado.urInterfaz.ur = this.bd.cargarUsuarioRegistrado(this.userSeguidor);				
					}
				}else if(!sigue && this.user.getPrivacidad() == 1)
					this.getBotonSeguir().setText("Enviar petición de amistad");
				else
					this.getBotonSeguir().setText("Seguir");
			});
		}else {
			this.getBotonSeguir().setVisible(false);
		}
		
	}
	
}