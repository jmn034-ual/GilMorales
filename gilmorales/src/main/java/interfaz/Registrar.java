package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
	public Iniciar_Sesion__4 _iniciar_sesion= new Iniciar_Sesion__4();

	public void Subir_foto() {
		
	}

	public void Validar_registro() {
		
	}

	public void Descartar() {
		_iniciar_sesion= new Iniciar_Sesion__4();
		this.getDescartar().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_iniciar_sesion);});
	}
}