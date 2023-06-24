package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaAddpublicacion;

public class Add_publicacion extends VistaAddpublicacion{
//	private button _subir_videoB;
//	private button _add_localizacionB;
//	private Label _tituloL;
//	private Label _subTituloL;
//	private Video _video;
//	private button _subirB;
//	private Label _localizacionL;
//	private TextField _localizacionTF;
//	private Label _descripcionL;
//	private TextField _descripcionTF;
//	private button _descartarB;
//	private button _publicarB;
//	public Comun__Comercial_y_Usuario_Registrado_ _comun__Comercial_y_Usuario_Registrado_ = new Comun__Comercial_y_Usuario_Registrado_();
	public Ver_publicacion_propia _ver_publicacion_propia;
	private UsuarioRegistrado ur;
	private BDPrincipal bd = new BDPrincipal();
	private String rutaVideo;
	private Publicacion publicacion;
	
	public Add_publicacion() {}
	
	public Add_publicacion(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = ur;
//		this.publicacion =  null;
		Add_localizacion();
		Ver_publicacion_propia();
		Publicar();
		Descartar();
	}

	public void Subir_video() {
		
	}

	public void Add_localizacion() {
		this.getTextFielLocalizacion();
	}

	public void Ver_publicacion_propia() {
		this.getBotonPublicar().addClickListener(event ->{
			
		});
	}

	public void Publicar() {
		this.getBotonPublicar().addClickListener(event -> {
			if(ur != null) {
//				if(!rutaVideo.isEmpty()) {
				this.publicacion = bd.addPublicacion(ur.getNombreUsuario(), this.getTextFielLocalizacion().getValue(),
						this.getTextAreaDescripcion().getValue(), "videos/tiktok1.mp4", ur.getID());
//				}
			}
		});
	}

	public void Descartar() {
		this.getBotonDescartar().addClickListener(event ->{
			this.setVisible(false);
		});
	}
}