package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
	public iUsuario_Registrado _iUsuario_Registrado = new BDPrincipal();
	public Lista_publicaciones_Usuario_Registrado listaPublicaciones;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	UsuarioRegistrado ur;
	
	public Usuario_Registrado(int UsuarioID) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");

		this.ur = _iUsuario_Registrado.cargarUsuarioRegistrado(UsuarioID);
		Cabecera_Usuario_Registrado();
		Lista_publicaciones__Usuario_Registrado_();
	}
	
	public void Lista_publicaciones__Usuario_Registrado_() {
		listaPublicaciones = new Lista_publicaciones_Usuario_Registrado(this);
		this.getListaPublicaciones().as(VerticalLayout.class).add(listaPublicaciones);
	}
	public void Cabecera_Usuario_Registrado() {
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado(ur, this);
		this.getCabeceraTop().as(VerticalLayout.class).add(_cabecera_Usuario_Registrado._cabecera_TOP);
		this.getCabecera().add(_cabecera_Usuario_Registrado);
	}
	
	
}