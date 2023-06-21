package basededatos;

import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

import java.time.LocalDate;
import java.util.List;

import bd_dcl.Hashtag;
import interfaz.Usuario_comercial;
import interfaz.Ver_perfil__Administrador_;
import interfaz.Administrador;
import interfaz.Usuario_No_Registrado;
import interfaz.Ver_notificaciones_usuario_publico;
import interfaz.Ver_notificaciones_usuario_privado;
import interfaz.Ver_perfil_publico;
import interfaz.Ver_Perfil__2;
import interfaz.Ver_perfil_privado;
import interfaz.Plataformas_externas;
import interfaz.Usuario_Registrado;
import interfaz.Iniciar_Sesion__4;

public class BDPrincipal implements iUsuario_comercial, iVer_perfil__Administrador_, iAdministrador, iUsuario_No_Registrado, iVer_notificaciones_usuario_publico, iVer_notificaciones_usuario_privado, iVer_perfil_publico, iVer_perfil_privado, iVer_perfil, iPlataformas_externas, iUsuario_Registrado, iIniciar_sesion {
	public Comentarios _c_comentarios = new Comentarios();
	public Notificaciones _c_notificaciones = new Notificaciones();
	public UsuariosRegistrados _c_usuario_registrado = new UsuariosRegistrados();
	public Publicaciones _c_publicacion = new Publicaciones();
	public UsuariosComerciales _c_comercial = new UsuariosComerciales();
	public Hashtags _c_hashtag = new Hashtags();
	public UsuariosAdministradores _c_usuarioAdministrador = new UsuariosAdministradores();
	public Denuncias _c_denuncia = new Denuncias();

	public UsuarioComercial cargarUsuarioComercial() {
		throw new UnsupportedOperationException();
	}

	public void addPublicacion(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarSeleecion(List aSeleccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPublicacoinUC(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuariosMeGustas(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void cargarAdministrador() {
		throw new UnsupportedOperationException();
	}

	public List cargarPublicacionesUsuarios() {
		throw new UnsupportedOperationException();
	}

	public List cargarListaUsuariosRegistrados() {
		throw new UnsupportedOperationException();
	}

	public List cargarListaHashtag() {
		throw new UnsupportedOperationException();
	}

	public List cargarTendencias() {
		throw new UnsupportedOperationException();
	}

	public List ordenarUsuarios(String aFiltro) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPublicacion(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void borrarComentario(int aIdComentario, int aIdPublicacion, String aNombreUsuarioPropietario) {
		throw new UnsupportedOperationException();
	}

	public void addFoto(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void bloquearUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List realizarBusqueda(String aBusqueda, Object aFiltro) {
		throw new UnsupportedOperationException();
	}

	public List filtrarDenuncias(String aFiltro) {
		throw new UnsupportedOperationException();
	}

	public List realizarBusqueda(String aBusqueda, String aFiltro) {
		throw new UnsupportedOperationException();
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, LocalDate aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuariosUNR() {
		throw new UnsupportedOperationException();
	}

	public List cargarListaHashtags() {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public void meGustaComentario(int aIdComentario, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void cambiarFotoPerfil(String aNombreUsuario, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUR(String aNombreUsuario, String aNuevoNombreUsuario, String aNombre, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarSeleccion(List aListaSeleccion) {
		throw new UnsupportedOperationException();
	}

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aFoto, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag) {
		throw new UnsupportedOperationException();
	}

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion) {
		throw new UnsupportedOperationException();
	}

	public List cargarComentariosTOP(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public List cargarListaUsuariosTOP() {
		throw new UnsupportedOperationException();
	}

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo) {
		throw new UnsupportedOperationException();
	}

	public List resultadoHashstags(int aIdHashtag, String aNombreHashtag) {
		throw new UnsupportedOperationException();
	}

	public List resultadoUsuarios(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarListaHashtagTOP() {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado iniciarSesion(String aNombreUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado iniciarSesionOtrasPlataformas(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado usarOtraCuenta(String aNombreUsuarioOemail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_comercial get_Usuario_comercial() {
		throw new UnsupportedOperationException();
	}

	public Ver_perfil__Administrador_ get_Ver_perfil__Administrador_() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Usuario_No_Registrado get_Usuario_No_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Ver_notificaciones_usuario_publico get_Ver_notificaciones_usuario_publico() {
		throw new UnsupportedOperationException();
	}

	public Ver_notificaciones_usuario_privado get_Ver_notificaciones_usuario_privado() {
		throw new UnsupportedOperationException();
	}

	public Ver_perfil_publico get_Ver_perfil_publico() {
		throw new UnsupportedOperationException();
	}

	public Ver_Perfil__2 get_Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public Ver_perfil_privado get_Ver_perfil_privado() {
		throw new UnsupportedOperationException();
	}

	public Plataformas_externas get_Plataformas_externas() {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado get_Usuario_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Iniciar_Sesion__4 get_Iniciar_sesion() {
		throw new UnsupportedOperationException();
	}
}