package basededatos;

import bd_dcl.UsuarioComercial;

import java.util.List;

import org.orm.PersistentException;

import bd_dcl.Publicacion;

public interface iUsuario_comercial {

	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword);

	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo, Object aUsuarioComercialID);

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto, int aUsuarioID);

	public void eliminarSeleccion(List aSeleccion);

	public void eliminarPublicacoinUC(int aIdPublicacion);

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion, int aUsuarioID);

	public List cargarUsuariosMeGustas(int aIdPublicacion);
}