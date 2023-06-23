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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioAdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression codigoEmpleado;
	public final StringExpression nombreAdmin;
	public final StringExpression apellidosAdmin;
	public final StringExpression foto;
	public final CollectionExpression gestiona;
	
	public UsuarioAdministradorDetachedCriteria() {
		super(bd_dcl.UsuarioAdministrador.class, bd_dcl.UsuarioAdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		codigoEmpleado = new IntegerExpression("codigoEmpleado", this.getDetachedCriteria());
		nombreAdmin = new StringExpression("nombreAdmin", this.getDetachedCriteria());
		apellidosAdmin = new StringExpression("apellidosAdmin", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		gestiona = new CollectionExpression("ORM_gestiona", this.getDetachedCriteria());
	}
	
	public UsuarioAdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.UsuarioAdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		codigoEmpleado = new IntegerExpression("codigoEmpleado", this.getDetachedCriteria());
		nombreAdmin = new StringExpression("nombreAdmin", this.getDetachedCriteria());
		apellidosAdmin = new StringExpression("apellidosAdmin", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		gestiona = new CollectionExpression("ORM_gestiona", this.getDetachedCriteria());
	}
	
	public bd_dcl.DenunciaDetachedCriteria createGestionaCriteria() {
		return new bd_dcl.DenunciaDetachedCriteria(createCriteria("ORM_gestiona"));
	}
	
	public UsuarioAdministrador uniqueUsuarioAdministrador(PersistentSession session) {
		return (UsuarioAdministrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioAdministrador[] listUsuarioAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioAdministrador[]) list.toArray(new UsuarioAdministrador[list.size()]);
	}
}

