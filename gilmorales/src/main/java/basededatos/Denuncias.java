package basededatos;

import java.util.List;
import java.util.Vector;

import bd_dcl.Denuncia;

public class Denuncias {
	public BDPrincipal _c_bd_denuncia;
	public Vector<Denuncia> _denuncia = new Vector<Denuncia>();

	public List cargarDenuncias() {
		throw new UnsupportedOperationException();
	}

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion) {
		throw new UnsupportedOperationException();
	}

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo) {
		throw new UnsupportedOperationException();
	}

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion) {
		throw new UnsupportedOperationException();
	}

	public List cargarUsuariosMeGustas(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public List filtrarDenuncias(String aFiltro) {
		throw new UnsupportedOperationException();
	}
}