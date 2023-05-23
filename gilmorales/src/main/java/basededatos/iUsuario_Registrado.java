package basededatos;

import java.util.List;

import bd_dcl.Hashtag;
import bd_dcl.UsuarioRegistrado;

public interface iUsuario_Registrado {

	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword);

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario);

	public void meGustaComentario(int aIdComentario, String aNombreUsuario);

	public void cambiarFotoPerfil(String aNombreUsuario, String aFoto);

	public void editarPerfilUR(String aNombreUsuario, String aNuevoNombreUsuario, String aNombre, String aDescripcion);

	public void eliminarSeleccion(List aListaSeleccion);

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario);

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue);

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario);

	public void addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aFoto, String aVideo);

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario);

	public List cargarListaHashtags();

	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag);

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion);

	public List cargarComentariosTOP(int aIdPublicacion);

	public List cargarListaUsuariosRegistrados();

	public List cargarListaUsuariosTOP();

	public List ordenarUsuarios(String aFiltro);

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo);

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion);

	public void eliminarPublicacion(int aIdPublicacion);

	public List resultadoHashstags(int aIdHashtag, String aNombreHashtag);

	public List resultadoUsuarios(String aNombreUsuario);

	public List cargarTendencias();

	public List cargarListaHashtagTOP();
}