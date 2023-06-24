package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaUsuarioRegistrado;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends VistaUsuarioRegistrado{
	public iUsuario_Registrado _iUsuario_Registrado;
	public Lista_publicaciones__Usuario_Registrado_ listaPublicaciones = new Lista_publicaciones__Usuario_Registrado_(this);
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	UsuarioRegistrado ur;
	
	public Usuario_Registrado(UsuarioRegistrado ur, BDPrincipal bd) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		_iUsuario_Registrado = bd;
		this.ur = ur;
		Cabecera_Usuario_Registrado();
		Lista_publicaciones__Usuario_Registrado_();
	}
	
	public void Lista_publicaciones__Usuario_Registrado_() {
		this.getListaPublicaciones().as(VerticalLayout.class).add(listaPublicaciones);
	}
	public void Cabecera_Usuario_Registrado() {
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado(ur, this);
		this.getCabecera().add(_cabecera_Usuario_Registrado);
		this._cabecera_Usuario_Registrado.getVaadinVerticalLayout1().setVisible(false);
		this._cabecera_Usuario_Registrado.getBotonAniadir().addClickListener(event ->{
			this.getListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_Registrado.addPubli.setVisible(true);
			this._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(false);
			this._cabecera_Usuario_Registrado.getBotonPerfil().setVisible(true);
			this._cabecera_Usuario_Registrado._ver_notificaciones.setVisible(false);
		});
		this._cabecera_Usuario_Registrado.getBotonNotificaciones().addClickListener(event ->{
			this.getListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_Registrado.getBotonNotificaciones().setVisible(false);
		});
		this._cabecera_Usuario_Registrado._cabecera_TOP.getBotonVerListaHashtag().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Usuario_Registrado._cabecera_TOP);
		});
		this._cabecera_Usuario_Registrado._cabecera_TOP.getBotonVerListaUsuarios().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Usuario_Registrado._cabecera_TOP);
		});
		this._cabecera_Usuario_Registrado.getInicio().addClickListener(event -> {
			this._cabecera_Usuario_Registrado.getVaadinVerticalLayout1().setVisible(false);
			this.listaPublicaciones.setVisible(true);
			this.getListaPublicaciones().setVisible(true);
			this._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(true);
			this._cabecera_Usuario_Registrado.addPubli.setVisible(false);
		});
		this._cabecera_Usuario_Registrado.getBotonPerfil().addClickListener(event -> {
			this.getListaPublicaciones().setVisible(false);
			this._cabecera_Usuario_Registrado.addPubli.setVisible(false);
			this._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
		});
		this._cabecera_Usuario_Registrado.addPubli.getBotonDescartar().addClickListener(event -> {
			this._cabecera_Usuario_Registrado.getVaadinVerticalLayout1().setVisible(false);
			this._cabecera_Usuario_Registrado.getBotonAniadir().setVisible(true);
			this._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(true);
			this._cabecera_Usuario_Registrado._cabecera_TOP.getCabeceraTop().setVisible(true);
			this.getListaPublicaciones().setVisible(true);
			this._cabecera_Usuario_Registrado.addPubli.Descartar();
		});
		this._cabecera_Usuario_Registrado.getBotonBuscar().addClickListener(event ->{
			this.getListaPublicaciones().setVisible(false);
		});
	}
	
	
}