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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="UsuarioAdministrador")
public class UsuarioAdministrador implements Serializable {
	public UsuarioAdministrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_USUARIOADMINISTRADOR_GESTIONA) {
			return ORM_gestiona;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="CodigoEmpleado", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_USUARIOADMINISTRADOR_CODIGOEMPLEADO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_USUARIOADMINISTRADOR_CODIGOEMPLEADO_GENERATOR", strategy="native")	
	private int codigoEmpleado;
	
	@Column(name="NombreAdmin", nullable=true, length=255)	
	private String nombreAdmin;
	
	@Column(name="ApellidosAdmin", nullable=true, length=255)	
	private String apellidosAdmin;
	
	@Column(name="FechaContratacion", nullable=true, length=255)	
	private String fechaContratacion;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@OneToMany(mappedBy="atendida", targetEntity=bd_dcl.Denuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gestiona = new java.util.HashSet();
	
	private void setCodigoEmpleado(int value) {
		this.codigoEmpleado = value;
	}
	
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	
	public int getORMID() {
		return getCodigoEmpleado();
	}
	
	public void setNombreAdmin(String value) {
		this.nombreAdmin = value;
	}
	
	public String getNombreAdmin() {
		return nombreAdmin;
	}
	
	public void setApellidosAdmin(String value) {
		this.apellidosAdmin = value;
	}
	
	public String getApellidosAdmin() {
		return apellidosAdmin;
	}
	
	public void setFechaContratacion(String value) {
		this.fechaContratacion = value;
	}
	
	public String getFechaContratacion() {
		return fechaContratacion;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Gestiona(java.util.Set value) {
		this.ORM_gestiona = value;
	}
	
	private java.util.Set getORM_Gestiona() {
		return ORM_gestiona;
	}
	
	@Transient	
	public final bd_dcl.DenunciaSetCollection gestiona = new bd_dcl.DenunciaSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_USUARIOADMINISTRADOR_GESTIONA, bd_dcl.ORMConstants.KEY_DENUNCIA_ATENDIDA, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodigoEmpleado());
	}
	
}
