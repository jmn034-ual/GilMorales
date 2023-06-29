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

public class DenunciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDenuncia;
	public final IntegerExpression realizadaPorId;
	public final AssociationExpression realizadaPor;
	public final IntegerExpression atendidaId;
	public final AssociationExpression atendida;
	public final IntegerExpression tipoDenuncia;
	public final IntegerExpression tipoEstado;
	public final StringExpression motivo;
	public final StringExpression explicacion;
	
	public DenunciaDetachedCriteria() {
		super(bd_dcl.Denuncia.class, bd_dcl.DenunciaCriteria.class);
		idDenuncia = new IntegerExpression("idDenuncia", this.getDetachedCriteria());
		realizadaPorId = new IntegerExpression("realizadaPor.ID", this.getDetachedCriteria());
		realizadaPor = new AssociationExpression("realizadaPor", this.getDetachedCriteria());
		atendidaId = new IntegerExpression("atendida.codigoEmpleado", this.getDetachedCriteria());
		atendida = new AssociationExpression("atendida", this.getDetachedCriteria());
		tipoDenuncia = new IntegerExpression("tipoDenuncia", this.getDetachedCriteria());
		tipoEstado = new IntegerExpression("tipoEstado", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
		explicacion = new StringExpression("explicacion", this.getDetachedCriteria());
	}
	
	public DenunciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.DenunciaCriteria.class);
		idDenuncia = new IntegerExpression("idDenuncia", this.getDetachedCriteria());
		realizadaPorId = new IntegerExpression("realizadaPor.ID", this.getDetachedCriteria());
		realizadaPor = new AssociationExpression("realizadaPor", this.getDetachedCriteria());
		atendidaId = new IntegerExpression("atendida.codigoEmpleado", this.getDetachedCriteria());
		atendida = new AssociationExpression("atendida", this.getDetachedCriteria());
		tipoDenuncia = new IntegerExpression("tipoDenuncia", this.getDetachedCriteria());
		tipoEstado = new IntegerExpression("tipoEstado", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
		explicacion = new StringExpression("explicacion", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createRealizadaPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("realizadaPor"));
	}
	
	public UsuarioAdministradorDetachedCriteria createAtendidaCriteria() {
		return new UsuarioAdministradorDetachedCriteria(createCriteria("atendida"));
	}
	
	public Denuncia uniqueDenuncia(PersistentSession session) {
		return (Denuncia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Denuncia[] listDenuncia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
	}
}

