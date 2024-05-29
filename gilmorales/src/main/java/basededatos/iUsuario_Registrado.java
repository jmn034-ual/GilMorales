package basededatos;

import bd_dcl.UsuarioRegistrado;

import java.util.List;

import bd_dcl.Hashtag;
import bd_dcl.Publicacion;

public interface iUsuario_Registrado {

	public UsuarioRegistrado cargarUsuarioRegistrado(int aUsuarioID);

	public void comentarPublicacion(int aIdPublicacion, int aUsuarioID, String aComentario);

	public void meGustaComentario(int aIdComentario, int aUsuarioID);

	public void cambiarFotoPerfil(int aUsuarioID, String aNombreUsuario, String aFoto);

	public void editarPerfilUR(String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto, int aUsuarioID);

	public void eliminarSeleccion(List aListaSeleccion);

	public void meGustaPublicacion(int aIdPublicacion, int aUsuarioID);

	public void seguirUsuario(int aUsuarioSeguidorID, int aUsuarioAseguirID);

	public void dejarSeguirUsuario(int aUsuarioDejaSeguirID, int aUsuarioDejadoSeguirID);

	public Publicacion addPublicacion(String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID);

	public UsuarioRegistrado verPerfilAjeno(int aUsuarioID);

	public List cargarListaHashtags();

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public void denunciarPublicacion(int aIdPublicacion, String aMotivo, String aExplicacion, int aUsuarioID);

	public List cargarComentariosTOP(int aIdPublicacion);

	public List cargarListaUsuariosRegistrados();

	public List cargarListaUsuariosTOP();

	public List ordenarUsuarios(String aFiltro);

	public void denunciarUsuario(String aExplicacion, String aMotivo, int aUsuarioDenuncianteID, int aUsuarioDenunciadoID);

	public void denunciarComentario(int aIdComentario, String aMotivo, String aExplicacion, int aUsuarioID);

	public void eliminarPublicacion(int aIdPublicacion);

	public List cargarTendencias();

	public List cargarListaHashtagTOP();

	public Hashtag cargarHashtag(int parseInt, String buscar);
}