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

public class ComentarioDAO {
	public static Comentario loadComentarioByORMID(int idComentario) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, idComentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int idComentario) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getComentarioByORMID(session, idComentario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(int idComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, idComentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int idComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getComentarioByORMID(session, idComentario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int idComentario) throws PersistentException {
		try {
			return (Comentario) session.load(bd_dcl.Comentario.class, new Integer(idComentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int idComentario) throws PersistentException {
		try {
			return (Comentario) session.get(bd_dcl.Comentario.class, new Integer(idComentario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int idComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.load(bd_dcl.Comentario.class, new Integer(idComentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int idComentario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.get(bd_dcl.Comentario.class, new Integer(idComentario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Comentario as Comentario");
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
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy, lockMode);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy, lockMode);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Comentario as Comentario");
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
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario createComentario() {
		return new bd_dcl.Comentario();
	}
	
	public static boolean save(bd_dcl.Comentario comentario) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.Comentario comentario) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Comentario comentario)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lDenunciadoPors = comentario.denunciadoPor.toArray();
			for(int i = 0; i < lDenunciadoPors.length; i++) {
				lDenunciadoPors[i].denunciaComentarioUR.remove(comentario);
			}
			if (comentario.getComentadoEn() != null) {
				comentario.getComentadoEn().tieneComentarios.remove(comentario);
			}
			
			bd_dcl.UsuarioComercial[] lDenunciaDes = comentario.denunciaDe.toArray();
			for(int i = 0; i < lDenunciaDes.length; i++) {
				lDenunciaDes[i].denunciaComentarioUC.remove(comentario);
			}
			if (comentario.getEsComentadoPor() != null) {
				comentario.getEsComentadoPor().comenta.remove(comentario);
			}
			
			bd_dcl.UsuarioRegistrado[] lGustaAs = comentario.gustaA.toArray();
			for(int i = 0; i < lGustaAs.length; i++) {
				lGustaAs[i].daMeGustaComentario.remove(comentario);
			}
			return delete(comentario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Comentario comentario, org.orm.PersistentSession session)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lDenunciadoPors = comentario.denunciadoPor.toArray();
			for(int i = 0; i < lDenunciadoPors.length; i++) {
				lDenunciadoPors[i].denunciaComentarioUR.remove(comentario);
			}
			if (comentario.getComentadoEn() != null) {
				comentario.getComentadoEn().tieneComentarios.remove(comentario);
			}
			
			bd_dcl.UsuarioComercial[] lDenunciaDes = comentario.denunciaDe.toArray();
			for(int i = 0; i < lDenunciaDes.length; i++) {
				lDenunciaDes[i].denunciaComentarioUC.remove(comentario);
			}
			if (comentario.getEsComentadoPor() != null) {
				comentario.getEsComentadoPor().comenta.remove(comentario);
			}
			
			bd_dcl.UsuarioRegistrado[] lGustaAs = comentario.gustaA.toArray();
			for(int i = 0; i < lGustaAs.length; i++) {
				lGustaAs[i].daMeGustaComentario.remove(comentario);
			}
			try {
				session.delete(comentario);
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
	
	public static boolean refresh(bd_dcl.Comentario comentario) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.Comentario comentario) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		Comentario[] comentarios = listComentarioByCriteria(comentarioCriteria);
		if(comentarios == null || comentarios.length == 0) {
			return null;
		}
		return comentarios[0];
	}
	
	public static Comentario[] listComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		return comentarioCriteria.listComentario();
	}
}
