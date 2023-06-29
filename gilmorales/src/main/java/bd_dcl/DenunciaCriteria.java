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

public class DenunciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDenuncia;
	public final IntegerExpression realizadaPorId;
	public final AssociationExpression realizadaPor;
	public final IntegerExpression atendidaId;
	public final AssociationExpression atendida;
	public final IntegerExpression tipoDenuncia;
	public final IntegerExpression tipoEstado;
	public final StringExpression motivo;
	public final StringExpression explicacion;
	
	public DenunciaCriteria(Criteria criteria) {
		super(criteria);
		idDenuncia = new IntegerExpression("idDenuncia", this);
		realizadaPorId = new IntegerExpression("realizadaPor.ID", this);
		realizadaPor = new AssociationExpression("realizadaPor", this);
		atendidaId = new IntegerExpression("atendida.codigoEmpleado", this);
		atendida = new AssociationExpression("atendida", this);
		tipoDenuncia = new IntegerExpression("tipoDenuncia", this);
		tipoEstado = new IntegerExpression("tipoEstado", this);
		motivo = new StringExpression("motivo", this);
		explicacion = new StringExpression("explicacion", this);
	}
	
	public DenunciaCriteria(PersistentSession session) {
		this(session.createCriteria(Denuncia.class));
	}
	
	public DenunciaCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createRealizadaPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("realizadaPor"));
	}
	
	public UsuarioAdministradorCriteria createAtendidaCriteria() {
		return new UsuarioAdministradorCriteria(createCriteria("atendida"));
	}
	
	public Denuncia uniqueDenuncia() {
		return (Denuncia) super.uniqueResult();
	}
	
	public Denuncia[] listDenuncia() {
		java.util.List list = super.list();
		return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
	}
}

