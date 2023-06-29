package interfaz;

import bd_dcl.Publicacion;
import vistas.VistaPublicacionesHashtagItem;

public class Publicaciones_hashtag_item extends VistaPublicacionesHashtagItem{
//	private Video _publicacionV;
//	private button _verPublicacionB;
//	private TextArea _descripcionTA;
//	private button _verPerfilB;
	public Publicaciones_hashtag _publicaciones_hashtag;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Ver_Perfil__2 _ver_perfil;
	Publicacion pubblicacion;
	
	public Publicaciones_hashtag_item(Publicacion p) {
		this.pubblicacion = p;
	}

	public void Ver_publicacion_ajena() {
		
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}