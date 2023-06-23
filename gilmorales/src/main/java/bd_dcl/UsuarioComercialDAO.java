/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Joaquín Morales Nieto(University of Almeria)
 * License Type: Academic
 */
package bd_dcl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UsuarioComercialDAO {
	public static UsuarioComercial loadUsuarioComercialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioComercialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial getUsuarioComercialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioComercialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioComercialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial getUsuarioComercialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioComercialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioComercial) session.load(bd_dcl.UsuarioComercial.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial getUsuarioComercialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioComercial) session.get(bd_dcl.UsuarioComercial.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioComercial) session.load(bd_dcl.UsuarioComercial.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial getUsuarioComercialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioComercial) session.get(bd_dcl.UsuarioComercial.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComercial(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioComercial(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComercial(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioComercial(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial[] listUsuarioComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial[] listUsuarioComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComercial(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioComercial as UsuarioComercial");
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
	
	public static List queryUsuarioComercial(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioComercial as UsuarioComercial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioComercial", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial[] listUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioComercial(session, condition, orderBy);
			return (UsuarioComercial[]) list.toArray(new UsuarioComercial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial[] listUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioComercial(session, condition, orderBy, lockMode);
			return (UsuarioComercial[]) list.toArray(new UsuarioComercial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioComercial[] usuarioComercials = listUsuarioComercialByQuery(session, condition, orderBy);
		if (usuarioComercials != null && usuarioComercials.length > 0)
			return usuarioComercials[0];
		else
			return null;
	}
	
	public static UsuarioComercial loadUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioComercial[] usuarioComercials = listUsuarioComercialByQuery(session, condition, orderBy, lockMode);
		if (usuarioComercials != null && usuarioComercials.length > 0)
			return usuarioComercials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioComercial as UsuarioComercial");
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
	
	public static java.util.Iterator iterateUsuarioComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioComercial as UsuarioComercial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioComercial", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial createUsuarioComercial() {
		return new bd_dcl.UsuarioComercial();
	}
	
	public static boolean save(bd_dcl.UsuarioComercial usuarioComercial) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(usuarioComercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.UsuarioComercial usuarioComercial) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(usuarioComercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioComercial usuarioComercial)throws PersistentException {
		try {
			bd_dcl.Publicacion[] lPublicas = usuarioComercial.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setEsPublicada(null);
			}
			bd_dcl.Comentario[] lDenunciaComentarioUCs = usuarioComercial.denunciaComentarioUC.toArray();
			for(int i = 0; i < lDenunciaComentarioUCs.length; i++) {
				lDenunciaComentarioUCs[i].denunciaDe.remove(usuarioComercial);
			}
			return delete(usuarioComercial);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioComercial usuarioComercial, org.orm.PersistentSession session)throws PersistentException {
		try {
			bd_dcl.Publicacion[] lPublicas = usuarioComercial.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setEsPublicada(null);
			}
			bd_dcl.Comentario[] lDenunciaComentarioUCs = usuarioComercial.denunciaComentarioUC.toArray();
			for(int i = 0; i < lDenunciaComentarioUCs.length; i++) {
				lDenunciaComentarioUCs[i].denunciaDe.remove(usuarioComercial);
			}
			try {
				session.delete(usuarioComercial);
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
	
	public static boolean refresh(bd_dcl.UsuarioComercial usuarioComercial) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(usuarioComercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.UsuarioComercial usuarioComercial) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(usuarioComercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComercial loadUsuarioComercialByCriteria(UsuarioComercialCriteria usuarioComercialCriteria) {
		UsuarioComercial[] usuarioComercials = listUsuarioComercialByCriteria(usuarioComercialCriteria);
		if(usuarioComercials == null || usuarioComercials.length == 0) {
			return null;
		}
		return usuarioComercials[0];
	}
	
	public static UsuarioComercial[] listUsuarioComercialByCriteria(UsuarioComercialCriteria usuarioComercialCriteria) {
		return usuarioComercialCriteria.listUsuarioComercial();
	}
}
