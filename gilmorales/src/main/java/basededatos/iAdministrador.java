package basededatos;

import java.util.List;

import bd_dcl.UsuarioAdministrador;

public interface iAdministrador {

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado);

	public List cargarPublicacionesUsuarios();

	public List cargarListaUsuariosRegistrados();

	public List cargarListaHashtags();

	public List cargarTendencias();

	public List ordenarUsuarios(String aFiltro);

	public void eliminarPublicacion(int aIdPublicacion);

	public void borrarComentario(int aIdComentario, int aIdPublicacion, int aIDUsuarioPropietario);

	public void addFoto(String aFoto, int aCodigoEmpleado);

	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID);

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public List filtrarDenuncias(String aFiltro);
}