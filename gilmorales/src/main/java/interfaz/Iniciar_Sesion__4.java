package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaIniciarsesion;

public class Iniciar_Sesion__4 extends VistaIniciarsesion{
	private Label _tituloL;
	private Label _usuarioL;
	private TextField _usuarioTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Button _recuperarPasswordB;
	private Button _iniciarSesion;
	private Button _googleB;
	private Button _facebookB;
	private Button _twitterB;
	private Button _instagramB;
	private Label _registrarseL;
	private Button _registrarseB;
	public Iniciar_sesion__3 _iniciar_sesion;
	public Iniciar_sesion_otras_plataformas _iniciar_sesion_otras_plataformas;
	public Recuperar_password _recuperar_password;
	public Registrar _registrar;
	
	public Iniciar_Sesion__4() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
	}

//	public void Iniciar_sesion_otras_plataformas() {
//	}
//
//	public void Recuperar_password() {
//		
//	}

	public void Validar_datos() {
		
	}

//	public void Registrar() { 
//		
//	}
}