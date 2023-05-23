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

public class PublicacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPublicacion;
	public final CollectionExpression visualizadaPor;
	public final IntegerExpression esPublicadaId;
	public final AssociationExpression esPublicada;
	public final IntegerExpression numComentarios;
	public final IntegerExpression numMeGustas;
	public final IntegerExpression numVisualizaciones;
	public final StringExpression descripcion;
	public final StringExpression nombreUsuarioComercial;
	public final StringExpression nombreUsuario;
	public final StringExpression fechaPublicacion;
	public final StringExpression video;
	public final CollectionExpression tieneComentarios;
	public final CollectionExpression gustaA;
	public final IntegerExpression perteneceAId;
	public final AssociationExpression perteneceA;
	public final CollectionExpression publicacionDenunciadaPor;
	public final CollectionExpression contiene;
	
	public PublicacionCriteria(Criteria criteria) {
		super(criteria);
		idPublicacion = new IntegerExpression("idPublicacion", this);
		visualizadaPor = new CollectionExpression("ORM_visualizadaPor", this);
		esPublicadaId = new IntegerExpression("esPublicada.ID", this);
		esPublicada = new AssociationExpression("esPublicada", this);
		numComentarios = new IntegerExpression("numComentarios", this);
		numMeGustas = new IntegerExpression("numMeGustas", this);
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this);
		descripcion = new StringExpression("descripcion", this);
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		fechaPublicacion = new StringExpression("fechaPublicacion", this);
		video = new StringExpression("video", this);
		tieneComentarios = new CollectionExpression("ORM_tieneComentarios", this);
		gustaA = new CollectionExpression("ORM_gustaA", this);
		perteneceAId = new IntegerExpression("perteneceA.ID", this);
		perteneceA = new AssociationExpression("perteneceA", this);
		publicacionDenunciadaPor = new CollectionExpression("ORM_publicacionDenunciadaPor", this);
		contiene = new CollectionExpression("ORM_contiene", this);
	}
	
	public PublicacionCriteria(PersistentSession session) {
		this(session.createCriteria(Publicacion.class));
	}
	
	public PublicacionCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createVisualizadaPorCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_visualizadaPor"));
	}
	
	public UsuarioComercialCriteria createEsPublicadaCriteria() {
		return new UsuarioComercialCriteria(createCriteria("esPublicada"));
	}
	
	public bd_dcl.ComentarioCriteria createTieneComentariosCriteria() {
		return new bd_dcl.ComentarioCriteria(createCriteria("ORM_tieneComentarios"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createGustaACriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_gustaA"));
	}
	
	public UsuarioRegistradoCriteria createPerteneceACriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("perteneceA"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createPublicacionDenunciadaPorCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_publicacionDenunciadaPor"));
	}
	
	public bd_dcl.HashtagCriteria createContieneCriteria() {
		return new bd_dcl.HashtagCriteria(createCriteria("ORM_contiene"));
	}
	
	public Publicacion uniquePublicacion() {
		return (Publicacion) super.uniqueResult();
	}
	
	public Publicacion[] listPublicacion() {
		java.util.List list = super.list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

