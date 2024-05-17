package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

import bd_dcl.UsuarioRegistrado;

public class Cabecera_Usuario_Registrado extends Comun_Comercial_y_Usuario_Registrado {

	public Usuario_Registrado urInterfaz;
	public Ver_notificaciones _ver_notificaciones;
	public Ver_perfil_propio _ver_perfil_propio;
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	private UsuarioRegistrado ur;
	
	public Cabecera_Usuario_Registrado(UsuarioRegistrado ur, Usuario_Registrado urInterfaz) {
		super();

    	this.getTextoBusqueda().getStyle().set("background-color", "transparent");
    	this.getTextoBusqueda().getStyle().set("border-radius", "8px");
    	this.getTextoBusqueda().getStyle().set("color", "#FFFFF");
    	this.getBotonAniadir().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
    	Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
		this.getLogoWeb().setIcon(customIcon);
    	this.ur = ur;
		this.urInterfaz = urInterfaz; 
    	Cabecera_TOP();  
    	this.Add_publicacion();
    	volverInicio();
    	Ver_perfil_propio();
    	Ver_notificaciones();
    	Realizar_busqueda();
	}
	@Override
	public void Add_publicacion() {
		this.addPubli = new Add_publicacion(ur, urInterfaz);
		this.getBotonAniadir().addClickListener(event->{
			this.addPubli = new Add_publicacion(ur, urInterfaz);
			this.getBotonAniadir().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			urInterfaz.getCabeceraTop().setVisible(false);
			this.addPubli.setVisible(true);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(addPubli);
		});
	}
	
	public void Ver_notificaciones() {
		_ver_notificaciones = new Ver_notificaciones(this);
		this.getBotonNotificaciones().addClickListener(event -> {
			_ver_notificaciones = new Ver_notificaciones(this);
			this._ver_notificaciones.setVisible(true);
			this.getBotonNotificaciones().setVisible(false);
			urInterfaz.getCabeceraTop().setVisible(false);
			this.addPubli.setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(_ver_notificaciones);
		});
	}

	public void Ver_perfil_propio() {
		_ver_perfil_propio =  new Ver_perfil_propio(this);
		this.getBotonPerfil().addClickListener(event -> {

			this._ver_perfil_propio._eliminar_publicaciones.setVisible(false);
			this._ver_perfil_propio.getLayoutTendencias().setVisible(true);
			this._ver_notificaciones.setVisible(false);
			this._ver_perfil_propio.setVisible(true);
			this.addPubli.setVisible(false);
			this.getBotonPerfil().setVisible(false);
			this.getBotonAniadir().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getCabeceraTop().setVisible(false);
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(_ver_perfil_propio);
		});
	}
	
//	public void Ver_perfil_propio() {
//		_ver_perfil_propio =  new Ver_perfil_propio(ur);
//		this.getBotonPerfil().addClickListener(event -> {
//			urInterfaz.getCabeceraTop().setVisible(false);
//			urInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
//			urInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(_ver_perfil_propio);
//
//		});
//	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue(), this);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			this._realizar_busqueda.setVisible(true);
			this._cabecera_TOP.setVisible(true);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(_realizar_busqueda);
			this.getTextoBusqueda().setValue("");
		});
	}
	public void Cabecera_TOP() {
		this._cabecera_TOP = new Cabecera_TOP(this);
		urInterfaz.getCabeceraTop().as(VerticalLayout.class).add(this._cabecera_TOP);
	}
	
	
	public void volverInicio() {
		this.getInicio().addClickListener(event -> {
			urInterfaz.getCabeceraTop().as(VerticalLayout.class).remove(this._cabecera_TOP);
			urInterfaz.getListaPublicaciones().as(VerticalLayout.class).removeAll();
			urInterfaz.getCabeceraTop().setVisible(true);
			urInterfaz.getListaPublicaciones().setVisible(true);
			urInterfaz.ur = urInterfaz._iUsuario_Registrado.cargarUsuarioRegistrado(urInterfaz.ur.getID());
			urInterfaz.getListaPublicaciones().as(VerticalLayout.class).add(new Lista_publicaciones_Usuario_Registrado(urInterfaz));
			Cabecera_TOP();
			this._cabecera_TOP.setVisible(true);
		});
	}
	

}