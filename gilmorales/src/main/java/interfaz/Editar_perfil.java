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

public class Editar_perfil extends VistaEditarPerfil {

	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/icons/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/icons/";

	public Ver_perfil_propio _ver_perfil_propio;
	BDPrincipal bd = new BDPrincipal();
	UsuarioRegistrado ur;
	public String fotoURL = "";
	Dialog dialog;
	String nombreUsuario, nombre, descripcion;

	public Editar_perfil() {
	}

	public Editar_perfil(UsuarioRegistrado ur, Dialog interfaz, Ver_perfil_propio perfil) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = this.bd.cargarUsuarioRegistrado(ur.getID());
		this.fotoURL = this.ur.getFoto();
		this.dialog = interfaz;
		this._ver_perfil_propio = perfil;
		this.nombreUsuario = ur.getNombreUsuario();
		this.nombre = ur.getNombre();
		this.descripcion = ur.getDescripcion();
		this.getTextFieldNombreUsuario().setPlaceholder(this.nombreUsuario);
		this.getTextFieldNombre().setPlaceholder(this.nombre);
		this.getFotoPerfil().setImage(ur.getFoto());
		this.getTextAreaDescripcion().setPlaceholder(this.descripcion);
		Cancelar();
		Guardar(false, null);
	}

	public void Guardar(boolean comercial, Editar_perfil_Comercial comercialInterfaz) {
		Cambiar_foto();
		this.getBotonGuardar().addClickListener(event -> {
			if (!this.getTextFieldNombreUsuario().getValue().isBlank()) {
				this.nombreUsuario = this.getTextFieldNombreUsuario().getValue();
				this.getTextFieldNombreUsuario().setPlaceholder(this.nombreUsuario);
			}
			if (!this.getTextFieldNombre().getValue().isBlank()) {
				this.nombre = this.getTextFieldNombre().getValue();
				this.getTextFieldNombre().setPlaceholder(this.nombre);
			}
			if (!this.getTextAreaDescripcion().getValue().isBlank()) {
				this.descripcion = this.getTextAreaDescripcion().getValue();
				this.getTextAreaDescripcion().setPlaceholder(this.descripcion);
			}
			if (!comercial) {
				bd.editarPerfilUR(this.nombreUsuario, this.nombre, this.descripcion, fotoURL, this.ur.getID());
				this._ver_perfil_propio.user = this.bd.cargarUsuarioRegistrado(ur.getID());
				this._ver_perfil_propio.getFotoPerfil1().setImage(fotoURL);
				this._ver_perfil_propio.getNombreUsuario().setText(this.nombreUsuario);
				this._ver_perfil_propio.getNombreYapellidos().setText(this.nombre);
				this._ver_perfil_propio.getLabelDescripcion().setText(this.descripcion);
			}else {
				bd.editarPerfilUC(this.nombreUsuario, this.nombre, this.descripcion, fotoURL, comercialInterfaz._usuario_comercial.comercial.getID());
				comercialInterfaz._usuario_comercial.comercial = bd.cargarUsuarioComercial(comercialInterfaz._usuario_comercial.comercial.getID());
				comercialInterfaz._usuario_comercial.getVaadinAvatar().setImage(this.fotoURL);
				comercialInterfaz._usuario_comercial.getNombreDeEmpresa().setText(this.nombre);
				comercialInterfaz._usuario_comercial.getNombreDeUsuario().setText(this.nombreUsuario);
				comercialInterfaz._usuario_comercial.getDescripcion().setText(this.descripcion);
			}
			this.dialog.close();
		});
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event -> {
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
					this.fotoURL = "/icons/" + event2.getFileName();
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