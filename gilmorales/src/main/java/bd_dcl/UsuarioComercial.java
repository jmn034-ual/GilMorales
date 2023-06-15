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
@Table(name="UsuarioComercial")
public class UsuarioComercial implements Serializable {
	public UsuarioComercial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_USUARIOCOMERCIAL_PUBLICA) {
			return ORM_publica;
		}
		else if (key == bd_dcl.ORMConstants.KEY_USUARIOCOMERCIAL_DENUNCIACOMENTARIOUC) {
			return ORM_denunciaComentarioUC;
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
	@GeneratedValue(generator="BD_DCL_USUARIOCOMERCIAL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_USUARIOCOMERCIAL_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="NombreUsuarioComercial", nullable=false, length=255)	
	private String nombreUsuarioComercial;
	
	@Column(name="NombreEmpresa", nullable=true, length=255)	
	private String nombreEmpresa;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="FechaNacimiento", nullable=true, length=255)	
	private String fechaNacimiento;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@OneToMany(mappedBy="esPublicada", targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_denunciaDe", targetEntity=bd_dcl.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciaComentarioUC = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreUsuarioComercial(String value) {
		this.nombreUsuarioComercial = value;
	}
	
	public String getNombreUsuarioComercial() {
		return nombreUsuarioComercial;
	}
	
	public void setNombreEmpresa(String value) {
		this.nombreEmpresa = value;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setFechaNacimiento(String value) {
		this.fechaNacimiento = value;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
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
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection publica = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOCOMERCIAL_PUBLICA, bd_dcl.ORMConstants.KEY_PUBLICACION_ESPUBLICADA, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_DenunciaComentarioUC(java.util.Set value) {
		this.ORM_denunciaComentarioUC = value;
	}
	
	private java.util.Set getORM_DenunciaComentarioUC() {
		return ORM_denunciaComentarioUC;
	}
	
	@Transient	
	public final bd_dcl.ComentarioSetCollection denunciaComentarioUC = new bd_dcl.ComentarioSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOCOMERCIAL_DENUNCIACOMENTARIOUC, bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADE, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
