package TikTok;

import java.util.Vector;

public class Publicacion {

	private String nombreUsuario;
	private String geolocalizacion;
	private String descripcion;
	private String fecha;
	private int numMeGustas;
	private int numComentarios;
	private int numVisualizaciones = 0;
	private Vector comentarios = new Vector<>();
	private Vector usuarios = new Vector<>();
	private Video video = new Video("videos/tiktok1.mp4");
	
	public Publicacion(String nombre, String descripcion, String fecha) {
		this.nombreUsuario = nombre;
		this.geolocalizacion = "";
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.numComentarios = comentarios.size();
		this.numMeGustas = usuarios.size();
	}
	
	public Publicacion(String nombre, String geolocalizacion, String descripcion, String fecha) {
		this.nombreUsuario = nombre;
		this.geolocalizacion = geolocalizacion;
		this.descripcion = descripcion;
		this.fecha = fecha;
//		this.numComentarios = comentarios.size();
//		this.numMeGustas = usuarios.size();
	}
	
//	public void comentar(String comentario) {
//		comentarios.add(comentario);
//	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(String geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getNumMeGustas() {
		return numMeGustas;
	}
	public void setNumMeGustas(int numMeGustas) {
		this.numMeGustas = numMeGustas;
	}
	public int getNumComentarios() {
		return numComentarios;
	}
	public void setNumComentarios(int numComentarios) {
		this.numComentarios = numComentarios;
	}
	public int getNumVisualizaciones() {
		return numVisualizaciones;
	}
	public void setNumVisualizaciones(int numVisualizaciones) {
		this.numVisualizaciones = numVisualizaciones;
	}
	public Vector getComentarios() {
		return comentarios;
	}
	public void setComentarios(Vector comentarios) {
		this.comentarios = comentarios;
	}
	public Vector getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Vector usuarios) {
		this.usuarios = usuarios;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	
	
}
