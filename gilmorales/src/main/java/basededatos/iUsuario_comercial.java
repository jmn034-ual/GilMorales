package basededatos;

import bd_dcl.UsuarioComercial;

import java.util.List;

import bd_dcl.Publicacion;

public interface iUsuario_comercial {

	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword);

	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo, Object aUsuarioComercialID);

	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto);

	public void eliminarSeleecion(List aSeleccion);

	public void eliminarPublicacoinUC(int aIdPublicacion);

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion);

	public List cargarUsuariosMeGustas(int aIdPublicacion);
}