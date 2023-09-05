package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaRealizarBusqueda;

public class Realizar_busqueda extends VistaRealizarBusqueda {
	private Label _tituloL;
	public Cabecera_Administrador _cabecera_Administrador;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Lista_resultado _lista_resultado;
	
//	public Realizar_busqueda() {
//		this.getStyle().set("width", "100%");
//		this.getStyle().set("height", "100%");
////		this.getVaadinHorizontalLayout().remove(this.getCabeceraTop().as(VerticalLayout.class));
////		this.getCabeceraTop().removeAllChildren();
//		Select<String> select = new Select<>();
//        select.setLabel("Filtrar por:");
//        select.setItems("Hashtags", "Usuarios",
//                "None");
//        select.setValue("None");
//        this.getLayoutFiltrar().add(select);
////		_lista_resultado = new Lista_resultado(buscar, select.getValue());
////		this.getLayoutListaResultadoBusqueda().setVisible(true);
//	}
	
	public Realizar_busqueda(String buscar) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
//		this.getVaadinHorizontalLayout().remove(this.getCabeceraTop().as(VerticalLayout.class));
//		this.getCabeceraTop().removeAllChildren();
		Select<String> select = new Select<>();
        select.setLabel("Filtrar por:");
        select.setItems("Hashtags", "Usuarios",
                "None");
        select.setValue("None");
        this.getLayoutFiltrar().add(select);
		_lista_resultado = new Lista_resultado(buscar, select.getValue());
		this.getLayoutListaResultadoBusqueda().setVisible(true);
	}

	public void Lista_resultado() {
		this.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).add(_lista_resultado);
	}
}