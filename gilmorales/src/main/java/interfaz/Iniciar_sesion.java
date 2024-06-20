package interfaz;

import basededatos.BDPrincipal;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import vistas.VistaIniciarsesion;

import basededatos.iIniciar_sesion;
import bd_dcl.UsuarioRegistrado;

public class Iniciar_sesion extends VistaIniciarsesion{
	public BDPrincipal bd = new BDPrincipal();
	public Login _iniciar_sesion;

	UsuarioRegistrado user;


	public Object Iniciar_sesion(String nombreUsuario, String password) {
			Object user = bd.iniciarSesion(nombreUsuario, password);
		return user;
	}
}