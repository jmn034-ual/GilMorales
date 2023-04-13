package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

//import basededatos.iAdministrador;
import vistas.VistaAdministradorPrincipal;

public class Administrador extends VistaAdministradorPrincipal {
	//public iAdministrador _iAdministrador;
	public Lista_Publicaciones__Administrador_ _lista_Publicaciones__Administrador_;
	public Cabecera_Administrador _cabecera_Administrador = new Cabecera_Administrador();
	public Cabecera_TOP top = new Cabecera_TOP();
	public Element cabeceraTop = top.getCabeceraTop();

	public Administrador(Lista_Publicaciones__Administrador_ lista) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Cabecera_Administrador();
		this.Lista_Publicaciones__Administrador_(lista);
		top.getLayoutListaResultadoBusqueda().setVisible(false);
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(top);
	}
	
	public void Lista_Publicaciones__Administrador_(Lista_Publicaciones__Administrador_ lista) {
		this.getLayoutPublicaciones().as(VerticalLayout.class).add(lista);
		
	
	}

	public void Cabecera_Administrador() {
		this.getLayoutCabeceraAdmin().add(_cabecera_Administrador);
	}
}