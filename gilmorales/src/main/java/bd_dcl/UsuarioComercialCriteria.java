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

public class UsuarioComercialCriteria extends AbstractORMCriteria {
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
	
	public UsuarioComercialCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this);
		nombreEmpresa = new StringExpression("nombreEmpresa", this);
		descripcion = new StringExpression("descripcion", this);
		fechaNacimiento = new StringExpression("fechaNacimiento", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		foto = new StringExpression("foto", this);
		publica = new CollectionExpression("ORM_publica", this);
		denunciaComentarioUC = new CollectionExpression("ORM_denunciaComentarioUC", this);
	}
	
	public UsuarioComercialCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioComercial.class));
	}
	
	public UsuarioComercialCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.PublicacionCriteria createPublicaCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_publica"));
	}
	
	public bd_dcl.ComentarioCriteria createDenunciaComentarioUCCriteria() {
		return new bd_dcl.ComentarioCriteria(createCriteria("ORM_denunciaComentarioUC"));
	}
	
	public UsuarioComercial uniqueUsuarioComercial() {
		return (UsuarioComercial) super.uniqueResult();
	}
	
	public UsuarioComercial[] listUsuarioComercial() {
		java.util.List list = super.list();
		return (UsuarioComercial[]) list.toArray(new UsuarioComercial[list.size()]);
	}
}

