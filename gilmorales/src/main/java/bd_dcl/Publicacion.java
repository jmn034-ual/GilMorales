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
@Table(name="Publicacion")
public class Publicacion implements Serializable {
	public Publicacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_TIENECOMENTARIOS) {
			return ORM_tieneComentarios;
		}
		else if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_VISUALIZADAPOR) {
			return ORM_visualizadaPor;
		}
		else if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_GUSTAA) {
			return ORM_gustaA;
		}
		else if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_PUBLICACIONDENUNCIADAPOR) {
			return ORM_publicacionDenunciadaPor;
		}
		else if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_ESPUBLICADA) {
			this.esPublicada = (bd_dcl.UsuarioComercial) owner;
		}
		
		else if (key == bd_dcl.ORMConstants.KEY_PUBLICACION_PERTENECEA) {
			this.perteneceA = (bd_dcl.UsuarioRegistrado) owner;
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
	
	@Column(name="IdPublicacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BD_DCL_PUBLICACION_IDPUBLICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_DCL_PUBLICACION_IDPUBLICACION_GENERATOR", strategy="native")	
	private int idPublicacion;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Publicacion3", joinColumns={ @JoinColumn(name="PublicacionIdPublicacion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_visualizadaPor = new java.util.HashSet();
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioComercial.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioComercialID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKPublicacio801666"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioComercial esPublicada;
	
	@Column(name="NumComentarios", nullable=false, length=10)	
	private int numComentarios;
	
	@Column(name="NumMeGustas", nullable=false, length=10)	
	private int numMeGustas;
	
	@Column(name="NumVisualizaciones", nullable=false, length=10)	
	private int numVisualizaciones;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="NombreUsuarioComercial", nullable=true, length=255)	
	private String nombreUsuarioComercial;
	
	@Column(name="NombreUsuario", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="FechaPublicacion", nullable=true, length=255)	
	private String fechaPublicacion;
	
	@Column(name="Video", nullable=true, length=255)	
	private String video;
	
	@Column(name="Localizacion", nullable=true, length=255)	
	private String localizacion;
	
	@OneToMany(mappedBy="comentadoEn", targetEntity=bd_dcl.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tieneComentarios = new java.util.HashSet();
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Publicacion", joinColumns={ @JoinColumn(name="PublicacionIdPublicacion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustaA = new java.util.HashSet();
	
	@ManyToOne(targetEntity=bd_dcl.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKPublicacio695078"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd_dcl.UsuarioRegistrado perteneceA;
	
	@ManyToMany(targetEntity=bd_dcl.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Publicacion2", joinColumns={ @JoinColumn(name="PublicacionIdPublicacion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publicacionDenunciadaPor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_aparece", targetEntity=bd_dcl.Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private void setIdPublicacion(int value) {
		this.idPublicacion = value;
	}
	
	public int getIdPublicacion() {
		return idPublicacion;
	}
	
	public int getORMID() {
		return getIdPublicacion();
	}
	
	public void setNumComentarios(int value) {
		this.numComentarios = value;
	}
	
	public int getNumComentarios() {
		return numComentarios;
	}
	
	public void setNumMeGustas(int value) {
		this.numMeGustas = value;
	}
	
	public int getNumMeGustas() {
		return numMeGustas;
	}
	
	public void setNumVisualizaciones(int value) {
		this.numVisualizaciones = value;
	}
	
	public int getNumVisualizaciones() {
		return numVisualizaciones;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setNombreUsuarioComercial(String value) {
		this.nombreUsuarioComercial = value;
	}
	
	public String getNombreUsuarioComercial() {
		return nombreUsuarioComercial;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setFechaPublicacion(String value) {
		this.fechaPublicacion = value;
	}
	
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	public void setVideo(String value) {
		this.video = value;
	}
	
	public String getVideo() {
		return video;
	}
	
	public void setLocalizacion(String value) {
		this.localizacion = value;
	}
	
	public String getLocalizacion() {
		return localizacion;
	}
	
	private void setORM_TieneComentarios(java.util.Set value) {
		this.ORM_tieneComentarios = value;
	}
	
	private java.util.Set getORM_TieneComentarios() {
		return ORM_tieneComentarios;
	}
	
	@Transient	
	public final bd_dcl.ComentarioSetCollection tieneComentarios = new bd_dcl.ComentarioSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_PUBLICACION_TIENECOMENTARIOS, bd_dcl.ORMConstants.KEY_COMENTARIO_COMENTADOEN, bd_dcl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_VisualizadaPor(java.util.Set value) {
		this.ORM_visualizadaPor = value;
	}
	
	private java.util.Set getORM_VisualizadaPor() {
		return ORM_visualizadaPor;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection visualizadaPor = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_PUBLICACION_VISUALIZADAPOR, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_VISUALIZA, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEsPublicada(bd_dcl.UsuarioComercial value) {
		if (esPublicada != null) {
			esPublicada.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public bd_dcl.UsuarioComercial getEsPublicada() {
		return esPublicada;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EsPublicada(bd_dcl.UsuarioComercial value) {
		this.esPublicada = value;
	}
	
	private bd_dcl.UsuarioComercial getORM_EsPublicada() {
		return esPublicada;
	}
	
	private void setORM_GustaA(java.util.Set value) {
		this.ORM_gustaA = value;
	}
	
	private java.util.Set getORM_GustaA() {
		return ORM_gustaA;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection gustaA = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_PUBLICACION_GUSTAA, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DAMEGUSTAPUBLICACION, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPerteneceA(bd_dcl.UsuarioRegistrado value) {
		if (perteneceA != null) {
			perteneceA.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public bd_dcl.UsuarioRegistrado getPerteneceA() {
		return perteneceA;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PerteneceA(bd_dcl.UsuarioRegistrado value) {
		this.perteneceA = value;
	}
	
	private bd_dcl.UsuarioRegistrado getORM_PerteneceA() {
		return perteneceA;
	}
	
	private void setORM_PublicacionDenunciadaPor(java.util.Set value) {
		this.ORM_publicacionDenunciadaPor = value;
	}
	
	private java.util.Set getORM_PublicacionDenunciadaPor() {
		return ORM_publicacionDenunciadaPor;
	}
	
	@Transient	
	public final bd_dcl.UsuarioRegistradoSetCollection publicacionDenunciadaPor = new bd_dcl.UsuarioRegistradoSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_PUBLICACION_PUBLICACIONDENUNCIADAPOR, bd_dcl.ORMConstants.KEY_USUARIOREGISTRADO_DENUCIAPUBLICACION, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final bd_dcl.HashtagSetCollection contiene = new bd_dcl.HashtagSetCollection(this, _ormAdapter, bd_dcl.ORMConstants.KEY_PUBLICACION_CONTIENE, bd_dcl.ORMConstants.KEY_HASHTAG_APARECE, bd_dcl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPublicacion());
	}
	
}
