package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;

public class Cabecera_Usuario_Registrado extends Comun_Comercial_y_Usuario_Registrado {

	public Usuario_Registrado urInterfaz;
	public Ver_notificaciones _ver_notificaciones;
	public Ver_perfil_propio _ver_perfil_propio;
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	
	public Cabecera_Usuario_Registrado(Usuario_Registrado urInterfaz) {
		super();
    	this.getTextoBusqueda().getStyle().set("background-color", "transparent");
    	this.getTextoBusqueda().getStyle().set("border-radius", "8px");
    	this.getTextoBusqueda().getStyle().set("color", "#FFFFF");
    	this.getBotonAniadir().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
    	Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
		this.getLogoWeb().setIcon(customIcon);
		this.urInterfaz = urInterfaz; 
    	Cabecera_TOP();  
    	Add_publicacion();
    	
    	volverInicio();
    	Ver_perfil_propio();
    	Ver_notificaciones();
    	Realizar_busqueda();
	}

	public void Add_publicacion() {
		this.addPubli = new Add_publicacion(urInterfaz.ur, urInterfaz);
		this.getBotonAniadir().addClickListener(event->{
//			this.addPubli = new Add_publicacion(ur, urInterfaz);
			this.getBotonAniadir().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(addPubli);
		});
	}
	
	public void Ver_notificaciones() {
		_ver_notificaciones = new Ver_notificaciones(this);
		this.getBotonNotificaciones().addClickListener(event -> {
//			_ver_notificaciones = new Ver_notificaciones(this);
			this.getBotonNotificaciones().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(_ver_notificaciones);
		});
	}

	public void Ver_perfil_propio() {
		_ver_perfil_propio =  new Ver_perfil_propio(this, this._cabecera_TOP);
		this.getBotonPerfil().addClickListener(event -> {
//
//			this._ver_perfil_propio._eliminar_publicaciones.setVisible(false);
//			this._ver_perfil_propio.getLayoutTendencias().setVisible(true);
//			this._ver_notificaciones.setVisible(false);
//			this._ver_perfil_propio.setVisible(true);
//			this.addPubli.setVisible(false);
			this.getBotonPerfil().setVisible(false);
			this.getBotonAniadir().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(_ver_perfil_propio);
		});
	}
	

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue(), this);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(_realizar_busqueda);
			this.getTextoBusqueda().setValue("");
		});
	}
	public void Cabecera_TOP() {
		this._cabecera_TOP = new Cabecera_TOP(this);
		urInterfaz.getVaadinHorizontalLayout().add(this._cabecera_TOP);
	}
	
	
	public void volverInicio() {
		this.getInicio().addClickListener(event -> {
			this.getBotonAniadir().setVisible(true);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			urInterfaz.ur = urInterfaz._iUsuario_Registrado.cargarUsuarioRegistrado(urInterfaz.ur.getID());
			urInterfaz.getVaadinHorizontalLayout().removeAll();
			urInterfaz.getVaadinHorizontalLayout().add(new Cabecera_TOP(this), new Lista_publicaciones_Usuario_Registrado(urInterfaz));
		});
	}
	

}