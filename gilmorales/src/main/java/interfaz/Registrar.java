package interfaz;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import vistas.VistaRegistrarusuario;

public class Registrar extends VistaRegistrarusuario {
	
	public Login _iniciar_sesion;
	iUsuario_No_Registrado bd = new BDPrincipal();
	boolean tipoCuenta;
	private String fotoURL = "";
	private String fotoURL2 = "";
	Usuario_No_Registrado interfaz;
	private Image imagen;
	int usuarioID;

	public Registrar(Usuario_No_Registrado interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		Descartar();
		Subir_foto();
		this.getNormal().addClickListener(event -> {
			this.getVaadinHorizontalLayout3().setVisible(true);
			this.getLabel1().setText("Nombre:");
			tipoCuenta = true;
			this.getComercial().setValue(false);
		});
		this.getComercial().addClickListener(event -> {
			this.getVaadinHorizontalLayout3().setVisible(false);
			this.getLabel1().setText("Nombre Empresa:");
			tipoCuenta = false;
			this.getNormal().setValue(false);
		});
		Validar_registro();
	}

	public boolean getValido() {
		return this.tipoCuenta;
	}

	public void Subir_foto() {

		this.getSubirFoto().addClickListener(event -> {
			MemoryBuffer  buffer = new MemoryBuffer ();
			Upload upload = new Upload(buffer);
			upload.setAcceptedFileTypes("image/*");

			Dialog dialog = new Dialog();
			dialog.getElement().setAttribute("aria-label", "Subir Imagen");

			dialog.add(upload);

			upload.addSucceededListener(event2 -> {
				 try {
		                InputStream inputStream = buffer.getInputStream();
		                byte[] bytes = inputStream.readAllBytes();
		             
		                
		                // Ruta donde se almacenará la imagen
		                this.fotoURL = System.getProperty("user.dir") + "/src/main/resources/META-INF/resources/icons/" + this.getNombreDeUsuarioTF().getValue() + ".jpg";		                
		                this.fotoURL2 = "icons/" + this.getNombreDeUsuarioTF().getValue() + ".jpg";
		                // Guardar la imagen en el directorio		                
		                FileOutputStream fos = new FileOutputStream(fotoURL);
		                fos.write(bytes);
		                fos.close();
		                
		                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
		                StreamResource streamResource = new StreamResource("image.jpg", () -> byteArrayInputStream);
		                 this.imagen = new Image(streamResource, "uploaded image");
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
			});
			dialog.open();
		});
	}
	
	public void Validar_registro() {
		this.getConfirmar().addClickListener(event -> {
			this.bd.registrarUsuario(this.getNombreTF().getValue(), this.getApellifosTF().getValue(),
					this.getEmail().getValue(), this.getContrasenaTF().getValue(), this.getDescripcionTF().getValue(),
					this.getNombreDeUsuarioTF().getValue(), this.getFecha().getValue().toString(), tipoCuenta,
					this.fotoURL2);
		});
	}

	public void Descartar() {
		this.getDescartar().addClickListener(event -> {
			this.interfaz.cabeceraUNR.setVisible(true);
			this.interfaz.getVaadinHorizontalLayout().setVisible(true);
			this.interfaz.getVaadinVerticalLayout().as(VerticalLayout.class)
					.remove(this.interfaz.inicioSesion._registrar);
		});
	}
}