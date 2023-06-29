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

public class DenunciaDAO {
	public static Denuncia loadDenunciaByORMID(int idDenuncia) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadDenunciaByORMID(session, idDenuncia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(int idDenuncia) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getDenunciaByORMID(session, idDenuncia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(int idDenuncia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadDenunciaByORMID(session, idDenuncia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(int idDenuncia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getDenunciaByORMID(session, idDenuncia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(PersistentSession session, int idDenuncia) throws PersistentException {
		try {
			return (Denuncia) session.load(bd_dcl.Denuncia.class, new Integer(idDenuncia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(PersistentSession session, int idDenuncia) throws PersistentException {
		try {
			return (Denuncia) session.get(bd_dcl.Denuncia.class, new Integer(idDenuncia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(PersistentSession session, int idDenuncia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia) session.load(bd_dcl.Denuncia.class, new Integer(idDenuncia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(PersistentSession session, int idDenuncia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia) session.get(bd_dcl.Denuncia.class, new Integer(idDenuncia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryDenuncia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryDenuncia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Denuncia as Denuncia");
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
	
	public static List queryDenuncia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Denuncia as Denuncia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Denuncia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDenuncia(session, condition, orderBy);
			return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDenuncia(session, condition, orderBy, lockMode);
			return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Denuncia[] denuncias = listDenunciaByQuery(session, condition, orderBy);
		if (denuncias != null && denuncias.length > 0)
			return denuncias[0];
		else
			return null;
	}
	
	public static Denuncia loadDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Denuncia[] denuncias = listDenunciaByQuery(session, condition, orderBy, lockMode);
		if (denuncias != null && denuncias.length > 0)
			return denuncias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Denuncia as Denuncia");
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
	
	public static java.util.Iterator iterateDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Denuncia as Denuncia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Denuncia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia createDenuncia() {
		return new bd_dcl.Denuncia();
	}
	
	public static boolean save(bd_dcl.Denuncia denuncia) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.Denuncia denuncia) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Denuncia denuncia)throws PersistentException {
		try {
			if (denuncia.getRealizadaPor() != null) {
				denuncia.getRealizadaPor().realizaDenuncia.remove(denuncia);
			}
			
			if (denuncia.getAtendida() != null) {
				denuncia.getAtendida().gestiona.remove(denuncia);
			}
			
			return delete(denuncia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Denuncia denuncia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (denuncia.getRealizadaPor() != null) {
				denuncia.getRealizadaPor().realizaDenuncia.remove(denuncia);
			}
			
			if (denuncia.getAtendida() != null) {
				denuncia.getAtendida().gestiona.remove(denuncia);
			}
			
			try {
				session.delete(denuncia);
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
	
	public static boolean refresh(bd_dcl.Denuncia denuncia) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.Denuncia denuncia) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByCriteria(DenunciaCriteria denunciaCriteria) {
		Denuncia[] denuncias = listDenunciaByCriteria(denunciaCriteria);
		if(denuncias == null || denuncias.length == 0) {
			return null;
		}
		return denuncias[0];
	}
	
	public static Denuncia[] listDenunciaByCriteria(DenunciaCriteria denunciaCriteria) {
		return denunciaCriteria.listDenuncia();
	}
}
