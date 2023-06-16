package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;
import vistas.VistaCabeceraAdmin;
import vistas.VistaCabeceraAdmin;

public class Cabecera_Administrador extends VistaCabeceraAdmin{
	private Button _cerrarSesionB;
	private Button _gestionarDenunciasB;
	private Button _inicioB;
	public Administrador _administrador;
	public Gestionar_denuncias denuncias= new Gestionar_denuncias("Cristian","27/05/2002","123456","icons/icon.png");
	public Realizar_busqueda _realizar_busqueda;
	public Cerrar_sesion _cerrar_sesion;
	
	public Cabecera_Administrador() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Gestionar_denuncias();
	}

	public void Gestionar_denuncias() {
		this.getGestionarDenunciasB().addClickListener(event->{
			this.denuncias.setVisible(true);
		});
	}

	public void Realizar_busqueda() {
		
	}

	public void Cerrar_sesion() {
		
	}

	public void Inicio() {
		
	}
}