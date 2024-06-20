package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.BDPrincipal;
import basededatos.iUsuario_No_Registrado;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaRegistrarusuario;

public class Registrar extends VistaRegistrarusuario {

	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/icons/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/icons/uploads/";

	public Login _iniciar_sesion;
	iUsuario_No_Registrado bd = new BDPrincipal();
	boolean tipoCuenta;
	private String fotoURL = "";
	Usuario_No_Registrado interfaz;
	private Image imagen;
	int usuarioID;
	Dialog dialog;

	public Registrar(Usuario_No_Registrado interfaz, Login login, Dialog dialog) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.dialog = dialog;
		this.interfaz = interfaz;
		this._iniciar_sesion = login;
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
			createUploadDirectory();

			FileBuffer buffer = new FileBuffer();

			Upload upload = new Upload(buffer);

			upload.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");

			Dialog dialog = new Dialog();
			dialog.getElement().setAttribute("aria-label", "Subir Imagen");

			dialog.add(upload);
			dialog.open();

			upload.addSucceededListener(event2 -> {
				File uploadedFile = buffer.getFileData().getFile();

				try {

					Path destinationPath = Paths.get(UPLOAD_DIR + event2.getFileName());
					Files.move(uploadedFile.toPath(), destinationPath,
							java.nio.file.StandardCopyOption.REPLACE_EXISTING);

					Notification.show("Image uploaded successfully!");

					Image img = createImageFromFile(IMAGE_PATH + event2.getFileName());
					dialog.close();
					this.fotoURL = "/icons/uploads/" + event2.getFileName();
					this.getVaadinAvatar().setImage(fotoURL);
				} catch (Exception e) {
					Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
				}
				upload.addFileRejectedListener(event3 -> {

					Notification.show("File rejected: " + event3.getErrorMessage(), 5000, Notification.Position.MIDDLE);

				});
			});
		});
	}

	public void Validar_registro() {
		this.getConfirmar().addClickListener(event -> {
			UsuarioRegistrado user;
			UsuarioComercial uc;
			Object userAux = this.bd.registrarUsuario(this.getNombreTF().getValue(), this.getApellifosTF().getValue(),
					this.getEmail().getValue(), this.getContrasenaTF().getValue(), this.getDescripcionTF().getValue(),
					this.getNombreDeUsuarioTF().getValue(), this.getFecha().getValue().toString(), tipoCuenta,
					this.fotoURL);
			this.dialog.close();
			this.interfaz.interfaz.removeAll();
			if(userAux instanceof UsuarioRegistrado) {		
				user = (UsuarioRegistrado) userAux;
				this.interfaz.interfaz.add(new Usuario_Registrado(this.interfaz.interfaz, user.getID()));
			}else {
				uc = (UsuarioComercial) userAux;
				this.interfaz.interfaz.add(new Usuario_comercial(this.interfaz.interfaz, uc.getID()));
			}
		});
	}

	public void Descartar() {
		this.getDescartar().addClickListener(event -> {
			this.dialog.close();
		});
	}

	private void createUploadDirectory() {

		Path uploadDirPath = Paths.get(UPLOAD_DIR);

		if (!Files.exists(uploadDirPath)) {

			try {

				Files.createDirectories(uploadDirPath);

			} catch (IOException e) {

				throw new RuntimeException("Could not create upload directory: " + e.getMessage(), e);

			}

		}
	}

	private Image createImageFromFile(String filePath) {

		File file = new File(filePath);

		if (file.exists()) {

			StreamResource resource = new StreamResource(file.getName(), () -> {

				try {

					return new FileInputStream(file);

				} catch (FileNotFoundException e) {

					Notification.show("Error: " + e.getMessage(), 5000, Notification.Position.MIDDLE);

					return null;

				}

			});

			Image image = new Image(resource, "Image not found");

			image.setMaxWidth("500px");

			return image;

		} else {

			Notification.show("File not found: " + filePath, 5000, Notification.Position.MIDDLE);

			return new Image();

		}
	}
}