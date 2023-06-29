package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Notificaciones {
	public BDPrincipal _c_bd_notificaciones;
	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();

	public List<Notificacion> cargarNotificaciones(UsuarioRegistrado aUsuario) throws PersistentException {
		List<Notificacion> notificaciones = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			notificaciones = new ArrayList<Notificacion>(aUsuario.recibe.getCollection());
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		return notificaciones;
	}
}