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

public class UsuarioComercialDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreUsuarioComercial;
	public final StringExpression nombreEmpresa;
	public final StringExpression descripcion;
	public final StringExpression fechaNacimiento;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression foto;
	public final CollectionExpression publica;
	public final CollectionExpression denunciaComentarioUC;
	
	public UsuarioComercialDetachedCriteria() {
		super(bd_dcl.UsuarioComercial.class, bd_dcl.UsuarioComercialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this.getDetachedCriteria());
		nombreEmpresa = new StringExpression("nombreEmpresa", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaNacimiento = new StringExpression("fechaNacimiento", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		denunciaComentarioUC = new CollectionExpression("ORM_denunciaComentarioUC", this.getDetachedCriteria());
	}
	
	public UsuarioComercialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.UsuarioComercialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this.getDetachedCriteria());
		nombreEmpresa = new StringExpression("nombreEmpresa", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaNacimiento = new StringExpression("fechaNacimiento", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		denunciaComentarioUC = new CollectionExpression("ORM_denunciaComentarioUC", this.getDetachedCriteria());
	}
	
	public bd_dcl.PublicacionDetachedCriteria createPublicaCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public bd_dcl.ComentarioDetachedCriteria createDenunciaComentarioUCCriteria() {
		return new bd_dcl.ComentarioDetachedCriteria(createCriteria("ORM_denunciaComentarioUC"));
	}
	
	public UsuarioComercial uniqueUsuarioComercial(PersistentSession session) {
		return (UsuarioComercial) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioComercial[] listUsuarioComercial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioComercial[]) list.toArray(new UsuarioComercial[list.size()]);
	}
}

