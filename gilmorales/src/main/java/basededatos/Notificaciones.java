package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Notificacion;
import bd_dcl.NotificacionDAO;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

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
	
	public void enviarSolicitud(int aUsuarioSeguidorID, int aUsuarioAseguirID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioRegistrado userSigue = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioSeguidorID);
			UsuarioRegistrado userAseguir = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuarioAseguirID);
			Notificacion notificacion = NotificacionDAO.createNotificacion();
			notificacion.setTipoNotificacion(0);
			notificacion.setEnviadaA(userAseguir);
			notificacion.setIDUsuarioNotifica(userSigue.getID());
			NotificacionDAO.save(notificacion);
			UsuarioRegistradoDAO.save(userAseguir);
			UsuarioRegistradoDAO.save(userSigue);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}
	
	public void eliminarNotificacion(int idNotificacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Notificacion notificaciones = NotificacionDAO.loadNotificacionByORMID(idNotificacion);
			NotificacionDAO.deleteAndDissociate(notificaciones);
			
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
	}
}