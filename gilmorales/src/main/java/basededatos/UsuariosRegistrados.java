package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
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
		return usuario;	}

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
			if(user.getNombreUsuario().equals(aNombreUsuario)) {
				user.setFoto(aFoto);
				UsuarioRegistradoDAO.save(user);
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();

	}
	public void editarPerfilUR(String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			usuario.setNombre(aNombre);
			usuario.setNombreUsuario(aNuevoNombreUsuario);
			cambiarFotoPerfil(usuario.getNombreUsuario(), aFoto, aUsuarioID);
			usuario.setDescripcion(aDescripcion);
			UsuarioRegistradoDAO.save(usuario);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	}

	public void seguirUsuario(int aUsuarioSeguidorID, int aUsuarioAseguirID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado userSigue = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioSeguidorID);
			UsuarioRegistrado userAseguir = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioAseguirID);
			if(!userAseguir.seguidor.contains(userSigue)) {
				userAseguir.seguidor.add(userSigue);
				userSigue.seguir.add(userAseguir);
				UsuarioRegistradoDAO.save(userAseguir);
				UsuarioRegistradoDAO.save(userSigue);
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	
	}

	public void dejarSeguirUsuario(int aUsuarioDejaSeguirID, int aUsuarioDejadoSeguirID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado userDejaSeguir = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioDejaSeguirID);
			UsuarioRegistrado user = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioDejadoSeguirID);
			if(user.seguidor.contains(userDejaSeguir)) {
				userDejaSeguir.seguir.remove(user);
				user.seguidor.remove(userDejaSeguir);
				UsuarioRegistradoDAO.save(userDejaSeguir);
				UsuarioRegistradoDAO.save(user);
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	
	}

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public List buscarUsuario(String aNombreUsuario) throws PersistentException {
		if(aNombreUsuario == "") return null;
		List lista = null;
		List<UsuarioRegistrado> usuariosCoincidentes = new ArrayList<UsuarioRegistrado>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			for(int i = 0; i < lista.size(); i++) {
				UsuarioRegistrado usuario = (UsuarioRegistrado) lista.get(i);
				if(usuario.getNombreUsuario().equals(aNombreUsuario) || usuario.getNombreUsuario().startsWith(aNombreUsuario.substring(0, 3))
						|| usuario.getNombreUsuario().startsWith(aNombreUsuario.substring(0, 4))) {
					usuariosCoincidentes.add(usuario);
				}
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		return usuariosCoincidentes;
	}

	public List cargarListaUsuariosTOP() throws PersistentException {
		List<UsuarioRegistrado> usuariosTop = new ArrayList<UsuarioRegistrado>();

		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<UsuarioRegistrado> usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			HashMap<UsuarioRegistrado, Integer> datos = new HashMap<UsuarioRegistrado, Integer>();
			for(UsuarioRegistrado user : usuarios) {
				List<Publicacion> publicaciones = new ArrayList<Publicacion>(user.publica.getCollection());
				System.out.println("El numero de usuarios es -> " + usuarios.size());
				int numMeGustas = 0;
				for(Publicacion publicacion : publicaciones) {
					numMeGustas += publicacion.getNumMeGustas();
				}
				datos.put(user, numMeGustas);
			}
			ArrayList<Integer> valores = new ArrayList<Integer>(datos.values());
			valores.sort(null);
			int i = 1;
			for(Entry<UsuarioRegistrado, Integer> d : datos.entrySet()) {
				if(valores.get(valores.size()-1).equals(d.getValue())) {
					usuariosTop.add(d.getKey());
					if(i < 5) {
						i++;
					}else {
						break;
					}
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

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) throws PersistentException {
		UsuarioRegistrado user = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			if(aTipoCuenta) {
				UsuarioRegistrado ur = UsuarioRegistradoDAO.createUsuarioRegistrado();
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
			}
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public List cargarUsuariosUNR() throws PersistentException {
		List<UsuarioRegistrado> usuarios = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			usuarios = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			t.commit();
		}catch(Exception e){
			t.rollback();
		}
		return usuarios;
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario, int aUsuarioID) throws PersistentException {
		String password = "";
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			password = usuario.getPassword();
			if(!password.equals(aNuevaPassword)) {
				usuario.setPassword(aNuevaPassword);
				password = aNuevaPassword;
				UsuarioRegistradoDAO.save(usuario);
			}
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
		return password;
	}

	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioID);
			UsuarioRegistradoDAO.deleteAndDissociate(usuario);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}
}