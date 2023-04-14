package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;

public class Comun__Comercial_y_Usuario_Registrado_ extends VistaCabecera{
//	private Button _anadirB;
//	private Button _cerrarSesionB;
//	private String _iconoWeb;
	
	public Comun__Comercial_y_Usuario_Registrado_() {
<<<<<<< HEAD
		this.getStyle().set("width","100%");
		this.getStyle().set("height","100%");
=======
		
>>>>>>> branch 'prototipado' of git@github.com:jmn034-ual/GilMorales.git
	}

	public void Add_publiacacion() {
<<<<<<< HEAD
		
=======
		this.getBotonAniadir().addClickListener(event->{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Add_publiacacion());
		});
>>>>>>> branch 'prototipado' of git@github.com:jmn034-ual/GilMorales.git
	}

	public void Cerrar_sesion() {
		
	}
}