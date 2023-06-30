package interfaz;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.server.StreamResource;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaRegistrarusuario;

public class Registrar extends VistaRegistrarusuario{

	//	private Label _tituloL;
	//	private Button _subirFotoB;
	//	private Image _foto;
	//	private Label _nombreL;
	//	private TextField _nombreTF;
	//	private Label _apellidosL;
	//	private TextField _apellidosTF;
	//	private Label _emailL;
	//	private TextField _emailTF;
	//	private Label _passwordL;
	//	private TextField _passwordTF;
	//	private Label _confirmarPasswordL;
	//	private TextField _confirmarPasswordTF;
	//	private Label _descripcionL;
	//	private TextField _descripcionTF;
	//	private Label _usuarioL;
	//	private TextField _usuarioTF;
	//	private Label _fechaL;
	//	private TextField _fechaTF;
	//	private Label _tipoCuentaL;
	//	private ComboBox _tipoCuentaCB;
	//	private Button _descartarB;
	//	private Button _confirmarB;
	public Login _iniciar_sesion;
	iUsuario_No_Registrado  bd = new BDPrincipal();
	boolean tipoCuenta;
	private boolean valido;
	private String foto;
	Usuario_No_Registrado interfaz;
	int usuarioID;


	public Registrar(Usuario_No_Registrado interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
//		Descartar();
		Subir_foto();
		this.getNormal().addClickListener(event ->{
			this.getVaadinHorizontalLayout3().setVisible(true);
			this.getLabel1().setText("Nombre:");
			tipoCuenta = true;
			this.getComercial().setValue(false);
		});
		this.getComercial().addClickListener(event ->{
			this.getVaadinHorizontalLayout3().setVisible(false);
			this.getLabel1().setText("Nombre Empresa:");
			tipoCuenta = false;
			this.getNormal().setValue(false);
		});
		Validar_registro() ;
	}

	public boolean getValido() {
		return this.tipoCuenta;
	}

	public void Subir_foto() {

		Upload upload = new Upload();
		upload.setAcceptedFileTypes("image/*");

		// Añadir un manejador de carga de archivos
		upload.addSucceededListener(event -> {
			// Obtener el archivo cargado como un arreglo de bytes
			byte[] bytes = event.getUpload().toString().getBytes();

			// Crear un recurso de flujo de bytes para la imagen cargada
			InputStream stream = new ByteArrayInputStream(bytes); 
			StreamResource resource = new StreamResource("image.png", () -> stream);

			// Crear un componente de imagen para mostrar la imagen cargada
			Image image = new Image(resource, "Imagen cargada");

			Notification.show("Imagen cargada correctamente");
		});

	}

	public void Validar_registro() {
		//		List<UsuarioRegistrado> usuarios = null;
		//		List<UsuarioComercial> comerciales = null;
		this.getConfirmar().addClickListener(event ->{
//			if(tipoCuenta) {
				this.bd.registrarUsuario(this.getNombreTF().getValue(), this.getApellifosTF().getValue(), this.getEmail().getValue(), 
						this.getContrasenaTF().getValue(), this.getDescripcionTF().getValue(), this.getNombreDeUsuarioTF().getValue(), this.getFecha().getValue().toString(), 
						tipoCuenta, "icons/luffy.jpg");
				this.valido = true;
//			}else {
//				this.usuarioID = bd.registrarUsuario(this.getNombreTF().getValue(), this.getApellifosTF().getValue(), this.getEmail().getValue(), 
//						this.getContrasenaTF().getValue(), this.getDescripcionTF().getValue(), this.getNombreDeUsuarioTF().getValue(), this.getFecha().getValue().toString(),
//						tipoCuenta, "icons/luffy.jpg");
//				this.valido = false;
//			}

		});
	}

//	public void Descartar() {
//		this.getDescartar().addClickListener(event ->{
//			this.interfaz.cabeceraUNR.setVisible(true);
//			this.interfaz.getVaadinHorizontalLayout().setVisible(true);
//			this.interfaz.getVaadinVerticalLayout().as(VerticalLayout.class).remove(this.interfaz.inicioSesion._registrar);
//		});
//	}
}