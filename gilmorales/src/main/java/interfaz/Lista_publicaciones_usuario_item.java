package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

import vistas.VistaListaPublicacionesUsuarioNoRegistradoItem;
import vistas.VistaListaUsuariosItem;

public class Lista_publicaciones_usuario_item extends VistaListaPublicacionesUsuarioNoRegistradoItem{
	private int _numeroVisualizaciones;
	private Div _video;
	private Button _verPublicacionB;
	private Label _visualizacionesL;
	public Lista_publicaciones_usuario _lista_publicaciones_usuario;
	public Ver_publicacion__Administrador_ _ver_publicacion__Administrador_;

	public void Ver_publicacion__Administrador_() {
		throw new UnsupportedOperationException();
	}
}