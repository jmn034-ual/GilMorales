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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioAdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression codigoEmpleado;
	public final StringExpression nombreAdmin;
	public final StringExpression apellidosAdmin;
	public final StringExpression fechaContratacion;
	public final StringExpression foto;
	public final CollectionExpression gestiona;
	
	public UsuarioAdministradorCriteria(Criteria criteria) {
		super(criteria);
		codigoEmpleado = new IntegerExpression("codigoEmpleado", this);
		nombreAdmin = new StringExpression("nombreAdmin", this);
		apellidosAdmin = new StringExpression("apellidosAdmin", this);
		fechaContratacion = new StringExpression("fechaContratacion", this);
		foto = new StringExpression("foto", this);
		gestiona = new CollectionExpression("ORM_gestiona", this);
	}
	
	public UsuarioAdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioAdministrador.class));
	}
	
	public UsuarioAdministradorCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.DenunciaCriteria createGestionaCriteria() {
		return new bd_dcl.DenunciaCriteria(createCriteria("ORM_gestiona"));
	}
	
	public UsuarioAdministrador uniqueUsuarioAdministrador() {
		return (UsuarioAdministrador) super.uniqueResult();
	}
	
	public UsuarioAdministrador[] listUsuarioAdministrador() {
		java.util.List list = super.list();
		return (UsuarioAdministrador[]) list.toArray(new UsuarioAdministrador[list.size()]);
	}
}

