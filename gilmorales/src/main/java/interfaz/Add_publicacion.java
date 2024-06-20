package interfaz;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;


import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaAddpublicacion;

public class Add_publicacion extends VistaAddpublicacion{
	
	private static final String VIDEO_PATH = "src/main/resources/META-INF/resources/videos/";
	private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/videos/";
	
	public Comun_Comercial_y_Usuario_Registrado _comun__Comercial_y_Usuario_Registrado_;
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propiaComercial;
	private UsuarioRegistrado ur;
	private BDPrincipal bd = new BDPrincipal();
	private Publicacion publicacion;
	public Usuario_Registrado urInterfaz;
	private String localizacion = "";
	Usuario_comercial ucInterfaz;
	UsuarioComercial uc;
	public String urlVideo;
	public Video video;

	public Add_publicacion() {}

	public Add_publicacion(UsuarioRegistrado ur, Usuario_Registrado urInterfaz) {
//		this.getStyle().set("width", "100%");
//		this.getStyle().set("height", "100%");
		this.ur = ur;
		this.urInterfaz = urInterfaz;
		Add_localizacion();
		Ver_publicacion_propia();
		Publicar();
		Descartar();
		Subir_video();
	}

	public Add_publicacion(UsuarioComercial uc, Usuario_comercial comercial) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.uc = uc;
		this.ucInterfaz = comercial;
		Add_localizacion();
		Ver_publicacion_propia();
		Publicar();
		Descartar();
		Subir_video();
	}

	public void Subir_video() {
		this.getBotonSubir().addClickListener(event -> {
			createUploadDirectory();
			FileBuffer buffer = new FileBuffer();

			Upload upload = new Upload(buffer);
			
			upload.setAcceptedFileTypes("video/mp4");
			upload.setMaxFileSize(1000 * 1024 * 1024);

			Dialog dialog = new Dialog();
			dialog.getElement().setAttribute("aria-label", "Subir Video");

			dialog.add(upload);
			dialog.open();

			upload.addSucceededListener(event2 -> {
				File uploadedFile = buffer.getFileData().getFile();

				 try {

					 Path destinationPath = Paths.get(UPLOAD_DIR + event2.getFileName());
					 Files.move(uploadedFile.toPath(), destinationPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);

					 Notification.show("Image uploaded successfully!");

					 this.urlVideo = "/videos/"+event2.getFileName();
					 this.video = new Video(urlVideo);

					 dialog.close();
					 this.getLayoutVideo().as(VerticalLayout.class).removeAll();
					 this.getLayoutVideo().as(VerticalLayout.class).add(this.video);
		            } catch (Exception e) {
		            	Notification.show("Error saving the image: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
		            }
				 upload.addFileRejectedListener(event3 -> {

					 Notification.show("File rejected: " + event3.getErrorMessage(), 5000, Notification.Position.MIDDLE);

					 });
			});
			
			
		});
	}

	public void Add_localizacion() {
		this.getBotonAniadir().addClickListener(event ->{
			localizacion = this.getTextFielLocalizacion().getValue();
		});
	}

	public void Ver_publicacion_propia() {
		if(this.urInterfaz != null) {
			this.getBotonPublicar().addClickListener(event ->{
				this.urInterfaz._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
			});
		}else {
			this.getBotonPublicar().addClickListener(event ->{
				this.ucInterfaz._cabecera_Usuario_Comercial.getBotonAniadir().setVisible(true);
			});

		}
	}

	public void Publicar() {
		this.getBotonPublicar().addClickListener(event -> {
			if(this.ur != null) {
				this.publicacion = bd.addPublicacion(this.localizacion,
						this.getTextAreaDescripcion().getValue(), this.urlVideo, ur.getID());
				this.getVaadinHorizontalLayout().removeAll();
				_ver_publicacion_propia = new Ver_publicacion_propia(publicacion, this.urInterfaz);
				this.getVaadinHorizontalLayout().add(_ver_publicacion_propia);
			}else {
				this.publicacion = bd.addPublicacionComercial(this.localizacion, 
						this.getTextAreaDescripcion().getValue(), this.urlVideo, uc.getID());
				this.getVaadinHorizontalLayout().removeAll();
				_ver_publicacion_propiaComercial = new Ver_publicacion_propia_Comercial(publicacion, this);
				this.getVaadinHorizontalLayout().add(this._ver_publicacion_propiaComercial);
			}
		});
	}

	public void Descartar() {
		this.getBotonDescartar().addClickListener(event ->{
			if(this.urInterfaz != null) {
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(new Cabecera_TOP(urInterfaz._cabecera_Usuario_Registrado), new Lista_publicaciones_Usuario_Registrado(urInterfaz));
			}else {
				this.ucInterfaz.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				this.ucInterfaz.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Usuario_comercial(this.ucInterfaz.mainview, this.uc.getID()));
			}
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


}