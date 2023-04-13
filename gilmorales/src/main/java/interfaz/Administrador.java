package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iAdministrador;
import vistas.VistaAdministradorPrincipal;

public class Administrador extends VistaAdministradorPrincipal {
	//public iAdministrador _iAdministrador;
	public Lista_Publicaciones__Administrador_ _lista_Publicaciones__Administrador_;
	public Cabecera_Administrador _cabecera_Administrador = new Cabecera_Administrador();

	public Administrador() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Cabecera_Administrador();
	}
	
	public void Lista_Publicaciones__Administrador_() {
		this.getLayoutPublicaciones().as(VerticalLayout.class).add(_lista_Publicaciones__Administrador_);
	
	}

	public void Cabecera_Administrador() {
		this.getLayoutCabeceraAdmin().add(_cabecera_Administrador);
	}
}