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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComentarioDetachedCriteria() {
		super(bd_dcl.Comentario.class, bd_dcl.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		denunciadoPor = new CollectionExpression("ORM_denunciadoPor", this.getDetachedCriteria());
		comentadoEnId = new IntegerExpression("comentadoEn.idPublicacion", this.getDetachedCriteria());
		comentadoEn = new AssociationExpression("comentadoEn", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		numeroMeGustas = new IntegerExpression("numeroMeGustas", this.getDetachedCriteria());
		denunciaDe = new CollectionExpression("ORM_denunciaDe", this.getDetachedCriteria());
		esComentadoPorId = new IntegerExpression("esComentadoPor.ID", this.getDetachedCriteria());
		esComentadoPor = new AssociationExpression("esComentadoPor", this.getDetachedCriteria());
		gustaA = new CollectionExpression("ORM_gustaA", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		denunciadoPor = new CollectionExpression("ORM_denunciadoPor", this.getDetachedCriteria());
		comentadoEnId = new IntegerExpression("comentadoEn.idPublicacion", this.getDetachedCriteria());
		comentadoEn = new AssociationExpression("comentadoEn", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		numeroMeGustas = new IntegerExpression("numeroMeGustas", this.getDetachedCriteria());
		denunciaDe = new CollectionExpression("ORM_denunciaDe", this.getDetachedCriteria());
		esComentadoPorId = new IntegerExpression("esComentadoPor.ID", this.getDetachedCriteria());
		esComentadoPor = new AssociationExpression("esComentadoPor", this.getDetachedCriteria());
		gustaA = new CollectionExpression("ORM_gustaA", this.getDetachedCriteria());
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createDenunciadoPorCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_denunciadoPor"));
	}
	
	public PublicacionDetachedCriteria createComentadoEnCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("comentadoEn"));
	}
	
	public bd_dcl.UsuarioComercialDetachedCriteria createDenunciaDeCriteria() {
		return new bd_dcl.UsuarioComercialDetachedCriteria(createCriteria("ORM_denunciaDe"));
	}
	
	public UsuarioRegistradoDetachedCriteria createEsComentadoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("esComentadoPor"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createGustaACriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_gustaA"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

