package basededatos;

import java.util.List;

import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;

public interface iAdministrador {

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado);

	public List cargarPublicacionesUsuarios();

	public List cargarListaUsuariosRegistrados();

	public List cargarListaHashtags();

	public List cargarTendencias();

	public List ordenarUsuarios(String aFiltro);

	public void eliminarPublicacion(int aIdPublicacion);

	public void borrarComentario(int aIdComentario);

	public UsuarioAdministrador addFoto(String aFoto, int aCodigoEmpleado);

	public UsuarioRegistrado bloquearUsuario(int aUsuarioID);

	public List realizarBusqueda(String aBusqueda, String aFiltro);

}