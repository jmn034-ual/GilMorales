package basededatos;

import java.util.List;

public interface iAdministrador {

	public void cargarAdministrador();

	public List cargarPublicacionesUsuarios();

	public List cargarListaUsuariosRegistrados();

	public List cargarListaHashtag();

	public List cargarTendencias();

	public List ordenarUsuarios(String aFiltro);

	public void eliminarPublicacion(int aIdPublicacion);

	public void borrarComentario(int aIdComentario, int aIdPublicacion, String aNombreUsuarioPropietario);

	public void addFoto(String aFoto);

	public void bloquearUsuario(String aNombreUsuario);

	public List realizarBusqueda(String aBusqueda, Object aFiltro);

	public List filtrarDenuncias(String aFiltro);
}