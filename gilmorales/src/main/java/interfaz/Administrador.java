package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.UsuarioAdministrador;
//import basededatos.iAdministrador;
import vistas.VistaAdministradorPrincipal;

public class Administrador extends VistaAdministradorPrincipal {
	public iAdministrador _iAdministrador = new BDPrincipal();
	public Lista_Publicaciones_Administrador _lista_Publicaciones__Administrador_;
	public Cabecera_Administrador _cabecera_Administrador = new Cabecera_Administrador();
	public Cabecera_TOP top;
	public Element cabeceraTop = top.getCabeceraTop();
	UsuarioAdministrador admin;
	
	public Administrador(int codigoEmpleado) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.admin = this._iAdministrador.cargarAdministrador(codigoEmpleado);
		this.Cabecera_Administrador();
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(top);
		this.Lista_Publicaciones__Administrador_();
	}
	
	public void Lista_Publicaciones__Administrador_() {
		_lista_Publicaciones__Administrador_= new Lista_Publicaciones_Administrador(this.admin, this);
		this.getLayoutPublicaciones().as(VerticalLayout.class).add(_lista_Publicaciones__Administrador_);
	}

	public void Cabecera_Administrador() {
	
	}
}