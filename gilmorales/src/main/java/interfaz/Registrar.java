package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaRegistrarusuario;

public class Registrar extends VistaRegistrarusuario{
	private Label _tituloL;
	private Button _subirFotoB;
	private Image _foto;
	private Label _nombreL;
	private TextField _nombreTF;
	private Label _apellidosL;
	private TextField _apellidosTF;
	private Label _emailL;
	private TextField _emailTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Label _confirmarPasswordL;
	private TextField _confirmarPasswordTF;
	private Label _descripcionL;
	private TextField _descripcionTF;
	private Label _usuarioL;
	private TextField _usuarioTF;
	private Label _fechaL;
	private TextField _fechaTF;
	private Label _tipoCuentaL;
	private ComboBox _tipoCuentaCB;
	private Button _descartarB;
	private Button _confirmarB;
	public Iniciar_Sesion__4 _iniciar_sesion;

	public Registrar() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("heigth", "100%");
	}
	public void Subir_foto() {
		throw new UnsupportedOperationException();
	}

	public void Validar_registro() {
		throw new UnsupportedOperationException();
	}

	public void Descartar() {
		throw new UnsupportedOperationException();
	}
}