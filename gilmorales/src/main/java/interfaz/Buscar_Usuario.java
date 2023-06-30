package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscarUsuario;

public class Buscar_Usuario extends VistaBuscarUsuario{
	public Filtrar_resultado _filtrar_resultado = new Filtrar_resultado();
	public Resultado_usuarios _resultado_usuarios;
	
	public Buscar_Usuario(String buscar, String filtro){
		_resultado_usuarios = new Resultado_usuarios(buscar, filtro);
		Resultado_usuarios();
	}

	public void Resultado_usuarios() {
		this.getLayoutBuscarUsuario().as(VerticalLayout.class).add(_resultado_usuarios);
	}
}