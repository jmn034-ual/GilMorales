package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaTopComentariosUsuarioNoRegistradoItem;

public class Lista_Top_comentarios_Publicacion_comercial_item extends Lista_Top_Comentarios_Usuario_No_Registrado_item{

	public Lista_Top_comentarios_Publicacion_comercial _lista_Top_comentarios__Publicacion_comercial_;
	
	public Lista_Top_comentarios_Publicacion_comercial_item (Comentario c) {
		super(c);
		this.getStyle().set("width", "100%");
		this.getMeGustaB().setDisableOnClick(true);
	}
}