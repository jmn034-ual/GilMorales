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
	public Iniciar_sesion_otras_plataformas _iniciar_sesion_otras_plataformas= new Iniciar_sesion_otras_plataformas();
	public Recuperar_password _recuperar_password= new Recuperar_password();
	public Registrar _registrar= new Registrar();
	

	public void Iniciar_sesion_otras_plataformas() {
		_iniciar_sesion_otras_plataformas.getStyle().set("wide", "100%");
		_iniciar_sesion_otras_plataformas.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_iniciar_sesion_otras_plataformas);
	}

	public void Recuperar_password() {
		_recuperar_password.getStyle().set("width", "100%");
    	_recuperar_password.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_recuperar_password);
		
	}

	public void Validar_datos() {
		throw new UnsupportedOperationException();
	}

	public void Registrar() { 
		_registrar.getStyle().set("width", "100%");
		_registrar.getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_registrar);
	}
}