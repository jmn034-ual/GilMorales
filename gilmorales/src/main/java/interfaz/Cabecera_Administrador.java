package interfaz;

import com.vaadin.flow.component.button.Button;

import vistas.VistaCabecera;
import vistas.VistaCabeceraAdministrador;

public class Cabecera_Administrador extends VistaCabecera{
	private Button _cerrarSesionB;
	private Button _gestionarDenunciasB;
	private Button _inicioB;
	public Administrador _administrador;
	public Gestionar_denuncias _gestionar_denuncias = new Gestionar_denuncias();
	public Realizar_busqueda _realizar_busqueda = new Realizar_busqueda();
	public Cerrar_sesion _cerrar_sesion = new Cerrar_sesion();
	
	public Cabecera_Administrador() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Gestionar_denuncias() {
		
	}

	public void Realizar_busqueda() {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_sesion() {
		throw new UnsupportedOperationException();
	}

	public void Inicio() {
		throw new UnsupportedOperationException();
	}
}