package basededatos;

import bd_dcl.UsuarioComercial;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.HashtagDAO;
import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;

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

	public void crearHashtag(Publicacion p) {
		Pattern hashtag = Pattern.compile("#(\\w+)");
		Matcher h = hashtag.matcher(p.getDescripcion());
		try {
			while (h.find()) {
				String nombreHashtag = h.group(1);
				List<Hashtag> listaHashtag = HashtagDAO.queryHashtag(null, null);
				if(listaHashtag.isEmpty()) {
					Hashtag nuevoHashatag = HashtagDAO.createHashtag();
					nuevoHashatag.setNombreHashtag(nombreHashtag);
					nuevoHashatag.aparece.add(p);
					HashtagDAO.save(nuevoHashatag);	
				}else {
					for(Hashtag h2 : listaHashtag) {
						if(!h2.getNombreHashtag().equals(nombreHashtag)) {
							Hashtag nuevoHashatag = HashtagDAO.createHashtag();
							nuevoHashatag.setNombreHashtag(nombreHashtag);
							nuevoHashatag.aparece.add(p);
							HashtagDAO.save(nuevoHashatag);	
							break;
						}else if(h2.getNombreHashtag().equals(nombreHashtag)){
							h2.aparece.add(p);
							HashtagDAO.save(h2);
						}
					}	
				}
			}
			GilMoralesPersistentManager.instance().disposePersistentManager();
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void crearMencion(Publicacion p) {
		Pattern mencion = Pattern.compile("@(\\w+)");
		Matcher m = mencion.matcher(p.getDescripcion());
		try {
			while (m.find()) {
				List<UsuarioRegistrado> lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
				for(UsuarioRegistrado ur : lista) {
					if(ur.getNombreUsuario().equals(m.group(1))) {	
						Notificacion notificacion = NotificacionDAO.createNotificacion();
						notificacion.setTipoNotificacion(3);
						notificacion.setEnviadaA(ur);
						notificacion.setUsuarioRegistradoIDNotifica(p.getPerteneceA().getID());
						NotificacionDAO.save(notificacion);
						break;
					}
				}
			}
			GilMoralesPersistentManager.instance().disposePersistentManager();
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo,
			int aUsuarioID) {
		Publicacion p = null;
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuarioID);
			p = publicacion.addPublicacion(usuario.getNombreUsuario(), aLocalizacion, aDescripcion, aVideo, aUsuarioID);
			/*Añadimos los posibles hashtag y/o menciones */
			crearHashtag(p);
			crearMencion(p);
			GilMoralesPersistentManager.instance().disposePersistentManager();
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
		List<UsuarioRegistrado> usuariosTop = new ArrayList<UsuarioRegistrado>();
		try {
			List<UsuarioRegistrado> usuarios = usuario_registrado.cargarListaUsuariosTOP();
			for(int i = 0; i < usuarios.size() && i < 5 ; i++) {
				usuariosTop.add(usuarios.get(i));
			}
//			usuariosTop.add(usuarios.get(0));
//			usuariosTop.add(usuarios.get(1));
//			usuariosTop.add(usuarios.get(2));
//			usuariosTop.add(usuarios.get(3));
//			usuariosTop.add(usuarios.get(4));

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuariosTop;
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
		List<Hashtag> hashtags = null;
		try {
			hashtags = hashtag.cargarListaHashtagsTOP();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return hashtags;
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