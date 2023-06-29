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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idNotificacion;
	public final IntegerExpression enviadaAId;
	public final AssociationExpression enviadaA;
	public final IntegerExpression tipoNotificacion;
	public final IntegerExpression IDUsuarioNotifica;
	
	public NotificacionDetachedCriteria() {
		super(bd_dcl.Notificacion.class, bd_dcl.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		enviadaAId = new IntegerExpression("enviadaA.ID", this.getDetachedCriteria());
		enviadaA = new AssociationExpression("enviadaA", this.getDetachedCriteria());
		tipoNotificacion = new IntegerExpression("tipoNotificacion", this.getDetachedCriteria());
		IDUsuarioNotifica = new IntegerExpression("IDUsuarioNotifica", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		enviadaAId = new IntegerExpression("enviadaA.ID", this.getDetachedCriteria());
		enviadaA = new AssociationExpression("enviadaA", this.getDetachedCriteria());
		tipoNotificacion = new IntegerExpression("tipoNotificacion", this.getDetachedCriteria());
		IDUsuarioNotifica = new IntegerExpression("IDUsuarioNotifica", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createEnviadaACriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("enviadaA"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

