package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.HashtagDAO;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioComercialDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class UsuariosRegistrados {
	public BDPrincipal _c_bd_usuario_registrado;
	public Vector<UsuarioRegistrado> _usuarioRegistrado = new Vector<UsuarioRegistrado>();

	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword) throws PersistentException {
		if(aNombreUsuario == "") return null;
		List lista = null;
		UsuarioRegistrado usuario = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			for(int i = 0; i < lista.size(); i++) {
				usuario = (UsuarioRegistrado) lista.get(i);
				if(usuario.getNombreUsuario().equals(aNombreUsuario) && usuario.getPassword().equals(aPassword)) return usuario;
			}

		} catch (Exception e) {
			t.rollback();
		}
		return usuario;
	}

	public List cargarListaUsuariosRegistrados() {
		throw new UnsupportedOperationException();
	}

	public void cambiarFotoPerfil(String aNombreUsuario, String aFoto, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUR(String aNombreUsuario, String aNuevoNombreUsuario, String aNombre, String aDescripcion, String aFoto, Object aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue, int aUsuarioSeguidorID, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario, int aUsuarioSeguidoID, int aUsuarioID) {
		throw new UnsupportedOperationException();
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
		throw new UnsupportedOperationException();
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, String aFechaNacimiento, boolean aTipoCuenta, String aFoto) throws PersistentException {
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
			}else {
				UsuarioComercial uc = UsuarioComercialDAO.createUsuarioComercial();
				uc.setNombreEmpresa(aNombre);
				uc.setEmail(aEmail);
				uc.setPassword(aPassword);
				uc.setDescripcion(aDescripcion);
				uc.setNombreUsuarioComercial(aNombreUsuario);
				uc.setFechaNacimiento(aFechaNacimiento.toString());
				uc.setEmail(aEmail);
				uc.setFoto(aFoto);
				UsuarioComercialDAO.save(uc);
			}
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public List cargarUsuariosUNR() {
		throw new UnsupportedOperationException();
	}

	public String recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}

	public void bloquearUsuario(String aNombreUsuario, int aUsuarioID) {
		throw new UnsupportedOperationException();
	}
}