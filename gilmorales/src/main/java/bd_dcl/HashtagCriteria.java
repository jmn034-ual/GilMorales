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

public class HashtagCriteria extends AbstractORMCriteria {
	public final IntegerExpression idHashtag;
	public final StringExpression nombreHashtag;
	public final CollectionExpression aparece;
	
	public HashtagCriteria(Criteria criteria) {
		super(criteria);
		idHashtag = new IntegerExpression("idHashtag", this);
		nombreHashtag = new StringExpression("nombreHashtag", this);
		aparece = new CollectionExpression("ORM_aparece", this);
	}
	
	public HashtagCriteria(PersistentSession session) {
		this(session.createCriteria(Hashtag.class));
	}
	
	public HashtagCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.PublicacionCriteria createApareceCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_aparece"));
	}
	
	public Hashtag uniqueHashtag() {
		return (Hashtag) super.uniqueResult();
	}
	
	public Hashtag[] listHashtag() {
		java.util.List list = super.list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

