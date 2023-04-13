package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;

import vistas.VistaConfigurarPerfil;

public class Configurar_perfil extends VistaConfigurarPerfil{
	private Button _restaurar;
	private Checkbox _configurar_notificacionesCL;
	private ComboBox _configurar_visibilidadCB;
	private Label _tituloL;
	private Label _privacidadL;
	private Label _visibilidadL;
	private Label _notificacionesL;
	private Label _preferenciasL;
	private Button _guardarB;
	public Ver_perfil_propio _ver_perfil_propio;

	public void Restaurar() {
		throw new UnsupportedOperationException();
	}

	public void Configurar_notificaciones() {
		throw new UnsupportedOperationException();
	}

	public void Configurar_visibilidad() {
		throw new UnsupportedOperationException();
	}

	public void Guardar() {
		throw new UnsupportedOperationException();
	}
}