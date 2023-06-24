package basededatos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;

public class Publicaciones {
	public BDPrincipal _c_bd_publicacion;
	public Vector<Publicacion> _publiacion = new Vector<Publicacion>();

	public void eliminarSeleccion(List aListaSeleccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPublicacion(int aID) {
		throw new UnsupportedOperationException();
	}

	public Publicacion addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		Publicacion p = null;
		try {
			p = PublicacionDAO.createPublicacion();
			p.setNombreUsuario(aNombreUsuario);
//			p.setLocalizacion(aLocalizacion);
			p.setDescripcion(aDescripcion);
			p.setVideo(aVideo);
			p.setFechaPublicacion(aVideo);
			 // Obtener la fecha actual
	        Date fechaActual = new Date();
	        // Formatear la fecha en el formato deseado
	        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
	        String fechaFormateada = formatoFecha.format(fechaActual);
	        p.setFechaPublicacion(fechaFormateada);
	        p.setNumComentarios(0);
	        p.setNumMeGustas(0);
	        p.setNumVisualizaciones(0);
	        PublicacionDAO.save(p);
	        t.commit();			
		} catch (Exception e) {
			t.rollback();
		}
		return p;
	}

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarPublicacionesUsuarios() {
		throw new UnsupportedOperationException();
	}
}