package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
	public iUsuario_Registrado _iUsuario_Registrado;
	public Lista_publicaciones__Usuario_Registrado_ listaPublicaciones;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	UsuarioRegistrado ur;
	
	public Usuario_Registrado(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = ur;
		Cabecera_Usuario_Registrado();
		Lista_publicaciones__Usuario_Registrado_();
	}
	
	public void Lista_publicaciones__Usuario_Registrado_() {
		listaPublicaciones = new Lista_publicaciones__Usuario_Registrado_(this, this.ur);
		this.getListaPublicaciones().as(VerticalLayout.class).add(listaPublicaciones);
	}
	public void Cabecera_Usuario_Registrado() {
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado(ur, this);
		this.getCabecera().add(_cabecera_Usuario_Registrado);
	}
	
	
}