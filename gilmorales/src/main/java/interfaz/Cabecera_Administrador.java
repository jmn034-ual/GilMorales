package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;
import vistas.VistaCabeceraAdmin;
import vistas.VistaCabeceraAdmin;

public class Cabecera_Administrador extends VistaCabeceraAdmin{
	public Administrador _administrador;
	public Gestionar_denuncias denuncias;
	public Realizar_busqueda _realizar_busqueda;
	public Cerrar_sesion _cerrar_sesion;
	public Cabecera_TOP cabeceraTOP;
	
	public Cabecera_Administrador(Administrador interfaz) {
		this.getStyle().set("width", "100%");
		this.getTextoBusqueda().getStyle().set("background-color", "transparent");
    	this.getTextoBusqueda().getStyle().set("border-radius", "8px");
    	this.getTextoBusqueda().getStyle().set("color", "#FFFFF");
    	Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
		this.getLogoWeb().setIcon(customIcon);
		this._administrador = interfaz;
		this.cabeceraTOP = new Cabecera_TOP(this);
		Gestionar_denuncias();
		Inicio();
		Realizar_busqueda();
		Cerrar_sesion();
	}

	public void Gestionar_denuncias() {
		denuncias = new Gestionar_denuncias(this);
		this.getGestionarDenunciasB().addClickListener(event->{
			_administrador.getVaadinHorizontalLayout().removeAll();
			_administrador.getVaadinHorizontalLayout().add(denuncias);
		});
	}

	public void Realizar_busqueda() {
		this.getBotonBuscar().addClickListener(event ->{
			_realizar_busqueda = new Realizar_busqueda(this.getTextoBusqueda().getValue(), this);
			_administrador.getVaadinHorizontalLayout().removeAll();
			_administrador.getVaadinHorizontalLayout().add(_realizar_busqueda);
			this.getTextoBusqueda().setValue("");
		});
	}

	public void Cerrar_sesion() {
		this.getCerrarSesionB().addClickListener(event->{
			
		});
		
	}

	public void Inicio() {
		this.getInicio().addClickListener(event -> {
			this.Gestionar_denuncias();
			_administrador.getVaadinHorizontalLayout().removeAll();
			_administrador.getVaadinHorizontalLayout().add(new Cabecera_TOP(this), new Lista_Publicaciones_Administrador(_administrador));
		});
	}
}