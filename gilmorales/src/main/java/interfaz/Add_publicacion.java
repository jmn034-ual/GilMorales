package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Add_publicacion() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
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
			
		});
	}

	public void Descartar() {
		this.getBotonDescartar().addClickListener(event ->{
			this.setVisible(false);
		});
	}
}