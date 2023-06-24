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

public class PublicacionDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final StringExpression localizacion;
	public final CollectionExpression tieneComentarios;
	public final CollectionExpression gustaA;
	public final IntegerExpression perteneceAId;
	public final AssociationExpression perteneceA;
	public final CollectionExpression publicacionDenunciadaPor;
	public final CollectionExpression contiene;
	
	public PublicacionDetachedCriteria() {
		super(bd_dcl.Publicacion.class, bd_dcl.PublicacionCriteria.class);
		idPublicacion = new IntegerExpression("idPublicacion", this.getDetachedCriteria());
		visualizadaPor = new CollectionExpression("ORM_visualizadaPor", this.getDetachedCriteria());
		esPublicadaId = new IntegerExpression("esPublicada.ID", this.getDetachedCriteria());
		esPublicada = new AssociationExpression("esPublicada", this.getDetachedCriteria());
		numComentarios = new IntegerExpression("numComentarios", this.getDetachedCriteria());
		numMeGustas = new IntegerExpression("numMeGustas", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fechaPublicacion = new StringExpression("fechaPublicacion", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		localizacion = new StringExpression("localizacion", this.getDetachedCriteria());
		tieneComentarios = new CollectionExpression("ORM_tieneComentarios", this.getDetachedCriteria());
		gustaA = new CollectionExpression("ORM_gustaA", this.getDetachedCriteria());
		perteneceAId = new IntegerExpression("perteneceA.ID", this.getDetachedCriteria());
		perteneceA = new AssociationExpression("perteneceA", this.getDetachedCriteria());
		publicacionDenunciadaPor = new CollectionExpression("ORM_publicacionDenunciadaPor", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.PublicacionCriteria.class);
		idPublicacion = new IntegerExpression("idPublicacion", this.getDetachedCriteria());
		visualizadaPor = new CollectionExpression("ORM_visualizadaPor", this.getDetachedCriteria());
		esPublicadaId = new IntegerExpression("esPublicada.ID", this.getDetachedCriteria());
		esPublicada = new AssociationExpression("esPublicada", this.getDetachedCriteria());
		numComentarios = new IntegerExpression("numComentarios", this.getDetachedCriteria());
		numMeGustas = new IntegerExpression("numMeGustas", this.getDetachedCriteria());
		numVisualizaciones = new IntegerExpression("numVisualizaciones", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		nombreUsuarioComercial = new StringExpression("nombreUsuarioComercial", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fechaPublicacion = new StringExpression("fechaPublicacion", this.getDetachedCriteria());
		video = new StringExpression("video", this.getDetachedCriteria());
		localizacion = new StringExpression("localizacion", this.getDetachedCriteria());
		tieneComentarios = new CollectionExpression("ORM_tieneComentarios", this.getDetachedCriteria());
		gustaA = new CollectionExpression("ORM_gustaA", this.getDetachedCriteria());
		perteneceAId = new IntegerExpression("perteneceA.ID", this.getDetachedCriteria());
		perteneceA = new AssociationExpression("perteneceA", this.getDetachedCriteria());
		publicacionDenunciadaPor = new CollectionExpression("ORM_publicacionDenunciadaPor", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createVisualizadaPorCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_visualizadaPor"));
	}
	
	public UsuarioComercialDetachedCriteria createEsPublicadaCriteria() {
		return new UsuarioComercialDetachedCriteria(createCriteria("esPublicada"));
	}
	
	public bd_dcl.ComentarioDetachedCriteria createTieneComentariosCriteria() {
		return new bd_dcl.ComentarioDetachedCriteria(createCriteria("ORM_tieneComentarios"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createGustaACriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_gustaA"));
	}
	
	public UsuarioRegistradoDetachedCriteria createPerteneceACriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("perteneceA"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createPublicacionDenunciadaPorCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_publicacionDenunciadaPor"));
	}
	
	public bd_dcl.HashtagDetachedCriteria createContieneCriteria() {
		return new bd_dcl.HashtagDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Publicacion uniquePublicacion(PersistentSession session) {
		return (Publicacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Publicacion[] listPublicacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

