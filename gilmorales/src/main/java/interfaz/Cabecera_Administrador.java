package interfaz;

import com.vaadin.flow.component.button.Button;

import vistas.VistaCabecera;
import vistas.VistaCabeceraAdmin;
import vistas.VistaCabeceraAdmin;

public class Cabecera_Administrador extends VistaCabeceraAdmin{
	private Button _cerrarSesionB;
	private Button _gestionarDenunciasB;
	private Button _inicioB;
	public Administrador _administrador;
	public Gestionar_denuncias _gestionar_denuncias;
	public Realizar_busqueda _realizar_busqueda;
	public Cerrar_sesion _cerrar_sesion;
	
	public Cabecera_Administrador() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Gestionar_denuncias() {
		
	}

	public void Realizar_busqueda() {
		
	}

	public void Cerrar_sesion() {
		
	}

	public void Inicio() {
		
	}
}