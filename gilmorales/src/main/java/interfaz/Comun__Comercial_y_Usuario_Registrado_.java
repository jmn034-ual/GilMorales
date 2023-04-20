package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;

public class Comun__Comercial_y_Usuario_Registrado_ extends VistaCabecera{
//	private Button _anadirB;
//	private Button _cerrarSesionB;
//	private String _iconoWeb;
	
	public Comun__Comercial_y_Usuario_Registrado_() {
		this.getStyle().set("width","100%");
		this.getStyle().set("height","100%");
		Add_publiacacion();

	}

	public void Add_publiacacion() {

		this.getBotonAniadir().addClickListener(event->{
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(new Add_publiacacion());
//			this.getBotonAniadir().setVisible(false);
		});
	}

	public void Cerrar_sesion() {
		
	}
}