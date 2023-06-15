package basededatos;

import java.util.List;
import java.util.Vector;

import bd_dcl.Publicacion;

public class Publicaciones {
	public BDPrincipal _c_bd_publicacion;
	public Vector<Publicacion> _publiacion = new Vector<Publicacion>();

	public void eliminarSeleccion(List aListaSeleccion) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPublicacion(int aID) {
		throw new UnsupportedOperationException();
	}

	public void addPublicacion(String aNombreUsuario, String aLocalizacion, String aDescripcion, String aVideo) {
		throw new UnsupportedOperationException();
	}

	public void meGustaPublicacion(int aIdPublicacion, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargarPublicacionesUsuarios() {
		throw new UnsupportedOperationException();
	}
}