package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

import bd_dcl.Publicacion;

public class Lista_publicaciones_gustadas_item {

	public Lista_publicaciones_gustadas _lista_publicaciones_gustadas;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	
	public Lista_publicaciones_gustadas_item(Publicacion p, Lista_publicaciones_gustadas interfaz) {
		this._lista_publicaciones_gustadas = interfaz;
	}

	public void Ver_publicacion__Administrador() {
		throw new UnsupportedOperationException();
	}
}