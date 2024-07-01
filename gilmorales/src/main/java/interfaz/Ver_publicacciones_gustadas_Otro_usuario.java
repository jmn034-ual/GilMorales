package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerPublicacionesGustadasOtroUsuario;

public class Ver_publicacciones_gustadas_Otro_usuario extends VistaVerPublicacionesGustadasOtroUsuario{
	public Ver_perfil_publico _ver_perfil_publico;
	public Publicaciones_gustadas_usuario_publico _publicaciones_gustadas_usuario_publico;
	
	public Ver_publicacciones_gustadas_Otro_usuario(Ver_perfil_publico interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this._ver_perfil_publico = interfaz;
		publicaciones_gustadas_usuario_publico();
	}

	public void publicaciones_gustadas_usuario_publico() {
		_publicaciones_gustadas_usuario_publico = new Publicaciones_gustadas_usuario_publico(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_gustadas_usuario_publico);
	}
}