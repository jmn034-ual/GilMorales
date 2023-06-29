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

public class UsuarioRegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreUsuario;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final StringExpression foto;
	public final StringExpression fechaNacimiento;
	public final StringExpression apellidos;
	public final StringExpression email;
	public final StringExpression password;
	public final IntegerExpression privacidad;
	public final CollectionExpression seguidor;
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
	
	public UsuarioRegistradoDetachedCriteria() {
		super(bd_dcl.UsuarioRegistrado.class, bd_dcl.UsuarioRegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaNacimiento = new StringExpression("fechaNacimiento", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		privacidad = new IntegerExpression("privacidad", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		esDenunciado = new CollectionExpression("ORM_esDenunciado", this.getDetachedCriteria());
		daMeGustaPublicacion = new CollectionExpression("ORM_daMeGustaPublicacion", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		denuciaPublicacion = new CollectionExpression("ORM_denuciaPublicacion", this.getDetachedCriteria());
		denunciaComentarioUR = new CollectionExpression("ORM_denunciaComentarioUR", this.getDetachedCriteria());
		comenta = new CollectionExpression("ORM_comenta", this.getDetachedCriteria());
		seguir = new CollectionExpression("ORM_seguir", this.getDetachedCriteria());
		daMeGustaComentario = new CollectionExpression("ORM_daMeGustaComentario", this.getDetachedCriteria());
		denucia = new CollectionExpression("ORM_denucia", this.getDetachedCriteria());
		visualiza = new CollectionExpression("ORM_visualiza", this.getDetachedCriteria());
		realizaDenuncia = new CollectionExpression("ORM_realizaDenuncia", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd_dcl.UsuarioRegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaNacimiento = new StringExpression("fechaNacimiento", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		privacidad = new IntegerExpression("privacidad", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		esDenunciado = new CollectionExpression("ORM_esDenunciado", this.getDetachedCriteria());
		daMeGustaPublicacion = new CollectionExpression("ORM_daMeGustaPublicacion", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
		denuciaPublicacion = new CollectionExpression("ORM_denuciaPublicacion", this.getDetachedCriteria());
		denunciaComentarioUR = new CollectionExpression("ORM_denunciaComentarioUR", this.getDetachedCriteria());
		comenta = new CollectionExpression("ORM_comenta", this.getDetachedCriteria());
		seguir = new CollectionExpression("ORM_seguir", this.getDetachedCriteria());
		daMeGustaComentario = new CollectionExpression("ORM_daMeGustaComentario", this.getDetachedCriteria());
		denucia = new CollectionExpression("ORM_denucia", this.getDetachedCriteria());
		visualiza = new CollectionExpression("ORM_visualiza", this.getDetachedCriteria());
		realizaDenuncia = new CollectionExpression("ORM_realizaDenuncia", this.getDetachedCriteria());
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createSeguidorCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createEsDenunciadoCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_esDenunciado"));
	}
	
	public bd_dcl.PublicacionDetachedCriteria createDaMeGustaPublicacionCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_daMeGustaPublicacion"));
	}
	
	public bd_dcl.PublicacionDetachedCriteria createPublicaCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public bd_dcl.NotificacionDetachedCriteria createRecibeCriteria() {
		return new bd_dcl.NotificacionDetachedCriteria(createCriteria("ORM_recibe"));
	}
	
	public bd_dcl.PublicacionDetachedCriteria createDenuciaPublicacionCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_denuciaPublicacion"));
	}
	
	public bd_dcl.ComentarioDetachedCriteria createDenunciaComentarioURCriteria() {
		return new bd_dcl.ComentarioDetachedCriteria(createCriteria("ORM_denunciaComentarioUR"));
	}
	
	public bd_dcl.ComentarioDetachedCriteria createComentaCriteria() {
		return new bd_dcl.ComentarioDetachedCriteria(createCriteria("ORM_comenta"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createSeguirCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_seguir"));
	}
	
	public bd_dcl.ComentarioDetachedCriteria createDaMeGustaComentarioCriteria() {
		return new bd_dcl.ComentarioDetachedCriteria(createCriteria("ORM_daMeGustaComentario"));
	}
	
	public bd_dcl.UsuarioRegistradoDetachedCriteria createDenuciaCriteria() {
		return new bd_dcl.UsuarioRegistradoDetachedCriteria(createCriteria("ORM_denucia"));
	}
	
	public bd_dcl.PublicacionDetachedCriteria createVisualizaCriteria() {
		return new bd_dcl.PublicacionDetachedCriteria(createCriteria("ORM_visualiza"));
	}
	
	public bd_dcl.DenunciaDetachedCriteria createRealizaDenunciaCriteria() {
		return new bd_dcl.DenunciaDetachedCriteria(createCriteria("ORM_realizaDenuncia"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado(PersistentSession session) {
		return (UsuarioRegistrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

