package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;

public class Comun__Comercial_y_Usuario_Registrado_ extends VistaCabecera{
//	private Button _anadirB;
//	private Button _cerrarSesionB;
//	private String _iconoWeb;
	
	public Comun__Comercial_y_Usuario_Registrado_() {
		
	}

	public void Add_publiacacion() {
		this.getBotonAniadir().addClickListener(event->{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Add_publiacacion());
		});
	}

	public void Cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}