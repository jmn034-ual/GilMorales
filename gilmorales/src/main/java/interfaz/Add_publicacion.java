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
	public Ver_publicacion_propia _ver_publicacion_propia = new Ver_publicacion_propia();
	private UsuarioRegistrado ur;
	private BDPrincipal bd = new BDPrincipal();
	private Publicacion publicacion;
	private Usuario_Registrado urInterfaz;

	
	public Add_publicacion() {}
	
	public Add_publicacion(UsuarioRegistrado ur, Usuario_Registrado urInterfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = ur;
		this.urInterfaz = urInterfaz;
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
			urInterfaz._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
		});
	}

	public void Publicar() {
		this.getBotonPublicar().addClickListener(event -> {
			if(ur != null) {
				this.publicacion = bd.addPublicacion(ur.getNombreUsuario(), this.getTextFielLocalizacion().getValue(),
						this.getTextAreaDescripcion().getValue(), "videos/tiktok1.mp4", ur.getID());
				this.getVaadinHorizontalLayout().removeAll();
				_ver_publicacion_propia = new Ver_publicacion_propia(publicacion, urInterfaz);
				this.getVaadinHorizontalLayout().add(_ver_publicacion_propia);
			}
		});
	}

	public void Descartar() {
		this.getBotonDescartar().addClickListener(event ->{
			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.getCabeceraTop().setVisible(true);
			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.getLayoutAyuda().setVisible(false);
			urInterfaz._cabecera_Usuario_Registrado.Cabecera_TOP();
			urInterfaz.listaPublicaciones.setVisible(true);
			urInterfaz.getListaPublicaciones().setVisible(true);
			urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			urInterfaz._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
			});
	}
}