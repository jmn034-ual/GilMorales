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
@Table(name="Hashtag")
public class Hashtag implements Serializable {
	public Hashtag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_HASHTAG_APARECE) {
			return ORM_aparece;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdHashtag", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_HASHTAG_IDHASHTAG_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_HASHTAG_IDHASHTAG_GENERATOR", strategy="native")	
	private int idHashtag;
	
	@Column(name="NombreHashtag", nullable=true, length=255)	
	private String nombreHashtag;
	
	@ManyToMany(targetEntity=bd_dcl.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Publicacion_Hashtag", joinColumns={ @JoinColumn(name="HashtagIdHashtag") }, inverseJoinColumns={ @JoinColumn(name="PublicacionIdPublicacion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece = new java.util.HashSet();
	
	private void setIdHashtag(int value) {
		this.idHashtag = value;
	}
	
	public int getIdHashtag() {
		return idHashtag;
	}
	
	public int getORMID() {
		return getIdHashtag();
	}
	
	public void setNombreHashtag(String value) {
		this.nombreHashtag = value;
	}
	
	public String getNombreHashtag() {
		return nombreHashtag;
	}
	
	private void setORM_Aparece(java.util.Set value) {
		this.ORM_aparece = value;
	}
	
	private java.util.Set getORM_Aparece() {
		return ORM_aparece;
	}
	
	@Transient	
	public final bd_dcl.PublicacionSetCollection aparece = new bd_dcl.PublicacionSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_HASHTAG_APARECE, bd_dcl.ORMConstants.KEY_PUBLICACION_CONTIENE, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdHashtag());
	}
	
}
