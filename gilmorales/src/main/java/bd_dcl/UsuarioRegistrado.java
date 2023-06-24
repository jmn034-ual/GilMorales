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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="UsuarioRegistrado")
public class UsuarioRegistrado implements Serializable {
	public UsuarioRegistrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDO) {
			return ORM_seguido;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_ESDENUNCIADO) {
			return ORM_esDenunciado;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTAPUBLICACION) {
			return ORM_daMeGustaPublicacion;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_PUBLICA) {
			return ORM_publica;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_RECIBE) {
			return ORM_recibe;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIAPUBLICACION) {
			return ORM_denuciaPublicacion;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUNCIACOMENTARIOUR) {
			return ORM_denunciaComentarioUR;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_COMENTA) {
			return ORM_comenta;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIR) {
			return ORM_seguir;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTACOMENTARIO) {
			return ORM_daMeGustaComentario;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIA) {
			return ORM_denucia;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_VISUALIZA) {
			return ORM_visualiza;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_REALIZADENUNCIA) {
			return ORM_realizaDenuncia;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_USUARIOREGISTRADO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_USUARIOREGISTRADO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="NombreUsuario", nullable=false, length=255)	
	private String nombreUsuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="FechaNacimiento", nullable=true, length=255)	
	private String fechaNacimiento;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_UsuarioRegistrado", joinColumns={ @JoinColumn(name="UsuarioRegistradoID2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_UsuarioRegistrado2", joinColumns={ @JoinColumn(name="UsuarioRegistradoID2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esDenunciado = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gustaA", targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_daMeGustaPublicacion = new java.util.HashSet();
	
	@OneToMany(mappedBy="perteneceA", targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	@OneToMany(mappedBy="enviadaA", targetEntity=bd_dcl.Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_publicacionDenunciadaPor", targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denuciaPublicacion = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_denunciadoPor", targetEntity=bd_dcl.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciaComentarioUR = new java.util.HashSet();
	
	@OneToMany(mappedBy="esComentadoPor", targetEntity=bd_dcl.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comenta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_seguido", targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguir = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gustaA", targetEntity=bd_dcl.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_daMeGustaComentario = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_esDenunciado", targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denucia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_visualizadaPor", targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_visualiza = new java.util.HashSet();
	
	@OneToMany(mappedBy="realizadaPor", targetEntity=bd_dcl.Denuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realizaDenuncia = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFechaNacimiento(String value) {
		this.fechaNacimiento = value;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection seguido = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDO, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIR, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_EsDenunciado(java.util.Set value) {
		this.ORM_esDenunciado = value;
	}
	
	private java.util.Set getORM_EsDenunciado() {
		return ORM_esDenunciado;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection esDenunciado = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_ESDENUNCIADO, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIA, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_DaMeGustaPublicacion(java.util.Set value) {
		this.ORM_daMeGustaPublicacion = value;
	}
	
	private java.util.Set getORM_DaMeGustaPublicacion() {
		return ORM_daMeGustaPublicacion;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection daMeGustaPublicacion = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTAPUBLICACION, bd_dcl.ORMConstants.KEY_PUBLICACION_GUSTAA, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection publica = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_PUBLICA, bd_dcl.ORMConstants.KEY_PUBLICACION_PERTENECEA, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Recibe(java.util.Set value) {
		this.ORM_recibe = value;
	}
	
	private java.util.Set getORM_Recibe() {
		return ORM_recibe;
	}
	
	@Transient	
	public final bd_dcl.NotificacionSetCollection recibe = new bd_dcl.NotificacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_RECIBE, bd_dcl.ORMConstants.KEY_NOTIFICACION_ENVIADAA, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_DenuciaPublicacion(java.util.Set value) {
		this.ORM_denuciaPublicacion = value;
	}
	
	private java.util.Set getORM_DenuciaPublicacion() {
		return ORM_denuciaPublicacion;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection denuciaPublicacion = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIAPUBLICACION, bd_dcl.ORMConstants.KEY_PUBLICACION_PUBLICACIONDENUNCIADAPOR, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_DenunciaComentarioUR(java.util.Set value) {
		this.ORM_denunciaComentarioUR = value;
	}
	
	private java.util.Set getORM_DenunciaComentarioUR() {
		return ORM_denunciaComentarioUR;
	}
	
	@Transient	
	public final bd_dcl.ComentarioSetCollection denunciaComentarioUR = new bd_dcl.ComentarioSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUNCIACOMENTARIOUR, bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADOPOR, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Comenta(java.util.Set value) {
		this.ORM_comenta = value;
	}
	
	private java.util.Set getORM_Comenta() {
		return ORM_comenta;
	}
	
	@Transient	
	public final bd_dcl.ComentarioSetCollection comenta = new bd_dcl.ComentarioSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_COMENTA, bd_dcl.ORMConstants.KEY_COMENTARIO_ESCOMENTADOPOR, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Seguir(java.util.Set value) {
		this.ORM_seguir = value;
	}
	
	private java.util.Set getORM_Seguir() {
		return ORM_seguir;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection seguir = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIR, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDO, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_DaMeGustaComentario(java.util.Set value) {
		this.ORM_daMeGustaComentario = value;
	}
	
	private java.util.Set getORM_DaMeGustaComentario() {
		return ORM_daMeGustaComentario;
	}
	
	@Transient	
	public final bd_dcl.ComentarioSetCollection daMeGustaComentario = new bd_dcl.ComentarioSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTACOMENTARIO, bd_dcl.ORMConstants.KEY_COMENTARIO_GUSTAA, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Denucia(java.util.Set value) {
		this.ORM_denucia = value;
	}
	
	private java.util.Set getORM_Denucia() {
		return ORM_denucia;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection denucia = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIA, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_ESDENUNCIADO, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Visualiza(java.util.Set value) {
		this.ORM_visualiza = value;
	}
	
	private java.util.Set getORM_Visualiza() {
		return ORM_visualiza;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection visualiza = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_VISUALIZA, bd_dcl.ORMConstants.KEY_PUBLICACION_VISUALIZADAPOR, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_RealizaDenuncia(java.util.Set value) {
		this.ORM_realizaDenuncia = value;
	}
	
	private java.util.Set getORM_RealizaDenuncia() {
		return ORM_realizaDenuncia;
	}
	
	@Transient	
	public final bd_dcl.DenunciaSetCollection realizaDenuncia = new bd_dcl.DenunciaSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_REALIZADENUNCIA, bd_dcl.ORMConstants.KEY_DENUNCIA_REALIZADAPOR, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
