package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.data.renderer.ClickableRenderer.ItemClickListener;
import com.vaadin.flow.server.StreamResource;

import TikTok.Imagen;
import vistas.VistaGestionarDenuncias;

public class Gestionar_denuncias extends VistaGestionarDenuncias {
	
	public Cabecera_Administrador _cabecera_Administrador;
	public Ver_denuncias _ver_denuncias;
	private String fotoURL = "";
	private static final String IMAGE_PATH = "src/main/resources/META-INF/resources/icons/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/icons/";
	
	public Gestionar_denuncias(Cabecera_Administrador interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._cabecera_Administrador = interfaz;
		this.getFotoUsuario().setImage(this._cabecera_Administrador._administrador.admin.getFoto());
		this.getNombre().setText(this._cabecera_Administrador._administrador.admin.getNombreAdmin() +"\n" + this._cabecera_Administrador._administrador.admin.getApellidosAdmin());
		this.getFecha().setText(this._cabecera_Administrador._administrador.admin.getFechaContratacion());
		this.getCódigo().setText(this._cabecera_Administrador._administrador.admin.getCodigoEmpleado() +"");
		this.Add_foto();
		this.Ver_denuncias();
	}
	

	public void Ver_denuncias() {
		this._ver_denuncias = new Ver_denuncias(this);
		this.getVerDenuncias().addClickListener(event->{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_denuncias);});
	}

	public void Add_foto() {

		this.getAddFoto().addClickListener(event -> {
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
					this.getFotoUsuario().setImage(fotoURL);
					this._cabecera_Administrador._administrador.admin = this._cabecera_Administrador._administrador._iAdministrador.addFoto(fotoURL, this._cabecera_Administrador._administrador.admin.getCodigoEmpleado());
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