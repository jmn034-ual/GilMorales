package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
//	private button _iniciarSesionB;
//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado= new Lista_Publicaciones__Usuario_no_registrado_();
	public Cabecera_Usuario_No_Registrado _cabecera_Usuario_No_Registrado = new Cabecera_Usuario_No_Registrado();

	public void Publicaciones__Usuario_no_registrado_() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_Sesion() {
		throw new UnsupportedOperationException();
	}
}