package interfaz;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.server.StreamResource;

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
	
	public Registrar() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getSubirFoto().addClickListener(event->this.Subir_foto());
		this.getConfirmar().addClickListener(event->this.Validar_registro());
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
		this.getNombreDeUsuarioTF().getValue();
		this.getNombreTF().getValue();
		this.getContrasenaTF().getValue();
		this.getConfirmarTF().getValue();
		this.getApellifosTF().getValue();
		this.getComercial().getValue();
		this.getNormal().getValue();
		this.getDescripcionTF().getValue();
		this.getEmail().getValue();
		this.getFecha().getValue();
	}

	public void Descartar() {
		
	}
}