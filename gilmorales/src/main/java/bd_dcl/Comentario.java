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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADOPOR) {
			return ORM_denunciadoPor;
		}
		else if (key == bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADE) {
			return ORM_denunciaDe;
		}
		else if (key == bd_dcl.ORMConstants.KEY_COMENTARIO_GUSTAA) {
			return ORM_gustaA;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd_dcl.ORMConstants.KEY_COMENTARIO_ESCOMENTADOPOR) {
			this.esComentadoPor = (bd_dcl.UsuarioRegistrado) owner;
		}
		
		else if (key == bd_dcl.ORMConstants.KEY_COMENTARIO_COMENTADOEN) {
			this.comentadoEn = (bd_dcl.Publicacion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdComentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_COMENTARIO_IDCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_COMENTARIO_IDCOMENTARIO_GENERATOR", strategy="native")	
	private int idComentario;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Comentario", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciadoPor = new java.util.HashSet();
	
	@ManyToOne(targetEntity=bd_dcl.Publicacion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PublicacionIdPublicacion", referencedColumnName="IdPublicacion", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario906250"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.Publicacion comentadoEn;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@Column(name="NumeroMeGustas", nullable=false, length=10)	
	private int numeroMeGustas;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioComercial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioComercial_Comentario", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioComercialID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciaDe = new java.util.HashSet();
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario626193"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioRegistrado esComentadoPor;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Comentario2", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustaA = new java.util.HashSet();
	
	private void setIdComentario(int value) {
		this.idComentario = value;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	
	public int getORMID() {
		return getIdComentario();
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setNumeroMeGustas(int value) {
		this.numeroMeGustas = value;
	}
	
	public int getNumeroMeGustas() {
		return numeroMeGustas;
	}
	
	private void setORM_DenunciadoPor(java.util.Set value) {
		this.ORM_denunciadoPor = value;
	}
	
	private java.util.Set getORM_DenunciadoPor() {
		return ORM_denunciadoPor;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection denunciadoPor = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADOPOR, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUNCIACOMENTARIOUR, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_DenunciaDe(java.util.Set value) {
		this.ORM_denunciaDe = value;
	}
	
	private java.util.Set getORM_DenunciaDe() {
		return ORM_denunciaDe;
	}
	
	@Transient	
	public final bd_dcl.UsuarioComercialSetCollection denunciaDe = new bd_dcl.UsuarioComercialSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_COMENTARIO_DENUNCIADE, bd_dcl.ORMConstants.KEY_USUARIOCOMERCIAL_DENUNCIACOMENTARIOUC, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEsComentadoPor(bd_dcl.UsuarioRegistrado value) {
		if (esComentadoPor != null) {
			esComentadoPor.comenta.remove(this);
		}
		if (value != null) {
			value.comenta.add(this);
		}
	}
	
	public bd_dcl.UsuarioRegistrado getEsComentadoPor() {
		return esComentadoPor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EsComentadoPor(bd_dcl.UsuarioRegistrado value) {
		this.esComentadoPor = value;
	}
	
	private bd_dcl.UsuarioRegistrado getORM_EsComentadoPor() {
		return esComentadoPor;
	}
	
	private void setORM_GustaA(java.util.Set value) {
		this.ORM_gustaA = value;
	}
	
	private java.util.Set getORM_GustaA() {
		return ORM_gustaA;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection gustaA = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_COMENTARIO_GUSTAA, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTACOMENTARIO, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setComentadoEn(bd_dcl.Publicacion value) {
		if (comentadoEn != null) {
			comentadoEn.tieneComentarios.remove(this);
		}
		if (value != null) {
			value.tieneComentarios.add(this);
		}
	}
	
	public bd_dcl.Publicacion getComentadoEn() {
		return comentadoEn;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ComentadoEn(bd_dcl.Publicacion value) {
		this.comentadoEn = value;
	}
	
	private bd_dcl.Publicacion getORM_ComentadoEn() {
		return comentadoEn;
	}
	
	public String toString() {
		return String.valueOf(getIdComentario());
	}
	
}
