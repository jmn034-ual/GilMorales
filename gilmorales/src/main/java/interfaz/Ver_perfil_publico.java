package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

//import basededatos.iVer_perfil_publico;

public class Ver_perfil_publico extends Ver_Perfil__2 {
//	private button _seguir;
//	public iVer_perfil_publico _iVer_perfil_ublico;
	public publicaciones_usuario_publico _publicaciones_usuario_publico;
	public Ver_publicacciones_gustadas__Otro_usuario_ _ver_publicacciones_gustadas__Otro_usuario_;

	public Ver_perfil_publico(Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getVerSeguidores().setVisible(false);
    	this.getVerSiguiendos().setVisible(false);
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas__Otro_usuario_();
    	_publicaciones_usuario_publico = new publicaciones_usuario_publico();
    	publicaciones_usuario_publico();
	}
	public Ver_perfil_publico(UsuarioRegistrado user) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getBotonEditarPerfil().setVisible(false);
    	this.getBotonEliminarPublicacion().setVisible(false);
    	this.getBotonModificarPerfil().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	_ver_publicacciones_gustadas__Otro_usuario_ = new Ver_publicacciones_gustadas__Otro_usuario_();
    	_publicaciones_usuario_publico = new publicaciones_usuario_publico();
    	publicaciones_usuario_publico();
	}
	public void Seguir() {
		throw new UnsupportedOperationException();
	}

	public void publicaciones_usuario_publico() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add();
		this.getBotonVideos().addClickListener(event ->{
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}

	public void Ver_publicacciones_gustadas__Otro_usuario_() {
		this.getBotonMeGustas().addClickListener(event ->{
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicacciones_gustadas__Otro_usuario_);
		});
	}
}