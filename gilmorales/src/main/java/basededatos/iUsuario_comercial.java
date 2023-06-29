package basededatos;

import bd_dcl.UsuarioComercial;

import java.util.List;

import bd_dcl.Publicacion;

public interface iUsuario_comercial {

	public UsuarioComercial cargarUsuarioComercial(int aUsuarioComercialID);

	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioComercialID);

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto, int aUsuarioID);

	public void eliminarSeleccion(List aListaSeleccion);

	public void eliminarPublicacoinUC(int aIdPublicacion);

	public void denunciarComentario(int aIdComentario, String aMotivo, String aExplicacion, int aUsuarioID);

	public List cargarUsuariosMeGustas(int aIdPublicacion);
}