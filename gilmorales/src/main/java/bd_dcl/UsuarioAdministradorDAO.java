/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Jmn034(University of Almeria)
 * License Type: Academic
 */
package bd_dcl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UsuarioAdministradorDAO {
	public static UsuarioAdministrador loadUsuarioAdministradorByORMID(int codigoEmpleado) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioAdministradorByORMID(session, codigoEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador getUsuarioAdministradorByORMID(int codigoEmpleado) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioAdministradorByORMID(session, codigoEmpleado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByORMID(int codigoEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioAdministradorByORMID(session, codigoEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador getUsuarioAdministradorByORMID(int codigoEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioAdministradorByORMID(session, codigoEmpleado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByORMID(PersistentSession session, int codigoEmpleado) throws PersistentException {
		try {
			return (UsuarioAdministrador) session.load(bd_dcl.UsuarioAdministrador.class, new Integer(codigoEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador getUsuarioAdministradorByORMID(PersistentSession session, int codigoEmpleado) throws PersistentException {
		try {
			return (UsuarioAdministrador) session.get(bd_dcl.UsuarioAdministrador.class, new Integer(codigoEmpleado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByORMID(PersistentSession session, int codigoEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioAdministrador) session.load(bd_dcl.UsuarioAdministrador.class, new Integer(codigoEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador getUsuarioAdministradorByORMID(PersistentSession session, int codigoEmpleado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioAdministrador) session.get(bd_dcl.UsuarioAdministrador.class, new Integer(codigoEmpleado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador[] listUsuarioAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador[] listUsuarioAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioAdministrador as UsuarioAdministrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioAdministrador as UsuarioAdministrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioAdministrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador[] listUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioAdministrador(session, condition, orderBy);
			return (UsuarioAdministrador[]) list.toArray(new UsuarioAdministrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador[] listUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioAdministrador(session, condition, orderBy, lockMode);
			return (UsuarioAdministrador[]) list.toArray(new UsuarioAdministrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioAdministrador[] usuarioAdministradors = listUsuarioAdministradorByQuery(session, condition, orderBy);
		if (usuarioAdministradors != null && usuarioAdministradors.length > 0)
			return usuarioAdministradors[0];
		else
			return null;
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioAdministrador[] usuarioAdministradors = listUsuarioAdministradorByQuery(session, condition, orderBy, lockMode);
		if (usuarioAdministradors != null && usuarioAdministradors.length > 0)
			return usuarioAdministradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioAdministrador as UsuarioAdministrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioAdministrador as UsuarioAdministrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioAdministrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador createUsuarioAdministrador() {
		return new bd_dcl.UsuarioAdministrador();
	}
	
	public static boolean save(bd_dcl.UsuarioAdministrador usuarioAdministrador) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(usuarioAdministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.UsuarioAdministrador usuarioAdministrador) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(usuarioAdministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioAdministrador usuarioAdministrador)throws PersistentException {
		try {
			bd_dcl.Denuncia[] lGestionas = usuarioAdministrador.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setAtendida(null);
			}
			return delete(usuarioAdministrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioAdministrador usuarioAdministrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			bd_dcl.Denuncia[] lGestionas = usuarioAdministrador.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setAtendida(null);
			}
			try {
				session.delete(usuarioAdministrador);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(bd_dcl.UsuarioAdministrador usuarioAdministrador) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(usuarioAdministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.UsuarioAdministrador usuarioAdministrador) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(usuarioAdministrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAdministrador loadUsuarioAdministradorByCriteria(UsuarioAdministradorCriteria usuarioAdministradorCriteria) {
		UsuarioAdministrador[] usuarioAdministradors = listUsuarioAdministradorByCriteria(usuarioAdministradorCriteria);
		if(usuarioAdministradors == null || usuarioAdministradors.length == 0) {
			return null;
		}
		return usuarioAdministradors[0];
	}
	
	public static UsuarioAdministrador[] listUsuarioAdministradorByCriteria(UsuarioAdministradorCriteria usuarioAdministradorCriteria) {
		return usuarioAdministradorCriteria.listUsuarioAdministrador();
	}
}
