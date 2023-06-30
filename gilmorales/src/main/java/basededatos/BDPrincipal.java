package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import bd_dcl.Comentario;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioComercialDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class BDPrincipal implements iUsuario_comercial, iVer_perfil__Administrador_, iAdministrador, iUsuario_No_Registrado, iVer_notificaciones_usuario_publico, iVer_notificaciones_usuario_privado, iVer_perfil_publico, iVer_perfil_privado, iVer_perfil, iPlataformas_externas, iUsuario_Registrado, iIniciar_sesion {
	public Comentarios comentarios = new Comentarios();
	public Notificaciones notificaciones = new Notificaciones();
	public UsuariosRegistrados usuario_registrado = new UsuariosRegistrados();
	public Publicaciones publicacion = new Publicaciones();
	public UsuariosComerciales comercial = new UsuariosComerciales();
	public Hashtags hashtag = new Hashtags();
	public UsuariosAdministradores _c_usuarioAdministrador = new UsuariosAdministradores();
	public Denuncias denuncia = new Denuncias();

	TreeMap<String, String> nombresUsuarios = new TreeMap<String, String>();

	public UsuarioComercial cargarUsuarioComercial(int aUsuarioComercialID) {
		UsuarioComercial comercial = null;
		try {
			comercial = this.comercial.cargarUsuarioComercial(aUsuarioComercialID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comercial;
	}

	public Publicacion addPublicacionComercial(String aNombreUsuarioComercial, String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioComercialID) {
		Publicacion p = null;
		try {
			p = this.publicacion.addPublicacion(aNombreUsuarioComercial, aLocalizacion, aDescripcion, aVideo, aUsuarioComercialID);
//			this.publicacion.crearHashtag(p);
//			this.publicacion.crearMencion(p);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	public void editarPerfilUC(String aNuevoNombreUsuario, String aNombreEmpresa, String aDescripcion, String aFoto, int aUsuarioID){
		try {
			this.comercial.editarPerfilUC(aNuevoNombreUsuario, aNombreEmpresa, aDescripcion, aFoto, aUsuarioID);
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

	public void eliminarPublicacoinUC(int aIdPublicacion) {
		try {
			this.publicacion.eliminarPublicacion(aIdPublicacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void denunciarComentario(int aIdComentario, String aMotivo, String aExplicacion, int aUsuarioID) {
		try {
			this.denuncia.denunciarComentario(aIdComentario, aMotivo, aExplicacion, aUsuarioID);
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

	public List<Hashtag> cargarListaHashtags() {
		List<Hashtag> lista = null;
		try {
			lista = this.hashtag.cargarListaHashtags();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
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

	public void borrarComentario(int aIdComentario, int aIdPublicacion, int aIDUsuarioPropietario) {
		try {
			this.comentarios.borrarComentario(aIdComentario, aIdPublicacion, aIDUsuarioPropietario);
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

	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID) {
		try {
			this.usuario_registrado.bloquearUsuario(aNombreUsuario, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List realizarBusqueda(String aBusqueda, String aFiltro) {
		List resultado = new ArrayList();
		try {
			if(aFiltro.equals("Hashtags")) {
				resultado.clear();
				resultado.addAll(this.hashtag.buscarHashtag(aBusqueda));
			}else if(aFiltro.equals("Usuarios")) {
				resultado.clear();
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

	public List filtrarDenuncias(String aFiltro) {
		List lista = null;
		try {
			lista = this.denuncia.filtrarDenuncias(aFiltro);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		try {
			if(!nombresUsuarios.containsKey(aNombreUsuario)) {
				if(aTipoCuenta) {
					nombresUsuarios.put(aNombreUsuario, "UsuarioRegistrado");
					this.usuario_registrado.registrarUsuario(aNombre, aApellidos, aEmail, aPassword, aDescripcion, aNombreUsuario, aFechaNacimiento, aTipoCuenta, aFoto);
				}else if(aTipoCuenta == false){
					nombresUsuarios.put(aNombreUsuario, "UsuarioComercial");
					this.comercial.registrarUsuario(aNombre, aEmail, aPassword, aDescripcion, aNombreUsuario, aFechaNacimiento, aFoto);

				}
			}else {
				Notification.show("El nombre de usuario elegido esta ocupado. Por favor, elija otro nombre de usuario");
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargarUsuariosUNR() {
		List<UsuarioRegistrado> usuarios = null;
		try {
			usuarios = usuario_registrado.cargarUsuariosUNR();
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public UsuarioRegistrado cargarUsuarioRegistrado(int aUsuarioID) {
		UsuarioRegistrado usuario = null;
		try {
			usuario = usuario_registrado.cargarUsuarioRegistrado(aUsuarioID);
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
			this.usuario_registrado.cambiarFotoPerfil(aNombreUsuario, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editarPerfilUR(String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto, int aUsuarioID) {
		try {
			this.usuario_registrado.editarPerfilUR(aNuevoNombreUsuario, aNombre, aDescripcion, aFoto, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void meGustaPublicacion(int aIdPublicacion, int aUsuarioID) {
		try {
			this.publicacion.meGustaPublicacion(aIdPublicacion, aUsuarioID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void seguirUsuario(int aUsuarioSeguidorID, int aUsuarioAseguirID) {
		try {
			this.usuario_registrado.seguirUsuario(aUsuarioSeguidorID, aUsuarioAseguirID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dejarSeguirUsuario(int aUsuarioDejaSeguirID, int aUsuarioDejadoSeguirID) {
		try {
			this.usuario_registrado.dejarSeguirUsuario(aUsuarioDejaSeguirID, aUsuarioDejadoSeguirID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo, int aUsuarioID) {
		Publicacion p = null;
		try {
			p = this.publicacion.addPublicacion(aNombreUsuario, aLocalizacion, aDescripcion, aVideo, aUsuarioID);
			this.publicacion.crearHashtag(p);
			this.publicacion.crearMencion(p);
		}catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void denunciarPublicacion(int aIdPublicacion, String aMotivo, String aExplicacion, int aUsuarioID) {
		try {
			this.denuncia.denunciarPublicacion(aIdPublicacion, aMotivo, aExplicacion, aUsuarioID);
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

	public void denunciarUsuario(String aExplicacion, String aMotivo, int aUsuarioDenuncianteID, int aUsuarioDenunciadoID) {
		try {
			this.denuncia.denunciarUsuario(aUsuarioDenunciadoID, aExplicacion, aMotivo, aUsuarioDenuncianteID);
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

	public Object iniciarSesion(String aNombreUsuario, String aPassword) {
		Object user = null;
		try {
			// Realizar la consulta utilizando el método queryUsuarioRegistrado
			
			System.out.println(nombresUsuarios.get(aNombreUsuario));
			List<UsuarioRegistrado> usuariosRegistrados = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			// Verificar si se encontró un usuario con el nombre especificado
			if (!usuariosRegistrados.isEmpty()) {
				for(UsuarioRegistrado ur : usuariosRegistrados) {
					System.out.println("Hay usuarios");
					if(ur.getNombreUsuario().equals(aNombreUsuario) && ur.getPassword().equals(aPassword)) {
						user = usuario_registrado.cargarUsuarioRegistrado(ur.getID());
						break;
					}
				}

			} 
			List<UsuarioComercial> comerciales = UsuarioComercialDAO.queryUsuarioComercial(null, null);
			if (!comerciales.isEmpty()) {
					for(UsuarioComercial uc : comerciales) {
						if(uc.getNombreUsuarioComercial().equals(aNombreUsuario) && uc.getPassword().equals(aPassword)) 
							user = comercial.cargarUsuarioComercial(uc.getID());
					}
			}else if(aNombreUsuario.equals("admin") && aPassword.equals("admin")) { 
				user = _c_usuarioAdministrador.cargarAdministrador(0);
			}else {
				// Manejar el caso en el que no se encontró ningún usuario con el nombre especificado
				Notification.show("Usuario y/o contraseña incorrecta.");
			}
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
			String password = this.usuario_registrado.recuperarPassword(aEmailRecuperacion, aNuevaPassword, aNombreUsuario, id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aNuevaPassword;
	}
}