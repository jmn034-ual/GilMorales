package basededatos;

import bd_dcl.UsuarioComercial;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

import java.time.LocalDate;
import java.util.List;

import org.orm.PersistentException;

import bd_dcl.Hashtag;

public class BDPrincipal implements iUsuario_comercial, iVer_perfil__Administrador_, iAdministrador, iUsuario_No_Registrado, iVer_notificaciones_usuario_publico, iVer_notificaciones_usuario_privado, iVer_perfil_publico, iVer_perfil_privado, iVer_perfil, iPlataformas_externas, iUsuario_Registrado, iIniciar_sesion {
	public Comentarios comentarios = new Comentarios();
	public Notificaciones notificaciones = new Notificaciones();
	public UsuariosRegistrados usuario_registrado = new UsuariosRegistrados();
	public Publicaciones publicacion = new Publicaciones();
	public UsuariosComerciales comercial = new UsuariosComerciales();
	public Hashtags hashtag = new Hashtags();
	public UsuariosAdministradores _c_usuarioAdministrador = new UsuariosAdministradores();
	public Denuncias denuncia = new Denuncias();
	
	public UsuarioRegistrado iniciarSesion(String aNombreUsuario, String aPassword) {
		
		return null;
	}
	
	public UsuarioRegistrado iniciarSesionOtrasPlataformas(String aEmail) {
		
		return null;
	}
	
	public UsuarioRegistrado usarOtraCuenta(String aNombreUsuarioOemail, String aPassword) {
		
		return null;
	}
	
	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		
		return null;
	}
	
	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword) {
		UsuarioRegistrado usuario = null;
		try {
			usuario = usuario_registrado.cargarUsuarioRegistrado(aNombreUsuario, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}
	
	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario) {
		
		
	}
	
	public void meGustaComentario(int aIdComentario, String aNombreUsuario, int aUsuarioID) {
		
		
	}
	
	public void cambiarFotoPerfil(int aUsuarioID, String aNombreUsuario, String aFoto) {
		
		
	}
	
	public void editarPerfilUR(int aUsuarioID, String aNuevoNombreUsuario, String aNombre, String aDescripcion,
			String aFoto) {
		
		
	}
	
	public void eliminarSeleccion(List aListaSeleccion) {
		
		
	}
	
	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario, int aUsuarioID) {
		
		
	}
	
	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue, int aUsuarioSeguidoID,
			int aUsuarioSeguidorID) {
		
		
	}
	
	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario, int aUsuarioDejaSeguirID,
			Object aUsuarioID) {
		
		
	}
	
	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo,
			int aUsuarioID) {
		Publicacion p = null;
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuarioID);
			p = publicacion.addPublicacion(usuario.getNombreUsuario(), aLocalizacion, aDescripcion, aVideo, aUsuarioID);
//			usuario.publica.add(p);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario, int aUsuarioID) {
		
		return null;
	}
	
	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag) {
		
		return null;
	}
	
	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion, int aUsuarioID) {
		
		
	}
	
	public List cargarComentariosTOP(int aIdPublicacion) {
		
		return null;
	}
	
	public List cargarListaUsuariosTOP() {
		
		return null;
	}
	
	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo,
			int aUsuarioDenunciaID, int aUsuarioDenunciadoID) {
		
		
	}
	
	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion, int aUsuarioID) {
		
		
	}
	
	public List resultadoHashstags(int aIdHashtag, String aNombreHashtag) {
		
		return null;
	}
	
	public List resultadoUsuarios(String aNombreUsuario) {
		
		return null;
	}
	
	public List cargarListaHashtagTOP() {
		
		return null;
	}
	
	public List realizarBusqueda(String aBusqueda, String aFiltro) {
		
		return null;
	}
	
	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword,
			String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		try {
			this.usuario_registrado.registrarUsuario(aNombre, aApellidos, aEmail, aPassword, aDescripcion, aNombreUsuario, aFechaNacimiento, aTipoCuenta, aFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List cargarUsuariosUNR() {
		
		return null;
	}
	
	public List cargarListaHashtags() {
		
		return null;
	}
	
	public void cargarAdministrador(String aNombreAdmin, String aPassword) {
		
		
	}
	
	public List cargarPublicacionesUsuarios() {
		
		return null;
	}
	
	public List cargarListaUsuariosRegistrados() {
		
		return null;
	}
	
	public List cargarListaHashtag() {
		
		return null;
	}
	
	public List cargarTendencias() {
		
		return null;
	}
	
	public List ordenarUsuarios(String aFiltro) {
		
		return null;
	}
	
	public void eliminarPublicacion(int aIdPublicacion) {
		try {
			publicacion.eliminarPublicacion(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void borrarComentario(int aIdComentario, int aIdPublicacion, String aNombreUsuarioPropietario) {
		
		
	}
	
	public void addFoto(String aFoto) {
		
		
	}
	
	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID) {
		
		
	}
	
	public List realizarBusqueda(String aBusqueda, Object aFiltro) {
		
		return null;
	}
	
	public List filtrarDenuncias(String aFiltro) {
		
		return null;
	}
	
	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword) {
		
		return null;
	}
	
	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion,
			String aVideo, Object aUsuarioComercialID) {
		
		return null;
	}
	
	public void editarPerfilUC(String aNombreUsuario, String aNuevoNombreUsuario, String aNombreEmpresa,
			String aDescripcion, String aFoto) {
		
		
	}
	
	public void eliminarSeleecion(List aSeleccion) {
		
		
	}
	
	public void eliminarPublicacoinUC(int aIdPublicacion) {
		
		
	}
	
	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion) {
		
		
	}
	
	public List cargarUsuariosMeGustas(int aIdPublicacion) {
		
		return null;
	}

}