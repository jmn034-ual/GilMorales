package basededatos;

import bd_dcl.UsuarioRegistrado;
import bd_dcl.Publicacion;

import java.util.List;

import bd_dcl.Hashtag;

public interface iUsuario_Registrado {

	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword);

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario, int UsuarioID);

	public void meGustaComentario(int aIdComentario, String aNombreUsuario, int aUsuarioID);

	public void cambiarFotoPerfil(int aUsuarioID, String aNombreUsuario, String aFoto);

	public void editarPerfilUR(int aUsuarioID, String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto);

	public void eliminarSeleccion(List aListaSeleccion);

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario, int aUsuarioID);

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue, int aUsuarioSeguidoID, int aUsuarioSeguidorID);

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario, int aUsuarioDejaSeguirID, int aUsuarioID);

	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID);

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario, int aUsuarioID);

	public List cargarListaHashtags();

	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag);

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion, int aUsuarioID);

	public List cargarComentariosTOP(int aIdPublicacion);

	public List cargarListaUsuariosRegistrados();

	public List cargarListaUsuariosTOP();

	public List ordenarUsuarios(String aFiltro);

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo, int aUsuarioDenunciaID, int aUsuarioDenunciadoID);

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion, int aUsuarioID);

	public void eliminarPublicacion(int aIdPublicacion);

	public List cargarTendencias();

	public List cargarListaHashtagTOP();
}