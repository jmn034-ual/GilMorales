package interfaz;

import java.util.Vector;

import bd_dcl.Publicacion;
import vistas.VistaListaTopComentariosUsuarioNoRegistrado;

public class Lista_Top_comentarios_Publicacion_comercial extends Lista_Top_Comentarios_Usuario_No_Registrado{
	public Ver_publicacion_propia_Comercial _ver_publicacion_propia__Comercial_;
	public Vector<Lista_Top_comentarios_Publicacion_comercial_item> _item = new Vector<Lista_Top_comentarios_Publicacion_comercial_item>();
	
	public Lista_Top_comentarios_Publicacion_comercial(Publicacion p, Ver_publicacion_propia_Comercial interfaz) {
		super(p);
	}
}