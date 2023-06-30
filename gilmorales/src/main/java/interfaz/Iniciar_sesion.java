package interfaz;

import basededatos.BDPrincipal;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import vistas.VistaIniciarsesion;

import basededatos.iIniciar_sesion;
import bd_dcl.UsuarioRegistrado;

public class Iniciar_sesion extends VistaIniciarsesion{
	public BDPrincipal bd = new BDPrincipal();
	public Login _iniciar_sesion;
//	private String nombreUsuario;
//	private String password;
	UsuarioRegistrado user;
	
//	public Iniciar_sesion() {
//		this.nombreUsuario = this.getUsuarioTF().getValue();
//		this.password = this.getContrasenaTF().getValue();
//	}

	public Object Iniciar_sesion(String nombreUsuario, String password) {
			Object user = bd.iniciarSesion(nombreUsuario, password);
		return user;
	}
}