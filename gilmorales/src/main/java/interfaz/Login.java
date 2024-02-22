package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaIniciarsesion;

public class Login extends Iniciar_sesion{
//	private Label _tituloL;
//	private Label _usuarioL;
//	private TextField _usuarioTF;
//	private Label _passwordL;
//	private TextField _passwordTF;
//	private Button _recuperarPasswordB;
//	private Button _iniciarSesion;
//	private Button _googleB;
//	private Button _facebookB;
//	private Button _twitterB;
//	private Button _instagramB;
//	private Label _registrarseL;
//	private Button _registrarseB;
	public Iniciar_sesion _iniciar_sesion;
	public Iniciar_sesion_otras_plataformas _iniciar_sesion_otras_plataformas;
	public Recuperar_password _recuperar_password ;
	public Registrar _registrar ;
	private iUsuario_Registrado ur;
	Usuario_No_Registrado interfaz;
	private String nombreUsuario;
	private String password;
	private boolean tipoCuenta = false;
	Object user = null;
	
	public Login(Usuario_No_Registrado interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.interfaz = interfaz;
    	Registrar();
    	Validar_datos();
	}

	public void Iniciar_sesion_otras_plataformas() {
	}

	public void Recuperar_password() {
		
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public Object Validar_datos() {
		this.getIniciarSesionB().addClickListener(event ->{
			this.nombreUsuario = this.getUsuarioTF().getValue();
			this.password = this.getContrasenaTF().getValue();
			user = this.Iniciar_sesion(this.nombreUsuario, this.password);
			this.getUsuarioTF().setValue("");
			this.getContrasenaTF().setValue("");
		});
		return user;
	}

	public void Registrar() { 
		_registrar = new Registrar(this.interfaz);
		this.getRegistrarB().addClickListener(event -> {
//			this.getVaadinHorizontalLayout().setVisible(false);
//			this.getVaadinHorizontalLayout1().setVisible(false);
//			this.getVaadinHorizontalLayout2().setVisible(false);
//			this.getVaadinHorizontalLayout3().setVisible(false);
//			this.getVaadinHorizontalLayout4().setVisible(false);
//			this.getVaadinHorizontalLayout5().setVisible(false);
//			this.getVaadinHorizontalLayout6().setVisible(false);
			this.interfaz.getVaadinVerticalLayout().as(VerticalLayout.class).remove(this.interfaz.inicioSesion);
			this.interfaz.getVaadinVerticalLayout().as(VerticalLayout.class).add(this._registrar);
		});
	}
}