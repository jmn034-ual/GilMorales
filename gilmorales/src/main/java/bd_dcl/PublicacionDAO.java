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

public class PublicacionDAO {
	public static Publicacion loadPublicacionByORMID(int idPublicacion) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, idPublicacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int idPublicacion) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, idPublicacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, idPublicacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, idPublicacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int idPublicacion) throws PersistentException {
		try {
			return (Publicacion) session.load(bd_dcl.Publicacion.class, new Integer(idPublicacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int idPublicacion) throws PersistentException {
		try {
			return (Publicacion) session.get(bd_dcl.Publicacion.class, new Integer(idPublicacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.load(bd_dcl.Publicacion.class, new Integer(idPublicacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.get(bd_dcl.Publicacion.class, new Integer(idPublicacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Publicacion as Publicacion");
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
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy, lockMode);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy, lockMode);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Publicacion as Publicacion");
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
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion createPublicacion() {
		return new bd_dcl.Publicacion();
	}
	
	public static boolean save(bd_dcl.Publicacion publicacion) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.Publicacion publicacion) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Publicacion publicacion)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lVisualizadaPors = publicacion.visualizadaPor.toArray();
			for(int i = 0; i < lVisualizadaPors.length; i++) {
				lVisualizadaPors[i].visualiza.remove(publicacion);
			}
			if (publicacion.getEsPublicada() != null) {
				publicacion.getEsPublicada().publica.remove(publicacion);
			}
			
			bd_dcl.Comentario[] lTieneComentarioss = publicacion.tieneComentarios.toArray();
			for(int i = 0; i < lTieneComentarioss.length; i++) {
				lTieneComentarioss[i].setComentadoEn(null);
			}
			bd_dcl.UsuarioRegistrado[] lGustaAs = publicacion.gustaA.toArray();
			for(int i = 0; i < lGustaAs.length; i++) {
				lGustaAs[i].daMeGustaPublicacion.remove(publicacion);
			}
			if (publicacion.getPerteneceA() != null) {
				publicacion.getPerteneceA().publica.remove(publicacion);
			}
			
			bd_dcl.UsuarioRegistrado[] lPublicacionDenunciadaPors = publicacion.publicacionDenunciadaPor.toArray();
			for(int i = 0; i < lPublicacionDenunciadaPors.length; i++) {
				lPublicacionDenunciadaPors[i].denuciaPublicacion.remove(publicacion);
			}
			bd_dcl.Hashtag[] lContienes = publicacion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].aparece.remove(publicacion);
			}
			return delete(publicacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.Publicacion publicacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lVisualizadaPors = publicacion.visualizadaPor.toArray();
			for(int i = 0; i < lVisualizadaPors.length; i++) {
				lVisualizadaPors[i].visualiza.remove(publicacion);
			}
			if (publicacion.getEsPublicada() != null) {
				publicacion.getEsPublicada().publica.remove(publicacion);
			}
			
			bd_dcl.Comentario[] lTieneComentarioss = publicacion.tieneComentarios.toArray();
			for(int i = 0; i < lTieneComentarioss.length; i++) {
				lTieneComentarioss[i].setComentadoEn(null);
			}
			bd_dcl.UsuarioRegistrado[] lGustaAs = publicacion.gustaA.toArray();
			for(int i = 0; i < lGustaAs.length; i++) {
				lGustaAs[i].daMeGustaPublicacion.remove(publicacion);
			}
			if (publicacion.getPerteneceA() != null) {
				publicacion.getPerteneceA().publica.remove(publicacion);
			}
			
			bd_dcl.UsuarioRegistrado[] lPublicacionDenunciadaPors = publicacion.publicacionDenunciadaPor.toArray();
			for(int i = 0; i < lPublicacionDenunciadaPors.length; i++) {
				lPublicacionDenunciadaPors[i].denuciaPublicacion.remove(publicacion);
			}
			bd_dcl.Hashtag[] lContienes = publicacion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].aparece.remove(publicacion);
			}
			try {
				session.delete(publicacion);
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
	
	public static boolean refresh(bd_dcl.Publicacion publicacion) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.Publicacion publicacion) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		Publicacion[] publicacions = listPublicacionByCriteria(publicacionCriteria);
		if(publicacions == null || publicacions.length == 0) {
			return null;
		}
		return publicacions[0];
	}
	
	public static Publicacion[] listPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		return publicacionCriteria.listPublicacion();
	}
}
