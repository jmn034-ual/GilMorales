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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd_dcl.ORMConstants.KEY_NOTIFICACION_ENVIADAA) {
			this.enviadaA = (bd_dcl.UsuarioRegistrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdNotificacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_NOTIFICACION_IDNOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_NOTIFICACION_IDNOTIFICACION_GENERATOR", strategy="native")	
	private int idNotificacion;
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="Tiene"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioRegistrado enviadaA;
	
	@Column(name="TipoNotificacion", nullable=false, length=10)	
	private int tipoNotificacion;
	
	@Column(name="IDUsuarioNotifica", nullable=false, length=10)	
	private int IDUsuarioNotifica;
	
	private void setIdNotificacion(int value) {
		this.idNotificacion = value;
	}
	
	public int getIdNotificacion() {
		return idNotificacion;
	}
	
	public int getORMID() {
		return getIdNotificacion();
	}
	
	public void setTipoNotificacion(int value) {
		this.tipoNotificacion = value;
	}
	
	public int getTipoNotificacion() {
		return tipoNotificacion;
	}
	
	public void setIDUsuarioNotifica(int value) {
		this.IDUsuarioNotifica = value;
	}
	
	public int getIDUsuarioNotifica() {
		return IDUsuarioNotifica;
	}
	
	public void setEnviadaA(bd_dcl.UsuarioRegistrado value) {
		if (enviadaA != null) {
			enviadaA.recibe.remove(this);
		}
		if (value != null) {
			value.recibe.add(this);
		}
	}
	
	public bd_dcl.UsuarioRegistrado getEnviadaA() {
		return enviadaA;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EnviadaA(bd_dcl.UsuarioRegistrado value) {
		this.enviadaA = value;
	}
	
	private bd_dcl.UsuarioRegistrado getORM_EnviadaA() {
		return enviadaA;
	}
	
	public String toString() {
		return String.valueOf(getIdNotificacion());
	}
	
}
