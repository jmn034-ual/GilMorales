package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciarsesionotraplataforma;

public class Iniciar_sesion_otras_plataformas extends VistaIniciarsesionotraplataforma{
	private Button _seleccionar_cuentaB;
	private Button _usarOtraCuentaB;
	private Label _tituloL;
	public Plataformas_externas _plataformas_externas;
	public Login _iniciar_sesion;
	public Usar_otra_cuenta _usar_otra_cuenta;

	public Iniciar_sesion_otras_plataformas() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	
	public void Seleccionar_cuenta() {
//		_plataformas_externas.getStyle().set("width", "100%");
//		_plataformas_externas.getStyle().set("height", "100%");
		this.getBotonCuenta1().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add();});
		this.getBotonCuenta2().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add();});
		this.getBotonCuenta3().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add();});
		this.getBotonCuenta4().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add();});
	}

//	public void Usar_otra_cuenta() {
//	}
}