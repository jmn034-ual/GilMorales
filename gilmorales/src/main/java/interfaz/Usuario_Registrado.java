package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuarioRegistrado;

//import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
//	public iUsuario_Registrado _iUsuario_Registrado;
	public Lista_publicaciones__Usuario_Registrado_ listaPublicaciones = new Lista_publicaciones__Usuario_Registrado_();
<<<<<<< HEAD
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	
	public Usuario_Registrado() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height","100%"); 
	}
	
=======
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado();

>>>>>>> branch 'prototipado' of git@github.com:jmn034-ual/GilMorales.git
	public void Lista_publicaciones__Usuario_Registrado_() {
		this.getListaPublicaciones().as(VerticalLayout.class).add(listaPublicaciones);;
	}

	public void Cabecera_Usuario_Registrado() {
		this.getCabecera().add(_cabecera_Usuario_Registrado);
	}
}