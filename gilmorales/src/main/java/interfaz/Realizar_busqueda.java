package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import vistas.VistaRealizarBusqueda;

public class Realizar_busqueda extends VistaRealizarBusqueda {
	public Cabecera_Administrador _cabecera_Administrador;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado;
	public Lista_resultado _lista_resultado;
	Select<String> select ;

	public Realizar_busqueda(String buscar, Object cabecera) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		if(cabecera instanceof Cabecera_Usuario_No_Registrado) {
			this._cabecera_Usuario_No_Registrado = (Cabecera_Usuario_No_Registrado) cabecera;
		}else if(cabecera instanceof Cabecera_Usuario_Registrado){
			this._cabecera_Usuario_Registrado = (Cabecera_Usuario_Registrado) cabecera;
		}else {
			this._cabecera_Administrador = (Cabecera_Administrador) cabecera;
		}
		select = new Select<>();
        select.setLabel("Filtrar por:");
        select.setItems("Hashtags", "Usuarios",
                "None");
        select.setValue("None");
        this.getVaadinHorizontalLayout().add(select);
		this.getLayoutListaResultadoBusqueda().setVisible(true);
		Lista_resultado(buscar);
	}

	public void Lista_resultado(String buscar) {
		_lista_resultado = new Lista_resultado(buscar, select.getValue(), this);
		this.getLayoutListaResultadoBusqueda().as(VerticalLayout.class).add(_lista_resultado);
	}
}