package interfaz;

import java.io.InputStream;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.component.upload.receivers.FileData;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.component.upload.receivers.MultiFileBuffer;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaAddpublicacion;

public class Add_publicacion extends VistaAddpublicacion{
	//	public Comun__Comercial_y_Usuario_Registrado_ _comun__Comercial_y_Usuario_Registrado_ = new Comun__Comercial_y_Usuario_Registrado_();
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Ver_publicacion_propia_Comercial _ver_publicacion_propiaComercial;
	private UsuarioRegistrado ur;
	private BDPrincipal bd = new BDPrincipal();
	private Publicacion publicacion;
	private Usuario_Registrado urInterfaz;
	private String localizacion = "";
	Usuario_comercial ucInterfaz;
	UsuarioComercial uc;

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
//		Subir_video();
	}

	public Add_publicacion(UsuarioComercial uc, Usuario_comercial comercial) {
//		this.getStyle().set("width", "100%");
//		this.getStyle().set("height", "100%");
		this.uc = uc;
		this.ucInterfaz = comercial;
		Add_localizacion();
		Ver_publicacion_propia();
		Publicar();
		Descartar();
//		Subir_video();
	}

//	public void Subir_video() {
//		/* Example for FileBuffer */
//		FileBuffer fileBuffer = new FileBuffer();
//		Upload singleFileUpload = new Upload(fileBuffer);
////		singleFileUpload.setAcceptedFileTypes("video/*");
//
//		int maxFileSizeInBytes = 10 * 1024 * 1024; // 10MB
//		singleFileUpload.setMaxFileSize(maxFileSizeInBytes);
//
//
//		singleFileUpload.addSucceededListener(event -> {
//			// Get information about the file that was written to the file system
//			FileData savedFileData = fileBuffer.getFileData();
//			String absolutePath = savedFileData.getFile().getAbsolutePath();
//			System.out.println(absolutePath);
//			this.getLayoutVideo().as(VerticalLayout.class).add(new Video(absolutePath));
//		});
//		this.getLayoutSubirVideo().as(VerticalLayout.class).add(singleFileUpload);
//	}

	public void Add_localizacion() {
		this.getBotonAniadir().addClickListener(event ->{
			localizacion = this.getLabelLocalizacion().getText();
		});
	}

	public void Ver_publicacion_propia() {
		if(urInterfaz != null) {
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
				this.publicacion = bd.addPublicacion(ur.getNombreUsuario(), this.localizacion,
						this.getTextAreaDescripcion().getValue(), "videos/tiktok1.mp4", ur.getID());
				this.getVaadinHorizontalLayout().removeAll();
				_ver_publicacion_propia = new Ver_publicacion_propia(publicacion, urInterfaz);
				this.getVaadinHorizontalLayout().add(_ver_publicacion_propia);
			}else {
				this.publicacion = bd.addPublicacionComercial(uc.getNombreUsuarioComercial(), this.localizacion, 
						this.getTextAreaDescripcion().getValue(), "videos/tiktok1.mp4", uc.getID());
				this.getVaadinHorizontalLayout().removeAll();
				//				_ver_publicacion_propia = new Ver_publicacion_propia_Comercial(publicacion, ucInterfaz, this.uc);
				this.getVaadinHorizontalLayout().add(this.ucInterfaz);
			}
		});
	}

	public void Descartar() {
		this.getBotonDescartar().addClickListener(event ->{
			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.getCabeceraTop().setVisible(true);
			//			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.getLayoutAyuda().setVisible(false);
			urInterfaz._cabecera_Usuario_Registrado.Cabecera_TOP();
			urInterfaz.listaPublicaciones.setVisible(true);
			urInterfaz.getListaPublicaciones().setVisible(true);
			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			urInterfaz._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
		});
	}
}