package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import TikTok.MainView;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.UsuarioAdministrador;
//import basededatos.iAdministrador;
import vistas.VistaAdministradorPrincipal;

public class Administrador extends VistaAdministradorPrincipal {
	public iAdministrador _iAdministrador = new BDPrincipal();
	public Lista_Publicaciones_Administrador _lista_Publicaciones__Administrador_;
	public Cabecera_Administrador _cabecera_Administrador;
	UsuarioAdministrador admin;
	MainView mainview;
	
	public Administrador(MainView mainview, int codigoEmpleado) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.mainview = mainview;
		this.admin = this._iAdministrador.cargarAdministrador(codigoEmpleado);
		Cabecera_Administrador();
		Lista_Publicaciones__Administrador_();
	}
	
	public void Lista_Publicaciones__Administrador_() {
		_lista_Publicaciones__Administrador_= new Lista_Publicaciones_Administrador(this);
		this.getVaadinHorizontalLayout().add(_lista_Publicaciones__Administrador_);
	}

	public void Cabecera_Administrador() {
		_cabecera_Administrador = new Cabecera_Administrador(this);
		this.getLayoutCabeceraAdmin().add(_cabecera_Administrador);	
		this.getVaadinHorizontalLayout().add(this._cabecera_Administrador.cabeceraTOP);
	}
}