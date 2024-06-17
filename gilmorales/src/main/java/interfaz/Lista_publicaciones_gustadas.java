package interfaz;

import java.util.Vector;

import vistas.VistaPublicacionesGustadasUsuarioPublico;

public class Lista_publicaciones_gustadas extends VistaPublicacionesGustadasUsuarioPublico{
	public Ver_publicaciones_gustadas _ver_publicaciones_gustadas;
	public Vector<Lista_publicaciones_gustadas_item> _item = new Vector<Lista_publicaciones_gustadas_item>();
	
	public Lista_publicaciones_gustadas(Ver_publicaciones_gustadas interfaz) {
		this._ver_publicaciones_gustadas = interfaz;
	}
}