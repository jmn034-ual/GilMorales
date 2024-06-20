package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.server.StreamResource;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaEditarPerfil;

public class Editar_perfil extends VistaEditarPerfil{
	
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/icons/uploads/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/icons/uploads/";
	
	public Ver_perfil_propio _ver_perfil_propio;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado ur;
	private String fotoURL = "";
	Dialog dialog;

	public Editar_perfil() {}
	public Editar_perfil(UsuarioRegistrado ur, Dialog interfaz, Ver_perfil_propio perfil) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = this.bd.cargarUsuarioRegistrado(ur.getID());
		this.fotoURL = this.ur.getFoto();
		this.dialog = interfaz;
		this._ver_perfil_propio = perfil;
		this.getTextFieldNombre().setPlaceholder(ur.getNombreUsuario());
		this.getTextFieldNombre().setPlaceholder(ur.getNombre());
		this.getFotoPerfil().setImage(ur.getFoto());
		Cancelar();
		Guardar();
	}


	public void Guardar() {
		Cambiar_foto();
		this.getBotonGuardar().addClickListener(event ->{
//			bd.cambiarFotoPerfil(this.ur.getID(), this.ur.getNombreUsuario(), fotoURL);
			bd.editarPerfilUR(this.getTextFieldNombreUsuario().getValue(), this.getTextFieldNombre().getValue(), this.getTextAreaDescripcion().getValue(), fotoURL, this.ur.getID());
			this._ver_perfil_propio.getFotoPerfil1().setImage(fotoURL);
			this._ver_perfil_propio .getNombreUsuario().setText(this.getTextFieldNombreUsuario().getValue());
			this._ver_perfil_propio.getNombreYapellidos().setText(this.getTextFieldNombre().getValue());
			this._ver_perfil_propio.getLabelDescripcion().setText(this.getTextAreaDescripcion().getValue());
			this.dialog.close();
		});
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.dialog.close();
		});
	}
	
	public void Cambiar_foto() {

		this.getBotonCambiar().addClickListener(event -> {
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
					this.getFotoPerfil().setImage(fotoURL);
				} catch (Exception e) {
					Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
				}
				upload.addFileRejectedListener(event3 -> {

					Notification.show("File rejected: " + event3.getErrorMessage(), 5000, Notification.Position.MIDDLE);

				});
			});
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