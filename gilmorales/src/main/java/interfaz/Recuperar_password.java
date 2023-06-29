package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaRecuperarpassword;

public class Recuperar_password extends VistaRecuperarpassword{
	private Button _enviar_codigo;
	private Label _tituloL;
	private Label _emailL;
	private TextField _emailTF;
	private Label _codigoL;
	private TextField _codigoTF;
	private Button _enviarCodigoB;
	private Label _passwordL;
	private TextField _passwordTF;
	private Button _enviarB;
	private Label _registrarseL;
	private Button _registrarseB;
	public Login _iniciar_sesion;
	
	public Recuperar_password() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Validar_codigo() {
		
	}

	public void Reenviar_codigo() {
		
	}

	public void Validar_datos() {
		
	}
}