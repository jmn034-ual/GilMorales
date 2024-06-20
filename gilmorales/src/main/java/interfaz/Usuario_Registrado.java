package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.MainView;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
	public iUsuario_Registrado _iUsuario_Registrado = new BDPrincipal();
	public Lista_publicaciones_Usuario_Registrado listaPublicaciones;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	UsuarioRegistrado ur;
	MainView mainview;
	
	public Usuario_Registrado(MainView mainview , int UsuarioID) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.mainview = mainview;
		this.ur = _iUsuario_Registrado.cargarUsuarioRegistrado(UsuarioID);
		Cabecera_Usuario_Registrado();
		Lista_publicaciones__Usuario_Registrado_();
	}
	
	public void Lista_publicaciones__Usuario_Registrado_() {
		listaPublicaciones = new Lista_publicaciones_Usuario_Registrado(this);
		this.getVaadinHorizontalLayout().add(listaPublicaciones);
	}
	public void Cabecera_Usuario_Registrado() {
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado(this);
		this.getCabecera().add(_cabecera_Usuario_Registrado);
	}
	
	
}