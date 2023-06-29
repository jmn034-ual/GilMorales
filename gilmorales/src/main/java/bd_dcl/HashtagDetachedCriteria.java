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

public class HashtagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idHashtag;
	public final StringExpression nombreHashtag;
	public final IntegerExpression numVisualizaciones;
	public final CollectionExpression aparece;
	
	public HashtagDetachedCriteria() {
		super(bd_dcl.Hashtag.class, bd_dcl.HashtagCriteria.class);
		idHashtag = new IntegerExpression("idHashtag", this.getDetachedCriteria());
		nombreHashtag = new StringExpression("nombreHashtag", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		aparece = new CollectionExpression("ORM_aparece", this.getDetachedCriteria());
	}
	
	public HashtagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.HashtagCriteria.class);
		idHashtag = new IntegerExpression("idHashtag", this.getDetachedCriteria());
		nombreHashtag = new StringExpression("nombreHashtag", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		aparece = new CollectionExpression("ORM_aparece", this.getDetachedCriteria());
	}
	
	public bd_dcl.PublicacionDetachedCriteria createApareceCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_aparece"));
	}
	
	public Hashtag uniqueHashtag(PersistentSession session) {
		return (Hashtag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hashtag[] listHashtag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

