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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idComentario;
	public final CollectionExpression denunciadoPor;
	public final IntegerExpression comentadoEnId;
	public final AssociationExpression comentadoEn;
	public final StringExpression comentario;
	public final IntegerExpression numeroMeGustas;
	public final CollectionExpression denunciaDe;
	public final IntegerExpression esComentadoPorId;
	public final AssociationExpression esComentadoPor;
	public final CollectionExpression gustaA;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new IntegerExpression("idComentario", this);
		denunciadoPor = new CollectionExpression("ORM_denunciadoPor", this);
		comentadoEnId = new IntegerExpression("comentadoEn.idPublicacion", this);
		comentadoEn = new AssociationExpression("comentadoEn", this);
		comentario = new StringExpression("comentario", this);
		numeroMeGustas = new IntegerExpression("numeroMeGustas", this);
		denunciaDe = new CollectionExpression("ORM_denunciaDe", this);
		esComentadoPorId = new IntegerExpression("esComentadoPor.ID", this);
		esComentadoPor = new AssociationExpression("esComentadoPor", this);
		gustaA = new CollectionExpression("ORM_gustaA", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createDenunciadoPorCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_denunciadoPor"));
	}
	
	public PublicacionCriteria createComentadoEnCriteria() {
		return new PublicacionCriteria(createCriteria("comentadoEn"));
	}
	
	public bd_dcl.UsuarioComercialCriteria createDenunciaDeCriteria() {
		return new bd_dcl.UsuarioComercialCriteria(createCriteria("ORM_denunciaDe"));
	}
	
	public UsuarioRegistradoCriteria createEsComentadoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("esComentadoPor"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createGustaACriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_gustaA"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

