package basededatos;

import java.util.List;
import java.util.Vector;

import bd_dcl.Comentario;

public class Comentarios {
	public BDPrincipal _c_bd_comentarios;
	public Vector<Comentario> _comentario = new Vector<Comentario>();

	public List cargarComentariosTOP(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void comentarPublicacion(int aIdPublicacion, String aNombreUsuario, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public void borrarComentario(int aIdComentario, int aIdPublicacion, String aNombreUsuarioPropietario) {
		throw new UnsupportedOperationException();
	}

	public void meGustaComentario(int aIdComentario, String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}
}