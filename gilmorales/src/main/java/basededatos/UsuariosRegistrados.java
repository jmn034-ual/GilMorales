package basededatos;

import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
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

	public void cambiarFotoPerfil(String aNombreUsuario, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void editarPerfilUR(String aNombreUsuario, String aNuevoNombreUsuario, String aNombre, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public void seguirUsuario(String aNombreUsuarioASeguir, String aNombreUsuarioSigue) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguirUsuario(String aNombreUsuarioDejarSeguir, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuariosTOP() {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado verPerfilAjeno(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado buscarUsuario(String aNombreUsuario) throws PersistentException {
		if(aNombreUsuario == "") return null;
		List lista = null;
		UsuarioRegistrado usuario = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			lista = UsuarioRegistradoDAO.queryUsuarioRegistrado(null, null);
			for(int i = 0; i < lista.size(); i++) {
				usuario = (UsuarioRegistrado) lista.get(i);
				if(usuario.getNombreUsuario().equals(aNombreUsuario)) return usuario;
			}

		} catch (Exception e) {
			t.rollback();
		}
		return usuario;
	}

	public List cargarListaUsuariosTOP() {
		throw new UnsupportedOperationException();
	}

	public List ordenarUsuarios(String aFiltro) {
		throw new UnsupportedOperationException();
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, 
			String aNombreUsuario, LocalDate aFechaNacimiento, boolean aTipoCuenta, String aFoto) throws PersistentException {
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
				ur.setEdad(0);
				ur.setFoto(aFoto);
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
	}

	public List cargarUsuariosUNR() {
		throw new UnsupportedOperationException();
	}

	public void recuperarPassword(String aEmailRecuperacion, String aNuevaPassword, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void bloquearUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}
}