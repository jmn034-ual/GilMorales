package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

import bd_dcl.UsuarioRegistrado;

public class Cabecera_Usuario_Registrado extends Comun_Comercial_y_Usuario_Registrado {

	public Usuario_Registrado _usuario_Registrado;
	public Ver_notificaciones _ver_notificaciones;
	public Ver_perfil_propio _ver_perfil_propio;
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP;
	private UsuarioRegistrado ur;
	private Usuario_Registrado urInterfaz;
	
	public Cabecera_Usuario_Registrado(UsuarioRegistrado ur, Usuario_Registrado urInterfaz) {
		super();
//		this.getStyle().set("width", "100%");
//    	this.getStyle().set("height", "100%");
    	this.getTextoBusqueda().getStyle().set("background-color", "transparent");
    	this.getTextoBusqueda().getStyle().set("border-radius", "8px");
    	this.getTextoBusqueda().getStyle().set("color", "#FFFFF");
    	this.getBotonAniadir().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
    	Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
//		customIcon.getStyle().set("heigth", "80px");
		this.getLogoWeb().setIcon(customIcon);
    	this.ur = ur;
		this.urInterfaz = urInterfaz; 
		this._ver_notificaciones = new Ver_notificaciones(this.ur);
		this.addPubli = new Add_publicacion(ur, urInterfaz);
		this._ver_perfil_propio = new Ver_perfil_propio(ur);
		this.getVaadinVerticalLayout1().setVisible(false);
    	Cabecera_TOP();  
    	this.Add_publicacion();
    	volverInicio();
    	Ver_perfil_propio();
    	Ver_notificaciones();
    	Realizar_busqueda();
	}
	@Override
	public void Add_publicacion() {
		this.getBotonAniadir().addClickListener(event->{
			this.addPubli = new Add_publicacion(ur, urInterfaz);
			this.getBotonAniadir().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
    		this._cabecera_TOP.getCabeceraTop().setVisible(false);
//    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(urInterfaz._cabecera_Usuario_Registrado.addPubli);
		});
	}
	
	public void Ver_notificaciones() {
		this.getBotonNotificaciones().addClickListener(event -> {
			_ver_notificaciones = new Ver_notificaciones(this.ur);
			this._ver_notificaciones.setVisible(true);
			this.getBotonNotificaciones().setVisible(false);
			this._cabecera_TOP.getCabeceraTop().setVisible(false);
//    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this._ver_perfil_propio.setVisible(false);
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
		this.getBotonPerfil().addClickListener(event -> {
			_ver_perfil_propio =  new Ver_perfil_propio(ur);
			this._ver_perfil_propio._eliminar_publicaciones.setVisible(false);
			this._ver_perfil_propio.getLayoutTendencias().setVisible(true);
			this._ver_notificaciones.setVisible(false);
			this._ver_perfil_propio.getVaadinVerticalLayout1().setVisible(true);
			this._ver_perfil_propio.setVisible(true);
			this._cabecera_TOP.getCabeceraTop().setVisible(false);
//    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this.getBotonPerfil().setVisible(false);
			this.getBotonAniadir().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(_ver_perfil_propio);
		});
	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue());
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			this._realizar_busqueda.setVisible(true);
			this._cabecera_TOP.setVisible(false);
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(false);
			urInterfaz.getVaadinHorizontalLayout().add(_realizar_busqueda);
		});
	}
	public void Cabecera_TOP() {
		this._cabecera_TOP = new Cabecera_TOP(this.urInterfaz);
//		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
//    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_cabecera_TOP);
	}
	public void volverInicio() {
		this.getInicio().addClickListener(event -> {
//			_realizar_busqueda = new Realizar_busqueda();
			this._ver_perfil_propio.setVisible(false);
			this._cabecera_TOP.getCabeceraTop().setVisible(true);
//			this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonPerfil().setVisible(true);
			this.getBotonAniadir().setVisible(true);
	    	this.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_cabecera_TOP);
			Cabecera_TOP();
			if(urInterfaz.getVaadinHorizontalLayout().getComponentCount() != 0) {
				urInterfaz.getVaadinHorizontalLayout().remove(urInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			}
			urInterfaz.getListaPublicaciones().setVisible(true);

		});
	}
}