package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Realizar_busqueda extends Cabecera_TOP {
	private Label _tituloL;
	public Cabecera_Administrador _cabecera_Administrador;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Lista_resultado _lista_resultado;
	
	public Realizar_busqueda() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
//		this.getVaadinHorizontalLayout().remove(this.getCabeceraTop().as(VerticalLayout.class));
//		this.getCabeceraTop().removeAllChildren();
		this.getLayoutListaResultadoBusqueda().setVisible(true);
	}

	public void Lista_resultado() {
		throw new UnsupportedOperationException();
	}
}