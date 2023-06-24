package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;
import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Notificaciones {
	public BDPrincipal _c_bd_notificaciones;
	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();

	public List cargarNotificaciones(UsuarioRegistrado aUsuario) {
		throw new UnsupportedOperationException();
	}
}