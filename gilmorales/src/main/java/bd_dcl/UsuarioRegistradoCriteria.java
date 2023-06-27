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

public class UsuarioRegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreUsuario;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final StringExpression foto;
	public final StringExpression fechaNacimiento;
	public final StringExpression apellidos;
	public final StringExpression email;
	public final StringExpression password;
	public final CollectionExpression seguido;
	public final CollectionExpression esDenunciado;
	public final CollectionExpression daMeGustaPublicacion;
	public final CollectionExpression publica;
	public final CollectionExpression recibe;
	public final CollectionExpression denuciaPublicacion;
	public final CollectionExpression denunciaComentarioUR;
	public final CollectionExpression comenta;
	public final CollectionExpression seguir;
	public final CollectionExpression daMeGustaComentario;
	public final CollectionExpression denucia;
	public final CollectionExpression visualiza;
	public final CollectionExpression realizaDenuncia;
	
	public UsuarioRegistradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		foto = new StringExpression("foto", this);
		fechaNacimiento = new StringExpression("fechaNacimiento", this);
		apellidos = new StringExpression("apellidos", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		seguido = new CollectionExpression("ORM_seguido", this);
		esDenunciado = new CollectionExpression("ORM_esDenunciado", this);
		daMeGustaPublicacion = new CollectionExpression("ORM_daMeGustaPublicacion", this);
		publica = new CollectionExpression("ORM_publica", this);
		recibe = new CollectionExpression("ORM_recibe", this);
		denuciaPublicacion = new CollectionExpression("ORM_denuciaPublicacion", this);
		denunciaComentarioUR = new CollectionExpression("ORM_denunciaComentarioUR", this);
		comenta = new CollectionExpression("ORM_comenta", this);
		seguir = new CollectionExpression("ORM_seguir", this);
		daMeGustaComentario = new CollectionExpression("ORM_daMeGustaComentario", this);
		denucia = new CollectionExpression("ORM_denucia", this);
		visualiza = new CollectionExpression("ORM_visualiza", this);
		realizaDenuncia = new CollectionExpression("ORM_realizaDenuncia", this);
	}
	
	public UsuarioRegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioRegistrado.class));
	}
	
	public UsuarioRegistradoCriteria() throws PersistentException {
		this(bd_dcl.GilMoralesPersistentManager.instance().getSession());
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createSeguidoCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_seguido"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createEsDenunciadoCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_esDenunciado"));
	}
	
	public bd_dcl.PublicacionCriteria createDaMeGustaPublicacionCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_daMeGustaPublicacion"));
	}
	
	public bd_dcl.PublicacionCriteria createPublicaCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_publica"));
	}
	
	public bd_dcl.NotificacionCriteria createRecibeCriteria() {
		return new bd_dcl.NotificacionCriteria(createCriteria("ORM_recibe"));
	}
	
	public bd_dcl.PublicacionCriteria createDenuciaPublicacionCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_denuciaPublicacion"));
	}
	
	public bd_dcl.ComentarioCriteria createDenunciaComentarioURCriteria() {
		return new bd_dcl.ComentarioCriteria(createCriteria("ORM_denunciaComentarioUR"));
	}
	
	public bd_dcl.ComentarioCriteria createComentaCriteria() {
		return new bd_dcl.ComentarioCriteria(createCriteria("ORM_comenta"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createSeguirCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_seguir"));
	}
	
	public bd_dcl.ComentarioCriteria createDaMeGustaComentarioCriteria() {
		return new bd_dcl.ComentarioCriteria(createCriteria("ORM_daMeGustaComentario"));
	}
	
	public bd_dcl.UsuarioRegistradoCriteria createDenuciaCriteria() {
		return new bd_dcl.UsuarioRegistradoCriteria(createCriteria("ORM_denucia"));
	}
	
	public bd_dcl.PublicacionCriteria createVisualizaCriteria() {
		return new bd_dcl.PublicacionCriteria(createCriteria("ORM_visualiza"));
	}
	
	public bd_dcl.DenunciaCriteria createRealizaDenunciaCriteria() {
		return new bd_dcl.DenunciaCriteria(createCriteria("ORM_realizaDenuncia"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado() {
		return (UsuarioRegistrado) super.uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado() {
		java.util.List list = super.list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

