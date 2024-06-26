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
    	this.getTextoBusqueda().getStyle().set("border-radius", "8px");
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
    	Cerrar_sesion(this);
	}

	public void Add_publicacion() {
		this.getBotonAniadir().addClickListener(event->{
			this.addPubli = new Add_publicacion(urInterfaz.ur, urInterfaz);
			this.urInterfaz.getVaadinHorizontalLayout().removeAll();
			this.urInterfaz.getVaadinHorizontalLayout().add(addPubli);
		});
	}
	
	public void Ver_notificaciones() {
		_ver_notificaciones = new Ver_notificaciones(this);
		this.getBotonNotificaciones().addClickListener(event -> {
			this.getBotonNotificaciones().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			this.urInterfaz.getVaadinHorizontalLayout().removeAll();
			this.urInterfaz.getVaadinHorizontalLayout().add(_ver_notificaciones);
		});
	}

	public void Ver_perfil_propio() {
		this.getBotonPerfil().addClickListener(event -> {
			_ver_perfil_propio =  new Ver_perfil_propio(this._cabecera_TOP);
			this.urInterfaz.getVaadinHorizontalLayout().removeAll();
			this.urInterfaz.getVaadinHorizontalLayout().add(_ver_perfil_propio);
		});
	}
	

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue(), this);
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
			this.urInterfaz.mainview.removeAll();
			this.urInterfaz.mainview.add(new Usuario_Registrado(this.urInterfaz.mainview, this.urInterfaz.ur.getID()));
		});
	}
	

}