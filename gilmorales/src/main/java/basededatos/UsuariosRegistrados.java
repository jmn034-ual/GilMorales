package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

import org.hibernate.mapping.Collection;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class UsuariosRegistrados {
	public BDPrincipal _c_bd_usuario_registrado;
	public Vector<UsuarioRegistrado> _usuarioRegistrado = new Vector<UsuarioRegistrado>();

	public UsuarioRegistrado cargarUsuarioRegistrado(int aUsuarioID) throws PersistentException {
		UsuarioRegistrado usuario = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);

		} catch (Exception e) {
			t.rollback();
		}
		return usuario;
	}

	public void configurarPerfil(int usuarioID, int privacidad) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(usuarioID);
			usuario.setPrivacidad(privacidad);
			UsuarioRegistradoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public List cargarListaUsuariosRegistrados() throws PersistentException {
		List<UsuarioRegistrado> usuarios = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
		} catch (Exception e) {
			t.rollback();
		}
		return usuarios;
	}

	public void cambiarFotoPerfil(String aNombreUsuario, String aFoto, int aUsuarioID) throws PersistentException {

		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado user = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			if (user.getNombreUsuario().equals(aNombreUsuario)) {
				user.setFoto(aFoto);
				UsuarioRegistradoDAO.save(user);
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();

	}

	public void editarPerfilUR(String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto,
			int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			usuario.setNombre(aNombre);
			usuario.setNombreUsuario(aNuevoNombreUsuario);
			usuario.setFoto(aFoto);
			usuario.setDescripcion(aDescripcion);
			UsuarioRegistradoDAO.save(usuario);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public void seguirUsuario(int aUsuarioSeguidorID, int aUsuarioAseguirID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado userSigue = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioSeguidorID);
			UsuarioRegistrado userAseguir = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioAseguirID);
			if (!userAseguir.seguidor.contains(userSigue) && (userSigue.getID() != userAseguir.getID())) {
				userAseguir.seguidor.add(userSigue);
				userSigue.seguir.add(userAseguir);
				Notificacion notificacion = NotificacionDAO.createNotificacion();
				notificacion.setTipoNotificacion(0);
				notificacion.setEnviadaA(userAseguir);
				notificacion.setIDUsuarioNotifica(userSigue.getID());
				NotificacionDAO.save(notificacion);
			} else {
				userAseguir.seguidor.remove(userSigue);
				userSigue.seguir.remove(userAseguir);
			}
			UsuarioRegistradoDAO.save(userAseguir);
			UsuarioRegistradoDAO.save(userSigue);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public List<UsuarioRegistrado> buscarUsuario(String aNombreUsuario) throws PersistentException {
		if (aNombreUsuario == "")
			return null;
		List lista = null;
		List<UsuarioRegistrado> usuariosCoincidentes = new ArrayList<UsuarioRegistrado>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			for (int i = 0; i < lista.size(); i++) {
				UsuarioRegistrado usuario = (UsuarioRegistrado) lista.get(i);
				if (usuario.getNombreUsuario().equals(aNombreUsuario)) {
					usuariosCoincidentes.add(usuario);
				} else if (aNombreUsuario.length() > 1) {
					if (usuario.getNombreUsuario().startsWith(aNombreUsuario.substring(0, 1))
							|| usuario.getNombreUsuario().startsWith(aNombreUsuario.substring(0, 2))) {
						usuariosCoincidentes.add(usuario);
					}
				}
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		return usuariosCoincidentes;
	}

	public List<UsuarioRegistrado> cargarListaUsuariosTOP() throws PersistentException {
		List<UsuarioRegistrado> usuariosTop = new ArrayList<UsuarioRegistrado>();

		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<UsuarioRegistrado> usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			TreeMap<Integer, UsuarioRegistrado> datos = new TreeMap<Integer, UsuarioRegistrado>(
					Collections.reverseOrder());
			for (UsuarioRegistrado user : usuarios) {
				List<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
				int numMeGustas = 0;
				for (Publicacion publicacion : publicaciones) {
					numMeGustas += publicacion.getNumMeGustas();
				}
				if (numMeGustas != 0) {
					if (!datos.containsKey(numMeGustas)) {
						datos.put(numMeGustas, user);
					} else {
						usuariosTop.add(user);
					}
				}
			}

			for (Entry<Integer, UsuarioRegistrado> d : datos.entrySet()) {
				if ((usuariosTop.size() < 5)) {
					usuariosTop.add(d.getValue());
				} else {
					break;
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuariosTop;
	}

	public List ordenarUsuarios(String aFiltro) {
		List<UsuarioRegistrado> lista = null;
		try {
			lista = cargarListaUsuariosRegistrados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public UsuarioRegistrado registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword,
			String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto)
			throws PersistentException {
		UsuarioRegistrado user = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			if (aTipoCuenta) {
				UsuarioRegistrado ur = UsuarioRegistradoDAO.createUsuarioRegistrado();
				UsuarioRegistrado nombreRepetido = UsuarioRegistradoDAO
						.loadUsuarioRegistradoByQuery(("nombreUsuario = '" + aNombreUsuario + "'"), null);
				if (nombreRepetido != null) {
					return null;
				}
				ur.setNombre(aNombre);
				ur.setApellidos(aApellidos);
				ur.setEmail(aEmail);
				ur.setPassword(aPassword);
				ur.setDescripcion(aDescripcion);
				ur.setNombreUsuario(aNombreUsuario);
				ur.setFechaNacimiento(aFechaNacimiento.toString());
				ur.setFoto(aFoto);
				ur.setPrivacidad(0);
				UsuarioRegistradoDAO.save(ur);
				user = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(ur.getID());
				this._usuarioRegistrado.add(user);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return user;
	}

	public List cargarUsuariosUNR() throws PersistentException {
		List<UsuarioRegistrado> usuarios = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuarios;
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario,
			int aUsuarioID) throws PersistentException {
		String password = "";
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			password = usuario.getPassword();
			if (!password.equals(aNuevaPassword)) {
				usuario.setPassword(aNuevaPassword);
				password = aNuevaPassword;
				UsuarioRegistradoDAO.save(usuario);
			}
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return password;
	}

	public UsuarioRegistrado bloquearUsuario(int aUsuarioID) throws PersistentException {
		UsuarioRegistrado usuario = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			if (usuario.getPrivacidad() != 3) {
				usuario.setPrivacidad(3);
				System.out.println(usuario.getPrivacidad());
			} else {
				System.out.println(usuario.getPrivacidad());
				usuario.setPrivacidad(0);
			}
			UsuarioRegistradoDAO.save(usuario);
			t.commit();

//			UsuarioRegistradoDAO.deleteAndDissociate(usuario);
		} catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return usuario;
	}
}