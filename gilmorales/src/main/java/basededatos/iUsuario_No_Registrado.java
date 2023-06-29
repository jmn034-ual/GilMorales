package basededatos;

import java.util.List;

public interface iUsuario_No_Registrado {

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto);

	public List cargarUsuariosUNR();

	public List cargarTendencias();

	public List cargarListaHashtags();
}