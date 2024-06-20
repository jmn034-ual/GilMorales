package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaIniciarsesion;

public class Login extends Iniciar_sesion{

	public Iniciar_sesion _iniciar_sesion;
	public Iniciar_sesion_otras_plataformas _iniciar_sesion_otras_plataformas;
	public Recuperar_password _recuperar_password ;
	public Registrar _registrar ;
	private iUsuario_Registrado ur;
	Usuario_No_Registrado interfaz;
	private String nombreUsuario;
	private String password;
	private boolean tipoCuenta = false;
	UsuarioRegistrado user;
	UsuarioComercial uc;
	UsuarioAdministrador admin;
	Dialog dialogRegistrar;
	
	public Login(Usuario_No_Registrado interfaz) {
    	this.interfaz = interfaz;
    	this.getUsuarioTF().setValue("");
		this.getContrasenaTF().setValue("");
		this.getRecuperarContrasenaB().setVisible(false);
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
	
	public void Validar_datos() {
		this.getIniciarSesionB().addClickListener(event ->{
			this.nombreUsuario = this.getUsuarioTF().getValue();
			this.password = this.getContrasenaTF().getValue();
			Object object = this.Iniciar_sesion(this.nombreUsuario, this.password);
			if(object != null) {
			this.interfaz.interfaz.removeAll();
			if(object instanceof UsuarioRegistrado) {
				this.user = (UsuarioRegistrado) object;
				this.interfaz.interfaz.add(new Usuario_Registrado(this.interfaz.interfaz, user.getID()));
			} else if(object instanceof UsuarioComercial){
				this.uc = (UsuarioComercial) object;
				this.interfaz.interfaz.add(new Usuario_comercial(this.interfaz.interfaz, uc.getID()));
			}else {
				this.admin = (UsuarioAdministrador) object;
				this.interfaz.interfaz.add(new Administrador(this.interfaz.interfaz, admin.getCodigoEmpleado()));
			}
			this.getUsuarioTF().setValue("");
			this.getContrasenaTF().setValue("");
			}else {
				 Notification.show("Usuario o claves incorrectas");
			}
		});
		
	}

	public void Registrar() {
		this.getRegistrarB().addClickListener(event -> {
			dialogRegistrar = new Dialog();
			_registrar = new Registrar(this.interfaz, this, dialogRegistrar);
			dialogRegistrar.add(_registrar);
			dialogRegistrar.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialogRegistrar.setCloseOnEsc(true);
			dialogRegistrar.setWidth("50%");
			this._registrar.getDescartar().addClickListener(event2 -> {
				dialogRegistrar.close();
			});
			this._registrar.getConfirmar().addClickListener(evente3 -> {
				this.interfaz.dialog.close();
			});
			dialogRegistrar.open();

		});
	}
}