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
@Table(name="Denuncia")
public class Denuncia implements Serializable {
	public Denuncia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd_dcl.ORMConstants.KEY_DENUNCIA_ATENDIDA) {
			this.atendida = (bd_dcl.UsuarioAdministrador) owner;
		}
		
		else if (key == bd_dcl.ORMConstants.KEY_DENUNCIA_REALIZADAPOR) {
			this.realizadaPor = (bd_dcl.UsuarioRegistrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdDenuncia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_DENUNCIA_IDDENUNCIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_DENUNCIA_IDDENUNCIA_GENERATOR", strategy="native")	
	private int idDenuncia;
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKDenuncia623487"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioRegistrado realizadaPor;
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioAdministrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioAdministradorCodigoEmpleado", referencedColumnName="CodigoEmpleado", nullable=false) }, foreignKey=@ForeignKey(name="FKDenuncia607679"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioAdministrador atendida;
	
	@Column(name="TipoDenuncia", nullable=false, length=10)	
	private int tipoDenuncia;
	
	@Column(name="TipoEstado", nullable=false, length=10)	
	private int tipoEstado;
	
	@Column(name="Motivo", nullable=true, length=255)	
	private String motivo;
	
	@Column(name="Explicacion", nullable=true, length=255)	
	private String explicacion;
	
	public void setTipoDenuncia(int value) {
		this.tipoDenuncia = value;
	}
	
	public int getTipoDenuncia() {
		return tipoDenuncia;
	}
	
	public void setTipoEstado(int value) {
		this.tipoEstado = value;
	}
	
	public int getTipoEstado() {
		return tipoEstado;
	}
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setExplicacion(String value) {
		this.explicacion = value;
	}
	
	public String getExplicacion() {
		return explicacion;
	}
	
	private void setIdDenuncia(int value) {
		this.idDenuncia = value;
	}
	
	public int getIdDenuncia() {
		return idDenuncia;
	}
	
	public int getORMID() {
		return getIdDenuncia();
	}
	
	public void setAtendida(bd_dcl.UsuarioAdministrador value) {
		if (atendida != null) {
			atendida.gestiona.remove(this);
		}
		if (value != null) {
			value.gestiona.add(this);
		}
	}
	
	public bd_dcl.UsuarioAdministrador getAtendida() {
		return atendida;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Atendida(bd_dcl.UsuarioAdministrador value) {
		this.atendida = value;
	}
	
	private bd_dcl.UsuarioAdministrador getORM_Atendida() {
		return atendida;
	}
	
	public void setRealizadaPor(bd_dcl.UsuarioRegistrado value) {
		if (realizadaPor != null) {
			realizadaPor.realizaDenuncia.remove(this);
		}
		if (value != null) {
			value.realizaDenuncia.add(this);
		}
	}
	
	public bd_dcl.UsuarioRegistrado getRealizadaPor() {
		return realizadaPor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RealizadaPor(bd_dcl.UsuarioRegistrado value) {
		this.realizadaPor = value;
	}
	
	private bd_dcl.UsuarioRegistrado getORM_RealizadaPor() {
		return realizadaPor;
	}
	
	public String toString() {
		return String.valueOf(getIdDenuncia());
	}
	
}
