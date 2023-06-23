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

public class UsuarioRegistradoDAO {
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(bd_dcl.UsuarioRegistrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(bd_dcl.UsuarioRegistrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(bd_dcl.UsuarioRegistrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(bd_dcl.UsuarioRegistrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy, lockMode);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd_dcl.GilMoralesPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd_dcl.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado createUsuarioRegistrado() {
		return new bd_dcl.UsuarioRegistrado();
	}
	
	public static boolean save(bd_dcl.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().saveObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd_dcl.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().deleteObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioRegistrado usuarioRegistrado)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lSeguidos = usuarioRegistrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguir.remove(usuarioRegistrado);
			}
			bd_dcl.UsuarioRegistrado[] lEsDenunciados = usuarioRegistrado.esDenunciado.toArray();
			for(int i = 0; i < lEsDenunciados.length; i++) {
				lEsDenunciados[i].denucia.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lDaMeGustaPublicacions = usuarioRegistrado.daMeGustaPublicacion.toArray();
			for(int i = 0; i < lDaMeGustaPublicacions.length; i++) {
				lDaMeGustaPublicacions[i].gustaA.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lPublicas = usuarioRegistrado.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setPerteneceA(null);
			}
			bd_dcl.Notificacion[] lRecibes = usuarioRegistrado.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviadaA(null);
			}
			bd_dcl.Publicacion[] lDenuciaPublicacions = usuarioRegistrado.denuciaPublicacion.toArray();
			for(int i = 0; i < lDenuciaPublicacions.length; i++) {
				lDenuciaPublicacions[i].publicacionDenunciadaPor.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lDenunciaComentarioURs = usuarioRegistrado.denunciaComentarioUR.toArray();
			for(int i = 0; i < lDenunciaComentarioURs.length; i++) {
				lDenunciaComentarioURs[i].denunciadoPor.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lComentas = usuarioRegistrado.comenta.toArray();
			for(int i = 0; i < lComentas.length; i++) {
				lComentas[i].setEsComentadoPor(null);
			}
			bd_dcl.UsuarioRegistrado[] lSeguirs = usuarioRegistrado.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguido.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lDaMeGustaComentarios = usuarioRegistrado.daMeGustaComentario.toArray();
			for(int i = 0; i < lDaMeGustaComentarios.length; i++) {
				lDaMeGustaComentarios[i].gustaA.remove(usuarioRegistrado);
			}
			bd_dcl.UsuarioRegistrado[] lDenucias = usuarioRegistrado.denucia.toArray();
			for(int i = 0; i < lDenucias.length; i++) {
				lDenucias[i].esDenunciado.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lVisualizas = usuarioRegistrado.visualiza.toArray();
			for(int i = 0; i < lVisualizas.length; i++) {
				lVisualizas[i].visualizadaPor.remove(usuarioRegistrado);
			}
			bd_dcl.Denuncia[] lRealizaDenuncias = usuarioRegistrado.realizaDenuncia.toArray();
			for(int i = 0; i < lRealizaDenuncias.length; i++) {
				lRealizaDenuncias[i].setRealizadaPor(null);
			}
			return delete(usuarioRegistrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd_dcl.UsuarioRegistrado usuarioRegistrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			bd_dcl.UsuarioRegistrado[] lSeguidos = usuarioRegistrado.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguir.remove(usuarioRegistrado);
			}
			bd_dcl.UsuarioRegistrado[] lEsDenunciados = usuarioRegistrado.esDenunciado.toArray();
			for(int i = 0; i < lEsDenunciados.length; i++) {
				lEsDenunciados[i].denucia.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lDaMeGustaPublicacions = usuarioRegistrado.daMeGustaPublicacion.toArray();
			for(int i = 0; i < lDaMeGustaPublicacions.length; i++) {
				lDaMeGustaPublicacions[i].gustaA.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lPublicas = usuarioRegistrado.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setPerteneceA(null);
			}
			bd_dcl.Notificacion[] lRecibes = usuarioRegistrado.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].setEnviadaA(null);
			}
			bd_dcl.Publicacion[] lDenuciaPublicacions = usuarioRegistrado.denuciaPublicacion.toArray();
			for(int i = 0; i < lDenuciaPublicacions.length; i++) {
				lDenuciaPublicacions[i].publicacionDenunciadaPor.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lDenunciaComentarioURs = usuarioRegistrado.denunciaComentarioUR.toArray();
			for(int i = 0; i < lDenunciaComentarioURs.length; i++) {
				lDenunciaComentarioURs[i].denunciadoPor.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lComentas = usuarioRegistrado.comenta.toArray();
			for(int i = 0; i < lComentas.length; i++) {
				lComentas[i].setEsComentadoPor(null);
			}
			bd_dcl.UsuarioRegistrado[] lSeguirs = usuarioRegistrado.seguir.toArray();
			for(int i = 0; i < lSeguirs.length; i++) {
				lSeguirs[i].seguido.remove(usuarioRegistrado);
			}
			bd_dcl.Comentario[] lDaMeGustaComentarios = usuarioRegistrado.daMeGustaComentario.toArray();
			for(int i = 0; i < lDaMeGustaComentarios.length; i++) {
				lDaMeGustaComentarios[i].gustaA.remove(usuarioRegistrado);
			}
			bd_dcl.UsuarioRegistrado[] lDenucias = usuarioRegistrado.denucia.toArray();
			for(int i = 0; i < lDenucias.length; i++) {
				lDenucias[i].esDenunciado.remove(usuarioRegistrado);
			}
			bd_dcl.Publicacion[] lVisualizas = usuarioRegistrado.visualiza.toArray();
			for(int i = 0; i < lVisualizas.length; i++) {
				lVisualizas[i].visualizadaPor.remove(usuarioRegistrado);
			}
			bd_dcl.Denuncia[] lRealizaDenuncias = usuarioRegistrado.realizaDenuncia.toArray();
			for(int i = 0; i < lRealizaDenuncias.length; i++) {
				lRealizaDenuncias[i].setRealizadaPor(null);
			}
			try {
				session.delete(usuarioRegistrado);
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
	
	public static boolean refresh(bd_dcl.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().refresh(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd_dcl.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			bd_dcl.GilMoralesPersistentManager.instance().getSession().evict(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByCriteria(usuarioRegistradoCriteria);
		if(usuarioRegistrados == null || usuarioRegistrados.length == 0) {
			return null;
		}
		return usuarioRegistrados[0];
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		return usuarioRegistradoCriteria.listUsuarioRegistrado();
	}
}
