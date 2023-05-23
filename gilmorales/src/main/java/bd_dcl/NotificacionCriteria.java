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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression enviadaAId;
	public final AssociationExpression enviadaA;
	public final IntegerExpression tipoNotificacion;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		idNotificacion = new IntegerExpression("idNotificacion", this);
		enviadaAId = new IntegerExpression("enviadaA.ID", this);
		enviadaA = new AssociationExpression("enviadaA", this);
		tipoNotificacion = new IntegerExpression("tipoNotificacion", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createEnviadaACriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("enviadaA"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

