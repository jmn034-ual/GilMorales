package basededatos;

import bd_dcl.UsuarioRegistrado;

public interface iIniciar_sesion {

	public UsuarioRegistrado iniciarSesion(String aNombreUsuario, String aPassword);

	public UsuarioRegistrado iniciarSesionOtrasPlataformas(String aEmail);

	public UsuarioRegistrado usarOtraCuenta(String aNombreUsuarioOemail, String aPassword);

	public void recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario);
}