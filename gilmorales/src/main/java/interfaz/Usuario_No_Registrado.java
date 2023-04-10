package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
	//	private button _iniciarSesionB;
	//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado= new Lista_Publicaciones__Usuario_no_registrado_();
	public Cabecera_Usuario_No_Registrado cabeceraUNR = new Cabecera_Usuario_No_Registrado();

	public Usuario_No_Registrado() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}

	public void Publicaciones__Usuario_no_registrado_() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {
		cabeceraUNR.getStyle().set("width", "100%");
		cabeceraUNR.getStyle().set("height", "100%");
		this.getLayoutCabecera().add(cabeceraUNR);
	}

	public void Iniciar_Sesion() {
		throw new UnsupportedOperationException();
	}
}