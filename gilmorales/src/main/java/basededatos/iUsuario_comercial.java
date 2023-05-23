package basededatos;

import java.util.List;

import bd_dcl.UsuarioComercial;

public interface iUsuario_comercial {

	public UsuarioComercial cargarUsuarioComercial();

	public void addPublicacion(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo);

	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto);

	public void eliminarSeleecion(List aSeleccion);

	public void eliminarPublicacoinUC(int aIdPublicacion);

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion);

	public List cargarUsuariosMeGustas(int aIdPublicacion);
}