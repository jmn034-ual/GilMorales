package basededatos;

import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

import bd_dcl.UsuarioRegistrado;

public class UsuariosRegistrados {
	public BDPrincipal _c_bd_usuario_registrado;
	public Vector<UsuarioRegistrado> _usuarioRegistrado = new Vector<UsuarioRegistrado>();

	public UsuarioRegistrado cargarUsuarioRegistrado(String aNombreUsuario, String aPassword) {
		throw new UnsupportedOperationException();
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

	public UsuarioRegistrado buscarUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarListaUsuariosTOP() {
		throw new UnsupportedOperationException();
	}

	public List ordenarUsuarios(String aFiltro) {
		throw new UnsupportedOperationException();
	}

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, LocalDate aFechaNacimiento, boolean aTipoCuenta, String aFoto) {
		throw new UnsupportedOperationException();
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