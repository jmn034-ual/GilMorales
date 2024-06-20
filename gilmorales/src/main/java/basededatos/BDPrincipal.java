package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import bd_dcl.Comentario;
import bd_dcl.Denuncia;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioComercialDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class BDPrincipal
		implements iUsuario_comercial, iVer_perfil__Administrador_, iAdministrador, iUsuario_No_Registrado,
		iVer_notificaciones_usuario_publico, iVer_notificaciones_usuario_privado, iVer_perfil_publico,
		iVer_perfil_privado, iVer_perfil, iPlataformas_externas, iUsuario_Registrado, iIniciar_sesion {
	public Comentarios comentarios = new Comentarios();
	public Notificaciones notificaciones = new Notificaciones();
	public UsuariosRegistrados usuarios_registrados = new UsuariosRegistrados();
	public Publicaciones publicaciones = new Publicaciones();
	public UsuariosComerciales comerciales = new UsuariosComerciales();
	public Hashtags hashtags = new Hashtags();
	public UsuariosAdministradores _c_usuarioAdministrador = new UsuariosAdministradores();
	public Denuncias denuncias = new Denuncias();

	TreeMap<String, String> nombresUsuarios = new TreeMap<String, String>();

	public UsuarioComercial cargarUsuarioComercial(int aUsuarioComercialID) {
		UsuarioComercial comercial = null;
		try {
			comercial = this.comerciales.cargarUsuarioComercial(aUsuarioComercialID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comercial;
	}

	public List cargarDenuncias() {
		List<Denuncia> denuncias = null;
		try {
			denuncias = this.denuncias.cargarDenuncias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return denuncias;
	}
	
	public Publicacion cargarPublicacion(int idPublicacion) {
		Publicacion publi = null;

		try {
			publi = this.publicaciones.cargarPublicacion(idPublicacion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return publi;
	}

	public Hashtag cargarHashtag(int idHashtag, String nombre) {
		Hashtag h = null;
		try {
			h = this.hashtags.cargarHashtag(idHashtag, nombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}

	public Publicacion addPublicacionComercial(String aLocalizacion,
			String aDescripcion, String aVideo, int aUsuarioComercialID) {
		Publicacion p = null;
		try {
			p = this.publicaciones.addPublicacionComercial(aLocalizacion, aDescripcion, aVideo, aUsuarioComercialID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto,
			int aUsuarioID) {
		try {
			this.comerciales.editarPerfilUC(aNuevoNombreUsuario, aNombreEmpresa, aDescripcion, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void eliminarSeleccion(List aListaSeleccion) {
		try {
			this.publicaciones.eliminarSeleccion(aListaSeleccion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminarPublicacoinUC(int aIdPublicacion) {
		try {
			this.publicaciones.eliminarPublicacion(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void denunciarComentario(int aIdComentario, String aMotivo, String aExplicacion, int aUsuarioID) {
		try {
			this.denuncias.denunciarComentario(aIdComentario, aMotivo, aExplicacion, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargarUsuariosMeGustas(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public UsuarioAdministrador cargarAdministrador(int aCodigoEmpleado) {
		UsuarioAdministrador administrador = null;
		try {
			administrador = this._c_usuarioAdministrador.cargarAdministrador(aCodigoEmpleado);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return administrador;
	}

	public List cargarPublicacionesUsuarios() {

		List lista = null;
		try {
			lista = this.publicaciones.cargarPublicacionesUsuarios();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List cargarListaUsuariosRegistrados() {
		List<UsuarioRegistrado> usuarios = null;
		try {
			usuarios = usuarios_registrados.cargarListaUsuariosRegistrados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public List<Hashtag> cargarListaHashtags() {
		List<Hashtag> lista = null;
		try {
			lista = this.hashtags.cargarListaHashtags();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List cargarTendencias() {
		List<Hashtag> tendencias = null;
		try {
			tendencias = this.hashtags.cargarTendencias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tendencias;
	}

	public List ordenarUsuarios(String aFiltro) {
		List lista = null;
		lista = this.usuarios_registrados.ordenarUsuarios(aFiltro);
		return lista;
	}

	public void eliminarPublicacion(int aIdPublicacion) {
		try {
			publicaciones.eliminarPublicacion(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void borrarComentario(int aIdComentario) {
		try {
			this.comentarios.borrarComentario(aIdComentario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addFoto(String aFoto, int aCodigoEmpleado) {
		try {
			this._c_usuarioAdministrador.addFoto(aFoto, aCodigoEmpleado);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bloquearUsuario(int aUsuarioID) {
		try {
			this.usuarios_registrados.bloquearUsuario(aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Object> realizarBusqueda(String aBusqueda, String aFiltro) {
		ArrayList<Object> resultado = new ArrayList<Object>();
		try {
			if (aFiltro.equals("Hashtags")) {
				resultado.clear();
				resultado.addAll(this.hashtags.buscarHashtag(aBusqueda));
			} else if (aFiltro.equals("Usuarios")) {
				resultado.clear();
				resultado.addAll(this.usuarios_registrados.buscarUsuario(aBusqueda));
			} else {
				resultado.addAll(this.usuarios_registrados.buscarUsuario(aBusqueda));
				resultado.addAll(this.hashtags.buscarHashtag(aBusqueda));
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	public List filtrarDenuncias(String aFiltro) {
		List lista = null;
		try {
			lista = this.denuncias.filtrarDenuncias(aFiltro);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	// La estructura nombresUsuarios no sirve para nada, por tanto tengo que darle
	// una vuelta para que no se puedan registrar usuarios con el mismo nombre
	public Object registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword,
			String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		Object user = null;
		try {
			if (!nombresUsuarios.containsKey(aNombreUsuario)) {
				if (aTipoCuenta) {
					nombresUsuarios.put(aNombreUsuario, "UsuarioRegistrado");
					user =  this.usuarios_registrados.registrarUsuario(aNombre, aApellidos, aEmail, aPassword, aDescripcion,
							aNombreUsuario, aFechaNacimiento, aTipoCuenta, aFoto);
				} else if (aTipoCuenta == false) {
					nombresUsuarios.put(aNombreUsuario, "UsuarioComercial");
					user = this.comerciales.registrarUsuario(aNombre, aEmail, aPassword, aDescripcion, aNombreUsuario,
							aFechaNacimiento, aFoto);

				}
			} else {
				Notification.show("El nombre de usuario elegido esta ocupado. Por favor, elija otro nombre de usuario");
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public List cargarUsuariosUNR() {
		List<UsuarioRegistrado> usuarios = null;
		try {
			usuarios = usuarios_registrados.cargarUsuariosUNR();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public UsuarioRegistrado cargarUsuarioRegistrado(int aUsuarioID) {
		UsuarioRegistrado usuario = null;
		try {
			usuario = usuarios_registrados.cargarUsuarioRegistrado(aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}

	public void comentarPublicacion(int aIdPublicacion, int aUsuarioID, String aComentario) {
		try {
			this.comentarios.comentarPublicacion(aIdPublicacion, aComentario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void meGustaComentario(int aIdComentario, int aUsuarioID) {
		try {
			this.comentarios.meGustaComentario(aIdComentario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cambiarFotoPerfil(int aUsuarioID, String aNombreUsuario, String aFoto) {
		try {
			this.usuarios_registrados.cambiarFotoPerfil(aNombreUsuario, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editarPerfilUR(String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto,
			int aUsuarioID) {
		try {
			this.usuarios_registrados.editarPerfilUR(aNuevoNombreUsuario, aNombre, aDescripcion, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void meGustaPublicacion(int aIdPublicacion, int aUsuarioID) {
		try {
			this.publicaciones.meGustaPublicacion(aIdPublicacion, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void seguirUsuario(int aUsuarioSeguidorID, int aUsuarioAseguirID) {
		try {
			this.usuarios_registrados.seguirUsuario(aUsuarioSeguidorID, aUsuarioAseguirID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dejarSeguirUsuario(int aUsuarioDejaSeguirID, int aUsuarioDejadoSeguirID) {
		try {
			this.usuarios_registrados.dejarSeguirUsuario(aUsuarioDejaSeguirID, aUsuarioDejadoSeguirID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Publicacion addPublicacion(String aLocalizacion, String aDescripcion, String aVideo,
			int aUsuarioID) {
		Publicacion p = null;
		try {
			p = this.publicaciones.addPublicacion(aLocalizacion, aDescripcion, aVideo, aUsuarioID);
			this.publicaciones.crearHashtag(p);
			this.publicaciones.crearMencion(p);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	public void denunciarPublicacion(int aIdPublicacion, String aMotivo, String aExplicacion, int aUsuarioID) {
		try {
			this.denuncias.denunciarPublicacion(aIdPublicacion, aMotivo, aExplicacion, aUsuarioID);
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

	public List<UsuarioRegistrado> cargarListaUsuariosTOP() {
		List<UsuarioRegistrado> usuariosTop = null;
		try {
			usuariosTop = usuarios_registrados.cargarListaUsuariosTOP();
//			for (int i = 0; i < usuarios.size() && i < 5; i++) {
//				usuariosTop.add(usuarios.get(i));
//			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuariosTop;
	}

	public void denunciarUsuario(String aExplicacion, String aMotivo, int aUsuarioDenuncianteID,
			int aUsuarioDenunciadoID) {
		try {
			this.denuncias.denunciarUsuario(aUsuarioDenunciadoID, aExplicacion, aMotivo, aUsuarioDenuncianteID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargarListaHashtagTOP() {
		List<Hashtag> listaHashtags = null;
		try {
			listaHashtags = hashtags.cargarListaHashtagsTOP();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaHashtags;
	}

	public Object iniciarSesion(String aNombreUsuario, String aPassword) {
		Object user = null;
		try {
			// Realizar la consulta utilizando el método queryUsuarioRegistrado
			List<Object> usuarios = new ArrayList<>();
			usuarios.addAll(UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null));
			usuarios.addAll(UsuarioComercialDAO.queryUsuarioComercial(null, null));

			if (aNombreUsuario.equals("admin") && aPassword.equals("admin")) {
				user = _c_usuarioAdministrador.cargarAdministrador(999);
				return user;
			}
			
			// Verificar si se encontró un usuario con el nombre especificado
			if (!usuarios.isEmpty()) {
				for (Object ur : usuarios) {
					if (ur instanceof UsuarioRegistrado) {
						UsuarioRegistrado userAux = cargarUsuarioRegistrado(Integer.parseInt(ur.toString()));
						if (userAux.getNombreUsuario().equals(aNombreUsuario)
								&& userAux.getPassword().equals(aPassword)) {
							return user = usuarios_registrados.cargarUsuarioRegistrado(userAux.getID());
						}
					} else if (ur instanceof UsuarioComercial) {
						UsuarioComercial userAux = cargarUsuarioComercial(Integer.parseInt(ur.toString()));
						if (userAux.getNombreUsuarioComercial().equals(aNombreUsuario)
								&& userAux.getPassword().equals(aPassword)) {
							return user = comerciales.cargarUsuarioComercial(userAux.getID());
						}
					}
				}

			}
			
//			 PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
//	            String condition = "NombreUsuario = '" + aNombreUsuario + "' AND Password = '" + aPassword + "'";
//	            List<UsuarioRegistrado> usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(session, condition, null);
//	            if (usuarios != null && !usuarios.isEmpty()) {
//	                return usuarios.get(0);
//	            }
//	            return null;

		} catch (PersistentException e) {
			e.printStackTrace();
			// Manejar la excepción
		}
		return user;
	}

	public UsuarioRegistrado iniciarSesionOtrasPlataformas(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado usarOtraCuenta(String aNombreUsuarioOemail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		int id = Integer.parseInt(aNombreUsuario);
		try {
			String password = this.usuarios_registrados.recuperarPassword(aEmailRecuperacion, aNuevaPassword,
					aNombreUsuario, id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aNuevaPassword;
	}
}