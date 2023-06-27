package basededatos;

import bd_dcl.UsuarioComercial;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Comentario;
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
		return cargarUsuarioRegistrado(aNombreUsuario, aPassword);
	}

	public UsuarioRegistrado iniciarSesionOtrasPlataformas(String aEmail) {

		return null;
	}

	public UsuarioRegistrado usarOtraCuenta(String aNombreUsuarioOemail, String aPassword) {

		return null;
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		int id = Integer.parseInt(aNombreUsuario);
		try {
			String password = this.usuario_registrado.recuperarPassword(aEmailRecuperacion, aNuevaPassword, aNombreUsuario, id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aNuevaPassword;
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

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario, int UsuarioID) {
		try {
			this.comentarios.comentarPublicacion(aIdPublicacion, aNombreUsuario, aComentario, UsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void meGustaComentario(int aIdComentario, String aNombreUsuario, int aUsuarioID) {
		try {
			this.comentarios.meGustaComentario(aIdComentario, aNombreUsuario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cambiarFotoPerfil(int aUsuarioID, String aNombreUsuario, String aFoto) {
		try {
			this.usuario_registrado.cambiarFotoPerfil(aNombreUsuario, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editarPerfilUR(int aUsuarioID, String aNuevoNombreUsuario, String aNombre, String aDescripcion,
			String aFoto) {
		try {
			this.usuario_registrado.editarPerfilUR(aNuevoNombreUsuario, aNuevoNombreUsuario, aNombre, aDescripcion, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminarSeleccion(List aListaSeleccion) {
		try {
			this.publicacion.eliminarSeleccion(aListaSeleccion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario, int aUsuarioID) {
		try {
			this.publicacion.meGustaPublicacion(aIdPublicacion, aNombreUsuario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue, int aUsuarioSeguidoID,
			int aUsuarioSeguidorID) {
		try {
			this.usuario_registrado.seguirUsuario(aNombreUsuarioASeguir, aNombreUsuarioSigue, aUsuarioSeguidoID, aUsuarioSeguidorID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario, int aUsuarioSeguidoID,
			int aUsuarioDejaSeguirID) {
		try {
			this.usuario_registrado.dejarSeguirUsuario(aNombreUsuarioDejarSeguir, aNombreUsuario, aUsuarioSeguidoID, aUsuarioDejaSeguirID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag) {
		Hashtag hashtagCargado = null;
		try {
			hashtagCargado = this.hashtag.cargarHashtag(aIdHashtag, aNombreHashstag);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hashtagCargado;
	}

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion, int aUsuarioID) {
		try {
			this.denuncia.denunciarPublicacion(aIdPublicacion, aNombreUsuarioDenunciante, aMotivo, aExplicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Comentario> cargarComentariosTOP(int aIdPublicacion) {
		List<Comentario> top = null;
		try {
			top = this.comentarios.cargarComentariosTOP(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return top;
	}

	public List cargarListaUsuariosTOP() {
		List<UsuarioRegistrado> usuariosTop = new ArrayList<UsuarioRegistrado>();
		try {
			List<UsuarioRegistrado> usuarios = usuario_registrado.cargarListaUsuariosTOP();
			for(int i = 0; i < usuarios.size() && i < 5 ; i++) {
				usuariosTop.add(usuarios.get(i));
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuariosTop;
	}

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo,
			int aUsuarioDenunciaID, int aUsuarioDenunciadoID) {
		try {
			this.denuncia.denunciarUsuario(aNombreUsuarioDenunciado, aNombreUsuarioDenunciante, aMotivo, aUsuarioDenunciaID, aUsuarioDenunciadoID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion, int aUsuarioID) {

		try {
			this.denuncia.denunciarComentario(aIdComentario, aNombreUsuarioDenunciante, aMotivo, aExplicacion, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public List<Object> realizarBusqueda(String aBusqueda, String aFiltro) {
		List<Object> resultado = null;
		try {
			if(aFiltro.equals("Hashtags")) {
				resultado.addAll(this.hashtag.buscarHashtag(aBusqueda));
			}else if(aFiltro.equals("Usuarios")) {
				resultado.addAll(this.usuario_registrado.buscarUsuario(aBusqueda));
			}else {
				resultado.addAll(this.usuario_registrado.buscarUsuario(aBusqueda));
				resultado.addAll(this.hashtag.buscarHashtag(aBusqueda));
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword,
			String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		try {
			if(aTipoCuenta) {
				this.usuario_registrado.registrarUsuario(aNombre, aApellidos, aEmail, aPassword, aDescripcion, aNombreUsuario, aFechaNacimiento, aTipoCuenta, aFoto);
			}else {
				this.comercial.registrarUsuario(aNombre, aEmail, aPassword, aDescripcion, aNombreUsuario, aFechaNacimiento, aFoto);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargarUsuariosUNR() {
		List<UsuarioRegistrado> usuarios = null;
		try {
			usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public List<Hashtag> cargarListaHashtags() {
		List<Hashtag> listaHashtags = null;
			try {
				listaHashtags = this.hashtag.cargarListaHashtags();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return listaHashtags;
	}

	public UsuarioAdministrador cargarAdministrador(String aNombreAdmin, String aPassword) {
		UsuarioAdministrador administrador = null;
		try {
			int codigoEmpleado = Integer.parseInt(aNombreAdmin);
			administrador = this._c_usuarioAdministrador.cargarAdministrador(codigoEmpleado, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return administrador;
	}

	public List cargarPublicacionesUsuarios() {

		List lista = null;
		try {
			lista = this.publicacion.cargarPublicacionesUsuarios();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List cargarListaUsuariosRegistrados() {
		List<UsuarioRegistrado> usuarios = null;
		try {
			usuarios = usuario_registrado.cargarListaUsuariosRegistrados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public List cargarTendencias() {
		List<Hashtag> tendencias = null;
		try {
			tendencias = this.hashtag.cargarTendencias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tendencias;
	}

	public List ordenarUsuarios(String aFiltro) {
		List lista = null;
		lista = this.usuario_registrado.ordenarUsuarios(aFiltro);
		return lista;
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

	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID) {
		
		try {
			this.usuario_registrado.bloquearUsuario(aNombreUsuario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List filtrarDenuncias(String aFiltro) {

		return null;
	}

	public UsuarioComercial cargarUsuarioComercial(String aNombreUsuario, String aPassword) {
		UsuarioComercial comercial = null;
		try {
			comercial = this.comercial.cargarUsuarioComercial(aNombreUsuario, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comercial;

	}

	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion,
			String aVideo, Object aUsuarioComercialID) {

		return null;
	}

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto, int aUsuarioID){
		try {
			this.comercial.editarPerfilUC(aNuevoNombreUsuario, aNombreEmpresa, aDescripcion, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void eliminarPublicacoinUC(int aIdPublicacion) {
		try {
			this.publicacion.eliminarPublicacion(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo,
			String aExplicacion) {


	}

	public List cargarUsuariosMeGustas(int aIdPublicacion) {

		return null;
	}

}