package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Cabecera_Usuario_Registrado extends Comun__Comercial_y_Usuario_Registrado_ {
	private Button _perfilB;
	private Button _notificacionesB;
	private Button _inicioB;
	private Button _buscarB;
	private TextField _buscarTF;
	public Usuario_Registrado _usuario_Registrado;
	public Ver_notificaciones _ver_notificaciones;
	public Ver_perfil_propio _ver_perfil_propio;
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP = new Cabecera_TOP();
	
	public Cabecera_Usuario_Registrado() {
    	Cabecera_TOP();
    	
	}

	public void Ver_notificaciones() {
		throw new UnsupportedOperationException();
	}

	public void Ver_perfil_propio() {
		throw new UnsupportedOperationException();
	}

	public void Realizar_busqueda(String aBuscarTF) {
		throw new UnsupportedOperationException();
	}

	public void Cabecera_TOP() {
		_cabecera_TOP.getStyle().set("width", "100%");
    	_cabecera_TOP.getStyle().set("height", "100%");
    	_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_cabecera_TOP);
	}

	public void volverInicio() {
		throw new UnsupportedOperationException();
	}
}